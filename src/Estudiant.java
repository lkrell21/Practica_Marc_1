public class Estudiant extends Persona {
    private double nota;

    private void posarNota(double nota){
        this.nota=nota;
    }

    public double obtenirNota() {
        return this.nota;
    }
}
