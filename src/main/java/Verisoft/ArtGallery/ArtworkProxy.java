package Verisoft.ArtGallery;

/**
 * ArtworkProxy class that acts as a proxy for the RealArtwork.
 * It controls access to the real artwork by adding extra functionality
 * such as access control and logging.
 */

public class ArtworkProxy implements Artwork {
    private RealArtwork realArtwork;
    private boolean isAuthorized;

    /**
     * Constructs an ArtworkProxy instance.
     *
     * @param realArtwork  the real artwork to be proxied
     * @param isAuthorized indicates whether the user is authorized to access the artwork
     */
    public ArtworkProxy(RealArtwork realArtwork, boolean isAuthorized) {
        this.realArtwork = realArtwork;
        this.isAuthorized = isAuthorized;
    }

    @Override
    public void viewArtwork() {
        if (isAuthorized) {
            realArtwork.viewArtwork();
            logAccess("viewed");
        } else {
            System.out.println("Access denied. You are not authorized to view this artwork.");
        }
    }

    @Override
    public void purchaseArtwork() {
        if (isAuthorized) {
            realArtwork.purchaseArtwork();
            logAccess("purchased");
        } else {
            System.out.println("Access denied. You are not authorized to purchase this artwork.");
        }
    }

    /**
     * Logs access to the artwork.
     *
     * @param action the action performed (viewed or purchased)
     */
    private void logAccess(String action) {
        System.out.println("Logging: Artwork was " + action + " by user.");
    }

}

