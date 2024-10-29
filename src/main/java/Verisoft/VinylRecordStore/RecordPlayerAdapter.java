package Verisoft.VinylRecordStore;

/**
 * Adapter class that adapts a RecordPlayer to work with the ModernMediaPlayer interface.
 * Allows playing vinyl records on a modern media player.
 */
public class RecordPlayerAdapter implements ModernMediaPlayer {
    private RecordPlayer recordPlayer;

    /**
     * Constructs a new RecordPlayerAdapter with the specified RecordPlayer.
     *
     * @param recordPlayer The record player to adapt.
     */
    public RecordPlayerAdapter(RecordPlayer recordPlayer) {
        this.recordPlayer = recordPlayer;
    }

    @Override
    public void play() {
        System.out.println("Adapting vinyl record to digital play...");
        recordPlayer.playRecord();
    }

    @Override
    public void pause() {
        System.out.println("Adapting vinyl record stop for digital pause...");
        recordPlayer.stopRecord();
    }
}
