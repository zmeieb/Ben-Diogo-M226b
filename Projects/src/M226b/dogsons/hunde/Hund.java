package M226b.dogsons.hunde;

import M226b.dogsons.bellen.BellVerhalten;
import M226b.dogsons.laufen.LaufVerhalten;

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
