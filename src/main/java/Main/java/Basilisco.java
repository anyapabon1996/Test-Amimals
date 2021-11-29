package Main.java;

public class Basilisco extends Animals implements Skills {
    // constructor
    public Basilisco(String type, String name, String habitat, Integer feet) {
        // con super le digo que implemente el m�todo constructor full de la clase
        // padre.
        super(type, name, habitat, feet);
    }

    public String sound() {
        return "El Basilisco emite dos clases de sonidos: uno siseante, caracteristico de las serpientes, y un rugido ensordecedor, propio de su estado furico.";
    }

    public boolean health() {
        return false;
    }

    public boolean appear() {
        return false;
    }

    public boolean kill() {
        return true;
    }

    public String velocity() {
        return "Debido a su inmensidad, su velocidad se ve reducida";
    } 
}
