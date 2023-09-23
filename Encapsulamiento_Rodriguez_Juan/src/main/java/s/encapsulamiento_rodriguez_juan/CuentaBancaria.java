
package s.encapsulamiento_rodriguez_juan;

public class CuentaBancaria {
      public String n_cuenta;
    private int saldo;
   
    public CuentaBancaria (int saldo, String n_cuenta) {
        this.n_cuenta = n_cuenta;
        this.saldo = saldo;
}
    public String getN_cuenta (){
        return n_cuenta;
    }
    public void setN_cuenta() {
        this.n_cuenta = n_cuenta;
    }
    public void setSaldo() {
        this.saldo = saldo;
    }
    public int getSaldo (){
        return saldo;
    }
}
