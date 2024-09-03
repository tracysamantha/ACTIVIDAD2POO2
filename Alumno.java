/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;
import java.util.List; 
import java.util.ArrayList;
/**
 *
 * @author tracy
 */
public class Alumno extends Persona {
    public String codigoAlumno;
    public List<Curso> listaCursos;

    public Alumno(String dni, String nombre, String apellido, String codigoAlumno) {
        super(dni, nombre, apellido);
        this.codigoAlumno = codigoAlumno;
         this.listaCursos = new ArrayList<>();
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void agregarCurso(Curso curso) {
        this.listaCursos.add(curso);
    }
}
