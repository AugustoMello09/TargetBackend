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
		System.out.println("Resultado do exercício um: " + exerciseOne.Sum());
		System.out.println("Resultado do exercício dois: " + exerciseTwo.isInFibonacciSequence(NUMERO));
		System.out.println("\n");
		System.out.println("-------- Resultado do exercício três ----------");
		System.out.println("Menor valor de faturamento ocorrido em um dia do mês: " + exerciseThree.menorFaturamento());
		System.out.println("Maior valor de faturamento ocorrido em um dia do mês: " + exerciseThree.maiorFaturamento());
		System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + exerciseThree.diasAcimaDaMedia());
		System.out.println("----------------------------");
		System.out.println("\n");
		System.out.println("-------- Resultado do exercício Quatro ----------");
		System.out.printf("Percentual de SP: %.2f%%\n", exerciseFour.percentualSP());
		System.out.printf("Percentual de RJ: %.2f%%\n", exerciseFour.percentualRJ());
		System.out.printf("Percentual de MG: %.2f%%\n", exerciseFour.percentualMG());
		System.out.printf("Percentual de ES: %.2f%%\n", exerciseFour.percentualES());
		System.out.printf("Percentual de Outros: %.2f%%\n", exerciseFour.percentualOutros());
		System.out.println("----------------------------");
		System.out.println("\n");
		System.out.println("Resultado do exercício Cinco: " + exerciseFive.reverseWords(TEXTO));
		
	}

}
