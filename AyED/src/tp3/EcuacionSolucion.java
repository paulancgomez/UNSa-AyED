package tp3;

/*
   RESUELVE CONGRUENCIA LINEAL SOLO SI a Y m SON COPRIMOS
   OSEA SI MCD(a,m)=1 CON 1 SOLUCION, CON MAS SOLUCIONES NO RESUELVE
 */

import java.util.Scanner;

public class EcuacionSolucion {
	public static void main(String[] args){
		int a,b,m;
		
		Scanner dato = new Scanner(System.in);
		do{
			System.out.println("Ingrese a: ");
			a = dato.nextInt();
			System.out.println("Ingrese b: ");
			b = dato.nextInt();
			System.out.println("Ingrese m: ");
			m = dato.nextInt();
		} while(m<=0);
		dato.close();
		
		if(euclidesRec(a,m)==1){
			int x = solucion(a,b,m);
			System.out.println("la solicion es x = "+x);
		}
		else{
			System.out.println("No se puede resolver la ecuacion lineal de congruencia ya que "+a+" y "+m+" no son comprimos...");
		}
	}
	
	static int euclidesRec(int D , int d){
		if(d != 0){
			return euclidesRec(d , (D%d));
		}
		else{
			return D;
		}
	}
	
	static int bezout(int a, int b){
		int s = 0;
		int OTROs = 1;
		
		int t = 1;
		int OTROt = 0;
		
		int r = b;
		int OTROr = a;
		
		int c,aux;
		
		while(r!=0){
			c = (OTROr/r);
			aux = r; r = (OTROr-(c*aux)); OTROr = aux;
			aux = s; s = (OTROs-(c*aux)); OTROs = aux;
			aux = t; t = (OTROt-(c*aux)); OTROt = aux;
		}	
		int prod1=a*OTROs;
		int prod2=b*OTROt;
		int sum=prod1+prod2;
		if(sum<0){
			OTROs=OTROs*(-1);
			OTROt=OTROt*(-1);
		}
		
		return OTROs;
	}
	static int solucion(int a,int b,int m){
		int s=bezout(a,m);
		System.out.println(s);
		int x0 = b*s;
		
		while(x0 < 0){
			x0=x0+m;
		}
		return x0;
	}
}
