package br.com.capsulecorp.contas;
import java.util.Scanner;

public class Funcionario extends Usuario {
	
	private int salario;
	private String cargo;
	private int matricula;
	
	Scanner sc = new Scanner(System.in);
	
	public void cadastrarFuncionario(String cargo) {
		super.cadastrar();
		System.out.println("Digite o cargp: ");
		cargo = sc.next();
		matricula = random.nextInt(1000) + 1;
		System.out.println("A matrícula do funcionário é: " + matricula);
		System.out.println("Funcionário cadastrado com sucesso!");
		return;
		
	}
	public Funcionario(int salario) {

		System.out.println("Digite o Salario do funcionário: ");
		this.salario = sc.nextInt();
		
		System.out.println("Salario do funcionário: " + this.salario);
	}
	
	public Funcionario() {
		
	}
	
//	public double obterIdade() {
//		double idade = 2024 - ano;
//		System.out.println("O funcionário tem " + idade + " anos de idade");
//		return idade;
//	}
	
	public double reajustaSalario() {
		System.out.println("Qual o percentual de reajuste do salário que deseja?");
		double taxa = sc.nextInt();
		double percentual = taxa / 100;
		double novoSalario = this.salario + (percentual * this.salario);
		System.out.println("O reajuste do salário em reais será de ");
		System.out.println("O novo salário é de R$ " + novoSalario);
		return salario;
	}
	
	public String promover() {
		System.out.println("O cargo do funcionário é " + this.cargo);
		System.out.println("Digite o cargo que deseja para seu funcionário: ");
		this.cargo = sc.nextLine();
		System.out.println("O cargo novo do funcionário é " + this.cargo);
		return cargo;
	}
	public void cadastrarFuncionario() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
