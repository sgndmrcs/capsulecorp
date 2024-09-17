package br.com.capsulecorp.contas;
import java.util.Scanner;
import java.util.Random;

public class Usuario {
	
	private int ano, mes, diaDoMes;
	private String nome, endereco, contato, cargo;
	
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	public Usuario() {
		
	}
	
	public Usuario(String nome) {

		System.out.println("Digite o nome do usuário: ");
		this.nome = sc.nextLine();
		System.out.println("Nome do usuário: " + this.nome);
	}
	
	public boolean cadastrar() {
		
		System.out.println("Deseja cadastrar um novo usuário?");
		System.out.println("1 - SIM | 2 - Não");
		int confirmarCadastro = sc.nextInt();
		
		if (confirmarCadastro == 1) {
			System.out.println("Digite o nome: ");
			nome = sc.next();
			System.out.println("Digite o dia de nascimento: ");
			diaDoMes = sc.nextInt();
			System.out.println("Digite o mês de nascimento: ");
			mes = sc.nextInt();
			System.out.println("Digite o ano de nascimento: ");
			ano = sc.nextInt();
			System.out.println("Digite o endereço: ");
			endereco = sc.next();
			System.out.println("Digite o contato: ");
			contato = sc.next();

		}if (confirmarCadastro == 2) {
			System.out.println("Cadastramento cancelado");
		}
		return false;
		
	}
	
	public double obterIdade() {
		
		double idade = 2024 - this.ano;
		System.out.println("O usuário tem " + idade + " anos de idade");
		return idade;
	}
	
	
	public String promover() {
		
		System.out.println("O cargo do funcionário é " + this.cargo);
		System.out.println("Digite o cargo que deseja para seu funcionário: ");
		this.cargo = sc.nextLine();
		System.out.println("O cargo novo do funcionário é " + this.cargo);
		return cargo;
	}
	
	
	

}
