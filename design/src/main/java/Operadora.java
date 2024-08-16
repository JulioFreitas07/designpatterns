
public class Operadora {
    public String nome;
    public Telefonia telefonia;

    public Operadora(String nomeN, Telefonia telefoniaT)
    {
        this.nome = nomeN;
        this.telefonia = telefoniaT;
    }

    public void atender() {
        telefonia.atender();
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nomeSet)
    {
        this.nome = nomeSet;
    }

    public Telefonia getTelefonia()
    {
        return telefonia;
    }

    public void setTelefonia(Telefonia telefoniaSet)
    {
        this.telefonia = telefoniaSet;
    }
}