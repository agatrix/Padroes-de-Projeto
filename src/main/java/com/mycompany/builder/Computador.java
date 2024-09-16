package com.mycompany.builder;

/**
 * Classe utilizada para representar um objeto casa
 * @author Gustavo
 */
public class Computador {
    private String marca;
    private boolean portatil;
    private String armazenamento;
    
    Computador(){}
    Computador(String marca, boolean portatil, String armazenamento) {
        this.marca = marca;
        this.portatil = portatil;
        this.armazenamento = armazenamento;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Get/Set">
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isPortatil() {
        return portatil;
    }

    public void setPortatil(boolean portatil) {
        this.portatil = portatil;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
    
    //</editor-fold>

    @Override
    public String toString() {
        return "Computador{" + "marca=" + marca + ", portatil=" + portatil
                + ", armazenamento=" + armazenamento + '}';
    }    
}
