package personagem;
import java.util.Random;

public class Arqueiro extends Personagem {
    private int agilidade;

    public Arqueiro(String nome){
        super();
        this.nome = nome;
        agilidade = 15;
        System.out.println("Arqueiro criado!");
    }

    @Override
    protected int atacar(){
        int ataqueCritico = (armaEquipada.getDano() * ataqueCritico()) / 100;
        int dano = agilidade + armaEquipada.getDano() + ataqueCritico;
        return dano;
    }

    private int ataqueCritico(){
        Random random = new Random();
        int porcentagem = random.nextInt(100);
        return porcentagem;
    }
}
