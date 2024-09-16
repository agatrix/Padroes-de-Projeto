package com.mycompany.memento;

import java.util.Stack;

/**
 * Classe que armazena a lista de mementos.
 * @author Gustavo
 */
public class Historico {
    private final Stack<DocumentoMemento> historico = new Stack<>();

    public void salvar(Documento documento) {
        historico.push(documento.criarMemento());
    }

    public void desfazer(Documento documento) {
        if (!historico.isEmpty()) {
            DocumentoMemento memento = historico.pop();
            documento.restaurar(memento);
        }
    }
}
