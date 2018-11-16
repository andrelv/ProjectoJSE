package io.altar.jseproject.model;

public class Product {
	private int id;
	private int shelf;
	private int desconto;
	private int iva;
	private double preco;
	
	
	public Product(int id, int shelf, int desconto, int iva, double preco) {
		//super(); para extender classes
		this.id = id;
		this.shelf = shelf;
		this.desconto = desconto;
		this.iva = iva;
		this.preco = preco;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getShelf() {
		return shelf;
	}
	public void setShelf(int shelf) {
		this.shelf = shelf;
	}
	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
