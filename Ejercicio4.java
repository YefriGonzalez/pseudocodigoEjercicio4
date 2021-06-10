import java.util.*;
public class Ejercicio4{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int mayorEdad=0;
		int menorEdad=0;
		int edad;
		for(int i=0;i<20;i++){
			System.out.print("Ingrese la edad: ");
			edad=scanner.nextInt();
			if(edad>mayorEdad){
				mayorEdad=edad;
			} else if(edad<mayorEdad){
				menorEdad=edad;
			}
		}
		System.out.println("La edad mayor es: "+mayorEdad+" años");
		System.out.println("La edad menor es: "+menorEdad+" años");
	}
}