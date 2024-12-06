package entities;

public class Conversao {
    public static final int IOF = 6;
    public static float dolar;
    public static float quantidade;
    public static float resultado;

    public static float conversao(){
      resultado = (dolar * quantidade) * (1 + IOF / 100.0f);
      return resultado;
    }

}
