programa {
  funcao inicio() {

    // declaração da variavel
    
    cadeia nome, genero
    inteiro idade
  
    // entrada de dados

    escreva("Informe seu nome: ")
    leia(nome)
    escreva("Informe sua idade: ")
    leia(idade)
    escreva("Seu gênero é Masculino ou Feminino? ")
    leia(genero)

    // verificação de dados

    se (idade >= 65 e genero == "masculino" ou idade >= 62 e genero == 
    "feminino") escreva(nome, " Você pode se aposentar!") 
    senao escreva(nome, " Você não pode se aposentar!")
  }    
}
