package tp1;

import java.util.Date;

public abstract class Pessoa {

	protected String nome, endere�o;
	protected int telefone, cpf, rg;
	
	
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndere�o() {
			return endere�o;
		}
		public void setEndere�o(String endere�o) {
			this.endere�o = endere�o;
		}
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		public int getCpf() {
			return cpf;
		}
		public void setCpf(int cpf) {
			this.cpf = cpf;
		}
		public int getRg() {
			return rg;
		}
		public void setRg(int rg) {
			this.rg = rg;
		}

}

