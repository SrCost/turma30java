programa
{
	
	funcao inicio()
	{
	/*Elabore um sistema que leia as variáveis C e N, respectivamente código 
	 * e número de horas trabalhadas de um operário. E calcule o salário 
	 * sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas 
	 * exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
	 * caso contrário zerar tal variável. A hora excedente de trabalho 
	 * vale R$ 20,00. No final do processamento imprimir o salário total e o 
	 * salário excedente.
	 * 
	 */

	real C, N, E = 0.0, s

	 	escreva("Digite seu código: ")
	 	leia(C)
	 	escreva("Digite o número de horas trabalhadas: ")
	 	leia(N)
	 	limpa()

	 	se(N <=50){
	 		s = N * 10
	 		escreva("Operário: ",C)
	 		escreva("\nHoras trabalhadas: ",N)
	 		escreva("\nExcedente: ",E)
	 		escreva("\nSalário: R$ ", s)
	 	}
	 	senao {
	 		E = N - 50
	 		
	 		s = (500) + (E * 20)
	 		escreva("Operário: ",C)
	 		escreva("\nHoras trabalhadas: ",N)
	 		escreva("\nExcedente: ",E)
	 		escreva("\nSalário: R$ ", s)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 502; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */