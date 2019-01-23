package dogsons.laufen;

public class KannNichtLaufen implements LaufVerhalten {
    @Override
    public void laufen() {
        System.out.println("Kann nicht laufen");

    }
}
