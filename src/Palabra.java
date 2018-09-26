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
    String palabras[]={"PERDI","ENANO","ANEXO","ANIME","ANTES","LUEGO","VERBO","MAGO","VELGA","Banco","BRUTO",
        "DELTA","ERIZO","DONAR","LETRA","ACIDO","ACTOR","AMIGO","APOYO"};
    void seleccionar(){
    int x=(int) (Math.random()*19);
    p=palabras[x];
    }
    void dividir(){
        letras=p.toCharArray();
    }
}

