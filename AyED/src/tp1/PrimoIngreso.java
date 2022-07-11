package tp1;
//Determinar si un numero entero es primo o no
//tener en cuenta: el numero 1 no es primo; y los numeros primos solo pueden ser numeros naturales

import java.util.Scanner;

public class PrimoIngreso {
	public static void main(String[] args){
		Scanner dato = new Scanner(System.in);
		int nro;
		boolean respuesta;
		do{
			System.out.println("Ingrese numero: ");
			nro = dato.nextInt();
		}while(nro<=0);
		dato.close();
		
		respuesta = esPrimo(nro);
		
		if(respuesta == true){
			System.out.println("El numero "+nro+" es primo");
		}
		else{
			System.out.println("El numero "+nro+" no es primo");
		}
	}
	//sqrt se usa para obtener la raiz cuadrada del numero
	static boolean esPrimo(int x){
		int pd = 2;
		
		for(int i=2;i<=(x/2);i++){
			if((x%i)==0){//el mod en java se representa con el simbolo %
				pd = pd +1;
			}
		}
		if(pd==2 && x!=1){
			return true;
		}
		else{
			return false;
		}
	}
}