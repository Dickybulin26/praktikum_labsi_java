// Subclass Kucing mewarisi Hewan
public class Kucing extends Hewan {

    public Kucing() {
        super();
    }

    public Kucing(String nama) {
        super(nama);
    }

    // Polymorphism: override perilaku bersuara() khas kucing
    @Override
    public void bersuara() {
        System.out.println("Suara: Meong!");
    }
}
