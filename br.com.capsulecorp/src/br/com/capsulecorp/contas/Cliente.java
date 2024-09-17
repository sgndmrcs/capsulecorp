package br.com.capsulecorp.contas;
import java.util.Scanner;

public class Cliente extends Usuario {
	
	private int renda;
	private String profissao;
	private int codigoDoCliente;
	
	Scanner sc = new Scanner(System.in);
	
	public void cadastrarCliente(String cargo) {
		super.cadastrar();
		System.out.println("Digite o cargp: ");
		cargo = sc.next();
		codigoDoCliente = random.nextInt(1000) + 1;
		System.out.println("O código do cliente é: " + codigoDoCliente);
		System.out.println("Cliente cadastrado com sucesso!");
		return;
		
	}
	public Cliente(int renda) {

		System.out.println("Digite o Salario do funcionário: ");
		this.renda = sc.nextInt();
		
		System.out.println("Salario do funcionário: " + this.renda);
	}
	
//	public double obterIdade() {
//		double idade = 2024 - ano;
//		System.out.println("O funcionário tem " + idade + " anos de idade");
//		return idade;
//	}
	
	public double reajustaRenda() {
		System.out.println("Qual o percentual de reajuste do salário que deseja?");
		double taxa = sc.nextInt();
		double percentual = taxa / 100;
		double novoSalario = this.renda + (percentual * this.renda);
		System.out.println("O reajuste do salário em reais será de ");
		System.out.println("O novo salário é de R$ " + novoSalario);
		return renda;
	}
	
	public String promover() {
		System.out.println("O cargo do funcionário é " + this.profissao);
		System.out.println("Digite o cargo que deseja para seu funcionário: ");
		this.profissao = sc.nextLine();
		System.out.println("O cargo novo do funcionário é " + this.profissao);
		return profissao;
	}
	public void cadastrarFuncionario() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
