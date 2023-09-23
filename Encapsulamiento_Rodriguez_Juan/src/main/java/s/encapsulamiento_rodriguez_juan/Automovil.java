
package s.encapsulamiento_rodriguez_juan;

public class Automovil {
    private String modelo;
    private String marca;
    
    public Automovil(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
}
    
    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    
    public void mostrar_velocidad (){
        System.out.println("Y la velocidad del carro es de "+ 300 + "km por hora");
    }
}
