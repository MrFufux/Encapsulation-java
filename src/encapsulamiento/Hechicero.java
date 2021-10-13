package encapsulamiento;

public class Hechicero extends Personaje{
    private int poder;

    @Override
    public void saludar() {
        System.out.println("Hola soy un hechicero y te voy a comprar la vida hijo puta.");
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getPoder() {
        return poder = poder;
    }
}
