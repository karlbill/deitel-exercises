/* (Jogos de dados) Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar 
  um objeto de classe Random, uma vez para lançar o primeiro dado e novamente para lançar o segundo. A soma dos
  dois valores deve enetão ser calculada. Cada dado pode mostrar um valor inteiro de 1 a 6, portanto a soma dos   valores irá variar de 2 a 12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. São 36 as
  possíveis combinações dos dois dados. Seu aplicativo deve lançar o dado 36 milhões de vezes. Utilize um array   unidimensional para contar o número de vezes que cada possível soma aparece. Exiba os resultados em formato   tabular.
*/
import java.security.SecureRandom;

public class Exercicio17{
	static int[] frequencias = new int[13];
	static int count = 0;

	public static void main(String[] args){
		for(int i = 1; i < 1000000; i++){
			int lancamento1 = lancaDado();
			int lancamento2 = lancaDado();
			int soma = lancamento1 + lancamento2;
			armazenaFrequencia(soma);
		}

		System.out.printf("%s%15s%n", "Soma", "Frequencia");

		for(int frequencia  : frequencias)
			System.out.printf("%4d%15d%n", count++ ,frequencia);
	}

	public static int lancaDado(){
		SecureRandom random = new SecureRandom();

		return 1 + random.nextInt(6);
	}

	public static void armazenaFrequencia(int soma){
		frequencias[soma] += 1;  
	}
}