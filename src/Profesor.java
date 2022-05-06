public class Profesor extends Persona {
    private double sou;

    public void canviarSou(double sou) throws Exception {
        if (sou < 3000 && sou > 0) {
            this.sou=sou;
        } else {
            throw new Exception("Error Sou");
        }
    }


    public String obtenirDades() throws Exception {
        return super.obtenirDades() + " Sou: " + this.sou;
    }

}
    

