package br.com.capsulecorp.app;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
import java.util.Calendar;
import br.com.capsulecorp.contas.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Olá, você está no sistema de cadastro da CAPSULE CORP!");
		System.out.println("Informe ao menu a opção desejada: ");
		System.out.println(" ");
		System.out.println("######################################################");
		System.out.println(" ");
		System.out.println("1 - Cadastrar novo colaborador");
		System.out.println("2 - Cadastrar novo cliente");
		System.out.println("3 - Verificar informações");
		System.out.println("4 - Sair do sistema");
		System.out.println(" ");
		System.out.println("######################################################");
		System.out.println(" ");
		System.out.println("Digite o número da opção desejada: ");
		int opcao = sc.nextInt();
		
		
		switch (opcao) {
		
		case 1: 
			Funcionario func1 = new Funcionario();
			func1.cadastrarFuncionario();
			
			break;
			
		case 2: 
			Cliente cliente1 = new Cliente();
			cliente1.cadastrarCliente();
			
			break;
		
		case 3: 
			System.out.println("Qual tipo de usuário deseja verificar: ");
			System.out.println(" ");
			System.out.println("######################################################");
			System.out.println(" ");
			System.out.println("1 - Informações de colaborador");
			System.out.println("2 - Informações de cliente");
			System.out.println(" ");
			System.out.println("######################################################");
			System.out.println(" ");
			System.out.println("Digite o número da opção desejada: ");
			int tipoUsuario = sc.nextInt();
			
			switch(tipoUsuario) {
			
			case 1:
				System.out.println("Informações cadastradas para colaborador: ");
				
				
				break;
				
			case 2:
				System.out.println("Informações cadastradas para cliente: ");
				
				
				sc.close();
				break;
			
			}
			
		case 4: 
			System.out.println("Você está saindo do sistema, até logo!");
			
			sc.close();
			break;
			
		}
		
		
	}
	
}
