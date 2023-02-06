package datosPersonales;

import javax.swing.JOptionPane;

public class DatosPersonalesFrame {
	
	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
		String lugarDeResidencia = JOptionPane.showInputDialog("Ingrese su lugar de residencia");
		
		JOptionPane.showMessageDialog(null, "Su nombre es: " + nombre + "\nSu apellido es: " + apellido + "\nTiene: " + edad + " años \nVive en: " + lugarDeResidencia); 
	}

}