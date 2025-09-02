package ejemploherencia;

public class Main {
     public static void main(String[] args) {
		DVD peli = new DVD("la novicia rebelde","musical",
				                "muy buena",true,120,"robert wise");
		CD disco = new CD("let it be", "rock","muy buena",true,50,"the beatles",5);
	    if (disco instanceof CD)
	    	System.out.println("es dvd");
	    if (disco instanceof Formato)
	    	System.out.println("es formato");
	    if (disco instanceof Object)
	    	System.out.println("es un objeto");
	    System.out.println(disco);
	}
}
