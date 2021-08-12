package EcommercePoo;

import java.util.Scanner;

public class pagamento {
	Scanner leia = new Scanner (System.in);
	int Pagmt;
	 
	
	
	do {
		
		System.out.print("\n****Métodos de pagamento****");
		System.out.print("\n1 - À vista com 10% de desconto.");
		System.out.print("\n2 - No cartão de crédito em 1x (10% de acréscimo.)");
		System.out.print("\n3 - No cartão de crédito em 2x (15% de acréscimo.");
		System.out.print("\nInforme a forma de pagamento desejada [1/2/3]: ");
		Pagmt = leia.nextInt();
		
		
	if (Pagmt == '1') {
		System.out.printf("O valor do seu pedido %d com 10% de desconto",carrinho)
			}
	else (Pagmt == '2') {
		System.out.printf("O valor do seu pedido %d com 10% de acréscimo",carrinho)
			}
	
	else if (Pagmt == '3') {
		System.out.printf("O valor do seu pedido %d com 15% de acréscimo",carrinho)
	}
			}