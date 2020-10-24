package exercicioLogicaProgramacao7;
import java.util.Scanner;

public class Array {
	
	public Scanner Leitor = new Scanner(System.in);
	private int[] array = new int[10];
	private int i = 0;
	private int x = 9;
	
	public void Array() {
		setValores();
		inverterValores();	
	}
	
	public void setValores() {
		while(i < 10) {
			try {
				System.out.println("Digite um numero:");
				array[i] = Leitor.nextInt();
				i++;
				}
				
				catch (java.util.InputMismatchException e){
					System.out.println("digite apenas numeros!!!");
					Leitor.nextLine();
			}
		}
	}
	public void inverterValores() {
		System.out.println("sequencia Invertida:");
		while(x > -1) {
			System.out.print(array[x] + ",");
			x--;
		}
	}	

}