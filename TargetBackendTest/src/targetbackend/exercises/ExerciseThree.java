package targetbackend.exercises;

import java.util.Arrays;

public class ExerciseThree {

	private Double[] faturamentoDiario = { 1200.0, 0.0, 1500.0, 0.0, 2000.0, 0.0, 0.0, 2200.0, 2500.0, 0.0 };

	public double menorFaturamento() {
		return Arrays.stream(faturamentoDiario).filter(f -> f > 0).min(Double::compare).orElse(0.0);
	}

	public double maiorFaturamento() {
		return Arrays.stream(faturamentoDiario).filter(f -> f > 0).max(Double::compare).orElse(0.0);
	}

	public long diasAcimaDaMedia() {
		Double[] faturamentoValidos = Arrays.stream(faturamentoDiario)
				.filter(f -> f > 0).toArray(Double[]::new);
		
		double mediaMensal = Arrays.stream(faturamentoValidos)
				.mapToDouble(Double::doubleValue).average().orElse(0.0);
		
		return Arrays.stream(faturamentoValidos).filter(f -> f > mediaMensal).count();
	}

}
