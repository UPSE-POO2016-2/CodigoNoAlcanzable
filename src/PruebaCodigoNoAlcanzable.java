
public class PruebaCodigoNoAlcanzable {

	public PruebaCodigoNoAlcanzable() {
		// TODO Auto-generated constructor stub
	}
	
	public static int sumar(int a, int b)
	{
		int operando1 = a;
		int operando2 = b;
		int suma = operando1 + operando2;
		return suma;
	}
	
	public static int dividir(int dividendo, int divisor) throws ArithmeticException
	{
		int resultadoDivision;
		if(divisor != 0)
		{
		 resultadoDivision = dividendo/divisor;
		}else{
			throw new ArithmeticException("MegaFatalError Salvaje Nivel 23: Error al dividir por 0");
		}
		
		
		return resultadoDivision;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int divisionsita = dividir(25, 0);
			System.out.println("Mi divisionsita da " 
								+ divisionsita);
		} catch(ArithmeticException e) {
			// TODO: handle exception
			System.err.println("Error del codigo de otro programador");
			//e.printStackTrace();		
			}
		
	}

}
