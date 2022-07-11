package tp4;

/*
   CALCULA EL MCD DE DOS NUMEROS NO NEGATIVOS MEDIANDO EL ALGORITMO DE
   EUCLIDES.
   SI a Y b SON NULOS ES INCORRECTO. Solo uno de los dos puede ser nulo o
   ninguno
 
 */

import java.util.Scanner;

public class Euclides {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		int a, b;
		System.out.println("Ingrese valor para a: ");
		a=leer.nextInt();
		System.out.println("Ingrese valor para b: ");
		b=leer.nextInt();
		
		leer.close();
	    
		int mcd=mcd(a,b);
		
		if(mcd!=-1)
	       System.out.println("El mcd de a y b mediante Euclides es: "+mcd);	
		else
			System.out.println("Datos invalidos, a y b no deben ser ambos nulos.");
	
	}
	
	
	static int mcd(int a, int b) {
		a=Math.abs(a);
		b=Math.abs(b);
		if(a==0 && b==0)
			return -1;
		else
			return mcdRec(a,b);
	}
	
	static int mcdRec(int a, int b) {
		if(b==0)
			return a;
		else
			return mcdRec(b, resto(a,b));
	}

	static int resto(int a, int b) {
		if(a>=0 && b>0) {
			while(a>=b) {
				a=a-b;
			}
		}
		return a;
	}
	
}
