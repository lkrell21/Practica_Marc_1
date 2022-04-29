public class Main {

    public static void main(String[] args) {
        String patata = "hola";
        System.out.println(patata.length());
        System.out.println("Hello world!");

        Estudiant estudiant = new Estudiant();
        System.out.println(estudiant.obtenirNota());

        Persona zapato = new Persona();
        zapato.canviarNom("Antonio");
        System.out.println(zapato.obtenirDades());

        Persona armario = new Persona();
        armario.canviarNom("Lucario");
        System.out.println(armario.obtenirDades());
    }

}