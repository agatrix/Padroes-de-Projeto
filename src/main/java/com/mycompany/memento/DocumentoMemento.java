package com.mycompany.memento;

/**
 * Memento da Classe Documento, salva o estado do objeto.
 * @author Gustavo
 */
public class DocumentoMemento {
    private final String texto;
    //Variavel Final póis o estado do memento é só
    //uma "Tela", não se altera

    public DocumentoMemento(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
