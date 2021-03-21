package model;


import java.util.Arrays;
import java.util.List;


public class Movie {
     private String name;
     private List<String> generos;     
     public Movie() {
    	 this.name="Titanic";
    	 this.generos=Arrays.asList("accion","romance","comedia");
     }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getGeneros() {
		return generos;
	}
	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}



     
}
