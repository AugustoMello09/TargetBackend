package targetbackend.exercises;

public class ExerciseTwo {
	
	/*
	 * 2) Dado a sequ�ncia de Fibonacci, onde se inicia por 0 e 1 e o pr�ximo valor
	 * sempre ser� a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
	 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
	 * um n�mero, ele calcule a sequ�ncia de Fibonacci e retorne uma mensagem
	 * avisando se o n�mero informado pertence ou n�o a sequ�ncia. IMPORTANTE: Esse
	 * n�mero pode ser informado atrav�s de qualquer entrada de sua prefer�ncia ou
	 * pode ser previamente definido no c�digo;
	 */
	
	public String isInFibonacciSequence(int numero) {
		int primeiro = 0, segundo = 1, proximo = 0;
		
		var verific = numero == 0 || numero == 1;
		
		if (verific) {
	        return numero + " pertence � sequ�ncia de Fibonacci.";
	    }
		
		while (proximo < numero) {
			 proximo = primeiro + segundo;
			 primeiro = segundo;
			 segundo = proximo; 
		}
		
		var isValid = proximo == numero;
		
		if (isValid) {
	        return numero + " pertence � sequ�ncia de Fibonacci.";
	    }

	    return numero + " n�o pertence � sequ�ncia de Fibonacci.";
		
	}
}
