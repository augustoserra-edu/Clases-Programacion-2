package ejemploherencia;

public class DVD extends Formato{
      private String director;
      public DVD(String titulo, String genero,String comentario,
    		       boolean tengo, int duracion, String director)
      {
    	  super(titulo,genero,comentario,tengo,duracion);
    	  this.director = director;
      }
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
    public String toString()
    {
    	return super.toString()+", "+director;
    }
}
