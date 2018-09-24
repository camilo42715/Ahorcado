/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Palabra {
    String p;
    char letras[];
    String palabras[]={"HOLA","LOSA","BARA","CAMI","LOCA","GANO","LOOL","MAGO","COOL"};
    void seleccionar(){
    int x=(int) (Math.random()*9);
    p=palabras[x];
    }
    void dividir(){
        letras=p.toCharArray();
    }
}

