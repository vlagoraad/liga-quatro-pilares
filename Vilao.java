public class Vilao extends Personagem {
    private int nivelDeAmeaca;

    public Vilao(String nome, float altura, Sexo sexo, int nivelDeAmeaca) {
        super(nome, altura, sexo);
        if (nivelDeAmeaca < 1 || nivelDeAmeaca > 10) {
            throw new IllegalArgumentException("Nível de ameaça deve ser entre 1 e 10");
        }
        this.nivelDeAmeaca = nivelDeAmeaca;
    }

    public int getNivelDeAmeaca() {
        return nivelDeAmeaca;
    }

    public void setNivelDeAmeaca(int nivelDeAmeaca) {
        if (nivelDeAmeaca < 1 || nivelDeAmeaca > 10) {
            throw new IllegalArgumentException("Nível de ameaça deve ser entre 1 e 10");
        }
        this.nivelDeAmeaca = nivelDeAmeaca;
    }

    @Override
    public String apresentar() {
        return "Vilão: " + getNome() 
             + " | Sexo: " + getSexo().getdescription()
             + " | Altura: " + getAltura()
             + " | Nível de ameaça: " + nivelDeAmeaca;
    }
}