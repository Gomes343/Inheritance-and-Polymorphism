package Question6;
public class Maquina{
    
    public Produtos[] produtos = new Produtos[10];
    protected int dinheiro;
    int contadorProdutos = 0;

    public void listarProdutos(){
        for(int i = 0; i < contadorProdutos ; i++){
            System.out.println("Nome Produto: "+produtos[i].nome+"  Valor Produto: "+produtos[i].valor);
        }

    }
    
    public void inserirMoeda(int dinheiro){
                int operador = 0;        
        for(int i = 0; i < contadorProdutos ; i++){
            if(produtos[i].valor == dinheiro){
                System.out.println("Entregando Produto: "+produtos[i].nome);
                this.dinheiro = dinheiro;
                operador = 1;
            }
            if (operador == 0){
                System.out.println("Nenhum produto do valor inserido!");
            }
        }
    }
    
    public void setDinheiro(int d){
        dinheiro = d;
    }
    
    public float getDinheiro(){
        return dinheiro;
    }


    
}
