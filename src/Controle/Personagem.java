/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;

import java.io.Serializable;
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
    
    public String nome;
    public int quantidadeVida;
    public int taxaAtaque;

    public int getTaxaAtaque() {
        return taxaAtaque;
    }

    public int getTaxaResistencia() {
        return taxaResistencia;
    }
    public int taxaResistencia;

    public void setTaxaAtaque(int taxaAtaque) {
        this.taxaAtaque = taxaAtaque;
    }

    public void setTaxaResistencia(int taxaResistencia) {
        this.taxaResistencia = taxaResistencia;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeVida() {
        return quantidadeVida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeVida(int quantidadeVida) {
        this.quantidadeVida = quantidadeVida;
    }
    
    private int getDano(){
        return 0;
    }
    
    private int getResistencia(){
        return 0;
    }
    
    private String atacar(Personagem atacado){
        return null;
    }
    
    public Personagem adicionar(Personagem personagem, int opcao){
        if (opcao == 1) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Selecione o personagem:");
            System.out.println("1) Guerreiro");
            System.out.println("2) Mago");
            System.out.println("3) Clérigo");
            System.out.println("4) Arqueiro");
            System.out.println("5) Cavaleiro");
            System.out.println("Opção: ");
            opcao = entrada.nextInt();
            
            switch (opcao){
                case 1:
                    personagem.setNome("Guerreiro");
                    personagem.setQuantidadeVida(500);
                    personagem.setTaxaAtaque(35);
                    personagem.setTaxaResistencia(50);
                    break;
                case 2:
                    personagem.setNome("Mago");
                    personagem.setQuantidadeVida(350);
                    personagem.setTaxaAtaque(40);
                    personagem.setTaxaResistencia(30);
                    break;
                case 3:
                    personagem.setNome("Clérigo");
                    personagem.setQuantidadeVida(250);
                    personagem.setTaxaAtaque(10);
                    personagem.setTaxaResistencia(20);
                    break;
                case 4:
                    personagem.setNome("Arqueiro");
                    personagem.setQuantidadeVida(350);
                    personagem.setTaxaAtaque(40);
                    personagem.setTaxaResistencia(25);
                    break;
                case 5:
                    personagem.setNome("Cavaleiro");
                    personagem.setQuantidadeVida(400);
                    personagem.setTaxaAtaque(50);
                    personagem.setTaxaResistencia(40);
                    break;
            }
        } else {
            personagem.setNome("Tanker");
            personagem.setQuantidadeVida(500);
            personagem.setTaxaAtaque(35);
            personagem.setTaxaResistencia(50);
        }
        return personagem;
    }
}
