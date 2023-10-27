public class Listas{
    protected Nodo inicio, fin;
    //metodo que crea la lista
    public void Lista(){
        inicio=fin=null;
    }

    public Boolean vacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }


    //Insertar nodos al inicio de la lista.
    public void insertaInicio(int e){
        inicio= new Nodo(e,inicio);
        if(fin==null){
            fin=inicio;
        }
    }

    public boolean listaVacia(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }

    public void agregarFinal(int e) {
        Nodo nuevoNodo = new Nodo(e);
        if (listaVacia()) {
            inicio = fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
    }
    public void mostrarLista(){
        System.out.println("");
        Nodo recorrido=inicio;

        while(recorrido!=null){
            System.out.print("["+recorrido.dato+"]-->");
            recorrido=recorrido.siguiente;
        }
    }

    public void insertarDespuesDe(int elemento, int nuevoElemento) {
        Nodo nuevoNodo = new Nodo(nuevoElemento);

    // Caso especial: si el elemento a insertar es el primer elemento de la lista
    if (inicio != null && inicio.dato == elemento) {
        nuevoNodo.siguiente = inicio;
        inicio = nuevoNodo;
        return; // Elemento insertado
    }

    Nodo anterior = null;
    Nodo actual = inicio;

    while (actual != null) {
        if (actual.dato == elemento) {
            // Encontramos el nodo con el elemento deseado
            nuevoNodo.siguiente = actual;
            anterior.siguiente = nuevoNodo;
            return; // Elemento insertado
        }

        anterior = actual;
        actual = actual.siguiente;
    }

    System.out.println("El elemento [" + elemento + "] no existe en la lista, no se pudo insertar.");
    }


    public double calcularPromedio() {
        if (listaVacia()) {
            System.out.println("La lista esta vacia. No se puede calcular el promedio.");
            return 0.0; // Puedes cambiar el valor de retorno apropiado según tus necesidades.
        }
    
        Nodo recorrido = inicio;
        int suma = 0;
        int contador = 0;
    
        while (recorrido != null) {
            suma += recorrido.dato;
            contador++;
            recorrido = recorrido.siguiente;
        }
    
        double promedio = (double) suma / contador;
        System.out.println("\nEl promedio es: " + promedio);
        return promedio;
    }
    
    
    public void eliminarNodoMayor() {
        if (listaVacia()) {
            System.out.println("La lista está vacía. No se puede eliminar el nodo mayor.");
            return;
        }
    
        Nodo nodoMaximo = null;
        Nodo nodoAnterior = null;
        Nodo actual = inicio;
        int valorMaximo = -1000;
    
        while (actual != null) {
            if (actual.dato > valorMaximo) {
                valorMaximo = actual.dato;
                nodoMaximo = actual;
            }
    
            actual = actual.siguiente;
        }
    
        if (nodoMaximo == inicio) {
            inicio = inicio.siguiente;
        } else {
            actual = inicio;
            while (actual != nodoMaximo) {
                nodoAnterior = actual;
                actual = actual.siguiente;
            }
    
            nodoAnterior.siguiente = nodoMaximo.siguiente;
        }
    
        if (nodoMaximo == fin) {
            fin = nodoAnterior;
        }
    }
    

    public void eliminarNodosMayores(int limite) {
        if (listaVacia()) {
            System.out.println("La lista está vacía. No se pueden eliminar nodos mayores.");
            return;
        }
    
        Nodo nodoAnterior = null;
        Nodo actual = inicio;
    
        while (actual != null) {
            if (actual.dato > limite) {
                // El nodo actual debe ser eliminado
                if (nodoAnterior == null) {
                    // El nodo a eliminar es el inicio de la lista
                    inicio = inicio.siguiente;
                    actual = inicio;
                } else {
                    // El nodo a eliminar está en medio o al final de la lista
                    nodoAnterior.siguiente = actual.siguiente;
                    actual = nodoAnterior.siguiente;
                }
            } else {
                // No se elimina el nodo, avanzamos al siguiente
                nodoAnterior = actual;
                actual = actual.siguiente;
            }
        }
    }
    
}
       
