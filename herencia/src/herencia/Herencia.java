//Ejemplo de herencia con las calses "Vehiculo" y "Automovil"
abstract class Vehiculo {
    protected String marca; 
    
    public Vehiculo(string marca) {
        this.marca = marca; 
    }   
}

// Class derivada que hereda de vehiculo
abstract calss Automovil extends Vehiculo {
     private String modelo; 
 
     public Automovil extends Vehiculo {
         super(marca); 
         this.modelo=modelo; 
     }

     public void conducir(){
         system.out.println( "conduciendo el automovil");
     }
}

//Uso de la herencia
public calss main {
   public static void main(string[] args){
      Automovil miAuto = new Automovil( "Toyota",   "Corolla") {}; 
      miAuto.arrancar();
      miAuto.conducir();
     s}
}
