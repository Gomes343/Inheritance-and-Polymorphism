package Question6;
public class Operador{
    
    float d;
    protected int teste = 0;
    Maquina maquina;
    
    public Operador(Maquina maquina){
        this.maquina = maquina;
    }
    
    public void retirarDinheiro(){
       this.d =+ maquina.getDinheiro();
       maquina.dinheiro = 0;
    }
    
    public void adicionarProdutos(String n, int v){
        maquina.produtos[teste] = new Produtos(n,v);
        teste += 1;
        maquina.contadorProdutos += 1;
    }
    
    /*
    public void listarProdutos(){
        for(int i = 0; i < contadorProdutos ; i++){
            System.out.println("Nome Produto: "+super.produtos[i].nome+"  Valor Produto: "+super.produtos[i].valor);
        }
}*/
    
}
