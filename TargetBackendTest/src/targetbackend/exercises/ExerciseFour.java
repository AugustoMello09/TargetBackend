package targetbackend.exercises;

public class ExerciseFour {

	/*
	 * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por
	 * estado: • SP – R$67.836,43 • RJ – R$36.678,66 • MG – R$29.229,88 • ES –
	 * R$27.165,48 • Outros – R$19.849,53
	 * 
	 * Escreva um programa na linguagem que desejar onde calcule o percentual de
	 * representação que cada estado teve dentro do valor total mensal da
	 * distribuidora.
	 */

	private static final double SP = 67836.43;
	private static final double RJ = 36678.66;
	private static final double MG = 29229.88;
	private static final double ES = 27165.48;
	private static final double OUTROS = 19849.53;

	public double percentualSP() {
		double total = SP + RJ + MG + ES + OUTROS;
		return (SP / total) * 100;
	}

	public double percentualRJ() {
		double total = SP + RJ + MG + ES + OUTROS;
		return (RJ / total) * 100;
	}

	public double percentualMG() {
		double total = SP + RJ + MG + ES + OUTROS;
		return (MG / total) * 100;
	}

	public double percentualES() {
		double total = SP + RJ + MG + ES + OUTROS;
		return (ES / total) * 100;
	}

	public double percentualOutros() { 
		double total = SP + RJ + MG + ES + OUTROS; 
		return (OUTROS / total) * 100;
	}
	
	
}
