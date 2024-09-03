/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

/**
 *
 * @author tracy
 */
public class Docente extends Persona{
  public String cursoDocente; 
  public String facultadDocente; 

    public Docente(String cursoDocente, String facultadDocente, String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.cursoDocente = cursoDocente;
        this.facultadDocente = facultadDocente;
    }
public void calificarCurso(Curso curso){
    int notaClase=(int)(Math.random()*21); 
    curso.setNota(notaClase);
    
}  
  
}

