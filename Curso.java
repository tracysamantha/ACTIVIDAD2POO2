/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

/**
 *
 * @author tracy
 */
public class Curso {
    public String nombreCurso;
    private int nota; 

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.nota=-1; 
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getNota() {
        return nota;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
