package br.com.capsulecorp.contas;
import java.util.Scanner;

public class Funcionario extends Usuario {
	
	private int salario;
	private String cargo, promover;
	private int matricula;
	
	Scanner sc = new Scanner(System.in);
	
	public void cadastrarFuncionario() {
		super.cadastrar();
		System.out.println("Digite o cargo: ");
		cargo = sc.next();
		matricula = random.nextInt(1000) + 1;
		System.out.println("A matrícula do funcionário é: " + matricula);
		System.out.println("Funcionário cadastrado com sucesso!");
		
	}
	
	public Funcionario() {
		
	}
	
	public void getInformacoes() {
		
	}
	
	public Funcionario(int salario) {

		System.out.println("Digite o Salario do funcionário: ");
		this.salario = sc.nextInt();
		
		System.out.println("Salario do funcionário: " + this.salario);
	}
	
	
	public void reajustaSalario() {
		System.out.println("Qual o percentual de reajuste do salário que deseja?");
		double taxa = sc.nextInt();
		double percentual = taxa / 100;
		double novoSalario = this.salario + (percentual * this.salario);
		System.out.println("O reajuste do salário em reais será de ");
		System.out.println("O novo salário é de R$ " + novoSalario);
	}
	
	public void promover() {
		System.out.println("O cargo do funcionário é " + this.cargo);
		System.out.println("Digite o cargo que deseja para seu funcionário: ");
		this.cargo = sc.nextLine();
		System.out.println("O cargo novo do funcionário é " + this.cargo);
	}



	
	
	

}
