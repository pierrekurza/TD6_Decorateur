/**
 * Created by pierre on 10/10/16.
 */
public class SalonDeThe {
    public static void main(String[] args) {
        Dessert d1 = new Gaufre();
        d1 = new Chocolat(d1);
        System.out.println("Nom : " + d1.getLibelle() + " -> Prix : " + d1.getPrix());
        System.out.println("Chocolat ? " + d1.estAuChocolat(d1) + '\n');

        Dessert d2 = new Pancake();
        d2 = new Sucre(d2);
        d2 = new Chantilly(d2);
        System.out.println("Nom : " + d2.getLibelle() + " -> Prix : " + d2.getPrix());
        System.out.println("Chocolat ? " + d2.estAuChocolat(d2) + '\n');
    }
}
