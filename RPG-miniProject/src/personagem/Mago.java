package personagem;

public class Mago extends Personagem {
    private int inteligencia;

    public Mago(String nome){
        super();
        this.nome = nome;
        inteligencia = 15;
        System.out.println("Mago criado!");
    }

    @Override
    protected int atacar(){
        int dano = (inteligencia * 2) + armaEquipada.getDano();
        return dano;
    }
}
