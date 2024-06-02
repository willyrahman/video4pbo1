
package KapalLaut2;

public class ArmadaLaut {
     public static void main(String[] args) {
        // Pelaut 1 bergabung dengan kapal perang
        KapalPerang kapalPerang = new KapalPerang("Battleship USS Missouri");
        Pelaut pelaut1 = new Pelaut("Captain John", kapalPerang);

        // Pelaut 2 bergabung dengan kapal dagang
        KapalDagang kapalDagang = new KapalDagang("Merchant Vessel Aurora");
        Pelaut pelaut2 = new Pelaut("First Mate Smith", kapalDagang);

        // Menampilkan detail pelaut dan kapal yang dinaikinya
        System.out.println("Detail Pelaut 1:");
        pelaut1.display();
        System.out.println();

        System.out.println("Detail Pelaut 2:");
        pelaut2.display();
    }

}