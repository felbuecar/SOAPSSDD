package comerciowebservice;

public class Usuario implements java.io.Serializable{
    
    private String nombre;
    private float saldo;
    private String direccion;

    public Usuario(String nombre, float saldo, String direccion){
	this.nombre=nombre;
	this.saldo=saldo;
	this.direccion=direccion;
	
    }

    public void setNombre(String nombre){
	this.nombre=nombre;
    }

    public void setSaldo(float saldo){
	this.saldo=saldo;
    }

    public void setDireccion(String direccion){
	this.direccion=direccion;
    }

    public String getNombre(){
	return this.nombre;
    }
    
    public float getSaldo(){
	return this.saldo;
    }
    
    public String getDireccion(){
	return this.direccion;
    }
}
