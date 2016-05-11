package calc;

public class Calculadora {
	
	// Versão 2.0.0

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		
		double resultado = calc.Somar(32, 84);
		System.out.println("Resultado da Soma (32 + 84)");
		System.out.println(resultado);
		System.out.println();
		
		resultado = calc.Subtrair(32, 8);
		System.out.println("Resultado da Subtração (32 - 8)");
		System.out.println(resultado);
		System.out.println();
		
		resultado = calc.Multiplicar(3, 8);
		System.out.println("Resultado da Multiplicação (3 * 8)");
		System.out.println(resultado);
		System.out.println();
		
		resultado = calc.Dividir(32, 8);
		System.out.println("Resultado da Divisão (32 / 8)");
		System.out.println(resultado);
		System.out.println();
		
	}

	public double Somar(double param1, param2){

		return param1 + param2;

	}

	public double Subtrair(double param1, param2){

		return param1 - param2;

	}

	public double Multiplicar(double param1, param2){

		return param1 * param2;

	}

	public double Dividir(double param1, param2){

		return param1 / param2;

	}
}
