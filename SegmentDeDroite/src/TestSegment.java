public class TestSegment {
    public static void main (String[] args){
        Segment segment1 = new Segment(6,8);
        Segment segment2 = new Segment(12,5);

        if (segment1.longueur() < segment2.longueur()){
            System.out.println("Le deuxieme segment est plus long");
        } else {
            System.out.println("Le premier segment est plus long");
        }
    }
}
