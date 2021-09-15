package test.calculadora;

import calculadora.Calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

	public class CalculadoraTest {

// Métados de teste do métado somar da classe Calculadora
	@Test
	public void testeSomaNumerosComuns() {
		//1) Definindo o cenario de teste
			Calculadora calc = new Calculadora();
					
		//Entradas
			double num1 = 10;
			double num2 = 20;
					
		//Saida
			double resultadoEsperado = 30;
					
		//2) Executar a ação a ser testada 
			double resultadoObtido;
			resultadoObtido = calc.somar(num1, num2);
					
		//3) Verificar o resultado obtido
			Assertions.assertEquals(resultadoEsperado, resultadoObtido);
			
		}		
	
	@Test
	public void testeSomaNumerosNegativos() {
		//1) Definindo o cenario de teste
			Calculadora calc = new Calculadora();
					
		//Entradas
			double num1 = -10;
			double num2 = -2;
					
		//Saida
			double resultadoEsperado = -12;
					
		//2) Executar a ação a ser testada 
			double resultadoObtido;
			resultadoObtido = calc.somar(num1, num2);
					
		//3) Verificar o resultado obtido
			Assertions.assertEquals(resultadoEsperado, resultadoObtido);
		}	
	
	@Test
	public void testeSomaNumerosGrandes() {
		//1) Definindo o cenario de teste
			Calculadora calc = new Calculadora();
					
		//Entradas
			double num1 = 1000000000;
			double num2 = 1000000000;
		//Saida
			double resultadoEsperado = 2000000000;
					
		//2) Executar a ação a ser testada 
			double resultadoObtido;
			resultadoObtido = calc.somar(num1, num2);
					
		//3) Verificar o resultado obtido
			Assertions.assertEquals(resultadoEsperado, resultadoObtido);
			
		}	
	
// Métados de teste do métado subtrair da classe Calculadora
	
	@Test
	public void testeSubtracaoNumerosComuns() {
		//1) Definindo o cenario de teste
			Calculadora calc = new Calculadora();
					
		//Entradas
			double num1 = 50;
			double num2 = 20;
		//Saida
			double resultadoEsperado = 30;
					
		//2) Executar a ação a ser testada 
			double resultadoObtido;
			resultadoObtido = calc.subtrair(num1, num2);
					
		//3) Verificar o resultado obtido
			Assertions.assertEquals(resultadoEsperado, resultadoObtido);
			
		}		

// Métados de teste do métado multiplicar da classe Calculadora
	@Test
	public void testeMultiplicacaoNumerosComuns() {
		//1) Definindo o cenario de teste
			Calculadora calc = new Calculadora();
					
		//Entradas
			double num1 = 12;
			double num2 = 12;
		//Saida
			double resultadoEsperado = 144;
					
		//2) Executar a ação a ser testada 
			double resultadoObtido;
			resultadoObtido = calc.multiplicar(num1, num2);
					
		//3) Verificar o resultado obtido
			Assertions.assertEquals(resultadoEsperado, resultadoObtido);
			
		}	

// Métados de teste do métado dividir da classe Calculadora - CORRETO
	@Test
	public void testeDivisaoNumerosReais() {
		//1) Definindo o cenario de teste
			Calculadora calc = new Calculadora();
					
		//Entradas
			double num1 = 50;
			double num2 = 5;
		//Saida
			double resultadoEsperado = 10;
					
		//2) Executar a ação a ser testada 
			double resultadoObtido;
			resultadoObtido = calc.dividir(num1, num2);
					
		//3) Verificar o resultado obtido
			Assertions.assertEquals(resultadoEsperado, resultadoObtido);
			
		}	
	
	@Test
	public void testeNumeroDivisorValor0() {
		//1) Definindo o cenario de teste
			Calculadora calc = new Calculadora();
					
		//Entradas
			double num1 = 50;
			double num2 = 0;
		//Saida
			double resultadoEsperado = 0;
					
		//2) Executar a ação a ser testada 
			double resultadoObtido;
			resultadoObtido = calc.multiplicar(num1, num2);
					
		//3) Verificar o resultado obtido
			Assertions.assertEquals(resultadoEsperado, resultadoObtido);
			
		}	

// Métados de teste do métado dividir da classe Calculadora - ERRADO
	@Test
	public void testeDivisaoNumerosReaisErro() {
		//1) Definindo o cenario de teste
			Calculadora calc = new Calculadora();
					
		//Entradas
			double num1 = 0;
			double num2 = 5;
		//Saida
			double resultadoEsperado = 10;
					
		//2) Executar a ação a ser testada 
			double resultadoObtido;
			resultadoObtido = calc.dividir(num1, num2);
					
		//3) Verificar o resultado obtido
			Assertions.assertEquals(resultadoEsperado, resultadoObtido);
			
		}	
	
	@Test
	public void testeNumeroDivisorValor0Erro() {
		//1) Definindo o cenario de teste
			Calculadora calc = new Calculadora();
					
		//Entradas
			double num1 = 50;
			double num2 = 4;
		//Saida
			double resultadoEsperado = 0;
					
		//2) Executar a ação a ser testada 
			double resultadoObtido;
			resultadoObtido = calc.multiplicar(num1, num2);
					
		//3) Verificar o resultado obtido
			Assertions.assertEquals(resultadoEsperado, resultadoObtido);
			
		}	
	
}


