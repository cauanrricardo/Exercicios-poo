package application;

import entities.Product;
import java.util.Scanner;

public class Progam {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Dados do produto");
        System.out.println("--------------------------------");
        System.out.println("Nome: ");
        product.nome = sc.nextLine();
        System.out.println("Preço: ");
        product.preco = sc.nextFloat();
        System.out.println("Quantidade no estoque: ");
        product.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.println("Entre com o numeros de produtos pra adicionar ao estoque: ");
        int quantidade = sc.nextInt();
        product.addProducts(quantidade);

        System.out.println();
        System.out.println("Atualizações do produto: " + product);

        System.out.println();
        System.out.println("Entre com o numeros de produtos pra remover ao estoque: ");
        quantidade = sc.nextInt();
        product.removeProducts(quantidade);

        System.out.println();
        System.out.println("Atualização final do produto: " + product);
        sc.close();
    }
}

