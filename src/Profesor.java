public class Profesor extends Persona {
    private double sou;

    public void canviarSou(double nouSou) {
        this.sou = nouSou;
    }

    public String obtenirDades() {
        return super.obtenirDades() + " Sou: " + this.sou;
    }

}
    

