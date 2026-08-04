/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/


public class Main {
    
    
    public static void main(String[] args) {
        SuperHeroi h = new SuperHeroi(Sexo.MULHER);
       // h.nome = "Lisiane Reips";
       //.altura = 1.75;
        h.identidadeSecreta = true;
        h.habilidades = new String[]{"super força", "visão de raio-x", "voar",
                "super velocidade", "sopro congelante"};
        h.mostrar();

        // O vilão consegue fazer isto. Por quê?
       // h.altura = -300;
       // h.nome = "";
        h.mostrar();
        
        //Personagem personagem1 = new Personagem();
        
    }
    
}