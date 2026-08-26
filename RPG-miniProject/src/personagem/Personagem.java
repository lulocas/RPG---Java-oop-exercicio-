package personagem;

import enums.TipoPersonagem;

abstract class Personagem {
    private String nome;
    private int nivel;
    private int vida;
    TipoPersonagem tipo;

    protected abstract void atacar();
    protected void receberDano(int dano){
        this.vida -= dano;
        System.out.println(this.nome + " recebeu -" + dano + " de dano");
        System.out.println("Vida atual -> " + this.vida);
    }
    protected void curar(int cura){
        if(this.vida + cura > 100){
            this.vida = 100;
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
