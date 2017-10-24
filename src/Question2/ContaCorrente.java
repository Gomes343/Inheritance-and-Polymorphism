package Question2;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(){
        i = 2;
    }
    
    public void depositar(int deposito){
       saldo += deposito - 0.10;
    }    
}
