package enums;

public enum TipoArma {
    ESPADA(20),
    MACHADO(25),
    ARCO(15),
    CAJADO(10);

    private int dano;

    private TipoArma(int dano){
        this.dano = dano;
    }

    public int getDano(){
        return dano;
    }
}
