
package KapalLaut2;

class Pelaut {
 private String namaPelaut;
    private KapalLaut2 kapal;

    public Pelaut(String namaPelaut, KapalLaut2 kapal) {
        this.namaPelaut = namaPelaut;
        this.kapal = kapal;
    }

    public String getNamaPelaut() {
        return namaPelaut;
    }

    public void setNamaPelaut(String namaPelaut) {
        this.namaPelaut = namaPelaut;
    }

    public KapalLaut2 getKapal() {
        return kapal;
    }

    public void setKapal(KapalLaut2 kapal) {
        this.kapal = kapal;
    }
     public void display() {
        System.out.println("Nama Pelaut: " + namaPelaut);
        kapal.display();
     }
        
}
   

   
    