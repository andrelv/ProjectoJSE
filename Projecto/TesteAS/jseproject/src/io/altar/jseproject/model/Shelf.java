package io.altar.jseproject.model;

public class Shelf extends Entity{
	
	private long capacidade;
	private Product produto;
	private double preco;
	
		public Shelf(long capacidade, Product produto, double preco) {
		super();
		this.capacidade = capacidade;
		this.produto = produto;
		this.preco = preco;
	}
		public long getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(long capacidade) {
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