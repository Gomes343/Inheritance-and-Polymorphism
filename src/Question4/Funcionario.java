package Question4;
public class Funcionario {
    
    private int salario;
    private String nome;
    
    
    public Funcionario (){ 
    }
    public Funcionario(String nome){
        this.nome = nome;
    }
    
    public void setSalario(int s){
        salario = s;
    }
    
    public int getSalario(){
        return salario;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public String getNome(){
        return nome;
    }
}

