import java.util.Locale;
import java.util.Scanner;

/*
 * Exercicio de conversao de temperatura de Celsius para fahrenheit
 */

public class TemperaturaCxF {
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	double TemperaturaC;
	double TemperaturaF;
	String nome;
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Qual o seu nome?: ");
	nome = leia.nextLine();
	System.out.print("Ensira alguma temperatura em Celsius: ");
	TemperaturaC = leia.nextByte();
	
	TemperaturaF = (TemperaturaC*1.8) + 32;
	
	System.out.print("olá, "+nome+" a temperatura em fahrenheit é "+TemperaturaF);
	
	}
}
