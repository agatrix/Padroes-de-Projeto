package com.mycompany.padraoprojeto;

import com.mycompany.builder.Computador;
import com.mycompany.builder.ComputadorDirector;
import com.mycompany.builder.DesktopBuild;
import com.mycompany.builder.NotebookBuilder;
import com.mycompany.memento.Documento;
import com.mycompany.memento.Historico;

/**
 * Código Main para execução dos Padroões de Projeto
 * @author Gustavo
 */
public class PadraoProjeto {

    public static void main(String[] args) {
        /**
         * MEMENTO EXEMPLO
         * Documento: Orignator
         * DocumentoMemento: Memento
         * Historico: Caretaker
         */
        
        Documento docs = new Documento(); //Criando o Originator
        Historico historico = new Historico();
        
        docs.setTexto("Teste1");
        //Salvamos o primeiro estado no historico
        historico.salvar(docs);
                
        //Sobreescrevemos o que tem no atributo texto
        docs.setTexto("Teste2");
        //Salvamos o novo estado no historico
        historico.salvar(docs);
        
        docs.setTexto("Teste3"); //Salvamos mais um estado
        //historico.salvar(docs); So salvamos quando for mudar de estado
        
        //Printamos o que esta atualmente
        System.out.println(docs); 
        //Usamos o metodo desfazer, ou seja, voltamos um estado
        historico.desfazer(docs); 
        System.out.println(docs);
        
        historico.desfazer(docs); 
        System.out.println(docs);
        
//--------------TESTE ENCERRADO MEMENT----------------------------------------//        
        
        /**
         * BUILDER EXEMPLO
         * Computador: Objeto
         * IComputadorBuilder: Interface
         * NotebookBuilder e DesktopBuilder: Builders
         * ComputadorDirector: Director
         */
        
        ComputadorDirector x = new ComputadorDirector
                                        (new NotebookBuilder());
        x.criarComputador();
        Computador modelo = x.getComputador();
        System.out.println(modelo.toString());
        
        x = new ComputadorDirector(new DesktopBuild());
        x.criarComputador();
        modelo = x.getComputador();
        System.out.println(modelo.toString());
        
        //modelo = new Computador("x",true,"256GB");
        
        /**
         * modelo = ComputadorBuild()
         *          marca("x").
         *          portatil(false).
         *          armazenamento("128GB").
         *          build();
         */
    }
}
