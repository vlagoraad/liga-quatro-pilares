import java.util.List;
import java.util.ArrayList;
public class SuperHeroi extends Personagem {
    private boolean identidadeSecreta;
    private List <String> habilidades = new ArrayList<>();

    public SuperHeroi(String nome, float altura, Sexo sexo){
        super(nome, altura,sexo);
        setNome(nome);
        setAltura(altura);
        setSexo(sexo);

    }
    public void mostrar() {
        System.out.println(getNome() + " - " + getSexo() + " - " + getAltura());
        for (int i = 0; i < habilidades.size(); i++) {
            System.out.println(habilidades.get(i));
        }
    }

    @Override
    public String apresentar() {
        return "Herói: " + getIdentidade()
                + " | Sexo: " + getSexo().getdescription()
                + " | Altura: " + getAltura()
                + " | Habilidades: " + getHabilidades();
    }

    @Override
    public void agir() {
        List<String> habs = getHabilidades();
        if (habs.isEmpty()) {
            System.out.println(getNome() + " não tem habilidades!");
        } else {
            System.out.println(getNome() + " usa: " + habs.get(0));
        }
    }

    public void usarHabilidade() {
        List<String> habs = getHabilidades();
        if (habs.isEmpty()) {
            System.out.println("Nenhuma habilidade disponível.");
        } else {
            System.out.println(getNome() + " usa: " + habs.get(0));
        }
    }

    public void usarHabilidade(int indice) {
        List<String> habs = getHabilidades();
        if (indice < 0 || indice >= habs.size()) {
            System.out.println("Índice inválido: " + indice);
        } else {
            System.out.println(getNome() + " usa: " + habs.get(indice));
        }
    }

    public void usarHabilidade(String nome) {
        List<String> habs = getHabilidades();
        if (habs.contains(nome)) {
            System.out.println(getNome() + " usa: " + nome);
        } else {
            System.out.println("Habilidade '" + nome + "' não encontrada.");
        }
    }
    
    public void adicionarHabilidade(String habilidade) {
    this.habilidades.add(habilidade);
}



    public String getIdentidade(){
        if (identidadeSecreta){
            return "??? (identidade protegida)";
        }
        return getNome();
    }

    public String revelarIdentidade(){
        return getNome();
    }

    public List<String> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }
}