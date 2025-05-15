public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new ContaCorrente();
        cc.depositar(250);

        Conta cp = new ContaPoupanca();
        cp.depositar(50);

        cc.imprimirExtrato();
        System.out.println();
        
        cp.imprimirExtrato();
        System.out.println();

        System.out.println("Trasferindo 50 reais");

        cc.transferir(50, cp);

        cc.imprimirExtrato();
        System.out.println();
        
        cp.imprimirExtrato();
    }
}
