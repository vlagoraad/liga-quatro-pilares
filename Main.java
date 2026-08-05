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

        System.out.println("---");

        // --- PASSO 4: polimorfismo ---
        List<Personagem> personagens = new ArrayList<>();
        personagens.add(new SuperHeroi("Capitã Marvel", 1.73f, Sexo.MULHER));
        personagens.add(new Vilao("Thanos", 2.0f, Sexo.HOMEM, 10));
        personagens.add(new Civil("Maria", 1.60f, Sexo.MULHER, "Médica"));
        personagens.add(new SuperHeroi("Thor", 1.98f, Sexo.HOMEM));
        personagens.add(new Vilao("Loki", 1.85f, Sexo.HOMEM, 6));

        System.out.println("=== BATALHA ===");
        for (Personagem p : personagens) {
            System.out.println(p); // toString() polimórfico
            p.agir();               // agir() polimórfico
            System.out.println("---");
        }

        // --- teste das sobrecargas de usarHabilidade() ---
        System.out.println("=== SOBRECARGAS ===");
        SuperHeroi teste = new SuperHeroi("Capitã Marvel", 1.73f, Sexo.MULHER);
        teste.usarHabilidade();           // sem argumento
        teste.usarHabilidade(0);          // por índice válido
        teste.usarHabilidade(99);         // índice inválido — não quebra
        teste.usarHabilidade("Raio");     // por nome
    }
}