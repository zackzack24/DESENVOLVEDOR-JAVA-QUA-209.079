// declarando as constantes
const form  = document.querySelector('form');
const imc   = document.querySelector('button');
const meuBotao = document.getElementById('meuBotao');
const minhaImagem = document.getElementById(`minhaImagem`);

// anula submissão de dados do formulário
form.onsubmit = () => false;

imc.addEventListener(`click`, () => {

    // declarando variáveis
    let peso    = document.querySelector('#peso').value.replace(',', '.');
    let altura  = document.querySelector('#altura').value.replace(',', '.');
    let result  = document.querySelector('#result');
    let diag    = document.querySelector('#diag');
    let imc     = peso/Math.pow(altura, 2); 

    // exibe o resultado do IMC
    result.innerHTML = imc.toFixed(2);

    diag.innerHTML = (
        imc < 16.9 ? `Magreza Severa.`
        : imc < 18.5 ? `Abaixo do Peso.`
        : imc < 25 ? `Peso normal.`
        : imc < 30 ? `Acima do Peso.`
        : imc < 35 ? `Obesidade I`
        : imc < 40 ? `Obesidade II`
        : `Obesidade Mórbida` 

    );
});

git 