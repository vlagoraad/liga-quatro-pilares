import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // --- PASSO 2: cópia defensiva ---
        SuperHeroi h = new SuperHeroi("Amanda", 1.7f, Sexo.MULHER);
        h.getHabilidades().add("fogo");
        List<String> copia = h.getHabilidades();
        System.out.println("Tamanho antes: " + copia.size());
        copia.add("Super Força");
        copia.add("Invisibilidade");
        System.out.println("Tamanho da cópia depois de alterar: " + copia.size());
        List<String> original = h.getHabilidades();
        System.out.println("Tamanho da lista original (dentro do objeto): " + original.size());
        System.out.println("Contém Super Força? " + original.contains("Super Força"));
        System.out.println("---");

        // --- PASSO 3: herança ---
        Personagem heroi = new SuperHeroi("Amanda", 1.7f, Sexo.MULHER);
        Personagem vilao = new Vilao("Doutor Código-Espaguete", 1.9f, Sexo.HOMEM, 8);
        Personagem civil = new Civil("João", 1.75f, Sexo.PREFIRO_NAO_DIZER, "Jornalista");
        System.out.println(heroi.apresentar());
        System.out.println(vilao.apresentar());
        System.out.println(civil.apresentar());
        System.out.println("---");

        // --- PASSO 4: polimorfismo ---
        List<Personagem> personagens = new ArrayList<>();
        personagens.add(new SuperHeroi("Homem-Aranha", 1.73f, Sexo.HOMEM));
        personagens.add(new Vilao("Thanos", 2.0f, Sexo.HOMEM, 10));
        personagens.add(new Civil("Maria", 1.60f, Sexo.MULHER, "Médica"));

        System.out.println("=== BATALHA POLIMÓRFICA ===");
        for (Personagem p : personagens) {
            System.out.println(p);
            p.agir();
            System.out.println("---");
        }

        SuperHeroi teste = new SuperHeroi("Mulher-Maravilha", 1.83f, Sexo.MULHER);
        teste.adicionarHabilidade("Escudo");
        teste.adicionarHabilidade("Laço da verdade");
        System.out.println("=== SOBRECARGAS ===");
        teste.usarHabilidade();
        teste.usarHabilidade(1);
        teste.usarHabilidade(99);
        teste.usarHabilidade("Escudo");
        teste.usarHabilidade("Raio");
        System.out.println("---");

        // --- PASSO 5: boss ---
        System.out.println("=== BOSS: BATALHA ===");
        Batalha batalha = new Batalha();

        SuperHeroi marvel = new SuperHeroi("Capitã Marvel", 1.73f, Sexo.MULHER);
        marvel.adicionarHabilidade("Voo");
        marvel.adicionarHabilidade("Raio de energia");

        SuperHeroi thor = new SuperHeroi("Thor", 1.98f, Sexo.HOMEM);
        thor.adicionarHabilidade("Mjolnir");
        thor.adicionarHabilidade("Trovão");

        batalha.adicionar(marvel);
        batalha.adicionar(thor);
        batalha.adicionar(new Vilao("Thanos", 2.0f, Sexo.HOMEM, 10));
        batalha.adicionar(new Vilao("Loki", 1.85f, Sexo.HOMEM, 6));
        batalha.adicionar(new Civil("Maria", 1.60f, Sexo.MULHER, "Médica"));
        batalha.adicionar(new Civil("Carlos", 1.80f, Sexo.HOMEM, "Jornalista"));

        batalha.iniciar();

        System.out.println("=== HERÓIS NA BATALHA ===");
        for (Personagem p : batalha.listarHerois()) {
            System.out.println(p.getNome());
        }

        System.out.println("=== MAIS ALTO ===");
        Personagem alto = batalha.maisAlto();
        System.out.println(alto.getNome() + " - " + alto.getAltura());

        System.out.println("=== REMOVER DERROTADO ===");
        batalha.removerDerrotado("Loki");
        batalha.removerDerrotado("Loki"); // testa personagem inexistente
    }
}