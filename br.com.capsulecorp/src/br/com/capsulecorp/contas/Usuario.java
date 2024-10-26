package br.com.capsulecorp.contas;
import br.com.capsulecorp.auxiliar.ListaDeTelefonesNaoOrdenados;

import java.util.Scanner;
import java.util.Calendar;

public class Usuario {
	
	private int ano, mes, diaDoMes;
	private String nome;
	private String endereco;
	private ListaDeTelefonesNaoOrdenados telefones;
	private String cargo;
	
	Scanner sc = new Scanner(System.in);
	
	public Usuario() {
		
	}
	
	public Usuario(String nome) {

		System.out.println("Digite o nome do usuário: ");
		this.nome = sc.nextLine();
		System.out.println("Nome do usuário: " + this.nome);

	}
	
	public Usuario(int ano) {
		
		System.out.println("Digite o ano de nascimento: ");
		this.ano = sc.nextInt();
		System.out.println("Ano de nascimento: " + this.ano);

	}
	
	public void cadastrar() {
		
		System.out.println("Digite o nome: ");
		this.nome = setNome(sc.nextLine());
		System.out.println("Digite o dia de nascimento: ");
		this.diaDoMes = sc.nextInt();
		System.out.println("Digite o mês de nascimento: ");
		this.mes = sc.nextInt();
		System.out.println("Digite o ano de nascimento: ");
		this.ano = sc.nextInt();
		sc.nextLine();

	}
	
	public void obterIdade() {
		
		Calendar c = Calendar.getInstance();
		int atual = c.get(Calendar.YEAR);
		int idade = atual - this.ano;
		System.out.println("O usuário tem " + idade + " anos de idade");
		
	}
	
	public void promover() {
		
		System.out.println("O cargo do funcionário é " + this.cargo);
		System.out.println("Digite o cargo que deseja para seu funcionário: ");
		this.cargo = sc.nextLine();
		System.out.println("O cargo novo do funcionário é " + this.cargo);

	}


	public String getCargo() {
		return cargo;
	}

	public String setCargo(String cargo) {
		this.cargo = cargo;
		return cargo;
	}

	public String getNome() {
		return nome;
	}

	public String setNome(String nome) {
		this.nome = nome;
		return nome;
	}

	public ListaDeTelefonesNaoOrdenados getTelefones() {
		return telefones;
	}

	public void setTelefones(ListaDeTelefonesNaoOrdenados telefones) {
		this.telefones = telefones;
	}
}
