package ejemploherencia;

public class CD extends Formato{
     private String interprete;
     private int temas;
     public CD(String titulo, String genero,String comentario,
		       boolean tengo, int duracion, String interprete, int temas)
     {
	      super(titulo,genero,comentario,tengo,duracion);
          this.interprete = interprete;
          this.temas = temas;
     }
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	public int getTemas() {
		return temas;
	}
	public void setTemas(int temas) {
		this.temas = temas;
	}
     
	public String toString()
	{
		return super.toString()+", "+interprete+", "+temas;
	}
}
