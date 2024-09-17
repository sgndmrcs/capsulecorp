package br.com.capsulecorp.app;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
import br.com.capsulecorp.contas.*;

public class Main {

	public static void main(String[] args) {
		
		Funcionario user1 = new Funcionario();
		Random random = new Random();
	
		//user1.cadastrarFuncionario1();
		
		int mat = random.nextInt(1000) + 1;
		System.out.println(mat);


	}
	
}
