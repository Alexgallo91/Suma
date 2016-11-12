import java.util.Scanner;

public class Suma {
	
	public static void main(String []args)
	{
		int numero1;
		int numero2;
		int suma;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer numero:");
		numero1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero:");
		numero2 = sc.nextInt();
		
		suma = numero1 + numero2;
		
		System.out.println("La suma en total es: " + suma);
	}

}
