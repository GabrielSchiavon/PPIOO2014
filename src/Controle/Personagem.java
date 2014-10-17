/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Guilherme
 */
@Entity
public class Personagem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personagem)) {
            return false;
        }
        Personagem other = (Personagem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controle.Personagem[ id=" + id + " ]";
    }
    
    private String nome;
    private int quantidadeVida;
    private int taxaAtaque;
    private int classe;
    private int taxaResistencia;
    
    public int getClasse() {
        return this.classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public int getTaxaAtaque() {
        return this.taxaAtaque;
    }

    public int getTaxaResistencia() {
        return taxaResistencia;
    }    

    public void setTaxaAtaque(int taxaAtaque) {
        this.taxaAtaque = taxaAtaque;
    }

    public void setTaxaResistencia(int taxaResistencia) {
        this.taxaResistencia = taxaResistencia;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidadeVida() {
        return this.quantidadeVida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeVida(int quantidadeVida) {
        this.quantidadeVida = quantidadeVida;
    }
    
    private int getDano(Personagem personagem){
        return personagem.getTaxaAtaque();
    }
    
    private int getResistencia(){
        return this.taxaResistencia;
    }
    
    private String atacar(Personagem atacado){
        return null;
    }
    
    public Personagem addProtagonista(Personagem personagem, int opcao){
        if (opcao == 1) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Selecione o personagem:");
            System.out.println("\nProtagonistas:");
            System.out.println("1) Guerreiro");
            System.out.println("2) Mago");
            System.out.println("3) Arqueiro");
            System.out.println("\n Antagonistas:");
            System.out.println("4) Exorcista");
            System.out.println("5) Troll");
            System.out.println("6) Vikings");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
 
            switch (opcao){
                case 1:
                    personagem.setNome("Guerreiro");
                    personagem.setClasse(1);
                    personagem.setQuantidadeVida(500);
                    personagem.setTaxaAtaque(35);
                    personagem.setTaxaResistencia(50);
                    break;
                case 2:
                    personagem.setNome("Mago");
                    personagem.setClasse(2);
                    personagem.setQuantidadeVida(350);
                    personagem.setTaxaAtaque(40);
                    personagem.setTaxaResistencia(30);
                    break;
                case 3:
                    personagem.setNome("Arqueiro");
                    personagem.setClasse(3);
                    personagem.setQuantidadeVida(350);
                    personagem.setTaxaAtaque(35);
                    personagem.setTaxaResistencia(25);
                    break;
                case 4:
                    personagem.setNome("Exorcista");
                    personagem.setClasse(4);
                    personagem.setQuantidadeVida(250);
                    personagem.setTaxaAtaque(10);
                    personagem.setTaxaResistencia(20);
                    break;
                case 5:
                    personagem.setNome("Troll");
                    personagem.setClasse(5);
                    personagem.setQuantidadeVida(400);
                    personagem.setTaxaAtaque(40);
                    personagem.setTaxaResistencia(50);
                    break;
                case 6:
                    personagem.setNome("Viking");
                    personagem.setClasse(6);
                    personagem.setQuantidadeVida(500);
                    personagem.setTaxaAtaque(50);
                    personagem.setTaxaResistencia(40);
            }      
        }
        return personagem;
    }
        
    public Personagem addSistema(Personagem personagemSistema, Personagem jogador ){
        personagemSistema.setNome(jogador.getNome());
        personagemSistema.setClasse(jogador.getClasse());
        personagemSistema.setQuantidadeVida(jogador.getQuantidadeVida());
        personagemSistema.setTaxaAtaque(jogador.getTaxaAtaque());
        personagemSistema.setTaxaResistencia(jogador.getTaxaResistencia());
        return personagemSistema;
    }
}
