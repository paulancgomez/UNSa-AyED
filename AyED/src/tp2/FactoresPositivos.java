package tp2;

 //Devuelve todos los factores positivos de un numero positivo dado. NO ANDAAA


import java.util.Scanner;

public class FactoresPositivos {
	public static void main(String[] args){
		Scanner dato = new Scanner(System.in);
		int nro;
		
		do{
			System.out.println("Ingrese numero: ");
			nro = dato.nextInt();
		}while(nro<=1);
		dato.close();
		
		if(esPrimo(nro)){
			System.out.println("Los unicos factores positivo de "+nro+" son: "+nro+" ; 1");
		}
		else{
			facposnum(nro);
		}
	}
	
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
	
	static void facposnum(int nro){
		int aux = nro;
		int tam;
		int vec[];
		
		if(nro<=8){
			tam = nro;
		}
		else{
			tam = nro/2;//no se usa esto (int)Math.sqrt(nro) ya que aqui pongo a todos los factores
		}
		
		vec = new int[tam];
		
		int posibleDivisor = 2;
		int indice = 0;
		
		while(aux != 1){
			while((aux%posibleDivisor)==0){
				vec[indice] = posibleDivisor;
				indice=indice+1;
				vec[indice] = aux/posibleDivisor;
				indice=indice+1;
				aux=aux/posibleDivisor;
			}
			posibleDivisor=posibleDivisor+1;
			
		}
	
		System.out.println("los factores positivos del numero "+nro+" son: ");
		for(int i=0;i<tam;i++){
			if(vec[i]!=0){
				System.out.print("; "+vec[i]+" ");
			}
		}
	}
}