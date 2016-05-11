package calc;

public class Calculadora {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		
		double resultado = calc.Somar(32, 84);
		System.out.println(resultado);
		
		resultado = calc.Subtrair(32, 8);
		System.out.println(resultado);
		
		resultado = calc.Multiplicar(3, 8);
		System.out.println(resultado);
		
		resultado = calc.Dividir(32, 8);
		System.out.println(resultado);
	}

	public double Somar(double param1, double param2){

		return param1 + param2;

	}

	public double Subtrair(double param1, double param2){

		return param1 - param2;

	}

	public double Multiplicar(double param1, double  param2){

		return param1 * param2;

	}

	public double Dividir(double param1, double param2){

		return param1 / param2;

	}
}
