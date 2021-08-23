package introJUnit.com.testJUnit.calculadorasimples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraTest {
	static Calculadora calculadora;
	
	@Test
	public void testaSomaMenosIngenuo() {
		Calculadora localCalculadora = new Calculadora();
		
		boolean temErro = false;
		
		if(localCalculadora.soma(2, 2) != 4) {
			temErro = true;
		}
		
		if(localCalculadora.soma(2, -2) != 0) {
			temErro = true;
		}
		
		if(localCalculadora.soma(-2, 2) != 0) {
			temErro = true;
		}
		
		if(localCalculadora.soma(-2, -2) != -4) {
			temErro = true;
		}
		
		if(localCalculadora.soma(0, 0) != 0) {
			temErro = true;
		}
		
		if(temErro) {
			fail("Houve um erro na valida��o da soma.");
		}
	}
	
	@Test
	public void testaSubtracaoMenosIngenuo() {
		Calculadora localCalculadora = new Calculadora();
		
		boolean temErro = false;
		
		if(localCalculadora.subtracao(2, 2) != 0) {
			temErro = true;
		}
		
		if(localCalculadora.subtracao(2, -2) != 4) {
			temErro = true;
		}
		
		if(localCalculadora.subtracao(-2, 2) != -4) {
			temErro = true;
		}
		
		if(localCalculadora.subtracao(-2, -2) != 0) {
			temErro = true;
		}
		
		if(localCalculadora.subtracao(0, 0) != 0) {
			temErro = true;
		}
		
		if(temErro) {
			fail("Houve um erro na valida��o da subtra��o.");
		}
	}
	
	@Test
	public void testaMultiplicacaoMenosIngenuo() {
		Calculadora localCalculadora = new Calculadora();
		
		boolean temErro = false;
		
		if(localCalculadora.multiplicacao(2, 2) != 4) {
			temErro = true;
		}
		
		if(localCalculadora.multiplicacao(2, -2) != -4) {
			temErro = true;
		}
		
		if(localCalculadora.multiplicacao(-2, 2) != -4) {
			temErro = true;
		}
		
		if(localCalculadora.multiplicacao(-2, -2) != 4) {
			temErro = true;
		}
		
		if(localCalculadora.multiplicacao(0, 0) != 0) {
			temErro = true;
		}
		
		if(temErro) {
			fail("Houve um erro na valida��o da multiplica��o.");
		}
	}
	
	@Test
	public void testaDivisaoMenosIngenuo() {
		Calculadora localCalculadora = new Calculadora();
		
		boolean temErro = false;
		
		if(localCalculadora.divisao(2, 2) != 1) {
			temErro = true;
		}
		
		if(localCalculadora.divisao(2, -2) != -1) {
			temErro = true;
		}
		
		if(localCalculadora.divisao(-2, 2) != -1) {
			temErro = true;
		}
		
		if(localCalculadora.divisao(-2, -2) != 1) {
			temErro = true;
		}
		
		if(temErro) {
			fail("Houve um erro na valida��o da divis�o.");
		}
	}
	
	@Test
	public void testaRestoDivisaoMenosIngenuo() {
		Calculadora localCalculadora = new Calculadora();
		
		boolean temErro = false;
		
		if(localCalculadora.restoDaDivisaoNumInteiro(2, 2) != 0) {
			temErro = true;
		}
		
		if(localCalculadora.restoDaDivisaoNumInteiro(4, -2) != 0) {
			temErro = true;
		}
		
		if(localCalculadora.restoDaDivisaoNumInteiro(-2, -1) != 0) {
			temErro = true;
		}
		
		if(localCalculadora.restoDaDivisaoNumInteiro(1, 2) !=  1) {
			temErro = true;
		}
		
		if(temErro) {
			fail("Houve um erro na valida��o do resto da divis�o.");
		}
	}
	
	@BeforeAll
	public static void setup() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void deveRetornarQuatroAoSomarDoisMaisDois() {
		assertEquals(4.0, calculadora.soma(2, 2));
	}
	
	@Test
	public void deveRetornarZeroAoSomarDoisComMenosDois() {
		assertEquals(0.0, calculadora.soma(2, -2));
	}
	
	@Test
	public void deveRetornarZeroAoSubtrairDoisComDois() {
		assertEquals(0.0, calculadora.subtracao(2, 2));
	}
	
	@Test
	public void deveRetornarTresAoSubtrairUmComMenosDois() {
		assertEquals(3.0, calculadora.subtracao(1, -2));
	}
	
	@Test
	public void deveRetornarQuatroAoMultiplicarDoisComDois() {
		assertEquals(4.0, calculadora.multiplicacao(2, 2));
	}
	
	@Test
	public void deveRetornarMenosQuatroAoMultiplicarDoisComMenosDois() {
		assertEquals(-4.0, calculadora.multiplicacao(2, -2));
	}
	
	@Test
	public void deveRetornarQuatroAoMultiplicarDoisComMenosDois() {
		assertEquals(4.0, calculadora.multiplicacao(-2, -2));
	}
	
	@Test
	public void deveRetornarUmAoDividirDoisComDois() {
		assertEquals(1.0, calculadora.divisao(2, 2));
	}
	
	@Test
	public void deveRetornarMenosDoisAoDividirQuatroComMenosDois() {
		assertEquals(-2.0, calculadora.divisao(4, -2));
	}
	
	@Test
	public void deveRetornarZeroNoRestoDivisaoDoisPorDois() {
		assertEquals(0.0, calculadora.restoDaDivisaoNumInteiro(2, 2));
	}
	
	@Test
	public void deveRetornarUmAoDividirTresPorDois() {
		assertEquals(1.0, calculadora.restoDaDivisaoNumInteiro(3, 2));
	}
	
	@DisplayName("Valida m�ltiplas somas com informa��es em CSV")
	@ParameterizedTest
	@CsvSource({"2.0, 2.0, 4.0","2.0, 3.0, 5.0"})
	void validaMultiplasSomasCSV(double valor1, double valor2, double valorEsperado) {
		assertEquals(valorEsperado, calculadora.soma(valor1, valor2));
	}
	
	@DisplayName("Valida m�ltiplas somas com informa��es em arquivo CSV")
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void validaMultiplasSomasArqCSV(double parcela1, double parcela2, double resultadoEsperado) {
        assertEquals(resultadoEsperado, calculadora.soma(parcela1, parcela2));
    }

    @Test
    public void divisaoPorZeroGeraExcecao() {
        assertThrows(ArithmeticException.class, () -> {
        	int resultado = calculadora.restoDaDivisaoNumInteiro(4, 0);
            System.out.println(resultado);
        });
    }
}
