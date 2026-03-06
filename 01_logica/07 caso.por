programa {
  funcao inicio() {

    // declaração de variávies

    caracter opcao
    real x,y, result 

    // entrada de dados

    escreva("Digite o valor de x: ")
    leia(x)
    
    escreva("Digite o valor de y: ")
    leia(y) 

    escreva("Digite a operação desejada \n ")
    escreva(" 1 - Soma \n ") 
    escreva(" 2 - Subtração \n ")
    escreva(" 3 - Multiplicação \n ")
    escreva(" 4 - Divisão \n ")
    leia(opcao)

    // escolha caso 
    escolha (opcao) 
    {
      caso 1:
        result = x + y
        escreva("O resultado da Soma é ", result)
        pare
      caso 2:
        result = x - y
        escreva("O resultado da Subtração é ", result)
        pare
      caso 3:
        result = x * y
        escreva("O resultado da multiplicação é ", result)
        pare
      caso 4:
        result = x / y
        escreva("O resultado da divisão é ", result)
        pare
        
    }
  }
}
