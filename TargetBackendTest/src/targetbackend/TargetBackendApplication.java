package targetbackend;

import targetbackend.exercises.ExerciseFive;
import targetbackend.exercises.ExerciseFour;
import targetbackend.exercises.ExerciseOne;
import targetbackend.exercises.ExerciseThree;
import targetbackend.exercises.ExerciseTwo;

public class TargetBackendApplication {

	private static final int NUMERO = 10;
	private static final String TEXTO = "Jose";

	private static ExerciseOne exerciseOne = new ExerciseOne();
	private static ExerciseTwo exerciseTwo = new ExerciseTwo();
	private static ExerciseThree exerciseThree = new ExerciseThree();
	private static ExerciseFour exerciseFour = new ExerciseFour();
	private static ExerciseFive exerciseFive = new ExerciseFive();

	public static void main(String[] args) {
		
		System.out.println("----------------------------");
		System.out.println("Resultado do exerc�cio um: " + exerciseOne.Sum());
		System.out.println("Resultado do exerc�cio dois: " + exerciseTwo.isInFibonacciSequence(NUMERO));
		System.out.println("\n");
		System.out.println("-------- Resultado do exerc�cio tr�s ----------");
		System.out.println("Menor valor de faturamento ocorrido em um dia do m�s: " + exerciseThree.menorFaturamento());
		System.out.println("Maior valor de faturamento ocorrido em um dia do m�s: " + exerciseThree.maiorFaturamento());
		System.out.println("N�mero de dias no m�s em que o valor de faturamento di�rio foi superior � m�dia mensal: " + exerciseThree.diasAcimaDaMedia());
		System.out.println("----------------------------");
		System.out.println("\n");
		System.out.println("-------- Resultado do exerc�cio Quatro ----------");
		System.out.printf("Percentual de SP: %.2f%%\n", exerciseFour.percentualSP());
		System.out.printf("Percentual de RJ: %.2f%%\n", exerciseFour.percentualRJ());
		System.out.printf("Percentual de MG: %.2f%%\n", exerciseFour.percentualMG());
		System.out.printf("Percentual de ES: %.2f%%\n", exerciseFour.percentualES());
		System.out.printf("Percentual de Outros: %.2f%%\n", exerciseFour.percentualOutros());
		System.out.println("----------------------------");
		System.out.println("\n");
		System.out.println("Resultado do exerc�cio Cinco: " + exerciseFive.reverseWords(TEXTO));
		
	}

}
