package Verisoft.FashionDesignStudio;

public class FormalOutfitFactory implements OutfitFactory{
    @Override
    public Top createTop() {
        return new FormalTop();
    }

    @Override
    public Botton createBotton() {
        return new FormalBotton();
    }
}
