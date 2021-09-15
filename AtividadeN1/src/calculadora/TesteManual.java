package calculadora;
public class TesteManual {
	
	public static void main(String args[]){
		//Criando um objeto da classe calculadora que recebe uma nova instância de calculadora
		
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
		if(resultadoEsperado == resultadoObtido)
			System.out.println("Resposta Correta");
		else
			System.out.println("Resposta Incorreta");
		
	}			 
}						
	
	