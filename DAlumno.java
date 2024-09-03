/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Beans.Curso;
import java.io.File;
import java.util.ArrayList; 
import java.util.List; 
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author tracy
 */
public class DAlumno {
    public List<String> leerCursosAlumno() {
        List<String> cursos = new ArrayList<>();
        try {
            File archivo = new File("cursosAlumnos.txt");
            Scanner scanner = new Scanner(archivo);
            
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                cursos.add(linea); 
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cursos;  
    }
}
