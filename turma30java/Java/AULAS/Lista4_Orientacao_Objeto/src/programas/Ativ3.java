package programas;

/*
 * 3) Crie uma classe produto eletr�nico e apresente os atributos e
 *  m�todos referentes esta classe, em seguida crie um objeto produto
 *   eletr�nico, defina as instancias deste objeto e apresente as
 *    informa��es deste objeto no console.
 */

import java.util.Scanner;

import Classes.ProdutoEletronico;

public class Ativ3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ProdutoEletronico celular = new ProdutoEletronico();

		System.out.println("Digite o modelo do celular: ");
		celular.nome = scan.nextLine().toUpperCase();

		System.out.println("Digite a gera��o do celular: ");
		celular.geracao = scan.nextInt();

		System.out.println("Digite a mem�ria do celular: ");
		celular.memoria = scan.nextInt();

		System.out.println("Digite o valor do celular: ");
		celular.preco = scan.nextDouble();

		celular.aparelho();

	}

}
