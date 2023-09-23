
package s.encapsulamiento_rodriguez_juan;


public class Circulo {
    int radio;
    double area;
    
    public Circulo (int radio){
    this.radio = radio;
    }
    public void setRadio() {
        this.radio = radio;
    }
    public int getRadio (){
        return radio;
    }
    
    public void mostrar_area(){
        area = Math.PI * Math.pow (getRadio(),2); 
        System.out.println("El area de su circulo es de "+ area);
    }
    
    
}
