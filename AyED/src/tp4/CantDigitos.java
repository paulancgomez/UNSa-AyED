package tp4;
import java.util.Scanner;

public class CantDigitos {

	public static void main(String[] args) {
		
		Scanner dato = new Scanner(System.in);
		int n;
		System.out.println("ingrese valor para n: ");
		n= dato.nextInt();
	    dato.close();
				
		int cantDig = cantidadDigitosRec(n);
		System.out.println("El numero "+n+" posee "+cantDig+" digitos");
	
	}
			
	
	static int cantidadDigitosRec(int nro){
		int cont=1;
		if(nro/10!=0)
			return cont+(cantidadDigitosRec(nro/10));
		else
			return cont;
		
	}
	


}
