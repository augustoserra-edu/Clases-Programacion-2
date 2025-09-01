package ejemploherencia;

public class Formato {
	  protected String titulo;
      protected String genero;
      protected String comentario;
      protected boolean tengo;
      protected int duracion;
      public Formato (String titulo, String genero,String comentario, boolean tengo, int duracion)
      {
    	this.titulo = titulo;
  		this.genero = genero;
  		this.comentario = comentario;
  		this.tengo = tengo;
  		this.duracion = duracion;
      }
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public boolean isTengo() {
		return tengo;
	}
	public void setTengo(boolean tengo) {
		this.tengo = tengo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String toString()
	{
		return titulo+", "+genero+", "+duracion+", "+tengo+", "+comentario;
	} 
}
