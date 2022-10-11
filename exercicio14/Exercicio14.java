/* (Lista de argumentos de comprimento variável)
   Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados para método product
   utilizando uma lista de argumentos de comprimento variável. Teste seu método com várias chamadas, cada uma
   com um número diferente de argumentos.
*/

public class Exercicio14{

	public static void main(String[] args){
		System.out.printf("O produto eh: %d%n", product(2,3));
		System.out.printf("O produto eh: %d%n", product(2,3,5));
		System.out.printf("O produto eh: %d%n", product(5,8,9,2));
	}
		
	public static int product(int... serie){
		int product = 1;

		for(int inteiro : serie){
			product *= inteiro;
		}

		return product;
	}
}