package com.mycompany.builder;

/**
 * Class DesktopBuild
 * @author Gustavo
 */
public class DesktopBuild implements IComputadorBuilder {
    Computador desktop = new Computador();
    @Override
    public void setMarca() {
        desktop.setMarca("Y");
    }

    @Override
    public void setPortatil() {
        desktop.setPortatil(false);
    }

    @Override
    public void setArmazenamento() {
        desktop.setArmazenamento("1024GB");
    }

    @Override
    public Computador getComputador() {
        return desktop;
    }
    
}
