public class Nodo {
    public int dato;
    public Nodo siguiente;

    //Crear un constructor.
    //Constructor: Método que permite instanciar una clase.
    public Nodo(int d, Nodo n){
        dato =d;//Asignación del parametro
        siguiente=n;//Asiganación del Nodo
    }
    public Nodo(int d){
        this.dato=d;
        this.siguiente=null;
    }
}