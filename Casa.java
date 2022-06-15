public class Casa {
    private Elemento elemento;

    public Casa(int x, int y) {
        this.elemento = null;
    }
    
    /**
     * @param peca a Pe�a a ser posicionada nesta Casa.
     */
    public void colocarElemento(Elemento elemento) {
        this.elemento = elemento;
    }
    
    /**
     * Remove a peca posicionada nesta casa, se houver.
     */
    public void removerPeca() {
        elemento = null;
    }
    
    /**
     * @return a Peca posicionada nesta Casa, ou Null se a casa estiver livre.
     */
    public Elemento getElemento() {
        return elemento;
    }
    
    /**
     * @return true se existe uma pe�a nesta casa, caso contrario false.
     */
    public boolean possuiElemento() {
        return elemento != null;
    }
}
