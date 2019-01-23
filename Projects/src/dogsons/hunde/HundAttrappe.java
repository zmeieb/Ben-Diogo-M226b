package dogsons.hunde;

import dogsons.bellen.BellVerhalten;
import dogsons.bellen.ElektronischBellen;

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
