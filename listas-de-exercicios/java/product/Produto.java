package product;

public class Produto {
    private float preço;
    private String nome;
    
    public Produto(float preço,String nome){
            this.nome = nome;
            this.preço = preço;
    }

    public float desconto10(){
        return preço = preço - (preço/10);
    }

    public float getpreço(){
        return preço;
    }
    
    public String toString(){
        return "Preço:" + preço + " Produto:" + nome;
    }
}
