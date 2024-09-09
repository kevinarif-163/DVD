package product;

public class Tester {
    //Buat object dari class CD
    public static void main(String[] args) {
        CD c1 = new CD();

        c1.setArtist("ibad kayang");
        c1.setLabel("ibad senam");
        c1.setNumsong(2);

        c1.print();
        DVD d1 = new DVD();

        d1.setLength(2);
        d1.setRating("ibad senam");
        d1.setStudio("oon");

        c1.print();
    }
}
