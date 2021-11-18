package AuxilioBrasil;

import java.util.Scanner;

public class AuxilioBrasil {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Beneficiarios usuario = new Beneficiarios();
		
		System.out.println("Olá! Seja Bem-Vindo!!! \nAqui iremos descobrir se você"
							+ " cumpre com os requisitos para receber o Auxílio Brasil.");
		
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
		//Bolsa Família
		int bolsaFamilia;
		 System.out.println("Você já possui cadastro no Bolsa Família? \n[1] Sim \t[2]Não: ");
		 bolsaFamilia = ler.nextInt();
		 usuario.setBolsaFamilia(bolsaFamilia);
		 
		 if(usuario.getBolsaFamilia() == 2) { 
		 }
		 else if(usuario.getBolsaFamilia() == 1) {
			 System.out.println("Você cumpre com os requisitos!!! \nPara confirmar seu cadastro entre em contato com"
					 + " o Atendimento Caixa ao cidadão, pelo telefone 111. \nPara mais informações acesse o"
					 + " site www.gov.br/cidadania/auxilio-brasil");
			 break;
		 }
		 
		 //Coleta dados da renda familiar
		 double renda;
		 int qntPessoas;
		 System.out.println("Digite o total da sua renda familiar: ");
		 renda = ler.nextDouble();
		 usuario.setRenda(renda);
		 System.out.println("Digite a quantidade de pessoas na família: ");
		 qntPessoas = ler.nextInt();
		 usuario.setQntPessoas(qntPessoas);
		 
		 if(usuario.getRendaPerCapita() > 89 && usuario.getRendaPerCapita() < 178) {
		 }
		 else if(usuario.getRendaPerCapita() < 89) {
			 System.out.println("Você cumpre com os requisitos!!! \nPara confirmar seu cadastro entre em contato com"
					 + " o Atendimento Caixa ao cidadão, pelo telefone 111. \nPara mais informações acesse o"
					 + " site www.gov.br/cidadania/auxilio-brasil");
			 break;
		 }
		 else{
			 System.out.println("Você possui renda maior que R$178, por isso não receber o Auxílio Brasil.");
			 break;
		 }
		 
		 // Verificação de requisitos para renda per capita entre 89 e 178 reais.
		 int requisitos;
			System.out.println("Dentre os moradores, possui ao menos UM destes casos? "
					+ "\n- Gestantes;"
					+ "\n- Crianças entre 0 e 3 anos incompletos"
					+ "\n- Indivíduos entre 3 à 21 anos incompletos matriculados no Ensino Básico"
					+ "\n [1] Sim [2] Não");
			requisitos = ler.nextInt();
			usuario.setRequisitos(requisitos);
			
			if(usuario.getRequisitos() == 1) {
				 System.out.println("Você cumpre com os requisitos!!! \nPara confirmar seu cadastro entre em contato com"
						 + " o Atendimento Caixa ao cidadão, pelo telefone 111. \nPara mais informações acesse o"
						 + " site www.gov.br/cidadania/auxilio-brasil");
				break;
			}
			else {
				System.out.println("Você não cumpre com os requisitos. Não poderá receber o Auxílio Brasil.");
				break;
			}
			  
		} 
		
		System.out.println("\nPrograma encerrado.");
		 
	}
}
