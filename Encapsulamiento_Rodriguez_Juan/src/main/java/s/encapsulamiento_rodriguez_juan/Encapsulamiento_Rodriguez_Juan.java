
package s.encapsulamiento_rodriguez_juan;

import java.util.Scanner;

public class Encapsulamiento_Rodriguez_Juan {

    public static void main(String[] args) {
        int opc = 0;
        int opc_2 = 0;
        Scanner txt = new Scanner(System.in);
        System.out.println("Ejercicios de encapsulamiento: \n (1) Clase de estudiante  \n (2) Cuenta bancaria \n (3) Automovil \n (4) Empleado \n (5) Circulo  ");
        System.out.println("Selecciona el ejercicio que desea observar :D = ");
        opc = txt.nextInt();
       
                switch (opc){
                    case 1:
                            double nota_2;
                            Estudiante estudiante = new Estudiante("Juan", 20);
                            System.out.println("Hola, digita la calificacion 1: ");
                            estudiante.setCalificacion(0,txt.nextDouble());
                            System.out.println("Digita la calififacion 2: ");
                            nota_2= txt.nextDouble();
                            estudiante.setCalificacion(1,nota_2);
                            System.out.println("Nombre del estudiante: " + estudiante.getNombre());
                            System.out.println("Edad del estudiante: " + estudiante.getEdad());
                            System.out.println("Calificación 1: " + estudiante.getCalificacion(0));
                            System.out.println("Calificación 2: " + estudiante.getCalificacion(1));    
                    break;
                   
                   
                    case 2:
                       
                            CuentaBancaria cuenta = new CuentaBancaria(1000000, "6849");
                            int ret = 0;
                            int dep = 0;
                            int total;
                            System.out.println("Bienvenido a tu cuenta bancaria con numero de cuenta= "+ cuenta.getN_cuenta()+" Y un dinero base de "+cuenta.getSaldo());
                            System.out.println("___________________________________________________________________________");
                            System.out.println("(1) Retirar dinero \n (2) Depositar dinero "); // la opcion de consultar esta tanto en la de retirar como en la de depositar al final :)
                            opc_2 = txt.nextInt();
                   
                                switch (opc_2) {

                                    case 1:
                                        System.out.println("Cuanto desea retirar?");
                                        ret= txt.nextInt();
                                        if (ret>0 && ret<= cuenta.getSaldo()){
                                            total= cuenta.getSaldo()- ret;
                                            System.out.println("Su retiro de "+ ret +" ha sido completado exitosamente.");
                                            System.out.println("Su saldo actual ahora es de "+ total);
                                        }
                                        else {
                                            System.out.println("Por favor haga un retiro coherente");
                                        }
                                    break;

                                    case 2:
                                        System.out.println("Cuanto desea depositar?");
                                        dep= txt.nextInt();
                                        if (dep>0){
                                            total= dep + cuenta.getSaldo();
                                            System.out.println("Su deposito de "+ dep +" ha sido completado exitosamente.");
                                            System.out.println("Su saldo actual ahora es de "+ total);
                                        }
                                        else {
                                            System.out.println("Por favor haga un deposito coherente");
                                        }
                                    break;

                                    default: System.out.println("Por favor esocja una opcion de las 2");
                                }
                       
                    break;
                   
                    case 3:
                        Automovil carro = new Automovil("M3 GTR", "BMW");
                        System.out.println("El carro es de la marca= "+carro.getMarca());
                        System.out.println("El "+carro.getMarca()+ " es del modelo= "+carro.getModelo());
                        carro.mostrar_velocidad();
                       
                    break;
                   
                    case 4:
                       Empleado trabajador = new Empleado ("Edward", "19/01/08",1300000);
                       trabajador.mostrar_info();
                       trabajador.aumentar_salario();
                    break;
                   
                    case 5:
                        Circulo circulo = new Circulo (4);
                        System.out.println("Teniendo claro que el radio de su circulo es de 4m entonces: ");
                        circulo.mostrar_area();
                    break;
                   
                    default: System.out.println("Por favor digite una opcion valida ");
                }
       
    }
   
}
