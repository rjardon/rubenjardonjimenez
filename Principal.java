package tareamatriz1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Rub�n Jard�n Jim�nez
 * @version 1.0
 */
public class Principal {

	public static Scanner teclado = new Scanner (System.in);
	public static int min = 10;//variable de los alumnos m�nimos
	public static int max = 20;//variable de los alumnos m�ximos
	
	/**
	 * M�todo main
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] clase = {{15,19,20,12},{16,14,12,11},{17,20,11,10},{11,12,13,18},{18,19,20,19}};//matriz de 5 x 4 introduciendo n� de alumnos
		int num;
		
		//do while para hacer el men� del programa
		do {
			
			System.out.println("1.Mostrar valores.");
			System.out.println("2.Mostrar total de alumnos por d�a.");
			System.out.println("3.Mostrar total de alumnos por hora.");
			System.out.println("4.Mostrar la media de alumnos de cada d�a.");
			System.out.println("5.Mostrar d�a y hora donde hay un n�mero de alumnos determinado.");
			
			System.out.println("�Qu� desea hacer?");
			num = teclado.nextInt();
			
			switch(num) {
			
			case 1: if(min >= 10 && max <= 20) {//el caso 1 llama al m�todo mostrarHorario
				mostrarHorario(clase);
			}
			break;
			
			case 2: if(min >= 10 && max <= 20) {//el caso 2 llama al m�todo mostrarTotalDia
				mostrarTotalDia(clase);
			}
			break;
			
			case 3: if(min >= 10 && max <= 20) {//el caso 3 llama al m�todo mostrarTotalHoras
				mostrarTotalHoras(clase);
			}
			break;
			
			case 4: if(min >= 10 && max <= 20) {//el caso 4 llama al m�todo mediaHoras
				mediaHoras(clase);
			}
			break;
			
			case 5: numAlum(clase);//el caso 5 llama al m�todo numAlum
			
			break;
		}
	}
		while(num != 0);
		
	}
	
	/**
	 * M�todo que muestra la matriz de los d�as y los alumnos en cada hora
	 * @param clase
	 */
	public static void mostrarHorario(int[][]clase) {
		
		String [] dias = {"Lunes: ","Martes: ","Mi�rcoles: ","Jueves: ","Viernes: "};//creaci�n de vector para los d�as
		
		for(int i = 0;i < clase.length;i++) {
			
			System.out.println(dias[i]);
			System.out.print("\t");

			for(int j = 0;j < clase[i].length;j++) {
				
				System.out.print(clase[i][j]);
				System.out.print("\t");
				
			}
			System.out.println("|");
		}
		
	}

	/**
	 * M�todo que muestra el total de alumnos por d�a
	 * Necesitamos crear una variable suma para que vaya sumando alumnos
	 * @param clase
	 */
	public static void mostrarTotalDia(int[][]clase) {
		
		int suma = 0;
		
		for(int j = 0;j < clase.length;j++) {
			
			for(int i = 0;i < clase[j].length;i++) {
				
				suma += clase[j][i];
				
			}
			System.out.println("La suma de alumnos es: "+suma);
		}
		
	}
	/**
	 * M�todo que muestra el total de alumnos por hora
	 * Tambi�n crearemos una variable para sumar los alumnos
	 * @param clase
	 */
	public static void mostrarTotalHoras(int[][]clase) {
		
		for(int i = 0;i < clase[0].length;i++) {
			
			int suma = 0;
			
			for(int j = 0;j < clase.length;j++) {
				
				suma += clase[j][i];
				
			}
			System.out.println("La suma de alumnos es: "+suma);
		}
	}
	
	/**
	 * M�todo que saca la media de alumnos por hora
	 * @param clase
	 */
	public static void mediaHoras(int[][]clase) {
		
		for(int i = 0;i < clase[0].length;i++) {
			
			int suma = 0;
			int cont = 0;
			
			for(int j = 0;j < clase.length;j++) {
				
				cont++;
				suma += clase[j][i];
				
				
				
			}
			System.out.println("La media de alumnos por hora es: "+(suma/cont));
		}
	}
	
	/**
	 * M�todo para sacar la posici�n donde se encuentra el n�mero de alumnos que has introducido
	 * Debe sacar d�a y hora. Si el n�mero introducido se repite te mostrar� todos los d�as y todas las horas
	 * donde hay ese n�mero de alumnos.
	 * @param clase
	 */
	public static void numAlum(int[][]clase) {
		
		boolean encontrado = false;
		
		System.out.println("Introduce un n�mero: ");
		int num = teclado.nextInt();
		
		for(int i = 0;i < clase.length;i++) {
			
			for(int j = 0;j < clase[i].length;j++) {
				
				if(num == clase[i][j]) {
					
					encontrado = true;
					
					System.out.println(clase[i][j]+" a "+(j+1)+" hora "+" el d�a "+(i+1));
				}
			}
		}
		    if(encontrado = false) {
			System.out.println("Se te va la cabeza.");
		}
	
	}
}
