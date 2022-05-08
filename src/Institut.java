import jdk.jshell.spi.ExecutionControl;

public class Institut {
    public String nom;

    public void posarNom(String nom) {
        this.nom = nom;
    }

    public String imprimirInformacio() {
        return "Nom institut: " + this.nom;
    }


}
