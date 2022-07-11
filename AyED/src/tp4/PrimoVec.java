package tp4;

/* RECURSIVO: Dada una lista de enteros positivos determine para cada uno de los elementos
              si es primo o no. Devuelva la lista resultado.
 
 */

import java.util.Scanner;

public class PrimoVec {

	public static void main(String[] args) {
		
		int vec[]=new int[5];
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingrese 5 numeros: ");
		for(int i=0; i<5; i++) { 
			System.out.println("Numero "+(i+1)+": ");
			vec[i]=leer.nextInt();
		}
	    
		leer.close();
	    
		primoVec(vec, 0);
		
		System.out.println("MUESTRA VECTOR: 0 (NO PRIMO) - 1 (PRIMO) ");
		for(int i=0; i<5; i++) { 
			System.out.println("Numero "+(i+1)+": "+vec[i]);
		}
		

	}
	
	
	static void primoVec (int vec[], int i) {
		if(i<vec.length) {
		    vec[i]=esPrimo(vec[i]);
		    primoVec(vec, i+1);
		}
	}

    
    static int esPrimo (int num) {
    	num= Math.abs(num);
		if(num==1)			//el 1 no es primo ni compuesto
		   return 0;		
	    else{
		   if(num%2==0){    //si es par osea si es compuesto 
			  if(num==2)    //es 2?
				 return 1;  //el 2 es primo
			  else
				 return 0;   //cualquier otro compuesto no es primo
		   }				
		   else
			  return esPrimoRec(num,3); 
	    }
    }
    
     static int esPrimoRec(int num, int PD){			
	     if(Math.pow(PD, 2)>num)
			return 1;
	     else{	
		    if(num%PD==0)
		 	   return 0;
		    else
			   return esPrimoRec(num,PD+2);
	    }
    }

     
     
}
