
package fila;

public class Pilha<T> extends EstruturaEstatica {
    public Pilha(){
        super();
    }
    
    public Pilha(int capacidade){
        super(capacidade);
    }
    
    public void empilha(T elemento){
        super.adiciona(elemento);
    }
    
    public T topo(){
        if(this.estaVazia()){
            return null;
        } else {
            return (T) this.elementos[tamanho-1];
        }
    }
    
    public T desempilha(){
        if(this.estaVazia()){
            return null;
        }
        T elemento = (T) this.elementos[tamanho-1];
        tamanho --;
        return elemento;
    }
}
