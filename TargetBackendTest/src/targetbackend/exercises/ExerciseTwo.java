package targetbackend.exercises;

public class ExerciseTwo {
	
	/*
	 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
	 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
	 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
	 * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
	 * avisando se o número informado pertence ou não a sequência. IMPORTANTE: Esse
	 * número pode ser informado através de qualquer entrada de sua preferência ou
	 * pode ser previamente definido no código;
	 */
	
	public String isInFibonacciSequence(int numero) {
		int primeiro = 0, segundo = 1, proximo = 0;
		
		var verific = numero == 0 || numero == 1;
		
		if (verific) {
	        return numero + " pertence à sequência de Fibonacci.";
	    }
		
		while (proximo < numero) {
			 proximo = primeiro + segundo;
			 primeiro = segundo;
			 segundo = proximo; 
		}
		
		var isValid = proximo == numero;
		
		if (isValid) {
	        return numero + " pertence à sequência de Fibonacci.";
	    }

	    return numero + " não pertence à sequência de Fibonacci.";
		
	}
}
