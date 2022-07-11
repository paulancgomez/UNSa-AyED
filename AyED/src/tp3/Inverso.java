package tp3;

//DEVUELVE EL INVERSO DE UN NUMERO EN Zm DADO (SIRVE) 

import java.util.Scanner;

public class Inverso {
	public static void main(String[] args){
		int nro,m;
		
		Scanner dato = new Scanner(System.in);
		do{
			System.out.println("Ingrese numero: ");
			nro = dato.nextInt();
			System.out.println("Ingrese m: ");
			m = dato.nextInt();
		} while(nro==0 && m==0);
		dato.close();
		
		if(euclidesRec(nro,m)==1){
			int x = inverso(nro, m);
			System.out.println("El inverso de "+nro+" en Z"+m+" es: "+x);
		}
		else{
			System.out.println(" "+0+" Ya que el numero "+nro+" no posee inverso en Z"+m);
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
	static int inverso(int nro,int m){
		int s=bezout(nro,m);
		
		int x0 = s;
		if(s < 0){
			x0=s+m;
		}
		return x0;
	}
}