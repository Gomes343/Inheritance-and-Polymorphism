package Questao1;

public class Conta{

    double saldo;
    int i;
    
    public Conta(){
        i = 1;
    }
    
    
    public double getSaldo(){
        return saldo;
    }   
            
    public void setSaldo(double Saldo){
        this.saldo = Saldo;
    }
    
    public void deposito(double d){
        this.saldo += d;
    }
    
    public void saca(double s){
        this.saldo -= s;
    }
    
    public void taxa(double t){
        this.saldo = saldo + (((t/100)*saldo)*i);
    }  
}