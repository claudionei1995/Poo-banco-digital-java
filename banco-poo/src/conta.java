public class abstract Conta implements interfaceConta {
 
private static final int agencia_padrao;
private static int sequencial;

     private int agencia;
     private int numero;
     private double saldo;

  public conta(){
  
  this.agencia = conta.agencia_padrao;
  this.numero = sequencial ++ ;

  }

   public void sacar(double value){
    
    saldo -= valor;

   }
   public  void depositar(double value){
    
    saldo =- valor;

   }
   public void transferir(double value, conta contaDestino) {

    this.sacar(valor);
    contaDestino.depositar(valor);
 
   }

   public int getAgencia (){
   return agencia;

   }

   public int getNumero (){
     return numero;

   }

   public double getSaldo(){
    return saldo;


   }


}
