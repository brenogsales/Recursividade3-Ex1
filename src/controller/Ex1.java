package controller;

public class Ex1 {
    public Ex1(){
        super();
    }
    public static int contaDigitos(int num){
        if (num < 10 && num > - 10){
            return 1;
        }

        return 1 + contaDigitos(num / 10);
    }
}
