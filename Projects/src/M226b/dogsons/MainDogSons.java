package M226b.dogsons;

import M226b.dogsons.bellen.LautBellen;
import M226b.dogsons.hunde.Husky;

public class MainDogSons {

    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.bellen();
        husky.setBellVerhalten(new LautBellen());
        husky.bellen();
    }
}
