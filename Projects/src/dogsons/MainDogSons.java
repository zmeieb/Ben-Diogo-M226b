package dogsons;

import dogsons.bellen.LautBellen;
import dogsons.hunde.Husky;

public class MainDogSons {

    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.bellen();
        husky.setBellVerhalten(new LautBellen());
        husky.bellen();
    }
}
