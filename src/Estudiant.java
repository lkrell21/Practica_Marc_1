public class Estudiant extends Persona {
    private double nota;

    public void posarNota(double nota){
        this.nota=nota;
    }

    public String obtenirDades() {
        return super.obtenirDades() + " Nota: " + this.nota;
    }
}
