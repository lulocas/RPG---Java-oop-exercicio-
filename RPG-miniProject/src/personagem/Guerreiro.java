package personagem;

public class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro(String nome){
        super();
        this.nome = nome;
        forca = 15;
        System.out.println("Guerreiro criado!");
    }

    @Override
    protected int atacar() {
        int dano = (forca + armaEquipada.getDano()) / 2;
        return dano;
    }
}
