/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String code, ArrayList<Policia> l) {
        lista = l;
        codigo = code;
    }

    public void calcularPromedioEdades() {
        promedioEdades = 0;

        for (int i = 0; i < lista.size(); i++) {
            promedioEdades = promedioEdades + lista.get(i).getEdad();
        }

        promedioEdades = promedioEdades / lista.size();
    }

    public void setLista(ArrayList<Policia> l) {
        lista = l;
    }

    public void setCodigo(String c) {
        codigo = c;
    }

    public double getPromedioEdades() {
        return promedioEdades;
    }

    public ArrayList<Policia> getLista() {
        return lista;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {

        String mensaje = "\tReporte Policia\n";
        mensaje = String.format("%sCODIGO: %s\n"
                + "Lista estudiantes: \n", mensaje, codigo);
        for (int i = 0; i < lista.size(); i++) {
            mensaje = String.format("%s\nNombre del policia: %s\n"
                    + "Apellido del policia: %s\n"
                    + "Edad del policia: %d\n",
                    mensaje,
                    lista.get(i).getNombre(),
                    lista.get(i).getApellido(),
                    lista.get(i).getEdad());

        }
        mensaje = String.format("%s\nPromedio de matriculas de estudiantes: %.2f\n"
                + "------------------------------------------",
                mensaje, getPromedioEdades());
        return mensaje;
    }

}
