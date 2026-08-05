import java.util.List;
import java.util.ArrayList;

public class Batalha {
    private List<Personagem> participantes = new ArrayList<>();

    public void adicionar(Personagem p) {
        if (p == null) {
            throw new IllegalArgumentException("Personagem não pode ser nulo.");
        }
        for (Personagem existente : participantes) {
            if (existente.getNome().equalsIgnoreCase(p.getNome())) {
                throw new IllegalArgumentException("Personagem já está na batalha: " + p.getNome());
            }
        }
        participantes.add(p);
    }

    public void iniciar() {
        System.out.println("=== BATALHA INICIADA ===");
        for (Personagem p : participantes) {
            System.out.println(p);
            p.agir();
            System.out.println("---");
        }
    }

    public List<Personagem> listarHerois() {
        List<Personagem> herois = new ArrayList<>();
        for (Personagem p : participantes) {
            if (p instanceof SuperHeroi) {
                herois.add(p);
            }
        }
        return herois;
    }

    public Personagem maisAlto() {
        if (participantes.isEmpty()) return null;
        Personagem maior = participantes.get(0);
        for (Personagem p : participantes) {
            if (p.getAltura() > maior.getAltura()) {
                maior = p;
            }
        }
        return maior;
    }

    public void removerDerrotado(String nomeDeGuerra) {
        Personagem alvo = null;
        for (Personagem p : participantes) {
            if (p.getNome().equalsIgnoreCase(nomeDeGuerra)) {
                alvo = p;
                break;
            }
        }
        if (alvo != null) {
            participantes.remove(alvo);
            System.out.println(nomeDeGuerra + " foi removido da batalha.");
        } else {
            System.out.println("Personagem não encontrado: " + nomeDeGuerra);
        }
    }
}