package tp1;

import java.util.Date;

public class Sapato {
	
	private String marca, tipo, cor;
	private int idSapato, tamanho, preco;
	private Cliente cliente;
	private Loja loja;
	
	public Sapato (String m, String t, String c, int id, int tam,int p){

		marca = m;
		tipo = t;
		cor = c;
		idSapato = id;
		tamanho = tam;
		preco = p;
		
		
		
	}
	
	public String toString() {	
			return "Marca do sapato: " + marca;
		}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdSapato() {
		return idSapato;
	}
	public void setIdSapato(int idSapato) {
		this.idSapato = idSapato;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Loja getLoja() {
		return loja;
	}
	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	
	

}
