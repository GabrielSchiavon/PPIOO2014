package Controle;

public class Protagonista extends Personagem {
    public String atacar(Personagem atacado){
        return null;
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
    
    public void incrementarVida(Personagem personagem, int fatorInc){
        
    }
}
