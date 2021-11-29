package Main.java;

public class Fenix extends Animals implements Skills {

    public Fenix(String type, String name, String habitat, Integer feet){
        super(type, name, habitat, feet); 
    }

    public String sound(){
        return "Se caracteriza por su canto, capaz de entenderse como una expresión emocionaque brota desde el interior de la persona. Solo se conoce una pieza de su canto, captada después de la muerte de Dumbledore. Visitar: https://www.youtube.com/watch?v=akxeqLr7A0M";
    }

    public boolean health(){
        return true;
    }
 
    public boolean kill(){
        return false; 
    }

    public boolean appear(){
        return true;
    }

    public String velocity(){
        return "Altamente veloz"; 
    }

}
