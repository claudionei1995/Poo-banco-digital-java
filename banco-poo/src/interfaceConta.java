public interface interfaceConta {

    void sacar(double value);

    void depositar(double value);

    void transferir(double value);

    void transferir(double value, conta contaDestino);

    void inprimirExtrato(){
   
   System.out.println("Extrato conta corrente")

  }
}