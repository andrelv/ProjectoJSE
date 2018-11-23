package io.altar.jseproject.model;

public class Product extends Entity{

	private long shelf;
	private double desconto;
	private double iva;
	private double preco;
	
	
	public Product(long shelf, double desconto, double iva, double preco) {
				
		this.shelf = shelf;
		this.desconto = desconto;
		this.iva = iva;
		this.preco = preco;
	}
	
	public long getShelf() {
		return shelf;
	}
	public void setShelf(long shelf) {
		this.shelf = shelf;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Product "+this.getId()+" [shelf=" + shelf + ", desconto=" + desconto + ", iva=" + iva + ", preco=" + preco + "]";
	}
	
	
}
