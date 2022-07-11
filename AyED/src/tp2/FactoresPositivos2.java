package tp2;

//EJERCICIO QUE SUBIO LA CHICA NO SIRVE

import java.util.Scanner;

public class FactoresPositivos2 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese numero: ");
		int num;
		num=leer.nextInt();
		leer.close();
		
		factores(num);

	}
	
	public static void factores(int num) {
		if(num>0) {
			System.out.println("Los factores positivos son: ");
			for(int i=1; i<=Math.abs(Math.sqrt(num));i++) {
				if(restoEntero(num, i)==0) {
					System.out.println(i+" ");
					if(cocienteEntero(num,i)!=i)
					    System.out.println(cocienteEntero(num,i));
				}
			}
		}
	    else
		    System.out.println("DATOS NO VALIDO.");
    }
	
	public static int restoEntero(int a, int b) {
		if(a>=0 && b>0) {
			while(a>=b)
				a=a-b;
		}
		return a;
	}
	
	public static int cocienteEntero(int a, int b) {
		int c=0;
		if(a>=0 && b>0) {
			c=c+1;
			a=a-b;
		}
		return c;
	}
	
	



}


