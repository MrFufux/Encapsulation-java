package encapsulamiento;

public class Personaje {
    //attributes
    private String nombre;
    private int edad;
    private String textura;

    //method
    public void saludar(){
        System.out.println("Hello there!");
    }

    //method setter and getter

    //setter y getter del atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    //setter y getter del atributo edad

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    //setter y getter del atributo textura

    public void setTextura(String textura) {
        this.textura = textura;
    }
    public String getTextura() {
        return textura;
    }
}
