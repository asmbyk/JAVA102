public class main {
    /*nesned ( iç ice sınıflar )
     - inner class  ( iç sınıflar )
        - static
        -non-static
      - local class  ( yerel sınıflar )
      - Anonymus class ( anonim sınıflar )
     */
    public static void main(String[] args) {
     Out o = new Out();
     o.run();
     Out.In in = o.new In();
     in.run();
    }

}
