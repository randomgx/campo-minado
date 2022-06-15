public class Elemento {

    public static final int VAZIO = 0;
    public static final int RECOMPENSA = 1;
    public static final int BOMBA = 2;

    protected Casa casa;
    protected int tipo;
    protected int valor;
    protected boolean revelado = false;

    public Elemento() {
        //this.casa = casa;
    }

    public void setCasa(Casa casa)
    {
        this.casa = casa;
        casa.colocarElemento(this);
    }

    /**
     * Valor    Tipo
     *   0   Vazio
     *   1   Recompensa
     *   2   Bomba
     *   3   Escondido
     * @return o tipo da peca.
     */
    public int getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }

    public boolean getRevelado() {
        return revelado;
    }  

    public void revelar() {
        revelado = true;
    }

    public void esconder() {
        revelado = false;
    }
}
