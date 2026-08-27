package personagem;

public class Mago extends Personagem {
    private int inteligencia;

    @Override
    protected int atacar(){
        int dano = (inteligencia * 2) + armaEquipada.getDano();
        return dano;
    }
}
