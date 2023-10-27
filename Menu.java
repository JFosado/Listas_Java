import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
      
        Listas listita = new Listas();
        int opcion=0, el, el2;
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar un elemento a la lista \n2. Agregar un elemento al final de la lista\n3. Insertar despues de un elemento\n4. Calcular promedio\n5. Eliminar el nodo mayor\n6. Eliminar los nodos mayores a un elemento dado\n7. Salir","Menu de opciones",3));
                switch(opcion){
                    case 1: try{
                        el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento","Insertando al inicio",3));
                        listita.insertaInicio(el);
                    }catch(NumberFormatException n){
                        JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                    }
                    listita.mostrarLista();
                        break;
                    case 2:try{
                        el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento","Insertando al final",3));
                        listita.agregarFinal(el);
                    }catch(NumberFormatException n){
                        JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                    }
                    listita.mostrarLista();
                        break;
                    case 3: el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento a buscar","Buscando",3));
                    el2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento a insertar","Insertando",3));
                    listita.insertarDespuesDe(el, el2);
                    listita.mostrarLista();
                    break;
                    case 4:listita.calcularPromedio();
                    break;
                    case 5: listita.eliminarNodoMayor();
                    listita.mostrarLista();
                    break;
                    case 6:el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el limite de valor","Asignando limite",3));
                    listita.eliminarNodosMayores(el);
                    listita.mostrarLista();
                    break;
                    case 7: break;
                        default: JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                    
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            }
        }while(opcion!=7);
    }
    
}