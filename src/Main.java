import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        String patata = "hola";
        System.out.println(patata.length());
        System.out.println("Hello world!");

        Estudiant estudiant = new Estudiant();
        estudiant.canviarNom("Carlos");
        estudiant.assignarDni("47473821P");
        estudiant.posarNota(3);
        //estudiant.posarNota(34);
        //estudiant.posarNota(-34);
        System.out.println(estudiant.obtenirDades());

        Persona zapato = new Persona();
        zapato.canviarNom("Antonio");
        zapato.assignarDni("43627852X");
        //zapato.assignarDni("43627852P");
        System.out.println(zapato.obtenirDades());

        Persona armario = new Persona();
        armario.canviarNom("Lucario");
        armario.assignarDni("43077589X");
        System.out.println(armario.obtenirDades());

        Profesor oriol = new Profesor();
        oriol.canviarSou(2500);
        //oriol.canviarSou(-4);
        //oriol.canviarSou(5134278);
        oriol.canviarNom("Oriol");
        oriol.assignarDni("32678502X");
        System.out.println(oriol.obtenirDades());

        ProfesorSubstitut marc = new ProfesorSubstitut();
        Date datainici = new Date(1533, 4, 11);
        Date dataFI  = new Date(1733, 43, 12);
        marc.assignarSubstitucio(datainici, dataFI);
        marc.canviarSou(2500);
        marc.canviarNom("Marc");
        marc.assignarDni("65899324M");
        System.out.println(marc.obtenirDades());


        Institut ins = new Institut();
        ins.posarNom("Mondongo");
        System.out.println(ins.imprimirInformacio());


    }

}