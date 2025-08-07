programa {
  funcao inicio() {
    // declarar as variáveis

    real x, y, result
    inteiro opcao

    //loop faça enquanto

    faca 
    {
      // menu
      escreva("1 - Soma\n")
      escreva("2 - Subtração\n")
      escreva("3 - Multiplicação\n")
      escreva("4 - Divisão\n")
      escreva("5 - Sair do Programa\n")
      leia(opcao)

      // verifica se o usuário deseja sair ou não
      se (opcao >= 1 e opcao <= 4)
      {
        escreva ("Informe o valor de x")
        leia(x)
        escreva ("Informe o valor de y")
        leia(y)
      }

      // verifica a opção escolhida
      escolha (opcao)
      {
        caso 1:
          result = x+y
          escreva("Resultado: ", result)
          pare
        caso 2:
          result = x-y
          escreva("Resultado: ", result)
          pare
        caso 3:
          result = x*y
          escreva("Resultado: ", result)
          pare
        caso 4:
          result = x/y
          escreva("Resultado: ", result)
          pare
        caso 5:
          escreva("Programa Encerrado ")
          pare
          caso contrario:
          escreva("Opção Inválida.")
          pare
      }
    } enquanto (opcao != 5)
    
  }
}
