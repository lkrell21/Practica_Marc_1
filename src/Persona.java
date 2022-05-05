public class Persona {
    private String nom;
    private String dni;

    public void canviarNom(String nom) {
        this.nom=nom;
    }
    public void assignarDni(String dni) {
        this.dni=dni;
    }

    public String obtenirDades() {
        return "Persona amb nom: " + this.nom + " i DNI: " + this.dni;
    }

}