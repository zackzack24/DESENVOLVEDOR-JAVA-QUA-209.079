const cpfMask = document.querySelector('#SeuCpf');
const form = document.querySelector("form");
// const telefoneMask = document.querySelector('#telefone');
// Não está sendo usado mas pode ser adicionado posteriormente
// const cepMask = document.querySelector('#cep');
// Não está sendo usado mas pode ser adicionado posteriormente

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

