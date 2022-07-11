package tp2;

//Implementar el algoritmo de Euclides (es para calcular el MCD de dos numeros).
//Tener en cuenta que el maximo comun divisor de dos numeros enteros siempre es un numero entero POSITIVO

import java.util.Scanner;

public class Euclides {
	public static void main(String[] args){
		int a,b,mcd;
		
		//ingreso de datos utilizando el Scanner:
		Scanner dato = new Scanner(System.in);
		do{
			System.out.println("Ingrese valor para a: ");
			a = dato.nextInt();
			System.out.println("Ingrese valor para b: ");
			b = dato.nextInt();
		} while(a==0 && b==0);
		dato.close();
		
		/*
		if(b != 0){
			mcd = euclides(a,b);
		}
		else{
			mcd = a;
		}
		System.out.println("MCD("+a+" , "+b+") = "+mcd);
		*/
		
		if(b != 0){
			mcd = euclidesRec(Math.abs(a) , Math.abs(b));//utilizo modulo ya que el MCD es un numero entero positivo
		}
		else{
			mcd = Math.abs(a);//utilizo modulo ya que el MCD es un numero entero positivo
		}
		System.out.println("MCD("+a+" , "+b+") = "+mcd);
		
		/*
		//primera forma e hacer el algoritmo de euclides:
		if(b!=0){//ya que b seria mi dividendo y el dividendo no puede ser cero
			int D = a , d = b , resto;
			
			while(d != 0){
				resto = (D%d);
				D = d;
				d = resto;
			}
			System.out.println("MCD("+a+" , "+b+") = "+D);
		}
		else{
			System.out.println("MCD("+a+" , "+b+") = "+a);
		}
		*/
	}
	
	//AHORA la idea es que euclides sea un metodo (modulo) y por eso tiene que estar afura del main:
	static int euclides(int D , int d){
		int resto;
		
		while(d != 0){
			resto = (D%d);
			D = d;
			d = resto;
		}
		return D;
	}
	
	//segunda forma de hacer el algoritmo de euclides (de manera recursiva)
	static int euclidesRec(int D , int d){
		if(d != 0){
			return euclidesRec(d , (D%d));
		}
		else{
			return D;
		}
	}	
}