import Clases.GestorTareas;
import Clases.Tarea;

void main() {


    GestorTareas gestor = new GestorTareas();
    gestor.agregarTarea(new Tarea(1,"tarea de matematicas",5,false));
    gestor.agregarTarea(new Tarea(2,"Organizar el cuarto",2,false));
    gestor.agregarTarea(new Tarea(3,"ir al gimnasio",5,false));
    gestor.agregarTarea(new Tarea(4,"Estudiar Arrays y likendList",3,false));
    gestor.agregarTarea(new Tarea(5,"sacar al perro",4,false));
    gestor.listarTareas();
    gestor.marcarCompletada(1);
    gestor.marcarCompletada(5);
    gestor.buscarPorId(1);
    gestor.eliminarTarea(1);
    System.out.println("--------------------");
    gestor.listarTareas();
    System.out.println("--------------------");
    gestor.obtenerTareasPendientes();
    System.out.println("---------------------");
    gestor.obtenerTareasPrioridad(2);

}
