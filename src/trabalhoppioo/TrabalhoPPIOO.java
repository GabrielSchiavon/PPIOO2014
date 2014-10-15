/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhoppioo;

import Controle.Personagem;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class TrabalhoPPIOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int valor;
        Personagem personagem = new Personagem();
        Personagem personagem1 = new Personagem();
        do{
        System.out.println("************");
        System.out.println("*** MENU ***");
        System.out.println("************\n");
        System.out.println("1 - Criar personagem");
        System.out.println("2 - Listar ja Criados");
        System.out.print("Opcao => ");
        opcao = entrada.nextInt();
        
        switch (opcao){
            case 1:
                System.out.println("\n\nAdicionar:\n");
                System.out.println("1) Protagonista\n");
                System.out.println("2) Antagonista\n");
                System.out.println("Opcao: ");
                opcao = entrada.nextInt();
                
                if (opcao == 1){                 
                    personagem.adicionar(personagem, opcao);
                    System.out.println("Nome: " + personagem.getNome());
                    System.out.println("Quantidade de vida:"  + personagem.getQuantidadeVida());
                    System.out.println("Taxa de Ataque: " + personagem.getTaxaAtaque());
                    System.out.println("Taxa de Resistencia: " + personagem.getTaxaResistencia());
                } 
                else{
                    personagem1.adicionar(personagem1, opcao);
                    System.out.println("Nome: " + personagem1.getNome());
                    System.out.println("Quantidade de vida:"  + personagem1.getQuantidadeVida());
                    System.out.println("Taxa de Ataque: " + personagem1.getTaxaAtaque());
                    System.out.println("Taxa de Resistencia: " + personagem1.getTaxaResistencia());
                }
                break;
            case 2:
                System.out.println("Protagonista:");
                System.out.println("Nome: " + personagem.getNome());
                System.out.println("Quantidade de vida:"  + personagem.getQuantidadeVida());
                System.out.println("Taxa de Ataque: " + personagem.getTaxaAtaque());
                System.out.println("Taxa de Resistencia: " + personagem.getTaxaResistencia());
                System.out.println("\nAntagonista:");
                System.out.println("Nome: " + personagem1.getNome());
                System.out.println("Quantidade de vida:"  + personagem1.getQuantidadeVida());
                System.out.println("Taxa de Ataque: " + personagem1.getTaxaAtaque());
                System.out.println("Taxa de Resistencia: " + personagem1.getTaxaResistencia());
                break;
            default: System.out.println("Valor Invalido");
        }
        System.out.println("Deseja de nv ? <1> SIM <2> NAO");
        valor = entrada.nextInt();
        }
        while (valor == 1);
    }
    
}
