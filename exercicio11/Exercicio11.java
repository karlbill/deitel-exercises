/* Escreva instruções que realizam as seguintes operações de um array unidimensional:
(a) Configure os 10 elementos do array de inteiros counts como zeros.
(b) Adicione um a cada um dos 15 elementos do array de inteiros bonus.
(c) Exiba os cinco valores de array de inteiros bestScores em formato de coluna.
*/

public class Exercicio11{

	public static void main(String[] args){
		int[] count = new int[10];
		count = geraArrayDeInteirosConstante(10, 0);
		int [] bonusIncremental = geraArrayDeInteirosIncremental(15, 1);
		geraBestScore();

	}

	public static int[] geraArrayDeInteirosConstante(int quantidadeDeElementos, int valor){
		int[] array = new int[quantidadeDeElementos];
		for(int i = 0; i < quantidadeDeElementos; i++){
			array[i] = valor;
		}		
		
		return array;
	}

	public static int[] geraArrayDeInteirosIncremental(int quantidadeDeElementos, int incremento){
		int[] array = new int[quantidadeDeElementos];
		for(int i = 0; i < quantidadeDeElementos; i++){
			array[i] = i + incremento;
		}

		return array;
	}

	public static void geraBestScore(){
		int[] array = new int[5];
		
		System.out.printf("%s%18s%n", "Index", "Best Score");
		for(int i = 0; i < 5; i++){
			array[i] = i*100;
			System.out.printf("%3s%16d%n",i,array[i]);
		}
	}
}