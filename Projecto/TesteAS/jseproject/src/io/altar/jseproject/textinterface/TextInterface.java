package io.altar.jseproject.textinterface;

import java.util.Scanner;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.model.Product;

public class TextInterface {

		static int idProd=0;
		static int idShelf=0;
		
		Product ListaProdutos[];
		Shelf ListaShelfs[];
		
		
		// Escolhe o que pretende seleccionar
		public static void ecran1 (){
		Scanner input = new Scanner (System.in);
		System.out.println("Por favor seleccione uma das seguintes opcoes:");
		System.out.println("1) Listar produtos");
		System.out.println("2) Listar prateleiras");
		System.out.println("3) Sair");
		int select = input.nextInt();
		
		if (select==1){
			listaProdutos();
			}
		if (select==2){
			listaPrateleiras();
		}
		if (select==3){
			input.close();
			System.exit(0);
			
		}
		else {
			System.out.println("A opcao introduida nao e valida, seleccione novamente");
			ecran1();
		}
		}	
			
		public static void listaProdutos (){
			//for (i=0;i=listaProdutos.length; i++){}
			
			Scanner input = new Scanner (System.in);
			System.out.println("Por favor seleccione uma das seguintes opcoes:");
			System.out.println("1) Criar novo produto");
			System.out.println("2) Editar um produto existente");
			System.out.println("3) Consultar o detalhe de um produto");
			System.out.println("4) Remover um produto");
			System.out.println("5) Voltar ao ecran anterior");
			int select = input.nextInt();
			
			        switch (select) {
			            case 1:  criaProd();
			                     break;
			            case 2:  editaProd();
			                     break;
			            case 3:  consultaProd();
			                     break;
			            case 4:  removeProd();
			                     break;
			            case 5:  ecran1();
			                     break;
			            
			            default: System.out.println("A opcao introduida nao e valida.");
			            			listaProdutos();
			                     break;
			        
			}
			        listaProdutos();
		}
		
		public static void criaProd(){
			for (int i = 0; i= ListaProdutos.length; i++){
				System.out.println("Produto "+i+": " +ListaProdutos[i]);
			}
			
			Scanner input = new Scanner (System.in);
			System.out.println("Indique a prateleira do novo produto");
			int shelf = input.nextInt();
			Scanner input1 = new Scanner (System.in);
			System.out.println("Indique o desconto do novo produto");
			int desconto = input1.nextInt();
			Scanner input2 = new Scanner (System.in);
			System.out.println("Indique o IVA do novo produto");
			int iva = input2.nextInt();
			Scanner input3 = new Scanner (System.in);
			System.out.println("Indique o preco do novo produto");
			double preco = input3.nextDouble();
			idProd++;
			Product produto1 = new Product(idProd, shelf, desconto, iva, preco);
			System.out.println("Produto criado com [Id=" +produto1.getId() +" Prateleira:" +produto1.getShelf() +" desconto= " +produto1.getDesconto()+"% Preco: " +produto1.getPreco()+"]");
		//falta por na lista
		}
		
		public static void editaProd(){}
		
		public static void consultaProd(){}
		
		public static void removeProd(){}
		
		
		
		
		
		
		
			
		public static void listaPrateleiras(){
			Scanner input = new Scanner (System.in);
			System.out.println("Por favor seleccione uma das seguintes opcoes:");
			System.out.println("1) Criar nova prateleira");
			System.out.println("2) Editar uma prateleira existente");
			System.out.println("3) Consultar o detalhe de uma prateleira");
			System.out.println("4) Remover uma prateleira");
			System.out.println("5) Voltar ao ecran anterior");
			int select = input.nextInt();
			
			switch (select) {
            case 1:  criaShelf();
                     break;
            case 2:  editaShelf();
                     break;
            case 3:  consultaShelf();
                     break;
            case 4:  removeShelf();
                     break;
            case 5:  ecran1();
                     break;
            
            default: System.out.println("A opcao introduida nao e valida.");
            			listaPrateleiras();
                     break;      
							}
			listaPrateleiras();
		}
		
		public static void criaShelf(){
			Scanner input = new Scanner (System.in);
			System.out.println("Indique a capacidade da nova prateleira");
			int capacidade = input.nextInt();
			Scanner input1 = new Scanner (System.in);
			System.out.println("Indique o preco de aluguer");
			double preco = input1.nextDouble();
			idShelf++;
			Shelf shelf1 = new Shelf (idShelf, capacidade, preco);
			System.out.println("Foi criada a Shelf sem produtos com [ID= " +idShelf +" capacidade: " +capacidade +" preco: " +preco +"] ");
		}

		
		public static void editaShelf(){}
		
		public static void consultaShelf(){}
		
		public static void removeShelf(){}
		
		
}
		
