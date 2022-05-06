public class Estudiant extends Persona {
    private double nota;

    public void posarNota(double nota) throws Exception {
        if (this.nota < 10 && this.nota > 0) {
            this.nota=nota;
        } else {
            throw new Exception("Error Nota");
        }
    }{
        this.nota=nota;
    }

    public String obtenirDades() throws Exception {
        return super.obtenirDades() + " Nota: " + this.nota;
    }
}
