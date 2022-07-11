package tp2;

 //Devuelve el minimo comun multipo entre dos numeros enteros.

import java.util.Scanner;

public class Mcm {
	public static void main(String[] args){	
		int a,b,mcm;
		
		Scanner dato = new Scanner(System.in);
		do{
			System.out.println("Ingrese valor para a: ");
			a = dato.nextInt();
			System.out.println("Ingrese valor para b: ");
			b = dato.nextInt();
		} while(a==0 || b==0);
		dato.close();
		
		mcm = minimoComunMultiplo(Math.abs(a),Math.abs(b));
		System.out.println("El mcm("+a+" , "+b+") = "+mcm);
	}
	
	static int euclidesRec(int D , int d){
		if(d != 0){
			return euclidesRec(d , (D%d));
		}
		else{
			return D;
		}
	}
	static int minimoComunMultiplo(int a,int b){
		int mcd = euclidesRec(a,b);
		return ((a*b)/mcd);
	}
}