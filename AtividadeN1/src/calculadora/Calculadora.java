package calculadora;

public class Calculadora {
	
	public double somar (double num1, double num2){
		double resultado;
			resultado = num1 + num2;
		return resultado;
		}
		
	public double subtrair (double num1, double num2){
		double resultado;
			resultado = num1 - num2;
		return resultado;
		}
		
	public double multiplicar (double num1, double num2){
		double resultado;
			resultado = num1 * num2;
		return resultado;
		}
	
	public double dividir (double num1, double num2){
		double resultado;
		resultado = num1/num2;
			if(num2 == 0)
				return -1;
			else
				return resultado;
			
		}
	}
	


