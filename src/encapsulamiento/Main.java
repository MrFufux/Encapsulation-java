package encapsulamiento;

public class Main {
    public static void main(String[] args) {
        //creamos el objeto personaje1
        Personaje personaje1 = new Personaje();

        personaje1.setNombre("Steve");
        personaje1.setEdad(28);
        personaje1.setTextura("tSteve.jpg");

        personaje1.saludar();
        System.out.println("Nombre: " +personaje1.getNombre());
        System.out.println("Edad: " +personaje1.getEdad());
        System.out.println("Textura usada: "+personaje1.getTextura());
        System.out.println("-----------------------------------------");
        //creamos el objeto hechicero
        Personaje hechiceroMamado = new Hechicero(); //aplicamos polimorfismo

        hechiceroMamado.saludar();
        hechiceroMamado.setNombre("Rumualdo");
        hechiceroMamado.setEdad(150);
        hechiceroMamado.setTextura("tHechicero2.jpg");

        System.out.println("Nombre: " +hechiceroMamado.getNombre());
        System.out.println("Edad: " +hechiceroMamado.getEdad());
        System.out.println("Textura usada: "+hechiceroMamado.getTextura());

    }
}
