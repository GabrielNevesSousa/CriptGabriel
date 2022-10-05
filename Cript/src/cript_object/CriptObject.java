package cript_object;

public class CriptObject {
	
	
	String array[] = new String[11];
	String mensajeOriginal;
	String mensajeModificado;
	String cambiosMensaje;
	String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ,abcdefghijklmnopqrstuvwyz12345678910,?!.,_";

	public CriptObject(String mensajeOriginal) {
		this.mensajeOriginal = mensajeOriginal;
		
		System.out.println("Metodos de cifrado");
		System.out.println("1-César");
		System.out.println("2-monoalfabético ");
		System.out.println("3-Cifrado por numeración");
		
	}
	
	public String getMensajeOriginal() {
		return mensajeOriginal;
	}
	
	public void setMensajeOriginal(String mensajeOriginal) {
		this.mensajeOriginal = mensajeOriginal;
	}
	
	public CriptObject() {
		
	}
}