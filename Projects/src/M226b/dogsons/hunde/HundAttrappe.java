package M226b.dogsons.hunde;

import M226b.dogsons.bellen.BellVerhalten;
import M226b.dogsons.bellen.ElektronischBellen;

public class HundAttrappe extends Hund {

    private BellVerhalten bellVerhalten = new ElektronischBellen();

    public void bellen() {
        bellVerhalten.bellen();
    }

    @Override
    public void setBellVerhalten(BellVerhalten bellVerhalten) {
        this.bellVerhalten = bellVerhalten;
    }
}
