/* Comissão de vendas
   Utilize um array unidimensional para resolver o seguinte problema:
   uma empresa paga seu pessoal de vendas por comissão. O pessoal de
   vendas recebe R$200 por semana mais 9% de suas vendas brutas durante
   essa semana. Por exemplo, um vendedor que vende R$5000 brutos em uma
   semana recebe R$200 mais 9% de R$500 ou um total de R$650. Escreva
   um aplicativo (utilizando um array de contadores) que determine quanto
   o pessoal de vendas ganhou em cada um dos seguintes intervalos (suponha
   que o salário de cada vendedor foi truncado para uma quantia inteira):   
*/


public class Exercicio10{
	//Pagamento fixo semanal
	private static int PAGAMENTO_FIXO_SEMANAL = 200;
	private static double PERCENTUAL_DE_COMISSAO = 0.09;
	private static int[] array = intervaloDoTotalDeVendas(200,299);
	
	public static void main(String[] args){		
		
		for(int vendasBruto : array){
			System.out.printf("O valor a receber eh: %f%n", (calculoDaComissao(vendasBruto, PERCENTUAL_DE_COMISSAO) + PAGAMENTO_FIXO_SEMANAL));
		}
	}

	public static double calculoDaComissao(int vendasBrutoPorSemana, double percentualComissao){
		
		return vendasBrutoPorSemana * percentualComissao;
	}

	public static int[] intervaloDoTotalDeVendas(int inicial, int fim){
		int[] array = new int[100];
		for (int i = inicial; i < fim; i++){
			array[i - inicial] = i;
		}

		return array;
	}

}