package Clases;

import java.util.ArrayList;

public class GestorTareas {

    private ArrayList<Tarea> listaTareas;

    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
    }
    //agregamos una tarea a la lista O(1)
    public void agregarTarea(Tarea tarea) {
        listaTareas.add(tarea);
    }

    //mostramos todas las tareas 0(n)
    public void listarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        for (Tarea t : listaTareas) {
            System.out.println(t.toString());
        }
    }

    //Buscamos la tarea segun el id que tenga O(n) porque recorre toda la lista
    public void buscarPorId(int id){
        for (Tarea t : listaTareas) {
            if(t.getId()== id){
                System.out.println(t.toString());

            }
        }
    }

    public void marcarCompletada(int id){
        for (Tarea t : listaTareas) {
            if(t.getId()== id && t.isCompletada() == false){
                t.setCompletada(true);

            }
        }
    }

    public void eliminarTarea(int id){
        for (Tarea t : listaTareas) {
            if(t.getId()== id){
                listaTareas.remove(id-1);

            }
        }
    }

    public void obtenerTareasPendientes(){
        for (Tarea t : listaTareas) {
            if(t.isCompletada() == false){
                System.out.println(t.toString());

            }
        }
    }

    //
    public void obtenerTareasPrioridad(int prioridad){
        for (Tarea t : listaTareas) {
            if(t.getPrioridad() == prioridad){
                System.out.println(t.toString());

            }
        }
    }

}
