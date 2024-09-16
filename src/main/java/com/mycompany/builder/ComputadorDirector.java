package com.mycompany.builder;

/**
 *
 * @author gusta
 */
public class ComputadorDirector {
    private final IComputadorBuilder computador;

    public ComputadorDirector(IComputadorBuilder computador) {
        this.computador = computador;
    }
    
    public void criarComputador(){
        computador.setMarca();
        computador.setPortatil();
        computador.setArmazenamento();
    }
    public Computador getComputador(){
        return computador.getComputador();
    }
}
