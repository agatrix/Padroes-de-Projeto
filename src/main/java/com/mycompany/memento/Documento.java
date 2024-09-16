package com.mycompany.memento;

/**
 * Classe do Objeto do tipo documento
 * @author Gustavo
 */
public class Documento {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public DocumentoMemento criarMemento() {
        return new DocumentoMemento(texto);
    }
    
    public void restaurar(DocumentoMemento memento) {
        this.texto = memento.getTexto();
    }

    @Override
    public String toString() {
        return "Documento{" + "texto=" + texto + '}';
    }
}
