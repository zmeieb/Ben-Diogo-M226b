package dogsons.hunde;

import dogsons.bellen.BellVerhalten;
import dogsons.bellen.LeiseBellen;

public class Pudel extends Hund {

    private BellVerhalten bellVerhalten = new LeiseBellen();

    public void bellen() {
        bellVerhalten.bellen();
    }

    @Override
    public void setBellVerhalten(BellVerhalten bellVerhalten) {
        this.bellVerhalten = bellVerhalten;
    }
}
