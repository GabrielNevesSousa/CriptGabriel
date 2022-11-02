package cript_object;

public class CriptObject {
	
	String mensajeOriginal;
	String mensajeModificado;
	String cambiosMensaje;
	public static String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwyz12345678910?!.,_";
	public static int desplazar;
	
	public CriptObject(String mensajeOriginal) {
		this.mensajeOriginal = mensajeOriginal;
	}
	
	
	public String getMensajeOriginal() {
		return mensajeOriginal;
	}
	
	public void setMensajeOriginal(String mensajeOriginal) {
		this.mensajeOriginal = mensajeOriginal;
	}
	
	public CriptObject() {
		
	}
	
	public static String codificarCesar(String mensajeOriginal, int desplazamiento){
	    String textoCodificado = "";
	 
	    mensajeOriginal = mensajeOriginal.toUpperCase();
	 
	    char caracter;
	    for (int i = 0; i < mensajeOriginal.length(); i++) {
	        caracter = mensajeOriginal.charAt(i);
	 
	        int pos = alfabeto.indexOf(caracter);
	 
	        if(pos == -1){
	            textoCodificado += caracter;
	        }else{
	            textoCodificado += alfabeto.charAt( (pos + desplazamiento) % alfabeto.length() );
	        }
	    }
	 
	    return textoCodificado.toUpperCase();
	}
	
	  public static String descifradoCesar(String texto, int codigo) {
	        StringBuilder cifrado = new StringBuilder();
	        codigo = codigo % 68;
	        for (int i = 0; i < texto.length(); i++) {
	            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
	                if ((texto.charAt(i) - codigo) < 'a') {
	                    cifrado.append((char) (texto.charAt(i) - codigo + 68));
	                } else {
	                    cifrado.append((char) (texto.charAt(i) - codigo));
	                }
	            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
	                if ((texto.charAt(i) - codigo) < 'A') {
	                    cifrado.append((char) (texto.charAt(i) - codigo + 68));
	                } else {
	                    cifrado.append((char) (texto.charAt(i) - codigo));
	                }
	            }
	        }
	        return cifrado.toString();
	    }
}