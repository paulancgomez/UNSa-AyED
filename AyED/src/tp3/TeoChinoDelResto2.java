package tp3;

//NO SIRVEEEEEEEEEEEEEE, NO ARROJA RESULTADO

import java.util.Scanner;

public class TeoChinoDelResto2 {
		
			public static void main(String[] args){
				
				Scanner dato = new Scanner(System.in);
				int cant,a,b,m;	
				
				
				do{
					System.out.println("Ingrese cantidad de ecuaciones de congruencia que quiere ingresar: ");
					cant = dato.nextInt();
				}while(cant<=1);
				
				int matrizECongruencia[][] = new int[cant][3];
				
				for(int i=0;i<cant;i++){
					
					do{
						System.out.println("Ingrese a: ");
						a=dato.nextInt();
						System.out.println("Ingrese b: ");
						b=dato.nextInt();
						System.out.println("Ingrese m: ");
						m=dato.nextInt();
					}while(a<=0 || b<=0 || m<=0);
					
					matrizECongruencia[i][0]=a;
					matrizECongruencia[i][1]=b;
					matrizECongruencia[i][2]=m;
				}
				
				int mcd = euclidesRec(matrizECongruencia[0][2],matrizECongruencia[1][2]);
				
				for(int i=2;i<cant;i++){
					mcd = euclidesRec(mcd,matrizECongruencia[i+1][2]);
				}
				
				if(mcd==1){
					//int x = teoremaChino(matrizECongruencia,cant);
				}
				else{
					System.out.println("No puedo aplicar el Teorema Chino del Resto. Por lo tanto no puedo decir nada de la solucion del sistema...");
				}
				dato.close();
			}
			
			static int euclidesRec(int D , int d){
				if(d != 0){
					return euclidesRec(d , (D%d));
				}
				else{
					return D;
				}
			}
			
			static int bezout(int a, int b){
				int s = 0;
				int OTROs = 1;
				
				int t = 1;
				int OTROt = 0;
				
				int r = b;
				int OTROr = a;
				
				int c,aux;
				
				while(r!=0){
					c = (OTROr/r);
					aux = r; r = (OTROr-(c*aux)); OTROr = aux;
					aux = s; s = (OTROs-(c*aux)); OTROs = aux;
					aux = t; t = (OTROt-(c*aux)); OTROt = aux;
				}
				
				int prod1=a*OTROs;
				int prod2=b*OTROt;
				int sum=prod1+prod2;
				if(sum<0){
					OTROs=OTROs*(-1);
					OTROt=OTROt*(-1);
				}
				
				return OTROs;
			}
			static int inverso(int nro,int m){
				int s=bezout(nro,m);
				
				int x0 = s;
				if(s < 0){
					x0=s+m;
				}
				return x0;
			}
			
			static int teoremaChino(int[][] matrizCongruencia,int cantF){
				for(int i=0;i<cantF;i++){
					if(matrizCongruencia[i][0]!=0){
						int inv;
						inv = inverso(matrizCongruencia[i][0],matrizCongruencia[i][2]);
						matrizCongruencia[i][0] = 1;
						matrizCongruencia[i][1] = (matrizCongruencia[i][1]*inv);
					}
				}
				
				//int vecC[] = new int[cantF]; 	
				
				return 23;
			}

}

