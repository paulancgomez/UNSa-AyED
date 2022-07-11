package tp1;

//Calcula la division de dos numeros enteros aplicando el metodo de la division Euclidea

import java.util.Scanner;

public class CocienteRestoEnt {
	public static void main(String[] args){
		Scanner dato = new Scanner(System.in);
		int D,d;
		
		System.out.println("Ingrese dividendo: ");
		D = dato.nextInt();
		do{
			System.out.println("Ingrese divisor: ");
			d = dato.nextInt();
		}while(d==0);
		dato.close();
		
		int cociente = PrincipioDivisionEuclidea(D , d);
		int resto = D - (cociente * d);
		System.out.println("El cociente es "+cociente+" y el resto es "+resto);
	}
	
	static int PrincipioDivisionEuclidea(int D , int d){
		int q,r; //D:dividendo,d:divisor,q:cociente,r:resto
		q= D/d;
		r=(D - (q*d));
		
		if(D<0 && d>0){
			r=r+d;
			q=(D-r)/d;
		}
		else{
			if(D>0 && d<0){
				q=(D-r)/d;
			}
			else{
				if(D<0 && d<0){
					r=r-d;
					q=(D-r)/d;
				}
			}
	    }
		return q;
	}
}
