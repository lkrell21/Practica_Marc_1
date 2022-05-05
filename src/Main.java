public class Main {

    public static void main(String[] args) {
        String patata = "hola";
        System.out.println(patata.length());
        System.out.println("Hello world!");

        Estudiant estudiant = new Estudiant();
        estudiant.canviarNom("Carlos");
        estudiant.assignarDni("47473821P");
        estudiant.posarNota(0.1);
        System.out.println(estudiant.obtenirDades());

        Persona zapato = new Persona();
        zapato.canviarNom("Antonio");
        zapato.assignarDni("43627852X");
        System.out.println(zapato.obtenirDades());

        Persona armario = new Persona();
        armario.canviarNom("Lucario");
        armario.assignarDni("43077589X");
        System.out.println(armario.obtenirDades());

        Profesor oriol = new Profesor();
        oriol.canviarSou(2500);
        oriol.canviarNom("Oriol");
        oriol.assignarDni("32678502X");
        System.out.println(oriol.obtenirDades());

        Institut ins = new Institut();
        ins.posarNom("Mondongo");
        System.out.println(ins.imprimirInformacio());


    }

}