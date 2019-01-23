package dogsons.hunde;

import dogsons.bellen.BellVerhalten;
import dogsons.bellen.LautBellen;

public class Husky extends Hund {

    private BellVerhalten bellVerhalten = new LautBellen();

    public void bellen() {
        bellVerhalten.bellen();
    }

    @Override
    public void setBellVerhalten(BellVerhalten bellVerhalten) {
        this.bellVerhalten = bellVerhalten;
    }
}
