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
	 
	    return textoCodificado;
	}
	
	  public static String descifradoCesar(String texto, int desplazamiento) {
		  String textoDescodificado = "";
		  
		    texto = texto.toUpperCase();
		 
		    char caracter;
		    for (int i = 0; i < texto.length(); i++) {
		        caracter = texto.charAt(i);
		 
		        int pos = alfabeto.indexOf(caracter);
		 
		        if(pos == -1){
		            textoDescodificado += caracter;
		        }else{
		            if(pos - desplazamiento < 0){
		                textoDescodificado += alfabeto.charAt( alfabeto.length() + (pos - desplazamiento) );
		            }else{
		                textoDescodificado += alfabeto.charAt( (pos - desplazamiento) % alfabeto.length() );
		            }
		        }
		 
		    }
		 
		    return textoDescodificado;
	    }
}