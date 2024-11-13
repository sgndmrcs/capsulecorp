package br.com.capsulecorp.personalextradata;

public class Organizacao {

    System.out.println(" ");
		System.out.println("Deseja cadastrar o endereço: ");
		System.out.println(" ");
		System.out.println("######################################################");
		System.out.println(" ");
		System.out.println("1 - Cadastrar endereço");
		System.out.println("2 - Cadastrar futuramente");
		System.out.println("3 - Verificar informações");
		System.out.println("4 - Finalizar cadastro");
		System.out.println(" ");
		System.out.println("######################################################");
		System.out.println(" ");
    int valorEndereco = sc.nextInt();

		switch (valorEndereco) {

        case 1:



            break;


        case 2:

            System.out.println("Solicite futuramente a adição do endereço");

            break;

        case 3:

            System.out.println("Qual informação deseja verificar: ");
            System.out.println(" ");
            System.out.println("######################################################");
            System.out.println(" ");
            System.out.println("1 - Endereço de colaborador");
            System.out.println("2 - Endereço de cliente");
            System.out.println("3 - Sair");
            System.out.println(" ");
            System.out.println("######################################################");
            System.out.println(" ");
            System.out.println("Digite o número da opção desejada: ");
            int opcaoEndereco = sc.nextInt();

            switch(opcaoEndereco) {

                case 1:

                    System.out.println("Informações cadastradas para colaborador: ");

                    break;

                case 2:

                    System.out.println("Informações cadastradas para cliente: ");

                    break;

            }

        case 4:

            System.out.println("Você está saindo do sistema, até logo!");

            break;

    }
}
