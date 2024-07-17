public class main{

public static void main(String[] args){

conta cc = new contaCorrente();
cc depositar(100);

conta poupanca = new contaPoupanca(100);

cc.transferir(100 , poupanca);

cc.inprimirExtrato();
poupanca.inprimirExtrato();


}
}