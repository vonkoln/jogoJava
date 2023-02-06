 import java.util.Scanner;
 import java.io.PrintStream;
 import java.util.Random;

    public class Jogo{
 
    
        public static void main(String [] args){       
        
            PrintStream show = System.out;
            Scanner scan = new Scanner(System.in);
            Random gerador = new Random();
        
        
            int opcao ;
            int escolha_computador;
            int escolha_usuario;
        

            show.println("Olá, Como se chama?");
            String nome = scan.nextLine();
            show.println("Prazer em conhece lo" + nome +"!");
            show.println(nome + "Voce que jogar comigo?");
            show.println("/n informe o numero da sua opcao./n 1 -> sim. /n 2 -> nao /n" );
            opcao = scan.nextInt();
 
 
            if(opcao == 2){ 

show.println("Que Pena!! mas tudo bem, fica pra próxima");
} else if (opcao ==1 ) {  
      show.println("ok, ..o jogo é assim...");
      show.println("Eu vou escolher um numero de 0 a 10");
       show.println("tente advinahr qual é, e voce sera o vencedor");
    
escolha_computador = gerador.nextInt(11);
   show.println ("OK, " +nome+ ". Eu ja escolhi");
   show.println ("ok, agora tente advinhar!!") ;

     do { 
     escolha_usuario = scan.nextInt();
       if ( escolha_usuario != escolha_computador) { 
           show.println("Resposta errada");
      } else { 
          show.println("parabens!Você acertou!!!");
        }
     } while (escolha_computador != escolha_usuario);
    }
}
}