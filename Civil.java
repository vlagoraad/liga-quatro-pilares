public class Civil extends Personagem {
    private String profissao;

    public Civil(String nome, float altura, Sexo sexo, String profissao) {
        super(nome, altura, sexo);
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String apresentar() {
        return "Civil: " + getNome()
                + " | Sexo: " + getSexo().getdescription()
                + " | Altura: " + getAltura()
                + " | Profissão: " + profissao;
    }

    @Override
    public void agir() {
        System.out.println(getNome() + " pede socorro!");
    }}
