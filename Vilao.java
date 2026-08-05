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

    @Override
    public void agir() {
        if (nivelDeAmeaca >= 7) {
            System.out.println(getNome() + " lança um ataque devastador! (nível " + nivelDeAmeaca + ")");
        } else if (nivelDeAmeaca >= 4) {
            System.out.println(getNome() + " ataca com força moderada. (nível " + nivelDeAmeaca + ")");
        } else {
            System.out.println(getNome() + " tenta atacar, mas é fraco. (nível " + nivelDeAmeaca + ")");
        }
    }
}
