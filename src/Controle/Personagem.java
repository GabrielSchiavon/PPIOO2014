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
    
    public Personagem addProtagonista(Personagem protagonista, int opcao){
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
                    protagonista.setNome("Guerreiro");
                    protagonista.setQuantidadeVida(500);
                    protagonista.setTaxaAtaque(35);
                    protagonista.setTaxaResistencia(50);
                    break;
                case 2:
                    protagonista.setNome("Mago");
                    protagonista.setQuantidadeVida(350);
                    protagonista.setTaxaAtaque(40);
                    protagonista.setTaxaResistencia(30);
                    break;
                case 3:
                    protagonista.setNome("Clérigo");
                    protagonista.setQuantidadeVida(250);
                    protagonista.setTaxaAtaque(10);
                    protagonista.setTaxaResistencia(20);
                    break;
                case 4:
                    protagonista.setNome("Arqueiro");
                    protagonista.setQuantidadeVida(350);
                    protagonista.setTaxaAtaque(40);
                    protagonista.setTaxaResistencia(25);
                    break;
                case 5:
                    protagonista.setNome("Templarios");
                    protagonista.setQuantidadeVida(400);
                    protagonista.setTaxaAtaque(50);
                    protagonista.setTaxaResistencia(40);
                    break;
            }      
        }
        return protagonista;
    }
    
    public Personagem addAntagonista(Personagem antagonista,int opcao){
        Random gerador = new Random();
        int valor = gerador.nextInt(101);
        System.out.println("Valor: " + valor);
        
        if (valor >= 0 && valor <=20) {
                antagonista.setNome("Terrorista");
                antagonista.setQuantidadeVida(500);
                antagonista.setTaxaAtaque(35);
                antagonista.setTaxaResistencia(50);
            } 
            else if(valor >= 21 && valor <= 40){
                antagonista.setNome("Xamã");
                antagonista.setQuantidadeVida(350);
                antagonista.setTaxaAtaque(40);
                antagonista.setTaxaResistencia(30);
            }
            else if(valor >= 41 && valor <= 60){
                antagonista.setNome("Exorcista");
                antagonista.setQuantidadeVida(250);
                antagonista.setTaxaAtaque(10);
                antagonista.setTaxaResistencia(20);
            }     
            else if (valor >= 61 && valor <= 80){
                antagonista.setNome("Gatuno");
                antagonista.setQuantidadeVida(350);
                antagonista.setTaxaAtaque(40);
                antagonista.setTaxaResistencia(25);
            }
            else {
                antagonista.setNome("Cavaleiro");
                antagonista.setQuantidadeVida(400);
                antagonista.setTaxaAtaque(50);
                antagonista.setTaxaResistencia(40);
            }
        return antagonista;
    }
}
