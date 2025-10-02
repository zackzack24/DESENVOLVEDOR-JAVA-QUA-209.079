const cpfMask = document.querySelector('#SeuCpf');
const form = document.querySelector("form");
// const telefoneMask = document.querySelector('#telefone');
// Não está sendo usado mas pode ser adicionado posteriormente
// const cepMask = document.querySelector('#cep');
// Não está sendo usado mas pode ser adicionado posteriormente

// FUNÇÃO PARA BUSCAR AUTOMÁTICO
const pesquisa = document.querySelector("#pesquisa");
const valoresPesquisa = document.querySelectorAll( 'table tbody tr');
const resultadoPesquisa = document.querySelector("#resultado-pesquisa"); 

// função em si
pesquisa.addEventListener("input", function() {
    const pesquisa = pesquisa.value.toLowerCase();
    let html = "";
    valoresPesquisa.forEach(linha => { 
        const pesquisados = linha.cells[0].textContent.toLowerCase();
        if (pesquisados.includes(termo)){
            html += `<tr>${linha.innerHTML}</tr>`;
        }
        linha.style.display = pesquisados.includes(pesquisa) ? "" : "none";
    });
    resultadoPesquisa.innerHTML = `<table>{html}</table>`;
});

// pesquisa.addEventListener("input", function() {
//     result.innerHTML = pesquisa.value();    
// });

// valoresPesquisa.forEach(linha => {
//     const Pesquisa = linha.cells[0].textContent; //.toLowerCase()
//     const valoresPesquisa = linha.cells[1].textContent; //.toLowerCase()
// });

// // testando forma do copilot

// pesquisa.addEventListener("inout" , function() {
//     const 


    


const btn = () => {
    let nome  = document.querySelector('#nome').value;
    let cpf  = document.querySelector('#SeuCpf').value;    
    // let telefone  = document.querySelector('#telefone').value;
    // Não está sendo usado mas pode ser adicionado posteriormente
    // let cep = document.querySelector('#cep').value;
    // Não está sendo usado mas pode ser adicionado posteriormente
    // let resultado = `CPF: ${cpf} <br /> Telefone: ${telefone} <br /> CEP: ${cep}`;
    // Não está sendo usado mas pode ser adicionado posteriormente


    document.querySelector('resultado').innerHTML = resultado;
}

cpfMask.addEventListener('input', function() {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d{1,2})$/, '$1-$2');
});

form.addEventListener('submit', function(event) {
    btn();
})
// telefoneMask.addEventListener('input', function() {
//     this.value = this.value
//         .replace(/\D/g, '')
//         .replace(/(\d{2})(\d)/, '($1) $2')
//         .replace(/(\d{4,5})(\d)/, '$1-$2')
//         .replace(/(-\d{4})\d+?$/, '$1');
// });

// cepMask.addEventListener('input', function() {
//     this.value = this.value
//         .replace(/\D/g, '')
//         .replace(/(\d{5})(\d)/, '$1-$2')
//         .replace(/(-\d{3})\d+?$/, '$1');
// });

