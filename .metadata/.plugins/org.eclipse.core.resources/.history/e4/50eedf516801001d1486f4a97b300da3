package tp1;

/* FACTORES DE UN NUMERO CUANDO FACTORIZAMOS (valga la redundancia jex):
 *       Ejemplo: Si num=432, mostrara 2,2,2,2,3,3,3


*/
import java.util.Scanner;

public class FactoresTodos {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingrese numero: ");
		int num;
		num=leer.nextInt();
		leer.close();
		
		factores(num);

	}
	
	//FACTORIZAMOS
	
	public static void factores (int num){
		int d=2;
		while(num!=1) {
		   if(num%d==0) {
			  System.out.println("Factor: "+d);
			  num=num/d;
		   }
		   else
			   d=d+1;
		}
	}

}

