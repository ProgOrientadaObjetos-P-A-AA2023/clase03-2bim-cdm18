/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String code, ArrayList<Estudiante> e) {
        lista = e;
        codigo = code;
    }

    public void calcularPromedioMatriculas() {
        promedioMatriculas = 0;

        for (int i = 0; i < lista.size(); i++) {
            promedioMatriculas = promedioMatriculas + lista.get(i).getMatricula();
        }

        promedioMatriculas = promedioMatriculas / lista.size();

    }

    public void setLista(ArrayList<Estudiante> l) {
        lista = l;
    }

    public double getPromedioMatriculas() {
        return promedioMatriculas;
    }

    public ArrayList<Estudiante> getLista() {
        return lista;
    }

    @Override
    public String toString() {

        String mensaje = "\tReporte Estudiante\n";
        mensaje = String.format("%sCODIGO: %s\n"
                + "Lista estudiantes: \n", mensaje, codigo);
        for (int i = 0; i < lista.size(); i++) {
            mensaje = String.format("%s\nNombre del estudiante: %s\n"
                    + "Apellido del estudiante: %s\n"
                    + "Edad del estudiante: %d\n"
                    + "Matricula del estudiante: %.2f\n",
                    mensaje,
                    lista.get(i).getNombre(),
                    lista.get(i).getApellido(),
                    lista.get(i).getEdad(),
                    lista.get(i).getMatricula());

        }
        mensaje = String.format("%s\nPromedio de matriculas de estudiantes: %.2f\n"
                + "------------------------------------------",
                mensaje, getPromedioMatriculas());
        return mensaje;
    }

}
