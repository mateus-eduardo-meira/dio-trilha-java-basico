import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DesafioControleFluxo {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = terminal.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = terminal.nextInt();

        try{
            contar(primeiroNumero, segundoNumero);
        } catch(ParametrosInvalidosException p){
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
        }
    }
    
    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        if(numeroUm < numeroDois){
            int contagem = numeroDois - numeroUm;

            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número: "+ (i+1));
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}
