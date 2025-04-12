
package fila;


public class Lista<T> extends EstruturaEstatica<T> {
    //metodo construtor com parametros o super proque esta herdado
    public Lista(int capacidade){
        super(capacidade);
    }
    
    //metodo construtor sem parametros
    public Lista(){
        super();
    }
    
    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }
    
    public boolean adciona(int posicao, T elemento){
        return super.adiciona(posicao, elemento);
    }
}
