package Verisoft.VinylRecordStore;

public class VinylRecordStore implements RecordPlayer {
    @Override
    public void playRecord() {
        System.out.println("play VinylRecord");
    }

    @Override
    public void stopRecord() {
        System.out.println("Stopping vinyl record...");
    }
}
