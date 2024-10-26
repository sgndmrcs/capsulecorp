package br.com.capsulecorp.contas;
import java.util.Scanner;
import java.util.UUID;
import br.com.capsulecorp.personalextradata.*;

public class Cliente extends Usuario {
	
	private int renda;
	private Profissao profissao;
	private String codigoDoCliente;
	
	Scanner sc = new Scanner(System.in);

	public Cliente() {

		this.codigoDoCliente = UUID.randomUUID().toString();

	}
	
	public void cadastrarCliente() {


		super.cadastrar();
		System.out.println("Digite a profissao: ");
		this.profissao = Profissao.valueOf(sc.nextLine());
		System.out.println("O código do cliente é: " + codigoDoCliente);
		System.out.println("Cliente cadastrado com sucesso!");
		
	}

	public Cliente(int renda) {

		System.out.println("Digite o Salario do funcionário: ");
		this.renda = sc.nextInt();
		System.out.println("Salario do funcionário: " + this.renda);
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
