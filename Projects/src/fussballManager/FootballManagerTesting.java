package fussballManager;

import org.junit.Assert;
import org.junit.Test;

public class FootballManagerTesting {
    MainManagerSimulator main = new MainManagerSimulator();
    @Test
    public void showGoalkeepers(){
        main.showGoalkeepers(main.generatePlayer());
    }
}
