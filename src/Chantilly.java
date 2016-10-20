/**
 * Created by pierre on 10/10/16.
 */
public class Chantilly extends SupplementDecorateur {

    public Chantilly(Dessert d)
    {
        super.d = d;
    }

    public String getLibelle()
    {
        return d.getLibelle() + "Chantilly ";
    }

    public double getPrix()
    {
        return d.getPrix() + 1;
    }

}
