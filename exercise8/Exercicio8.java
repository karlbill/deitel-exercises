/* Escreva instruções Java para realizar cada uma das seguintes tarefas:
	a) Exiba o valor do elemento 6 do array f.
	b) Inicialize cada um dos cinco elementos de array de inteiros unidimensional g com 8
	c) Some os 100 elementos do array de ponto flutuante c.
	d) Copie o array a de 11 elementos para a primeira parte de array b, que contém 34 elementos.
	e) Determine e exiba os maiores e menores valores contidos no array de ponto flutuante w de 99 elementos
*/
import java.security.SecureRandom;

public class Exercicio8{

	public static void main(String[] args){
		System.out.printf("%d%n ", retornaAPosicao6DoArray());
		inicializaElementosDoArrayCom8();
		System.out.println();
		System.out.printf("Soma elementos: %f%n", soma100ElementosDoArray(cria100ElementosDePontoFlutuante()));
		printArray(adicionaANoInicioDeB(criaADe11Elementos(), criaBDe34Elementos()));
		System.out.printf("O maior valor eh: %f%n ", retornaOMaiorValor(criaArrayDe99Elementos()));
		System.out.printf("O menor valor eh: %f%n ", retornaOMenorValor(criaArrayDe99Elementos()));
	}

	public static int retornaAPosicao6DoArray(){
		//Formas de criação do array f de 6 elementos
		//int[] f = new int[6];
		int[] f = {0, 10, 20, 30, 40, 50};
	
		//Imprime o array f
		return f[5];
	}

	public static void inicializaElementosDoArrayCom8(){
		int[] g = {8,8,8,8,8};
		
		for(int index = 0; index < g.length; index++){
			System.out.printf("%d ", g[index]);
		}
	}

	public static float[] cria100ElementosDePontoFlutuante(){
		SecureRandom random = new SecureRandom();
		float[] array = new float[100];

		for(int index = 0; index < 100; index++){
			array[index] = random.nextFloat(100);
			System.out.printf("%f ", array[index]);
		}

		;
		
		return array;
	}

	public static float soma100ElementosDoArray(float[] array){
		float soma = 0;

		for(int index = 0; index < 100; index++){
			soma += array[index];
		}

		return soma;
	}

	public static int[] criaADe11Elementos(){
		int[] a = new int[11];

		SecureRandom random = new SecureRandom();

		for(int index = 0; index < 11; index++){
			a[index] = random.nextInt(100);
			System.out.printf("%d ", a[index]);
		}
		System.out.println();
		return a;
	}

	public static int[] criaBDe34Elementos(){
		int[] b = new int[34];

		SecureRandom random = new SecureRandom();

		for(int index = 0; index < 34; index++){
			b[index] = random.nextInt(100);
			System.out.printf("%d ", b[index]);
		}
		System.out.println();
		return b;
	}

	public static int[] adicionaANoInicioDeB(int[] a, int[] b){
		int[] newB = new int[a.length + b.length];

		for(int index = 0; index < a.length; index++){
			newB[index] = a[index];			
		}

		for(int index = a.length; index < b.length + a.length; index++){
			newB[index] = b[index - a.length];
		}

		return newB;
	}

	public static void printArray(int[] array){
		for(int index = 0; index < array.length; index++){
			System.out.printf("%d ", array[index]);
		}
		System.out.println();
	}

	public static float[] criaArrayDe99Elementos(){
		float[] w = new float[99];

		SecureRandom random = new SecureRandom();

		for(int index = 0; index < 99; index++){
			w[index] = random.nextFloat(100);
			System.out.printf("%f ", w[index]);
		}
		System.out.println();
		return w;
	}

	public static float retornaOMaiorValor(float[] array){
		float max = 0.0f;
		
		for(int i = 0; i < array.length - 1; i++){
			if(array[i] > max){
				max = array[i];	
			}			
		}
		
		return max;
	}

	public static float retornaOMenorValor(float[] array){
		float min = 999;
		
		for(int index = 0; index < array.length; index++){
			if(array[index] < min){
				min = array[index];
			}
		}
		
		return min;
	}
}













