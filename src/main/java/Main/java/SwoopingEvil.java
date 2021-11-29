package Main.java;

public class SwoopingEvil extends Animals implements Skills {


    public SwoopingEvil(String type, String name, String habitat, Integer feet){
        super(type, name, habitat, feet); 
    }
    
    public String sound(){
        return "Emite un sonido etereo"; 
    }

    public boolean health(){
        return true;
    }

    public boolean appear(){
        return false; 
    }

    public boolean kill(){
        return true;
    }

    public String velocity(){
        return "Volador de gran velocidad y resistencia"; 
    }

}
