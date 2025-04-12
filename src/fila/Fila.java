package fila;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila(){
        super();
    }
    
    public Fila(int capacidade){
        super(capacidade);
    }
    
    public void enfileira(T elemento) {
        this.adiciona(elemento);
    }
    
    public T espiar() {
        if (this.estaVazia()){
            return null;
        }
        return this.elementos[0];
    }
    
    public T desenfileira(){
        if (this.estaVazia()){
            return null;
        }
        
        final int POS = 0;
        
        T elementoASerRemovido = this.elementos[POS];
        this.remove(POS);
        return elementoASerRemovido;
    }
    
    @Override
    public String toString() {
        if (this.estaVazia()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(this.elementos[i]);
            sb.append(", ");
        }

        sb.append(this.elementos[this.tamanho - 1]);
        sb.append("]");

        return sb.toString();
    }
    
}
