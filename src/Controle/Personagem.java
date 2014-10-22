package Controle;

import java.util.Random;
import java.util.Scanner;

public class Personagem {
    private String nome;
    private String tipo;
    private int quantidadeVida;
    private int taxaAtaque;
    private int classe;
    private int taxaResistencia;
    private int VidaMax;

    public void setVidaMax(int VidaMax) {
        this.VidaMax = VidaMax;
    }

    public int getVidaMax() {
        return VidaMax;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
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
    
    private int reagir(int reducao){
        int valor;
        int gerador;
        Random gera = new Random();
        gerador = gera.nextInt(100);
        
        if (gerador > 75 && gerador < 100){
            valor = reducao * 1;
        } 
        else if (gerador > 50  && gerador < 74){
            valor = (int) (reducao * 0.75);
        }
        else {
            valor = (int) (reducao * 0.3);
        }
        return valor;
    }
    
    private int getResistencia(){
        return this.taxaResistencia;
    }
    
    public int calcFatorInc(Personagem personagem){
        int valor = 0;
        switch (personagem.getClasse()){
            case 1: 
                valor = (int) (personagem.getQuantidadeVida() * 0.1);
                break;
            case 2: 
                valor = (int) (personagem.getQuantidadeVida() * 0.4);
                break;
            case 3: 
                valor = (int) (personagem.getQuantidadeVida() * 0.3);
                break;
            default:
                System.out.println("Personagem nao é protagonista");
        }
        return valor;
    }
    
    public String atacar(Personagem atacado,Personagem atacante){
        int inicial, total;
        inicial = atacado.getQuantidadeVida();
        Scanner operacao = new Scanner(System.in);
        int op;
        
        if (atacante.getTipo().equals("Protagonista")){
            System.out.println("1) Atacar");
            System.out.println("2) Curar");
            op = operacao.nextInt();
            if (op == 1){
                atacado.setQuantidadeVida(inicial - getDano(atacante));
                atacado.setQuantidadeVida(atacado.getQuantidadeVida() + reagir(atacado.getResistencia()));
            }
            else {
                int valor = calcFatorInc(atacante) + atacado.getQuantidadeVida();
                if (atacado.getQuantidadeVida() == atacado.getVidaMax()){
                    System.out.println("Vida Completa");
                }
                else if (valor > atacado.getVidaMax()){
                    valor = atacado.getVidaMax() - valor;
                    atacado.setQuantidadeVida(atacado.getQuantidadeVida() + valor);
                }
                else {
                    atacado.setQuantidadeVida(valor);
                    System.out.println("Vida Recuperada em ");
                }
            }
        }
        else {
            
        }
        total = inicial - atacado.getQuantidadeVida();
        System.out.println("Dano total de " + total);
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
                    personagem.setTipo("Protagonista");
                    personagem.setClasse(1);
                    personagem.setQuantidadeVida(500);
                    personagem.setVidaMax(500);
                    personagem.setTaxaAtaque(35);
                    personagem.setTaxaResistencia(50);
                    break;
                case 2:
                    personagem.setNome("Mago");
                    personagem.setTipo("Protagonista");
                    personagem.setClasse(2);
                    personagem.setQuantidadeVida(350);
                    personagem.setVidaMax(350);
                    personagem.setTaxaAtaque(40);
                    personagem.setTaxaResistencia(30);
                    break;
                case 3:
                    personagem.setNome("Arqueiro");
                    personagem.setTipo("Protagonista");
                    personagem.setClasse(3);
                    personagem.setQuantidadeVida(350);
                    personagem.setVidaMax(350);
                    personagem.setTaxaAtaque(35);
                    personagem.setTaxaResistencia(25);
                    break;
                case 4:
                    personagem.setNome("Exorcista");
                    personagem.setTipo("Antagonista");
                    personagem.setClasse(4);
                    personagem.setQuantidadeVida(250);
                    personagem.setVidaMax(250);
                    personagem.setTaxaAtaque(10);
                    personagem.setTaxaResistencia(20);
                    break;
                case 5:
                    personagem.setNome("Troll");
                    personagem.setTipo("Antagonista");
                    personagem.setClasse(5);
                    personagem.setQuantidadeVida(400);
                    personagem.setVidaMax(400);
                    personagem.setTaxaAtaque(40);
                    personagem.setTaxaResistencia(50);
                    break;
                case 6:
                    personagem.setNome("Viking");
                    personagem.setTipo("Antagonista");
                    personagem.setClasse(6);
                    personagem.setQuantidadeVida(500);
                    personagem.setVidaMax(500);
                    personagem.setTaxaAtaque(50);
                    personagem.setTaxaResistencia(40);
                    break;
            }      
        }
        return personagem;
    }
        
    public Personagem addSistema(Personagem personagemSistema, Personagem jogador ){
        personagemSistema.setNome(jogador.getNome());
        personagemSistema.setTipo(jogador.getTipo());
        personagemSistema.setClasse(jogador.getClasse());
        personagemSistema.setQuantidadeVida(jogador.getQuantidadeVida());
        personagemSistema.setTaxaAtaque(jogador.getTaxaAtaque());
        personagemSistema.setTaxaResistencia(jogador.getTaxaResistencia());
        return personagemSistema;
    }
}
