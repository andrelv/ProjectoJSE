package io.altar.jseproject.textinterface;

import java.util.Calendar;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;

import io.altar.jseproject.model.Shelf;
import repositories.ProductRepository;
import repositories.ShelfRepository;
import io.altar.jseproject.model.Product;

public class TextInterface {

	private ProductRepository repositorioProdutos = new ProductRepository();
	private ShelfRepository repositorioShelf = new ShelfRepository();

	long idProd = 0;
	long idShelf = 0;

	// Escolhe o que pretende seleccionar
	public void ecran1() {
		Scanner input = new Scanner(System.in);
		System.out.println("Por favor seleccione uma das seguintes opcoes:");
		System.out.println("1) Listar produtos");
		System.out.println("2) Listar prateleiras");
		System.out.println("3) Sair");

		// validar(input);

		int select = input.nextInt();

		if (select == 1) {
			listaProdutos();
		}
		if (select == 2) {
			listaPrateleiras();
		}
		if (select == 3) {
			input.close();
			System.exit(0);

		} else {
			System.out.println("A opcao introduida nao e valida, seleccione novamente");
			ecran1();
		}
	}

	public void listaProdutos() {
		// System.out.println("");
		Collection<Product> ListaProdutos = repositorioProdutos.getAll();
		if (ListaProdutos.size() != 0) {
			System.out.println("Produtos existentes: ");
		}
		for (Product product : ListaProdutos) {

			System.out.println(product.toString());
		}
		System.out.println("");
		Scanner input = new Scanner(System.in);
		System.out.println("Por favor seleccione uma das seguintes opcoes:");
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar um produto existente");
		System.out.println("3) Consultar o detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecran anterior");
		String select = input.nextLine();

		switch (select) {
		case "1":
			criaProd();
			break;
		case "2":
			editaProd();
			break;
		case "3":
			consultaProd();
			break;
		case "4":
			removeProd();
			break;
		case "5":
			ecran1();
			break;

		default:
			System.out.println("A opcao introduida nao e valida.");
			listaProdutos();
			break;
		}
		listaProdutos();
	}

	public void criaProd() {

		Collection<Product> ListaProdutos = repositorioProdutos.getAll();

		System.out.println("");
		Scanner input = new Scanner(System.in);
		System.out.println("Indique a prateleira do novo produto");
		int shelf = input.nextInt();
		Scanner input1 = new Scanner(System.in);
		System.out.println("Indique o desconto do novo produto");
		double desconto = input1.nextInt();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Indique o IVA do novo produto");
		double iva = input2.nextInt();
		Scanner input3 = new Scanner(System.in);
		System.out.println("Indique o preco do novo produto");
		double preco = input3.nextDouble();

		Product produto1 = new Product(shelf, desconto, iva, preco);
		repositorioProdutos.save(produto1);
		System.out.println("Produto criado: " + produto1.toString());
		System.out.println("");
		listaProdutos();
	}

	public void editaProd() {
		Scanner input = new Scanner(System.in);
		Collection<Product> ListaProdutos = repositorioProdutos.getAll();
		long nr = 0;
		if (ListaProdutos.size() == 0) {
			System.out.println("Nao existem Produtos para editar, crie um novo Produto primeiro.");
			System.out.println("");
			criaProd();
		} else {
			if (ListaProdutos.size() == 1) {
				for (Product product : ListaProdutos) {
					nr = product.getId();
					System.out.println("So existe 1 produto.");
				}
			} else {
				System.out.println("Existem " + ListaProdutos.size() + " produtos, qual o produto que pretende editar?");
				for (Product product : ListaProdutos) {
					System.out.println("ID: " + product.getId());
				}
				nr = input.nextLong();
				input.nextLine();
				
				if (nr > ListaProdutos.size() || nr==0) {
					System.out.println("O valor introduzido nao e valido...");
					editaProd();
				}
			}
	if (repositorioProdutos.findById(nr) == null) {
		System.out.println("O valor introduzido nao e valido...");
		editaProd();
	}
			System.out.println("O produto com o Id: " + nr + " tem os seguintes atributos:");
			System.out.println("");
			System.out.println(repositorioProdutos.findById(nr));
			System.out.println("");
			System.out.println("Shelf " + repositorioProdutos.findById(nr).getShelf());				//////}
			
			Product produto1 = repositorioProdutos.findById(nr);
			String txt = input.nextLine();
			if (txt.equals("")) {
				long shelf = 0;
				repositorioProdutos.findById(nr).setShelf(shelf);

			} else {
				long shelf = Long.parseLong(txt);
				repositorioProdutos.findById(nr).setShelf(shelf);
			}
			System.out.println("Desconto " + repositorioProdutos.findById(nr).getDesconto());
			String txt1 = input.nextLine();

			if (txt1.equals("")) {

			} else {
				double desc = Long.parseLong(txt1);
				repositorioProdutos.findById(nr).setDesconto(desc);
			}
			System.out.println("IVA " + repositorioProdutos.findById(nr).getIva());
			String txt2 = input.nextLine();
			if (txt2.equals("")) {

			} else {
				double iva = Long.parseLong(txt2);
				repositorioProdutos.findById(nr).setIva(iva);
			}
			System.out.println("Preco " + repositorioProdutos.findById(nr).getPreco());
			String txt4 = input.nextLine();
			if (txt4.equals("")) {

			} else {
				double preco = Long.parseLong(txt4);
				repositorioProdutos.findById(nr).setPreco(preco);
			}

			repositorioProdutos.updateById(produto1);
			System.out.println("Produto " + nr + " editado com sucesso");
			System.out.println("");
			listaProdutos();
		}
	}

	public void consultaProd() {

		Collection<Product> ListaProdutos = repositorioProdutos.getAll();
		long nr = 0;
		if (ListaProdutos.size() > 0) {
			if (ListaProdutos.size() == 1) {
				nr = 1;
				System.out.println("So existe 1 produto:");
			} else {
				System.out.println("Existem " + ListaProdutos.size() + " Produtos:");

				for (Product product : ListaProdutos) {
					System.out.println("ID: " + product.getId());
				}
				System.out.println("Qual o id que pretende consultar?");
				Scanner input = new Scanner(System.in);
				nr = input.nextLong();
			}
			if (repositorioProdutos.findById(nr) != null) {
				System.out.println("Produto escolhido: " + repositorioProdutos.findById(nr));
				System.out.println("");
			} else {
				System.out.println("O produto escolhido nao existe, seleccione outro ID");
				System.out.println("");
				consultaProd();
			}
		} else {
			System.out.println("Nao existem produtos criados, crie um novo.");
			System.out.println("");
			criaProd();
		}
	}

	public void removeProd() {

		Collection<Product> ListaProdutos = repositorioProdutos.getAll();
		long nr = 0;
		if (ListaProdutos.size() > 0) {
			if (ListaProdutos.size() == 1) {
				nr = 1;
				System.out.println("So existe 1 produto:");
			} else {
				System.out.println("Existem " + ListaProdutos.size() + " Produtos");
				for (Product product : ListaProdutos) {

					System.out.println("ID: " + product.getId());
				}
				System.out.println("Qual o id que pretende remover?");
				Scanner input = new Scanner(System.in);
				nr = input.nextLong();
			}
			if (repositorioProdutos.findById(nr) != null) {
				System.out.println("Produto escolhido: " + repositorioProdutos.findById(nr));
				System.out.println("");
				System.out.println("Remover o produto com Id: " + nr + " ? (S)/(N)");
			} else {
				System.out.println("O produto escolhido nao existe, seleccione outro ID");
				System.out.println("");
				removeProd();
			}

			Scanner input = new Scanner(System.in);
			String a = input.nextLine();

			if (a.equals("s")) {
				repositorioProdutos.removeById(nr);
				System.out.println("Produto com Id: " + nr + " removido com sucesso!");
				System.out.println("");
				listaProdutos();
			} else {
				System.out.println("O produto nao foi removido");
				System.out.println("");
				listaProdutos();
				System.out.println("");
			}

		} else {
			System.out.println("Nao existem produtos criados, crie um novo.");
			System.out.println("");
			criaProd();
		}

	}

	public void listaPrateleiras() {
		Scanner input = new Scanner(System.in);
		System.out.println("Por favor seleccione uma das seguintes opcoes:");
		System.out.println("1) Criar nova prateleira");
		System.out.println("2) Editar uma prateleira existente");
		System.out.println("3) Consultar o detalhe de uma prateleira");
		System.out.println("4) Remover uma prateleira");
		System.out.println("5) Voltar ao ecran anterior");
		String select = input.nextLine();

		switch (select) {
		case "1":
			criaShelf();
			break;
		case "2":
			editaShelf();
			break;
		case "3":
			consultaShelf();
			break;
		case "4":
			removeShelf();
			break;
		case "5":
			ecran1();
			break;

		default:
			System.out.println("A opcao introduida nao e valida.");
			listaPrateleiras();
			break;
		}
		listaPrateleiras();
	}

	public void criaShelf() {
		Scanner input = new Scanner(System.in);
		System.out.println("Indique a capacidade da nova prateleira");
		int capacidade = input.nextInt();
		Scanner input1 = new Scanner(System.in);
		System.out.println("Indique o preco de aluguer");
		double preco = input1.nextDouble();
		// idShelf++;

		// Shelf shelf1 = new Shelf (capacidade, produto1, preco);
		System.out.println("Foi criada a Shelf sem produtos com [ID= " + idShelf + " capacidade: " + capacidade
				+ " preco: " + preco + "] ");
	}

	public void editaShelf() {
	}

	public void consultaShelf() {
	}

	public void removeShelf() {
	}

	// public void validar(String input){
	//
	// try {
	// int validar = Integer.parseInt(input);
	//
	// }
	// catch (Exception e) {
	//
	// System.out.println("O valor introduzido nao e valido, insira novamente");
	// Scanner input2 = new Scanner (System.in);
	// validar(input2);
	// }
	// }

}

// ao remover esta a aceitar numeros ou pedir so "S"
// ao introduzir produto, caso enter atribuir zero
// Nao valida o id removido
// try catch ou com nova materia para validar
// tirar os Scanners
