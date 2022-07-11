package tp4;

/*
   Potencia: a y b son naturales y lo que se desea es calcular a elevado a
             la b. 

*/

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
			Scanner dato = new Scanner(System.in);
			int a,b;
			System.out.println("ingrese valor para a: ");
			a= dato.nextInt();
			System.out.println("ingrese valor para b: ");
			b= dato.nextInt();
			dato.close();

			int p= potenciaRec(a,b);
				
			System.out.println(a+" elevado a la "+b+" es: "+p);
	
	}
			
    
	//a y b son naturales
	static int potenciaRec(int a,int b){
		if(b==1)
			return a;   //(CASO BASE)
		else
			return a*potenciaRec(a,b-1);
	}




}

