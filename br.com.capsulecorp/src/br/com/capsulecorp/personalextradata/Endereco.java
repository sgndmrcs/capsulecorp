package br.com.capsulecorp.personalextradata;
import java.util.Scanner;

public class Endereco {
    Scanner sc = new Scanner(System.in);

    private String logradouro, complemento;
    private int numero, cep;

    public void cadastraEndereco() {

        System.out.println("Digite seu CEP: ");
        cep = setCep(sc.nextInt());
        System.out.println("Digite o logradouro: ");
        logradouro = setLogradouro(sc.nextLine());
        sc.nextLine();
        System.out.println("Digite o número da rua: ");
        numero = setNumero(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite o complemento: ");
        complemento = setComplemento(sc.nextLine());

        System.out.println("");
        System.out.println(getComplemento());

    }

    public String getComplemento() {
        return this.complemento;
    }

    public String setComplemento(String complemento) {
        this.complemento = complemento;
        return complemento;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public String setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return logradouro;
    }

    public int getNumero() {
        return this.numero;
    }

    public int setNumero(int numero) {
        this.numero = numero;
        return numero;
    }

    public int getCep() {
        return this.cep;
    }

    public int setCep(int cep) {
        this.cep = cep;
        return cep;
    }
}
