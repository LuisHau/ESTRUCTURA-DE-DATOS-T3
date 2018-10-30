
package eje_pila1;

public class nodoDPila {
    // VARIABLE DONDE LA CUAL SE VA GUARDAR EL VALOR.
    private String valor;
    // VARIABLES PARA ENLAZAR EL NODO.
    private nodoDPila siguiente;
    
     //CONSTRUCTOR DONDE INICIALIZA EL VALOR DE LAS VARIABLES.
    
    public void nodoDPila(){
        this.valor = "";
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public nodoDPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoDPila siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
