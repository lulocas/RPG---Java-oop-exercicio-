package personagem;

import enums.TipoArma;
import enums.TipoPersonagem;

abstract class Personagem {
    private String nome;
    private int nivel;
    private int vida;
    private int vidaMaxima;
    private int xp;
    TipoPersonagem tipo;
    TipoArma armaEquipada;

    public Personagem(){
        nivel = 1;
        vida = 100;
        vidaMaxima = 100;
        xp = 0;
    }

    protected abstract int atacar();
    protected void receberDano(int dano){
        this.vida -= dano;
        System.out.println(this.nome + " recebeu -" + dano + " de dano");
        System.out.println("Vida atual -> " + this.vida);
    }
    protected void curar(int cura){
        if(this.vida + cura > vidaMaxima){
            this.vida = vidaMaxima;
        }else{
            this.vida += cura;
        }
        System.out.println(this.nome + " recebeu +" + cura + " de vida");
        System.out.println("Vida atual -> " + this.vida);
    }
    protected void exibirStatus(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Vida: " + this.vida + "/100");
        System.out.println("Nível: " + this.nivel);
    }
}
