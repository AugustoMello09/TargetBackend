package targetbackend.exercises;

public class ExerciseOne {

	/*
	 * 1) Observe o trecho de c�digo abaixo: int INDICE = 13, SOMA = 0, K = 0;
	 * Enquanto K < INDICE fa�a { K = K + 1; SOMA = SOMA + K; } Imprimir(SOMA); Ao
	 * final do processamento, qual ser� o valor da vari�vel SOMA?
	 */
	
	public int Sum() {
		int indice = 13;
		int soma = 0;
		int k = 0;
		while(k < indice) {
			k = k + 1;
			soma = soma + k;
			//System.out.println("Resultado da soma: " + soma);
		}
		return soma;
	}
}
