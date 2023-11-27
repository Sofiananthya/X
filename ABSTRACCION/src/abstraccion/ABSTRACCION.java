//Ejemplo de abstraccion con una clase "Auto"
abstract class Auto {
    String marca; 
    String modelo; 
    
    // Constructor
    public Auto(string marca, String modelo) {
        this.marca= marca; 
        this.modelo= modelo; 
    }
    
    // Metodo abstraido para obtener informacion basica del auto
    public String obtenerInformacion() {
        return "Marca: " + marca + "n"/ Modelo: "+ modelo;
    
    } 
}

//Uso de la abstraccion 
public class Main {
    public static void main(string[] args) {
        Auto miAuto=new Auto( "Toyota",  "Corolla"){};
        system.out.println( miAuto.obtenerInformacion());
    }
}
