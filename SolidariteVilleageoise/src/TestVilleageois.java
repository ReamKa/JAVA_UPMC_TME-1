
public class TestVilleageois {
    public static void main (String [] args) {
        Villeageois monsieurPoupou = new Villeageois("Monsieur Poupou");
        Villeageois madameParasol = new Villeageois("Madade Parasol");
        Villeageois mademoisellePeepee = new Villeageois("Mademoiselle Peepee");
        Villeageois jeuneToni = new Villeageois("Toni Montana");

        System.out.println(monsieurPoupou);
        System.out.println(madameParasol);
        System.out.println(mademoisellePeepee);
        System.out.println(jeuneToni);

        System.out.println(monsieurPoupou.toString());
        System.out.println(madameParasol.getMalade());
        System.out.println(mademoisellePeepee.getNom());
        System.out.println(jeuneToni.getPoids());

        double rocher = 200;
        double poidsPossible = monsieurPoupou.poidsSouleve() + mademoisellePeepee.poidsSouleve() + madameParasol.poidsSouleve() + jeuneToni.poidsSouleve();
        if (poidsPossible < rocher){
            System.out.println("Les bebes ne peuvent pas soulever le rocher :(");
        } else {
            System.out.println("Ils peuvent soulever le rocher wow !!");
        }

    }
}
