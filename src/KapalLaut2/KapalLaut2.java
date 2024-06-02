
package KapalLaut2;


class KapalLaut2{
        private String tipeKapal;

    
   public KapalLaut2(String tipeKapal) {
        this.tipeKapal = tipeKapal;
    }

    public String getTipeKapal() {
        return tipeKapal;
    }

    public void setTipeKapal(String tipeKapal) {
        this.tipeKapal = tipeKapal;
    }

    public void display() {
        System.out.println("Tipe Kapal: " + tipeKapal);
    }
} 