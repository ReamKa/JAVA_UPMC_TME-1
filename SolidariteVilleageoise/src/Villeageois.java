public class Villeageois {
    private String nom;
    private double poids;
    private boolean malade;

    public Villeageois(String nomVillageois){
        nom = nomVillageois;
        poids=Math.round(Math.random()*50+100);
        malade=Math.random()<0.2;
    }
    public String toString(){
        return "Villageois : " + nom + ". Poids : " + poids +" kgs. Malade : "+ malade;
    }

    public String getNom() {
        return nom;
    }
    public double getPoids() {
        return poids;
    }
    public boolean getMalade(){
        return malade;
    }
    public double poidsSouleve(){
        if (malade = true){
            return 0.25*poids;
        } else {
            return 0.3*poids;
        }
    }
}
