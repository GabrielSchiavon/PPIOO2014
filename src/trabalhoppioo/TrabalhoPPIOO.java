package trabalhoppioo;

import Controle.Personagem;
import java.util.Scanner;

public class TrabalhoPPIOO {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int valor;
       
        Personagem personagem = new Personagem();
        Personagem sistema = new Personagem();
                
        do{
        System.out.println("************");
        System.out.println("*** MENU ***");
        System.out.println("************\n");
        System.out.println("1 - Criar personagem");
        System.out.println("2 - Listar ja Criados");
        System.out.println("3 - Atacar");
        System.out.print("Opcao => ");
        opcao = entrada.nextInt();
        
        switch (opcao){
            case 1:
                personagem.addProtagonista(personagem, opcao);
                sistema.addSistema(sistema, personagem);

                System.out.println("\n\nAdicionar:\n");
                System.out.println("1) Protagonista\n");
                
                System.out.println("Jogador:");
                System.out.println("Nome: " + personagem.getNome());
                System.out.println("Quantidade de vida:"  + personagem.getQuantidadeVida());
                System.out.println("Taxa de Ataque: " + personagem.getTaxaAtaque());
                System.out.println("Taxa de Resistencia: " + personagem.getTaxaResistencia());
                
                System.out.println("\nSistema:");
                System.out.println("Nome: " + sistema.getNome());
                System.out.println("Quantidade de vida:"  + sistema.getQuantidadeVida());
                System.out.println("Taxa de Ataque: " + sistema.getTaxaAtaque());
                System.out.println("Taxa de Resistencia: " + sistema.getTaxaResistencia());            
                break;
                
            case 2:
                System.out.println("Jogador:");
                System.out.println("Nome: " + personagem.getNome());
                System.out.println("Quantidade de vida:"  + personagem.getQuantidadeVida());
                System.out.println("Taxa de Ataque: " + personagem.getTaxaAtaque());
                System.out.println("Taxa de Resistencia: " + personagem.getTaxaResistencia());
                
                System.out.println("\nSistema:");
                System.out.println("Nome: " + sistema.getNome());
                System.out.println("Quantidade de vida:"  + sistema.getQuantidadeVida());
                System.out.println("Taxa de Ataque: " + sistema.getTaxaAtaque());
                System.out.println("Taxa de Resistencia: " + sistema.getTaxaResistencia());
                break;
                
            case 3:
                personagem.atacar(sistema,personagem);
                System.out.println("Vida do adversario" + sistema.getQuantidadeVida());
                break;
                
            default: System.out.println("Valor Invalido");
        }
        System.out.println("Deseja de nv ? <1> SIM <2> NAO");
        valor = entrada.nextInt();
        }
        while (valor == 1);
    }
    
}
