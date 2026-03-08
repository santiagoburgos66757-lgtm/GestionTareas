package Clases;

import java.util.ArrayList;

public class GestorTareas {

    private ArrayList<Tarea> listaTareas;

    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
    }
    //Complejidad O(1): agregamos al final una tarea a la lista lo cual es constante
    public void agregarTarea(Tarea tarea) {
        listaTareas.add(tarea);
    }

    //Complejidad O(n): ya que recorre todas las tareas para mostrarlas
    public void listarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        for (Tarea t : listaTareas) {
            System.out.println(t.toString());
        }
    }

    //Complejidad O(n): Buscamos la tarea segun el id que tenga al recorrer toda la lista
    public void buscarPorId(int id){
        for (Tarea t : listaTareas) {
            if(t.getId()== id){
                System.out.println(t.toString());

            }
        }
    }
//Complejidad O(n): Buscamos la tarea por id y cambia su estado, recorriendo la lista
    public void marcarCompletada(int id){
        for (Tarea t : listaTareas) {
            if(t.getId()== id && t.isCompletada() == false){
                t.setCompletada(true);

            }
        }
    }

    //Complejidad O(n): Localiza la tarea y la elimina; al usar un ArrayList los elementos se desplazan
    public void eliminarTarea(int id){
        for (Tarea t : listaTareas) {
            if(t.getId()== id){
                listaTareas.remove(id-1);

                break;

            }
        }
    }
//Complejidad O(n): Se Revisa todas las tareas para filtrar las que no están completadas.
    public void obtenerTareasPendientes(){
        for (Tarea t : listaTareas) {
            if(t.isCompletada() == false){
                System.out.println(t.toString());

            }
        }
    }

    //Complejidad O(n): Recorre toda la lista verificando la prioridad de cada tarea.
    public void obtenerTareasPrioridad(int prioridad){
        for (Tarea t : listaTareas) {
            if(t.getPrioridad() == prioridad){
                System.out.println(t.toString());

            }
        }
    }

}
