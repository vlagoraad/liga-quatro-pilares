public abstract class Personagem{
    private String nome;
    private float altura;
    private Sexo sexo;

    public Personagem(String nome, float altura, Sexo sexo){
        if (nome == null) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        if (altura < 0.5 || altura > 3.0) {
            throw new IllegalArgumentException("Altura deve estar entre 0.5 e 3.0");
        }
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
    }

    public abstract String apresentar();

    public abstract void agir();

    public float getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    @Override
    public String toString() {
        return apresentar();
    }
}
