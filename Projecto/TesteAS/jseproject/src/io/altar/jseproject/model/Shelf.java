package io.altar.jseproject.model;

public class Shelf {
	
	private int id=0;
	private int capacidade;
	private Product produto;
	private double preco;
	
	
	public Shelf(int id, int capacidade, double preco) {
		//super();
		this.id = id;
		this.capacidade = capacidade;
		this.preco = preco;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public Product getProduto() {
		return produto;
	}
	public void setProduto(Product produto) {
		this.produto = produto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}