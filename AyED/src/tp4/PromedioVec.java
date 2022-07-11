package tp4;
import java.util.Scanner;

public class PromedioVec {	

		public static void main(String[] args){
			
			Scanner dato = new Scanner(System.in);
			int n;
			System.out.println("ingrese tamaño del vector: ");
			n= dato.nextInt();
			
			int vec[]= new int[n];
			int elemento;
			
			for(int i=0;i<n;i++){
				System.out.println("ingrese elemento: ");
				elemento= dato.nextInt();
				vec[i] = elemento;
			}
			dato.close();
			
			/*
			double sum=0;
			for(int j=0;j<n;j++){
				sum=sum+vec[j];
			}
			
			double promedio=(double)sum/n;
			*/
			
			double promedio = promedio(vec);
			System.out.println("El promedio es: "+promedio);
		
		}
		
		
		static double promedio(int[] vec) {
			return (double)sumaVec(vec,0)/vec.length;
		}
		
		static int sumaVec(int[] vec, int pos){
			if(pos==vec.length)
				return 0;
			else 
				return vec[pos]+sumaVec(vec, pos+1);
		}


}