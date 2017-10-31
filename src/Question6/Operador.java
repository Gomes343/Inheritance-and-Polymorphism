package Question6;
public class Operador extends Maquina{
    
    float d;
    protected int teste = 0;
    

    
    public void retirarDinheiro(){
       this.d =+ super.dinheiro;
       super.dinheiro = 0;
    }
    
    public void adicionarProdutos(String n, int v){
        super.produtos[teste] = new Produtos(n,v);
        teste =+ 1;
        super.contadorProdutos =+ 1;
    }
    
    /*
    public void listarProdutos(){
        for(int i = 0; i < contadorProdutos ; i++){
            System.out.println("Nome Produto: "+super.produtos[i].nome+"  Valor Produto: "+super.produtos[i].valor);
        }
}*/
    
}
