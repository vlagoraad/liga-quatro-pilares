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
    
    @Override public String apresentar(){
      return  "Apresentando";
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