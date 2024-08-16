

public class Main {
    public static void main(String[] args)
    {
    Operadora atento = new Operadora("Atento", new Vivo());
    atento.atender();

    atento.setNome("paulo Pescoço");

    System.out.println(atento.getNome());
    }
}