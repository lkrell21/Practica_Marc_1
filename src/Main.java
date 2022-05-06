import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        String patata = "hola";
        System.out.println(patata.length());
        System.out.println("Hello world!");

        Estudiant estudiant = new Estudiant();
        estudiant.canviarNom("Carlos");
        estudiant.assignarDni("47473821P");
        estudiant.posarNota(-1);
        System.out.println(estudiant.obtenirDades());

        Persona zapato = new Persona();
        zapato.canviarNom("Antonio");
        zapato.assignarDni("43627852X");
        //error DNI zapato.assignarDni("43627852P");
        System.out.println(zapato.obtenirDades());

        Persona armario = new Persona();
        armario.canviarNom("Lucario");
        armario.assignarDni("43077589X");
        System.out.println(armario.obtenirDades());

        Profesor oriol = new Profesor();
        oriol.canviarSou(3200);
        oriol.canviarNom("Oriol");
        oriol.assignarDni("32678502X");
        System.out.println(oriol.obtenirDades());

        ProfesorSubstitut marc = new ProfesorSubstitut();
        Date datainici = new Date(1950, 43, 0);
        Date dataFI  = new Date(1628, 28, -4);
        marc.canviarSou(2500);
        marc.canviarNom("Marc");
        marc.assignarDni("65899324M");
        System.out.println(marc.obtenirDades());


        Institut ins = new Institut();
        ins.posarNom("Mondongo");
        System.out.println(ins.imprimirInformacio());


    }

}