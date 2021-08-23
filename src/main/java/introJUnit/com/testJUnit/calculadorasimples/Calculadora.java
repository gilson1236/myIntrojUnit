package introJUnit.com.testJUnit.calculadorasimples;

public class Calculadora {
	
	public double soma(double parcela1, double parcela2) {
		return parcela1 + parcela2;
	}
	
	public double subtracao(double parcela1, double parcela2) {
		return parcela1 - parcela2;
	}
	
	public double multiplicacao(double parcela1, double parcela2) {
		return parcela1 * parcela2;
	}
	
	public double divisao(double parcela1, double parcela2) {
		return parcela1 / parcela2;
	}
	
	public int restoDaDivisaoNumInteiro(int parcela1, int parcela2) {
		return parcela1 % parcela2;
	}
}
