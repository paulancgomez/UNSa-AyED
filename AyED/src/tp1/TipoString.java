package tp1;

//posicion de un caracter de la cadena con charAt
//comparar dos objetos con equals

public class TipoString {

	public static void main(String[] args) {
		String nombre;
		nombre="Pau";
		
		System.out.println(nombre);
		System.out.println(nombre.charAt(0));
		
		String nombre2= new String("Pau");
		System.out.println(nombre2.equals(nombre));
	}

}
