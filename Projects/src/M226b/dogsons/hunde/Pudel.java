package M226b.dogsons.hunde;

import M226b.dogsons.bellen.BellVerhalten;
import M226b.dogsons.bellen.LeiseBellen;

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
