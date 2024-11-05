package Verisoft.ArtGallery;

/**
 * RealArtwork class representing an actual artwork in the gallery.
 * It implements the Artwork interface and contains the actual implementation
 * of viewing and purchasing the artwork.
 */
public class RealArtwork implements Artwork {
    private String title;
    private double price;

    /**
     * Constructs a RealArtwork instance.
     *
     * @param title the title of the artwork
     * @param price the price of the artwork
     */
    public RealArtwork(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public void viewArtwork() {
        System.out.println("Viewing artwork: " + title);
    }

    @Override
    public void purchaseArtwork() {
        System.out.println("Purchasing artwork: " + title + " for CH-" + price);
    }
}