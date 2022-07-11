package tp1;

//Determina si un numero asignado es primo

public class Primo {
	public static void main(String[] args){
		int nro,pd,i;
		
		nro=91;
		pd=2;
	
		for(i=2; i<=((int)(Math.sqrt(nro)));i++){
			int q=nro/i;
			int r=nro-(q*i);
			if(r==0){
				pd=pd+1;
			}
		}
		
		if(pd<=2){
			System.out.println("Es primo");
		}
		else{
			System.out.println("No es primo");
		}
	}
}
