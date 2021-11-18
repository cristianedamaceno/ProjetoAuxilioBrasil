package AuxilioBrasil;

public class Beneficiarios implements Interface {
		private String nome, cpf;
		private int idade, qntPessoas, bolsaFamilia, requisitos;
		private double renda, rendaPerCapita;
		
		@Override
		public String getNome() {
			return nome;
		}
		
		@Override
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public int getQntPessoas() {
			return qntPessoas;
		}
		
		@Override
		public void setQntPessoas(int qntPessoas) {
			this.qntPessoas = qntPessoas;
		}
		public int getBolsaFamilia() {
			return bolsaFamilia;
		}
		public void setBolsaFamilia(int bolsaFamilia) {
			this.bolsaFamilia = bolsaFamilia;
		}
		public double getRenda() {
			return renda;
		}
		
		@Override
		public void setRenda(double renda) {
			this.renda = renda;
		}
		
		@Override
		public double getRendaPerCapita() {
			rendaPerCapita = renda/qntPessoas;
			return rendaPerCapita;
		}
		public void setRendaPerCapita(double rendaPerCapita) {
			this.rendaPerCapita = rendaPerCapita;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public int getRequisitos() {
			return requisitos;
		}
		public void setRequisitos(int requisitos) {
			this.requisitos = requisitos;
		}
		
}
