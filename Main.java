/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.List;
import java.util.ArrayList;

public class Main {
    
    
    public static void main(String[] args) {
        SuperHeroi h = new SuperHeroi("Amanda", 3, Sexo.MULHER);
        // h.nome = "Lisiane Reips";
       //.altura = 1.75;
       // h.identidadeSecreta = true;
       // h.habilidades = new String[]{"super força", "visão de raio-x", "voar",
               // "super velocidade", "sopro congelante"};
       // h.mostrar();
        // O vilão consegue fazer isto. Por quê?
       //h.setNome("Amanda");
       //h.setAltura(-300);
       // h.nome = "";
       // h.mostrar();
        
        //Personagem personagem1 = new Personagem();
        
      
       //TESTE PASSO 2 LISTA DE HABILIDADE
       h.getHabilidades().add("fogo");
       List<String> copia = h.getHabilidades();
       System.out.println("Tamanho antes: " + copia.size());

       copia.add("Super Força");
       copia.add("Invisibilidade");

        System.out.println("Tamanho da cópia depois de alterar: " + copia.size());

        List<String> original = h.getHabilidades();
        System.out.println("Tamanho da lista original (dentro do objeto): " + original.size());

        System.out.println(original.contains("Super Força"));
        
    }
    
}