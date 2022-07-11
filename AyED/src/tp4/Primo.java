package tp4;

//DETERMINACION DE PRIMO RECURSIVO

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num;
			
		do{
			System.out.println("Ingrese numero: ");
			num = leer.nextInt();
		}while(num<=0);
		
		leer.close();
			
		if(esPrimo(num)==true)
			System.out.println("El numero "+num+" es PRIMO");			
		else
			System.out.println("El numero "+num+" N0 es PRIMO");
    
	}
		


    static boolean esPrimoRec(int num,int PD){			
	    if(Math.pow(PD, 2)>num)
			return true;
	    else{	
		   if(num%PD==0)
			  return false;
		   else
			  return esPrimoRec(num,PD+2);
	    }
    }
	
    
    static boolean esPrimo (int num) {
    	num= Math.abs(num);
		if(num==1)			//el 1 no es primo ni compuesto
		   return false;		
	    else{
		   if(num%2==0){    //si es par osea si es compuesto 
			  if(num==2)    //es 2?
				 return true;  //el 2 es primo
			  else
				 return false;   //cualquier otro compuesto no es primo
		   }				
		   else
			  return esPrimoRec(num,3);  //mando PD=3
	    }
    }



}