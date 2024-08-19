package controller;

public class Ex1 {
    public Ex1(){
        super();
    }
    public static int contaDigitos(int num){
        if (num < 10 && num > - 10){
            // Retorna 1 para números entre -9 e 9.
            return 1;
        }

        // Conta 1 e remove o ultimo digito para contar os restantes
        return 1 + contaDigitos(num / 10);
    }
}
