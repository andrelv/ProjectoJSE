package io.altar.helloworld;
import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("muda de linha");
		System.out.print("Hello !!");
		System.out.println(" World !!");

		Veiculo veiculo1 = new Veiculo(3, 0, "Piagio", false);
		veiculo1.toString();
		System.out.println(veiculo1);
		System.out.println("rodas " + veiculo1.getRodas());
		veiculo1.setRodas(4);
		veiculo1.setMarca("Yamaha");
		System.out.println(veiculo1.getRodas());
		
		Scanner input = new Scanner(System.in);
		 
		 System.out.println("Insira um ano:");
		 int ano = input.nextInt();
		 input.close();
		 boolean X=isAnoBissexto(ano);
		 
		 if(X==false){
			 System.out.println("O ano " +ano +" NAO e Bissexto");
		 }else{
			 System.out.println("O ano " +ano +" E Bissexto");
		 }
	}
 
	public static boolean isAnoBissexto(int ano) {
		
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
}
