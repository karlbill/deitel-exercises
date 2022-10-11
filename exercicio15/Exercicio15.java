/* (Argumentos de linha de comando) Faça com que o tamanho de um array seja especificado pelo primeiro
   argumento de linha de comando. Se nenhum argumento de linha de comando for fornecido, utilize 10 como o 
   tamanho padrão do array.
*/

public class Exercicio15{

	public static void main(String[] args){
		if(args.length == 0)
			criaArray(10);
		else
			criaArray(Integer.parseInt(args[0]));	
	}

	public static void criaArray(int tamanhoDoArray){
		int[] array = new int[tamanhoDoArray];
		
		System.out.printf("%s%8s%n", "Index", "Array");

		for(int index = 0; index < tamanhoDoArray; index++){
			System.out.printf("%d%8d%n", index, array[index]);
		}
		
		return;
	}
}