
package eje_pila1;

public class pilaEnlazada {
    // TOPE DE LA PILA.
    private nodoDPila inicio;
    // VARIABLE PARA REGISTRAR EL TAMAÑO DE LA PILA .
    private int tamanio;
    
    
    public void Pila(){
        inicio = null;
        tamanio = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public String[] Separar(String cadena){
        String[] cadenas = cadena.split("");
        
        //PARA ALMACENAR LAS PALABRAS EXTRAIDAS DEL TEXTO DINAMICAMETE
        String array[] = new String[cadenas.length];
        int contar = 0;
        for (int i = 0; i < cadenas.length; i++) {
            array[i] = cadenas[i];
            contar = cadenas.length;

        }
        
        return array;
    }
    
    
    public int getTamanio(){
        return tamanio;
    }
    
    
    
    public void apilar(String valor){
        // DEFINE UN NUEVO NODO.
        nodoDPila nuevo = new nodoDPila();
        // AGREGA EL VALOR AL NODO.
        nuevo.setValor(valor);
        
        // CONSULTA SI LA PILA ESTA VACIA.
        if (esVacia()) {
            // INICIALIZA LA PILA CON EL NUEVO VALOR .
            inicio = nuevo;
        }
        // Caso contrario agrega el nuevo nodo al inicio de la pila.
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        // Incrementa el contador del tamaño.
        tamanio++;
    } 
    // Elimina el elemento que se encuentra en el tope de la piala.
     
    public void retirar(){
        if (!esVacia()) {
            // Asigna como primer nodo al siguiente de la pila.
            inicio = inicio.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            tamanio--;
        }
    }
    
     // Consulta el valor del nodo que se encuentra en la cima de la pila
     
    public String cima() throws Exception{
        if(!esVacia()){
            return inicio.getValor();
        } else {
            throw new Exception("LA PILA SE ENCUENTRA VACIA.");
        }
    }
    
    public void listar(){
        // Crea una copia de la pila.
        nodoDPila aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
    
    //String temoral[] = new String[10];
    //int x=0;
    public void imprimelista(){
        // Crea una copia de la pila.
        
        
        nodoDPila aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
           // x++;
            //System.out.println("|\t" + aux.getValor() + "\t|");
            //System.out.println("-----------------");
            
            System.out.print(aux.getValor());
            //System.out.println(temoral[x]);
            
            aux = aux.getSiguiente();
            
        }
        
    } 
    
}
