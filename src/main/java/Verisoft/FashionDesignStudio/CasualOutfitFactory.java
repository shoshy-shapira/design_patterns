package Verisoft.FashionDesignStudio;
// Concrete factory for creating casual outfits
public class CasualOutfitFactory implements OutfitFactory {
    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Botton createBotton() {
        return new CasualBotton();
    }
}
