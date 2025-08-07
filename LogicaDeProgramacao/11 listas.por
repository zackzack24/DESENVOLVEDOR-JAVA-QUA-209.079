programa {
  funcao inicio() {
    // declaração de vetor

    cadeia nomes[10]  
    inteiro idades[10]  
    

    // entrada de dados

    para (inteiro n = 0; n < 10; n++)
     {
      escreva("Digite o nome do ", n+1," °usuário: \n")
      leia(nomes[n])
      escreva("Digite a idade do ", n+1," °usuário: \n")
      leia(idades[n])
     }

     // saída 
     para (inteiro n = 0; n < 10; n++)
     {
      escreva("Nome: ", n+1, "° usuário ",nomes[n], ". \n "  )
      escreva("idade: ", idades[n], ". \n" )
     }
   
  }
}

