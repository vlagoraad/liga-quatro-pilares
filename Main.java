import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // --- PASSO 2: teste cópia defensiva ---
        SuperHeroi h = new SuperHeroi("Amanda", 1.7f, Sexo.MULHER);
        
        h.getHabilidades().add("fogo"); // não muda nada, é cópia
        List<String> copia = h.getHabilidades();
        System.out.println("Tamanho antes: " + copia.size());
        copia.add("Super Força");
        copia.add("Invisibilidade");
        System.out.println("Tamanho da cópia depois de alterar: " + copia.size());
        List<String> original = h.getHabilidades();
        System.out.println("Tamanho da lista original (dentro do objeto): " + original.size());
        System.out.println("Contém Super Força? " + original.contains("Super Força"));

        System.out.println("---");

        // --- PASSO 3: teste herança e apresentar() ---
        Personagem heroi = new SuperHeroi("Amanda", 1.7f, Sexo.MULHER);
        Personagem vilao = new Vilao("Doutor Código-Espaguete", 1.9f, Sexo.HOMEM, 8);
        Personagem civil = new Civil("João", 1.75f, Sexo.PREFIRO_NAO_DIZER, "Jornalista");

        System.out.println(heroi.apresentar());
        System.out.println(vilao.apresentar());
        System.out.println(civil.apresentar());
    }
}