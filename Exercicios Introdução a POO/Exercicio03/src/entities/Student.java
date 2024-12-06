package entities;

public class Student {
    public String nome;
    public float nota01;
    public float nota02;
    public float nota03;

    public void verificacao(){
        if(nota01 > 30){
            System.out.println("Pontuação errada, verifique de novo!");
            System.exit(0);
        }
        if(nota02 > 35 ){
            System.out.println("Pontuação errada, verifique de novo!");
            System.exit(0);
        }
        if(nota03 > 35){
            System.out.println("Pontuação errada, verifique de novo!");
            System.exit(0);
        }
    }
    public float somaNotas(){
        return nota01 + nota02 + nota03;
    }
    public void aprovado(){
        if(somaNotas() >= 60){
            System.out.println(somaNotas());
            System.out.println("APROVADO");
        }else{
            System.out.println(somaNotas());
            System.out.println("REPROVADO");
            float pontos = 60 - somaNotas();
            System.out.println("FALTOU " + pontos + "PONTOS");
        }
    }
}
