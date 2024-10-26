package br.com.capsulecorp.contas;
import br.com.capsulecorp.personalextradata.*;
import java.util.Scanner;

public class Funcionario extends Usuario {
	
	private int salario;
	private String cargo, promover;
	private int matricula;

	Endereco endereco = new Endereco();
	Scanner sc = new Scanner(System.in);

	public Funcionario() {

	}
	
	public void cadastrarFuncionario() {
		super.cadastrar();
		System.out.println("Digite o cargo: ");
		this.cargo = setCargo(sc.nextLine());
		endereco.cadastraEndereco();
		System.out.println("A matrícula do funcionário é: ");
		System.out.println("Funcionário cadastrado com sucesso!");
		
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

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String getCargo() {
		return cargo;
	}

	@Override
	public String setCargo(String cargo) {
		this.cargo = cargo;
		return cargo;
	}

	public String getPromover() {
		return promover;
	}

	public void setPromover(String promover) {
		this.promover = promover;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
