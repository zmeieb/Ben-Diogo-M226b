package dogsons.hunde;

import dogsons.bellen.BellVerhalten;
import dogsons.laufen.LaufVerhalten;

public abstract class Hund {

    private BellVerhalten bellVerhalten;
    private LaufVerhalten laufenVerhalten;

    public void setBellVerhalten(BellVerhalten bellVerhalten) {
        this.bellVerhalten = bellVerhalten;
    }

    public void setLaufenVerhalten(LaufVerhalten laufenVerhalten) {
        this.laufenVerhalten = laufenVerhalten;
    }
}
