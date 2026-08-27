package personagem;

public class Guerreiro extends Personagem {
    private int forca;

    @Override
    protected int atacar() {
        int dano = (forca + armaEquipada.getDano()) / 2;
        return dano;
    }
}
