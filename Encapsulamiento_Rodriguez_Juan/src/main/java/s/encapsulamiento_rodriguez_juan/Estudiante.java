
package s.encapsulamiento_rodriguez_juan;

public class Estudiante {
      private String nombre;
    private int edad;
    private double[] calificaciones;        

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new double[5];
        }
   
    public String getNombre() {
        return nombre;
    }
       
    public void setEdad() {
        this.edad = edad;
    }
    public int getEdad (){
        return edad;
    }
       
    public double getCalificacion(int indice) {
        return calificaciones[indice];
    }
   
    public void setCalificacion(int indice, double calificacion) {
        calificaciones[indice] = calificacion;
    }


}
