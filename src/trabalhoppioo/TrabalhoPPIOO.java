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
        Personagem jogador = new Personagem();
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
                System.out.println("\n\nAdicionar:\n");
                System.out.println("1) Protagonista\n");
                jogador.addProtagonista(jogador, opcao);
                sistema.addSistema(sistema, jogador);
                System.out.println("Jogador:");
                System.out.println("Nome: " + jogador.getNome());
                System.out.println("Quantidade de vida:"  + jogador.getQuantidadeVida());
                System.out.println("Taxa de Ataque: " + jogador.getTaxaAtaque());
                System.out.println("Taxa de Resistencia: " + jogador.getTaxaResistencia());
                System.out.println("\nSistema:");
                System.out.println("Nome: " + sistema.getNome());
                System.out.println("Quantidade de vida:"  + sistema.getQuantidadeVida());
                System.out.println("Taxa de Ataque: " + sistema.getTaxaAtaque());
                System.out.println("Taxa de Resistencia: " + sistema.getTaxaResistencia());            
                break;
            
            case 2:
                System.out.println("Jogador:");
                System.out.println("Nome: " + jogador.getNome());
                System.out.println("Quantidade de vida:"  + jogador.getQuantidadeVida());
                System.out.println("Taxa de Ataque: " + jogador.getTaxaAtaque());
                System.out.println("Taxa de Resistencia: " + jogador.getTaxaResistencia());
                System.out.println("\nSistema:");
                System.out.println("Nome: " + sistema.getNome());
                System.out.println("Quantidade de vida:"  + sistema.getQuantidadeVida());
                System.out.println("Taxa de Ataque: " + sistema.getTaxaAtaque());
                System.out.println("Taxa de Resistencia: " + sistema.getTaxaResistencia());
                break;
            default: System.out.println("Valor Invalido");
        }
        System.out.println("Deseja de nv ? <1> SIM <2> NAO");
        valor = entrada.nextInt();
        }
        while (valor == 1);
    }
    
}
