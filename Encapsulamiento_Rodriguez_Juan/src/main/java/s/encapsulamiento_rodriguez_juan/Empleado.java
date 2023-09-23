
package s.encapsulamiento_rodriguez_juan;

import java.util.Scanner;

public class Empleado {
     String nombre;
     String fecha_contr;
     int salario;
     
    public Empleado (String nombre, String fecha_contr, int salario){
        this.nombre = nombre;
        this.fecha_contr = fecha_contr;
        this.salario = salario;
    }
    
    public String getNombre() {
        return nombre;
    }
    public String getFecha_contr() {
        return fecha_contr;
    }
    
    public void setSalario() {
        this.salario = salario;
    }
    public int getSalario (){
        return salario;
    }
    
    
    public void mostrar_info (){
        System.out.println("El empleado "+ getNombre()+" empezo a trabajar en la empresa desde "+ getFecha_contr() );
    }
    
    public void aumentar_salario (){
        int horas;
        int total;
        int sal;
        System.out.println("Su salario actualmente es de "+ getSalario());
        System.out.println("Si usted durante el mes hizo 2 o mas horas extras recibira un aumento en su salario. (El limite de horas es 16) (cada hora vale 20.000$)");
        System.out.println("Por favor digite cuantas horas extras realizo");
        Scanner txt = new Scanner (System.in);
        horas = txt.nextInt();
        if (horas>=2 && horas<=16){
            total= horas*20000;
            sal = getSalario() + total;
            System.out.println("Su salario aumento a "+ sal);  
        } 
        else {
            System.out.println("Por favor digite un numero de horas validas ");
        }
    }
}
