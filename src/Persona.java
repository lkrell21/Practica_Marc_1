public class Persona {
    private String nom;
    private String dni;

    public void canviarNom(String nom) {
        this.nom=nom;
    }
    public void assignarDni(String dni) throws Exception {
        if (this.dni == null) {
            this.dni=dni;
        } else {
            throw new Exception("Error DNI");
        }
    }

    public String obtenirDades() throws Exception{
        if (this.dni == null || this.nom == null) {
            throw new Exception("Error Dades");
        } else {
            return "Persona amb nom: " + this.nom + " i DNI: " + this.dni;
        }
    }

}