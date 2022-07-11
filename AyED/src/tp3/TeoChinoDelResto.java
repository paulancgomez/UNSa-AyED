package tp3;

/*
   ARROJA REAULTADO PERO NO LE PEGA
 
 */

import java.util.Scanner;

public class TeoChinoDelResto {
	public static void main(String[] args){
		Scanner dato = new Scanner(System.in);
		int cant,a,b,m;	
		do{
			System.out.println("Ingrese cantidad de ecuaciones de congruencia que quiere ingresar: ");
			cant = dato.nextInt();
		}while(cant<=0);
	
		switch(cant){
		case 1:{
			do{
				System.out.println("Ingrese a: ");
				a=dato.nextInt();
				System.out.println("Ingrese b: ");
				b=dato.nextInt();
				System.out.println("Ingrese m: ");
				m=dato.nextInt();
			}while(a<=0 || b<=0 || m<=0);
			
			int mcd= euclidesRec(a,m);
			
			if(b%mcd==0){
				int s=bezout(a,m);
				int vec[]= new int[mcd];
				
				vec[0]=((b*s)/mcd);
				while(vec[0]<0){
					vec[0]=((vec[0])+m);//lo realizo para que mi solucion sea un numero positivo en Zm
				}
				
				for(int i=1;i<mcd;i++){
					vec[i]= (vec[i-1] + ((m/mcd)*i))%m;
				}
				System.out.println("la soliciones son: ");
				for(int j=0;j<mcd;j++){
					System.out.println("x"+j+" = "+vec[j]);
				}
			}
			else{
				System.out.println("No se puede resolver la ecuacion lineal de congruencia ya que "+mcd+" de "+a+" y "+m+" no son divisde a "+b+"...");
			}
			
			break;
		}
		case 2:{
			int vec[]=new int[3];
			int vec2[]=new int[3];
			
			do{
				System.out.println("Ingrese a: ");
				a=dato.nextInt();
				System.out.println("Ingrese b: ");
				b=dato.nextInt();
				System.out.println("Ingrese m: ");
				m=dato.nextInt();
			}while(a<=0 || b<=0 || m<=0);
			
			vec[0]=a;vec[1]=b;vec[2]=m;
			
			do{
				System.out.println("Ingrese a: ");
				a=dato.nextInt();
				System.out.println("Ingrese b: ");
				b=dato.nextInt();
				System.out.println("Ingrese m: ");
				m=dato.nextInt();
			}while(a<=0 || b<=0 || m<=0);
			
			vec2[0]=a;vec2[1]=b;vec2[2]=m;
			
			if(vec[0]!=1){
				int inv= inverso(vec[0],vec[2]);
				vec[0]=1;
				vec[1]=(vec[1]*inv);
			}
			if(vec2[0]!=1){
				int inv= inverso(vec2[0],vec2[2]);
				vec2[0]=1;
				vec2[1]=(vec2[1]*inv);
			}
			
			int Z=vec[2]*vec2[2];
			int mcd = euclidesRec(vec[2],vec2[2]);
			if(mcd==1){
				int c1,c2;
				
				int inv = inverso(vec[2],vec2[2]);
				c1= vec[2]*inv*vec2[1];
				
				inv = inverso(vec2[2],vec[2]);
				c2= vec2[2]*inv*vec[1];
				
				int x= c1+c2;
				x=x%Z;
				System.out.println("La solucion es "+x+" en Z"+Z);
			}
			else{
				System.out.println("No puedo aplicar el Teorema Chino del Resto ya que "+vec[2]+" y "+vec2[2]+" no son primos de a dos. Por lo tanto no puedo decir nada de la solucion del sistema...");
			}
			
			
			break;
		}
		case 3:{
			int vec[]=new int[3];
			int vec2[]=new int[3];
			int vec3[]=new int[3];
			
			do{
				System.out.println("Ingrese a: ");
				a=dato.nextInt();
				System.out.println("Ingrese b: ");
				b=dato.nextInt();
				System.out.println("Ingrese m: ");
				m=dato.nextInt();
			}while(a<=0 || b<=0 || m<=0);
			
			vec[0]=a;vec[1]=b;vec[2]=m;
			
			do{
				System.out.println("Ingrese a: ");
				a=dato.nextInt();
				System.out.println("Ingrese b: ");
				b=dato.nextInt();
				System.out.println("Ingrese m: ");
				m=dato.nextInt();
			}while(a<=0 || b<=0 || m<=0);
			
			vec2[0]=a;vec2[1]=b;vec2[2]=m;
			
			do{
				System.out.println("Ingrese a: ");
				a=dato.nextInt();
				System.out.println("Ingrese b: ");
				b=dato.nextInt();
				System.out.println("Ingrese m: ");
				m=dato.nextInt();
			}while(a<=0 || b<=0 || m<=0);
			
			vec3[0]=a;vec3[1]=b;vec3[2]=m;
			
			if(vec[0]!=1){
				int inv= inverso(vec[0],vec[2]);
				vec[0]=1;
				vec[1]=(vec[1]*inv);
			}
			if(vec2[0]!=1){
				int inv= inverso(vec2[0],vec2[2]);
				vec2[0]=1;
				vec2[1]=(vec2[1]*inv);
			}
			if(vec3[0]!=1){
				int inv= inverso(vec3[0],vec3[2]);
				vec3[0]=1;
				vec3[1]=(vec3[1]*inv);
			}
			int Z=vec[2]*vec2[2]*vec3[2];
			int mcd = euclidesRec(vec[2],vec2[2]);
			int mcd2= euclidesRec(vec[2],vec3[2]);
			int mcd3= euclidesRec(vec3[2],vec2[2]);
			
			if(mcd==1 && mcd2==1 && mcd3==1){
				int c1,c2,c3;
				
				int inv = inverso((vec2[2]*vec3[2]), vec[2]);
				c1 = (vec2[2]*vec3[2])*inv*vec[1];
				
				inv = inverso((vec[2]*vec3[2]),vec2[2]);
				c2= (vec[2]*vec3[2])*inv*vec2[1];
				
				
				inv = inverso((vec[2]*vec2[2]),vec3[2]);
				c3= (vec[2]*vec2[2])*inv*vec3[1];
				
				int x= c1+c2+c3;
				x=x%Z;
				System.out.println("La solucion es: "+x+" en Z"+Z);
			}
			else{
				System.out.println("No puedo aplicar el Teorema Chino del Resto ya que "+vec[2]+" , "+vec2[2]+" y "+vec3[2]+" no son primos de a dos. Por lo tanto no puedo decir nada de la solucion del sistema...");
			}
		
			break;
		}
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
}
