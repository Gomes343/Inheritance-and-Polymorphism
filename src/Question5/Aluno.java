package Question5;
public class Aluno {
    
    private String nome;
    private float n1,n2;
    
    public Aluno(String n,float n1,float n2){
        nome = n;
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public float media(){
        float media = (n1+n2)/2;
        return media;
    }
    
}
