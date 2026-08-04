public class SuperHeroi extends Personagem {
    
    public  Sexo sexo;                
    public boolean identidadeSecreta;
    public String[] habilidades;

    public SuperHeroi(Sexo sexo){
        this.sexo = sexo;
        
    }
    public void mostrar() {
        System.out.println(nome + " - " + sexo + " - " + altura);
        for (int i = 0; i < habilidades.length; i++) {
            System.out.println(habilidades[i]);
        }
    }
    
    @Override public String apresentar(){
      return  "Apresentando";
    }
    
}