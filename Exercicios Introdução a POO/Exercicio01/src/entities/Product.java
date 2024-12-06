package entities;

public class Product {
    public String nome;
    public float preco;
    public int quantidade;

    public double totalValueInStock(){
        return preco * quantidade;
    }
    public void addProducts(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProducts(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                + ", R$ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: R$ "
                + String.format("%.2f", totalValueInStock());
    }

}
