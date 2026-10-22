// Subclass Sapi mewarisi Hewan
public class Sapi extends Hewan {

    // Polymorphism: override perilaku bersuara() khas sapi
    @Override
    public void bersuara() {
        System.out.println("Suara: Mooo!");
    }
}
