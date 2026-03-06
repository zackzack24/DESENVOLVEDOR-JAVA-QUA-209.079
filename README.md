<div align="center">

  <img src='https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white' />
  <img src='https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white' />
  <img src='https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white' />
  <img src='https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white' />
  <img src='https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white' />

  <h1>Repositório — Desenvolvedor Java</h1>

  <p>Documentação da minha jornada de aprendizado em Java, do zero ao Spring Boot.<br/>
  Exercícios, projetos práticos e evolução contínua.</p>

</div>

---

## 📁 Estrutura do Repositório

```
📦 DESENVOLVEDOR-JAVA-QUA-209.079
 ├── 📂 01_logica              → Lógica de programação em Portugol
 ├── 📂 02_java_console        → Fundamentos Java no console
 ├── 📂 03_poo                 → Programação Orientada a Objetos
 ├── 📂 04_gui                 → Interface gráfica com Swing/JOptionPane
 ├── 📂 05_atividades          → Atividades práticas Java
 ├── 📂 06_front_end           → HTML, CSS, JavaScript e Bootstrap
 ├── 📂 07_spring              → Projetos com Spring Boot
 ├── 📂 08_modelagem           → Modelagem de banco de dados (MySQL Workbench)
 └── 📂 09_projeto_final       → Sistema de Cadastro de Pessoas Desaparecidas
```

---

## 🧠 01 — Lógica de Programação (`01_logica`)

Exercícios em **Portugol** como base para o pensamento lógico antes de entrar no Java.

| # | Tema |
|---|------|
| 01 | Hello World |
| 02 | Variáveis |
| 03 | Entrada de Dados |
| 04 | Se / Senão |
| 05 | Se / Senão Lógico |
| 06 | Senão Se |
| 07 | Caso (Switch) |
| 08 | Enquanto (While) |
| 09 | Faça Enquanto (Do-While) |
| 10 | Vetor (Array) |
| 11 | Listas |

---

## ☕ 02 — Java Console (`02_java_console`)

Fundamentos da linguagem Java com programas rodados no terminal.

| # | Tema | Conceito |
|---|------|---------|
| 01 | Hello World | Estrutura básica |
| 02 | Variáveis | Tipos primitivos |
| 03 | Input | Scanner |
| 04-07 | If / Else | Condicionais |
| 08 | Switch | Múltipla escolha |
| 09 | While | Laço com condição |
| 10 | Do-While | Laço com pós-condição |
| 11 | Array | Vetores e iteração |

---

## 🏗️ 03 — POO — Programação Orientada a Objetos (`03_poo`)

Os quatro pilares da OOP aplicados em Java.

| # | Módulo | Conceito |
|---|--------|---------|
| 01 | Objeto | Classes e instâncias |
| 02 | Herança | `extends`, superclasse |
| 03 | Polimorfismo | Sobrescrita de métodos |
| 04 | Encapsulamento | `private`, getters/setters |
| 05 | Quatro Pilares | Integração dos conceitos |
| 06 | Interface | `interface`, contrato |

---

## 🖥️ 04 — GUI — Interface Gráfica (`04_gui`)

Interação com o usuário via **JOptionPane** e conceitos avançados de OOP.

| # | Projeto | Destaque |
|---|---------|---------|
| 01 | Caixas de Diálogo | JOptionPane com model |
| 02 | Calculadora | Interface `ICalculadora`, polimorfismo |
| 03 | Composição | Composição de objetos + Interface `IConta` |

---

## 📝 05 — Atividades Java (`05_atividades`)

Exercícios práticos integrando os conceitos estudados.

| # | Tema |
|---|------|
| 01 | Exercício básico |
| 02 | Lógica com classes |
| 03 | Pessoa e Conta (POO) |
| 04 | Cálculo de IMC |
| 05 | Comparação de Combustíveis |
| 06 | Carros e Pessoa |
| 09 | Fabricante, Modelo e Deltas |

---

## 🌐 06 — Front-End (`06_front_end`)

Desenvolvimento web com HTML, CSS, JavaScript e Bootstrap.

| # | Tema |
|---|------|
| 01 | Hello World HTML |
| 02 | Formulários |
| 03-05 | Estilos CSS |
| 06 | Site com Bootstrap |
| 07 | Container e Layout |
| 08 | Hello World JavaScript |
| 09 | Verificação de Maioridade |
| 10 | Máscara de Entrada |
| 11 | Consumo de API (fetch) |

---

## 🍃 07 — Spring Boot (`07_spring`)

Projetos web com o ecossistema Spring.

### `helloworld`
Primeiro projeto Spring Boot com Gradle. Rota simples com Thymeleaf.

### `telas`
Navegação entre páginas com Spring MVC e Thymeleaf.

### `CRUD-System`
Sistema CRUD completo de cadastro de pessoas.
- **Stack:** Spring Boot · Spring Data JPA · Thymeleaf · MySQL
- **Operações:** Cadastrar · Listar · Alterar · Excluir

---

## 🗄️ 08 — Modelagem de Banco de Dados (`08_modelagem`)

Modelos relacionais criados no **MySQL Workbench**.

- `db_escola.mwb` — Modelo de banco escolar
- `normalizacao.mwb` — Exercício de normalização
- `sql.mwb` — Modelo SQL geral
- `png_banco_de_dados.png` — Diagrama ER exportado

---

## 🚨 09 — Projeto Final (`09_projeto_final`)

### Sistema de Cadastro de Pessoas Desaparecidas

Sistema web completo desenvolvido como projeto de conclusão do curso.

**Funcionalidades:**
- Cadastro de pessoas desaparecidas
- Busca por nome ou características
- Listagem geral com status (encontrada / não encontrada)
- Marcação de pessoa como encontrada

**Stack:**
- Java 17
- Spring Boot 3
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

**Como rodar:**
```bash
# 1. Configure o banco no application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# 2. Execute
./mvnw spring-boot:run
```

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão | Uso |
|-----------|--------|-----|
| Java | 17 | Linguagem principal |
| Spring Boot | 3.x | Framework web |
| Maven | 3.x | Gerenciador de dependências |
| Gradle | 8.x | Build (helloworld) |
| MySQL | 8.x | Banco de dados |
| Thymeleaf | 3.x | Template engine |
| Bootstrap | 5.x | Estilização frontend |

---

## 📈 Evolução do Curso

```
Portugol → Java Básico → POO → GUI → Front-End → Spring Boot → Projeto Final
```

---

<div align="center">
  <sub>Desenvolvido durante o curso Desenvolvedor Java · QUA-209.079</sub>
</div>


