Set-ExecutionPolicy -Scope Process -ExecutionPolicy Bypass -Force

if (-not (Test-Path ".git")) {
    Write-Host "ERRO: Execute na raiz do repositorio (onde esta o .git)"
    exit 1
}

Write-Host "Repositorio Git encontrado."

function Move-GitFolder($origem, $destino) {
    $items = Get-ChildItem -Path $origem
    foreach ($item in $items) {
        git mv "$origem/$($item.Name)" "$destino/$($item.Name)" 2>$null
    }
}

Write-Host "Criando pastas..."

$pastas = @("01_logica","02_java_console","03_poo","04_gui","05_atividades","06_front_end","07_spring","08_modelagem","09_projeto_final")
foreach ($pasta in $pastas) {
    if (-not (Test-Path $pasta)) { New-Item -ItemType Directory -Path $pasta | Out-Null }
}

Write-Host "Movendo arquivos..."

if (Test-Path "LogicaDeProgramacao") {
    Move-GitFolder "LogicaDeProgramacao" "01_logica"
    Remove-Item "LogicaDeProgramacao" -Recurse -Force -ErrorAction SilentlyContinue
    Write-Host "  OK: LogicaDeProgramacao -> 01_logica"
}

if (Test-Path "JavaConsole") {
    Move-GitFolder "JavaConsole" "02_java_console"
    Remove-Item "JavaConsole" -Recurse -Force -ErrorAction SilentlyContinue
    Write-Host "  OK: JavaConsole -> 02_java_console"
}

if (Test-Path "POO") {
    if (Test-Path "POO/03.POLIMORFISMO")   { git mv "POO/03.POLIMORFISMO"   "POO/03.polimorfismo" }
    if (Test-Path "POO/04.ENCAPSULAMENTO") { git mv "POO/04.ENCAPSULAMENTO" "POO/04.encapsulamento" }
    if (Test-Path "POO/06.INTERFACE")      { git mv "POO/06.INTERFACE"      "POO/06.interface" }
    Move-GitFolder "POO" "03_poo"
    Remove-Item "POO" -Recurse -Force -ErrorAction SilentlyContinue
    Write-Host "  OK: POO -> 03_poo"
}

if (Test-Path "GUI") {
    Move-GitFolder "GUI" "04_gui"
    Remove-Item "GUI" -Recurse -Force -ErrorAction SilentlyContinue
    Write-Host "  OK: GUI -> 04_gui"
}

if (Test-Path "Atividades") {
    if (Test-Path "Atividades/Atividade01") { git mv "Atividades/Atividade01" "Atividades/atividade01" }
    if (Test-Path "Atividades/Atividade02") { git mv "Atividades/Atividade02" "Atividades/atividade02" }
    if (Test-Path "Atividades/Atividade03") { git mv "Atividades/Atividade03" "Atividades/atividade03" }
    if (Test-Path "Atividades/atividade07") { git mv "Atividades/atividade07" "06_front_end/atividade07_html_form" }
    if (Test-Path "Atividades/atividade08") { git mv "Atividades/atividade08" "06_front_end/atividade08_html_js" }
    Move-GitFolder "Atividades" "05_atividades"
    Remove-Item "Atividades" -Recurse -Force -ErrorAction SilentlyContinue
    Write-Host "  OK: Atividades -> 05_atividades"
}

if (Test-Path "front-end") {
    Move-GitFolder "front-end" "06_front_end"
    Remove-Item "front-end" -Recurse -Force -ErrorAction SilentlyContinue
    Write-Host "  OK: front-end -> 06_front_end"
}

if (Test-Path "spring") {
    Move-GitFolder "spring" "07_spring"
    Remove-Item "spring" -Recurse -Force -ErrorAction SilentlyContinue
    Write-Host "  OK: spring -> 07_spring"
}

if (Test-Path "modelagem") {
    Move-GitFolder "modelagem" "08_modelagem"
    Remove-Item "modelagem" -Recurse -Force -ErrorAction SilentlyContinue
    Write-Host "  OK: modelagem -> 08_modelagem"
}

if (Test-Path "ProjetoFinal") {
    Move-GitFolder "ProjetoFinal" "09_projeto_final"
    Remove-Item "ProjetoFinal" -Recurse -Force -ErrorAction SilentlyContinue
    Write-Host "  OK: ProjetoFinal -> 09_projeto_final"
}

Write-Host "Removendo .class do rastreamento Git..."
git rm -r --cached --ignore-unmatch "*.class" 2>$null
git rm -r --cached --ignore-unmatch "*/bin/" 2>$null

Write-Host "Criando commit..."
git add -A
git commit -m "refactor: reorganiza estrutura do repositorio"

Write-Host ""
Write-Host "Reorganizacao concluida!"
Write-Host "Agora rode: git push origin main"
