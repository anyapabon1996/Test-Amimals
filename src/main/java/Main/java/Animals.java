package Main.java;

public abstract class Animals {
	 	private String type;
	    private String name;
	    private String habitat; 
	    private Integer feetQuantities; 

	    //All fields constructor 
	    public Animals(String type, String name, String habitat, Integer feet){
	        this.type = type; 
	        this.name = name;
	        this.habitat = habitat;
	        this.feetQuantities = feet;
	    }

	    //getters and setters
	    public String getType(){
	        return this.type;
	    }

	    public void setType (String type){
	        this.type = type; 
	    }

	    public String getName(){
	        return this.name;
	    }

	    public void setName(String name){
	        this.name = name; 
	    }

	    public String getHabitat() {
	        return this.habitat;
	    }

	    public void setHabitat(String habitat) {
	    	this.habitat = habitat;
	    }

	    public Integer getFeetQuantities() {
	        return this.feetQuantities;
	    }

	    public void setFeetQuantities(Integer feetQuantities) {
	        this.feetQuantities = feetQuantities;
	    }

	    //toString()
	    @Override
	    public String toString() {
	        return "{" +
	            " type='" + getType() + "'" +
	            ", name='" + getName() + "'" +
	            ", habitat='" + getHabitat() + "'" +
	            ", feetQuantities='" + getFeetQuantities() + "'" +
	            "}";
	    } 

	    //at least one abstract method 
	    public abstract String sound();

}
