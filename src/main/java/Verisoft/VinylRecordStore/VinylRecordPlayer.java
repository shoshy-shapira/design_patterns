package Verisoft.VinylRecordStore;
/**
 * Concrete class representing a vinyl record player, implementing the RecordPlayer interface.
 */
public class VinylRecordPlayer implements RecordPlayer {
    @Override
    public void playRecord() {
        System.out.println("play VinylRecord");
    }

    @Override
    public void stopRecord() {
        System.out.println("Stopping vinyl record...");
    }
}
