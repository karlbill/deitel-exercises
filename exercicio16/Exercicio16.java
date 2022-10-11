/* (Usando a instrução for aprimorada) Escreva um aplicativo que usa uma instrução for aprimorada para somar
   os valores double passados pelos argumentos de linha de comando.
   [Dica: utilize o método static parseDouble da classe Double para converter uma String em um valor double.]
*/

public class Exercicio16{
	
	public static void main(String[] args){
		System.out.printf("A soma dos argumentos eh: %f%n", somaArgumentos(converteStringDeArgumentosEmDouble(args)));		

	}

	public static double somaArgumentos(double... args){
		double soma = 0.0;		

		for(double arg : args)
			soma += arg;

		return soma;
	}

	public static double[] converteStringDeArgumentosEmDouble(String[] args){
		double[] arrayDeDouble = new double[args.length];
		int index = 0;
		
		for(String arg : args){
			arrayDeDouble[index] = Double.parseDouble(arg);
			index += 1;
		}

		return arrayDeDouble;
	}

}