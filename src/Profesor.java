public class Profesor extends Persona {
    private double sou;

    public void canviarSou(double sou) throws Exception {
        if (this.sou < 3000 && this.sou > 0) {
            this.sou=sou;
        } else {
            throw new Exception("Error Sou");
        }
    }


    public String obtenirDades() {
        return super.obtenirDades() + " Sou: " + this.sou;
    }

}
    

