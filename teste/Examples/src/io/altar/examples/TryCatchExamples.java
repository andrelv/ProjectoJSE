package io.altar.examples;

import java.util.Scanner;

public class TryCatchExamples {
static Scanner sc = new Scanner (System.in);
	public static void main (String[] args){
			
	getNumero();
		
	}	
	
	public static void getNumero(){
		System.out.println("Numero : ");
		try {
			int value = sc.nextInt();
			System.out.println("Value :" +value);
		} catch (Exception e) {
			System.out.println("Erro : " +e);
			clearScanner();
			getNumero();
			// TODO: handle exception
		} finally {
			System.out.println("Atum.... saiu do try e do catch ");
		} 
		
	}
	
	public static void clearScanner(){
		sc.nextLine();
	}
}
 