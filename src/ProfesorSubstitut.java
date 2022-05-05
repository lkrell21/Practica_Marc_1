import java.util.Date;

public class ProfesorSubstitut extends Profesor {
    private Date datainici;
    private Date dataFI;

    public void assignarSubstitucio(Date datainici, Date dataFI) {
        this.datainici = datainici;
        this.dataFI = dataFI;
    }

}
