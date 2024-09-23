package br.com.capsulecorp.contas;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Random;
import java.time.LocalDate;

public class Usuario {
	
	private int ano, mes, diaDoMes;
	public String nome;
	private String endereco;
	private String contato;
	private String cargo;
	
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
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
		
		ano = this.ano;
		this.mes = mes;
		this.diaDoMes = diaDoMes;
		this.nome = nome;
		this.endereco = endereco;
		this.contato = contato;
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
	

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDiaDoMes() {
		return diaDoMes;
	}

	public void setDiaDoMes(int diaDoMes) {
		this.diaDoMes = diaDoMes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	


}
