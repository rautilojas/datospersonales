package datosPersonales;
import java.util.Scanner;

public class DatosPersonalesScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nombre = " ";
		String apellido = " ";
		String lugarDeResidencia = " ";
		int edad;
		
		System.out.println("Ingrese su nombre: ");
		nombre = scanner.nextLine();
		System.out.println("Ingrese su apellido: ");
		apellido = scanner.nextLine();
		System.out.println("Ingrese su lugar de residencia: ");
		lugarDeResidencia = scanner.nextLine();
		System.out.println("Ingrese su edad");
		edad = scanner.nextInt();
		
		System.out.println("Su nombre es: " + nombre + "\nSu apellido es: " + apellido + "\nTiene: " + edad + " años\nY vive en: " + lugarDeResidencia);
		
	}
	
}