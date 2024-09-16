package com.mycompany.builder;

/**
 *  Class NotebookBuilder
 * @author gusta
 */
public class NotebookBuilder implements IComputadorBuilder {
    Computador notebook = new Computador();
    @Override
    public void setMarca() {
        notebook.setMarca("X"); //Utilização de Setters
    }

    @Override
    public void setPortatil() {
        notebook.setPortatil(true);
    }

    @Override
    public void setArmazenamento() {
        notebook.setArmazenamento("512GB");
    }

    @Override
    public Computador getComputador() {
        return notebook;
    }
    
}
