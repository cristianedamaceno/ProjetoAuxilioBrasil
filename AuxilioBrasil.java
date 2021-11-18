package AuxilioBrasil;

import java.util.Scanner;

public class AuxilioBrasil {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Beneficiarios usuario = new Beneficiarios();
		
		System.out.println("Ol�! Seja Bem-Vindo!!! \nAqui iremos descobrir se voc�"
							+ " cumpre com os requisitos para receber o Aux�lio Brasil.");
		
		System.out.println("\n---------------------------------------------------------------------------------------");
		
		//Coletando dados cadastrais
		String nome, cpf;
		int idade,i;
		
		System.out.println("Iniciando Cadastro...");
		System.out.println("\nDigite o seu nome: ");
		nome = ler.next();
		usuario.setNome(nome);
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		usuario.setIdade(idade);
		System.out.println("Digite seu CPF: ");
		cpf = ler.next();
		usuario.setCpf(cpf);
		
		System.out.println("\nCadastro finalizado... \nDigite [1] para continuar e [2] para sair: ");
		i = ler.nextInt();
		
		while(i!=2){
		//Bolsa Fam�lia
		int bolsaFamilia;
		 System.out.println("Voc� j� possui cadastro no Bolsa Fam�lia? \n[1] Sim \t[2]N�o: ");
		 bolsaFamilia = ler.nextInt();
		 usuario.setBolsaFamilia(bolsaFamilia);
		 
		 if(usuario.getBolsaFamilia() == 2) { 
		 }
		 else if(usuario.getBolsaFamilia() == 1) {
			 System.out.println("Voc� cumpre com os requisitos!!! \nPara confirmar seu cadastro entre em contato com"
					 + " o Atendimento Caixa ao cidad�o, pelo telefone 111. \nPara mais informa��es acesse o"
					 + " site www.gov.br/cidadania/auxilio-brasil");
			 break;
		 }
		 
		 //Coleta dados da renda familiar
		 double renda;
		 int qntPessoas;
		 System.out.println("Digite o total da sua renda familiar: ");
		 renda = ler.nextDouble();
		 usuario.setRenda(renda);
		 System.out.println("Digite a quantidade de pessoas na fam�lia: ");
		 qntPessoas = ler.nextInt();
		 usuario.setQntPessoas(qntPessoas);
		 
		 if(usuario.getRendaPerCapita() > 89 && usuario.getRendaPerCapita() < 178) {
		 }
		 else if(usuario.getRendaPerCapita() < 89) {
			 System.out.println("Voc� cumpre com os requisitos!!! \nPara confirmar seu cadastro entre em contato com"
					 + " o Atendimento Caixa ao cidad�o, pelo telefone 111. \nPara mais informa��es acesse o"
					 + " site www.gov.br/cidadania/auxilio-brasil");
			 break;
		 }
		 else{
			 System.out.println("Voc� possui renda maior que R$178, por isso n�o receber o Aux�lio Brasil.");
			 break;
		 }
		 
		 // Verifica��o de requisitos para renda per capita entre 89 e 178 reais.
		 int requisitos;
			System.out.println("Dentre os moradores, possui ao menos UM destes casos? "
					+ "\n- Gestantes;"
					+ "\n- Crian�as entre 0 e 3 anos incompletos"
					+ "\n- Indiv�duos entre 3 � 21 anos incompletos matriculados no Ensino B�sico"
					+ "\n [1] Sim [2] N�o");
			requisitos = ler.nextInt();
			usuario.setRequisitos(requisitos);
			
			if(usuario.getRequisitos() == 1) {
				 System.out.println("Voc� cumpre com os requisitos!!! \nPara confirmar seu cadastro entre em contato com"
						 + " o Atendimento Caixa ao cidad�o, pelo telefone 111. \nPara mais informa��es acesse o"
						 + " site www.gov.br/cidadania/auxilio-brasil");
				break;
			}
			else {
				System.out.println("Voc� n�o cumpre com os requisitos. N�o poder� receber o Aux�lio Brasil.");
				break;
			}
			  
		} 
		
		System.out.println("\nPrograma encerrado.");
		 
	}
}
