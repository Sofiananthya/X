//Eemplo de encapsulacion con una clase "CuentaBancaria"
abstract class CuentaBancaria {
    private string titular;
    private double saldo; 
    
    // Constructor 
    public CuentaBancaria(string titular, double saldoInicial) {
        this.titular = titular; 
        this.saldo = saldoInicial; 
    }
    
    //Metodo publico para realizar un deposito 
    public void  depsositar(double monto) {
        saldo += monto; 
    }
    
    //Metodo publico para realizar un retiro 
    public void retirar(double monto) {
        if (monto <=saldo) {
            saldo -=monto;
        } else {
            system.out.println("Saldo insificiente");
        }
    }
    // Metodo publico para obtener el saldo 
    public double obtenerSaldo() {
        return saldo; 
    }
    
} 
// Uso dela encapsualcion
public calss main {
   public static void main(string [] args) {
        cuentaBancaria miCuenta = new CuentaBancaria( "Juan Prez",  1000){};
        miCuenta.depositar(  500); 
        miCuenta.retirar(  200); 
        system.out.println("Saldo actual: "+ miCuenta.obtenerSaldo());
    }
}
ssssss