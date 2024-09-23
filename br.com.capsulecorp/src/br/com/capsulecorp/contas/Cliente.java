package br.com.capsulecorp.contas;
import java.util.Scanner;

public class Cliente extends Usuario {
	
	private int renda;
	private String profissao;
	private int codigoDoCliente;
	
	Scanner sc = new Scanner(System.in);
	
	public void cadastrarCliente() {
		super.cadastrar();
		System.out.println("Digite a profissao: ");
		profissao = sc.next();
		codigoDoCliente = random.nextInt(100000) + 1;
		System.out.println("O código do cliente é: " + codigoDoCliente);
		System.out.println("Cliente cadastrado com sucesso!");
		
	}
	
	
	public Cliente(int renda) {

		System.out.println("Digite o Salario do funcionário: ");
		this.renda = sc.nextInt();
		System.out.println("Salario do funcionário: " + this.renda);
	}

	
	
	public Cliente() {
	
	}

	public double reajustaRenda() {
		System.out.println("Qual o percentual de reajuste do salário que deseja?");
		double taxa = sc.nextInt();
		double percentual = taxa / 100;
		double novoSalario = this.renda + (percentual * this.renda);
		System.out.println("O reajuste do salário em reais será de ");
		System.out.println("O novo salário é de R$ " + novoSalario);
		return renda;
	}
	

	
	
	

}
