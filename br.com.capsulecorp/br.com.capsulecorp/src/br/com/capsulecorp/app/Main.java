package br.com.capsulecorp.app;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
import java.util.Calendar;
import br.com.capsulecorp.contas.*;

public class Main {

	public static void main(String[] args) {
		
//		Funcionario user1 = new Funcionario();
//		Random random = new Random();
//	
		//user1.cadastrarFuncionario1();
		
		Usuario user1 = new Usuario(1996);
		user1.obterIdade();

	}
	
}
