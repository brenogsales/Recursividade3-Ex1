package view;

import controller.Ex1;

public class main {
    public static void main(String[] args) {
        int num = 12345;
        int quantidadeDigitos = Ex1.contaDigitos(num);

        System.out.printf("A quantidade de dígitos do número %d é: %d", num, quantidadeDigitos);
    }
}
