package com.mycompany.builder;

/**
 * Interface para firmar contrato nos builders
 * @author gusta
 */
public interface IComputadorBuilder {
    void setMarca();
    void setPortatil();
    void setArmazenamento();
    Computador getComputador();
    //Após construir o objeto, o get devolve ele montado
}
