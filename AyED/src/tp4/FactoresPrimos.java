package tp4;

//FACTORES PRIMOS DE UN NUMERO NATURAL

import java.util.Scanner;

public class FactoresPrimos {

	public static void main(String[] args) {
        
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingrese numero natural: ");
		int num;
		num=leer.nextInt();
		leer.close();
	
		factores(num,2);

	}

	public static void factores (int num, int d){
		if(num!=1) {
		   if(num%d==0) {
			  System.out.println("Factor: "+d);
			  factores(num/d,d);
		   }
		   else
			   factores(num,d+1);
		}
	}


}
