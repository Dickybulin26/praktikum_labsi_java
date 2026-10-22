// Subclass Kucing mewarisi Hewan
public class Kucing extends Hewan {

    // Polymorphism: override perilaku bersuara() khas kucing
    @Override
    public void bersuara() {
        System.out.println("Suara: Meong!");
    }
}
