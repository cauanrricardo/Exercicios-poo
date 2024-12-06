// Source code is decompiled from a .class file using FernFlower decompiler.
package entities;

public class Product {
   public String nome;
   public float preco;
   public int quantidade;

   public Product() {
   }

   public double totalValueInStock() {
      return (double)(this.preco * (float)this.quantidade);
   }

   public void addProducts(int quantidade) {
      this.quantidade += quantidade;
   }

   public void removeProducts(int quantidade) {
      this.quantidade -= quantidade;
   }

   public String toString() {
      String var10000 = this.nome;
      return var10000 + ", R$ " + String.format("%.2f", this.preco) + ", " + this.quantidade + " unidades, Total: R$ " + String.format("%.2f", this.totalValueInStock());
   }
}
