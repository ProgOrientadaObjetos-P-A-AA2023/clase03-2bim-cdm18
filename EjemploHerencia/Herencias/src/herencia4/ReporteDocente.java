/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String code, ArrayList<Docente> l) {
        lista = l;
        codigo = code;
    }

    public void establecerLista(ArrayList<Docente> l) {
        lista = l;
    }

    public void calcularPromedioSueldos() {
        promedioSueldos = 0;

        for (int i = 0; i < lista.size(); i++) {
            promedioSueldos = promedioSueldos + lista.get(i).getSueldo();
        }

        promedioSueldos = promedioSueldos / lista.size();

    }

    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {

        String mensaje = "\tReporte Docente\n";
        mensaje = String.format("%sCODIGO: %s\n"
                + "Lista de docentes:\n",
                mensaje, codigo);
        
        for (int i = 0; i < lista.size(); i++) {
            mensaje = String.format("%s\nNombre del docente: %s\n"
                    + "Apellido del docente: %s\n"
                    + "Edad del docente: %d\n"
                    + "Sueldo del docente: %.2f\n",
                    mensaje,
                    lista.get(i).getNombre(),
                    lista.get(i).getApellido(),
                    lista.get(i).getEdad(),
                    lista.get(i).getSueldo());

        }
        mensaje = String.format("%s\nPromedio de sueldos de docentes: %.3f\n"
                + "------------------------------------------",
                mensaje, obtenerPromedioSueldos());
        return mensaje;
    }

}
