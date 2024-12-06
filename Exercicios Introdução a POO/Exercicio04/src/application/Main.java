package application;
// Exemplo de Metodos Estaticos
import entities.Conversao;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço dolar: ");
        Conversao.dolar = sc.nextFloat();

        System.out.print("Digite a quantidade de $ (dolar) que quer comprar: ");
        Conversao.quantidade = sc.nextFloat();

        System.out.println("Preço final em R$ (reais) a ser pago: " + Conversao.conversao());

    }
}
