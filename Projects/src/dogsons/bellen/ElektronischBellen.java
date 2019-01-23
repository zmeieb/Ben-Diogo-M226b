package dogsons.bellen;

public class ElektronischBellen implements BellVerhalten {
    @Override
    public void bellen() {
        System.out.println("Robotic WOOF");
    }
}
