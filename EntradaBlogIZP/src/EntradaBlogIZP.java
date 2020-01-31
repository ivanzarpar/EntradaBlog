
/**Clase para manejar las entradas de un blog.
 * @author Iv�n Zarco
 * @since 21/3/1999
 * @version 2.3
 */

public class EntradaBlogIZP {
	/**separador es el car�cter que separa ENTRADA DE del nombre del autor*/
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	public EntradaBlogIZP(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	/**Constructor de la clase. 
	*
	* @param id N�mero de entrada
	* @param autor Nombre del autor de la entrada
	* @param texto Texto que contiene la entrada
	* Si el n�mero de entrada es negativo, lanza una excepci�n
	*/
	public void EntradaBlog(int id, String autor, String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**Devuelve el n�mero de la entrada*/
	public int getId(){
		return this.id;
	}
	
	/**devuelve el texto completo de la entrada*/
	public String getTexto(){
		return this.texto;
	}
	
	/**devuelve el nombre del autor de la entrada en may�sculas*/
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	//devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	/*public String devuelveAutor(){
		return this.autor;
	}*/
	
	/**No tiene porqu� tener argumentos*/
	public static void main(String[] args) {
                
		EntradaBlogIZP e1= new EntradaBlogIZP (3,"Ana","�ltimas noticias, est� disponible BixBy 2.0");
		System.out.println(e1.getId());
		System.out.println(e1.getTexto());
		System.out.println(e1.getAutor());
	}
}