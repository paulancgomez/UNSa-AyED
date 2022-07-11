package tp1;

//Calcula cociente y resto de numeros naturales
		//mediante restas sucesivas: (si funciona)

public class CocienteResto {
	public static void main(String[] args){
		
		/*
		int dividendo,divisor,cociente,resto;
		
		dividendo=11;
		divisor=5;
		cociente=0;
		resto=0;
		
		while(dividendo >= divisor){
			cociente = cociente + 1;
			dividendo = dividendo-divisor;
			resto = dividendo;
		}
		
		System.out.println("El cociente es: "+cociente+" y el resto es "+resto);
		*/	
		
		//Diseñar un programa para calcular el cociente y resto de numeros enteros
		//mediante restas sucesivas: (no funciona, hay que corregirlo)
		
		int dividendo,divisor,cociente,resto;
		
		dividendo=97;
		divisor=-11;
		cociente=0;
		resto=0;
		
		if(dividendo>=0){
			//funciona para dividendo positivo y cualquier divisor
			while(dividendo >= Math.abs(divisor)){ 
				cociente = cociente + 1;
				dividendo = (dividendo- (Math.abs(divisor)));
				resto = dividendo;
			}
			if(dividendo>=0 && divisor>0){
				System.out.println("El cociente es: "+cociente+" y el resto es "+resto);
			}
			else{
				if(dividendo>=0 && divisor<0){
					cociente = Math.negateExact(cociente);//covierte un numero en negativo 
					System.out.println("El cociente es: "+cociente+" y el resto es "+resto);
				}
			}
		}
		else{
			//funciona para dividendo negativo y cualquier divisor
			int copiadividendo;
			copiadividendo = dividendo;
			
			while((copiadividendo<0) && (copiadividendo <= Math.abs(divisor))){
				copiadividendo = copiadividendo + Math.abs(divisor);				
			}
			resto = copiadividendo;
			cociente = (dividendo - resto)/divisor;
			
			System.out.println("El cociente es: "+cociente+" y el resto es "+resto);
			
		//Diseñar un programa para calcular el cociente y resto de numeros enteros:
		//ES LA MANERA MAS EFICIENTE DE HACERLO (si funciona con todos los numeros que probe hasta ahora)
		/*
		int D,d,q,r; //D:dividendo,d:divisor,q:cociente,r:resto
		
		D=-27;
		d=-13;
		
		q= D/d;
		r=(D -(q*d));
		
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
		
		System.out.println("El cociente es: "+q+" y el resto es "+r);
		*/
		}	
    }
}



