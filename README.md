<h1> Desafio Target </h1>

<h3 align="center">
    Lista de exercícios targetBackend 🎯
    <br>
    <br><br>
    <p align="center">
      <a href="#sobre">Sobre</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
      <a href="#sobre">Exercicio</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
      <a href="#tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
      <a href="#contato">Entre em contato</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  </p>
</h3>

<hr>

<h3 id="sobre"> Sobre </h3>

Esses são exercícios referentes ao teste técnico TargetBackend

<h3 id="exercicios"> Exercícios  </h3>


#### Exercício Um

 __Questão 1)__

 > 1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0; 
 Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } Imprimir(SOMA);
Ao final do processamento, qual será o valor da variável SOMA?

~~~Java
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
  //Resultado do exercício um: 91
~~~

#### Exercício Dois

 __Questão 2)__

 > 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

 ~~~Java

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

  // numero = 10;
  // Resultado do exercício dois: 10 não pertence à sequência de Fibonacci.
 ~~~

 #### Exercício Três
 
  __Questão 3)__

> 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado: • SP – R$67.836,43 • RJ – R$36.678,66 • MG – R$29.229,88 • ES – R$27.165,48 • Outros – R$19.849,53 Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

~~~Java

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

//-------- Resultado do exercício três ----------
//Menor valor de faturamento ocorrido em um dia do mês: 1200.0
//Maior valor de faturamento ocorrido em um dia do mês: 2500.0
//Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: 3

~~~

#### Exercício Quatro

 __Questão 4)__

> 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado: • SP – R$67.836,43 • RJ – R$36.678,66 • MG – R$29.229,88 • ES – R$27.165,48 • Outros – R$19.849,53
Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

~~~JAVA
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


//Percentual de SP: 37,53%
//Percentual de RJ: 20,29%
//Percentual de MG: 16,17%
//Percentual de ES: 15,03%
//Percentual de Outros: 10,98%
~~~

#### Exercício Cinco

 __Questão 5)__

 > 5) Escreva um programa que inverta os caracteres de um string.
 a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse

~~~JAVA 
public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        
        int esquerda = 0;
        
        for(int direita = 0; direita <= arr.length; direita++){
            
            boolean verificar = direita == arr.length || arr[direita] == ' ';
            
            if(verificar){
                int l = esquerda, r = direita - 1;
                while(l < r){
                    char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
                }

                esquerda = direita + 1;
            }
        }
        return new String(arr);
    }

// Resultado do exercício Cinco: esoJ    
~~~

<hr>

<h3 id="tecnologias"> Tecnologias  </h3>

#### Ferramentas e Tecnologias usadas nesse repositório 🧱

<div style="display: inline_block"><br>
<img align="center" alt="Augusto-Java" height="60" width="60" src=https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg >
</div>    


<h3 id="contato"> Contato  </h3>

#### Entre em contato comigo através dos canais abaixo e desde já, agradeço a atenção. 🤝

Para mais informações sobre o projeto ou para entrar em contato, você pode me encontrar através dos canais abaixo:

<div style="display: inline_block">

  <a href="https://www.linkedin.com/in/augusto-mello-794a94234" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
 <a href="mailto:joseaugusto.mello01@gmail.com" target="_blank"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>

</div>
