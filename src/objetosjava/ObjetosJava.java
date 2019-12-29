/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosjava;

/**
 *
 * @author Walter Galdamez
 */
class Persona{
        
        String nombre="";
        String apellidoPaterno="";
        String apellidoMaterno="";
        
        public void desplegarDatos(){
        System.out.println("nombre: "+nombre);
        System.out.println("apellido paterno: "+apellidoPaterno);
        System.out.println("apellido materno: "+apellidoMaterno);
        }
}

public class ObjetosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //aqui se crearan los objetos de la clase Persona
        //Los objetos son instancias de una clase 

        //Creamos el objeto de tipo Persona utilizando el operador new
        Persona p1 = new Persona();
        //Modificamos los atributos utilizando el operador punto
        p1.nombre="Juan";
        p1.apellidoPaterno="Perez";
        p1.apellidoMaterno="Lopez";

        //desplegamos los nuevos datos instanciando el metodo desplegarDatos de la clase persona
        p1.desplegarDatos();

        }
        //Para comprender mejor el codigo ver el ejercicio Java Ejercicio 015 
        //Clase en java en mis codigo publicados o en mi cuenta de twitter @wgm0623    
}
