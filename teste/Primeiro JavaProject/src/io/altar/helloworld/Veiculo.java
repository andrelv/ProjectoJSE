package io.altar.helloworld;

public class Veiculo {
	
	private int rodas;
	private int portas;
	private String marca;
	private boolean avariado;
	
	public Veiculo(int rodas, int portas, String marca, boolean avariado) {
	
		this.rodas = rodas;
		this.portas = portas;
		this.marca = marca;
		this.avariado = avariado;
	}
	
	
	public int getRodas(){
		return this.rodas;
	}
	public void setRodas(int rodas){
		this.rodas=rodas;
		
	}
	public void setMarca(String marca){
		this.marca=marca;
	}
	
	
	
}

