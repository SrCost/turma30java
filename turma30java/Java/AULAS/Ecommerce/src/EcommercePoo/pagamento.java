package EcommercePoo;

import java.util.Scanner;

public class pagamento {
	Scanner leia = new Scanner (System.in);
	int Pagmt;
	 
	
	
	do {
		
		System.out.print("\n****M�todos de pagamento****");
		System.out.print("\n1 - � vista com 10% de desconto.");
		System.out.print("\n2 - No cart�o de cr�dito em 1x (10% de acr�scimo.)");
		System.out.print("\n3 - No cart�o de cr�dito em 2x (15% de acr�scimo.");
		System.out.print("\nInforme a forma de pagamento desejada [1/2/3]: ");
		Pagmt = leia.nextInt();
		
		
	if (Pagmt == '1') {
		System.out.printf("O valor do seu pedido %d com 10% de desconto",carrinho)
			}
	else (Pagmt == '2') {
		System.out.printf("O valor do seu pedido %d com 10% de acr�scimo",carrinho)
			}
	
	else if (Pagmt == '3') {
		System.out.printf("O valor do seu pedido %d com 15% de acr�scimo",carrinho)
	}
			}