package M226b.dogsons.hunde;

import M226b.dogsons.bellen.BellVerhalten;
import M226b.dogsons.bellen.LautBellen;

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
