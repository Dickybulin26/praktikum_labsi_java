// Subclass Sapi mewarisi Hewan
public class Sapi extends Hewan {

    public Sapi() {
        super();
    }

    public Sapi(String nama) {
        super(nama);
    }

    // Polymorphism: override perilaku bersuara() khas sapi
    @Override
    public void bersuara() {
        System.out.println("Suara: Mooo!");
    }
}
