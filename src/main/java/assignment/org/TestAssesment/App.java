package assignment.org.TestAssesment;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import java.util.List;

public class App {


    File team;

    @Test
    public void TC1 () {
    	   List<String> roles = JsonPath.from(team).getList("player.role");
        int wicketkeeper = 0;
		
		for (String role : roles) {
            if (role.equalsIgnoreCase("Wicket-keeper"))
            	wicketkeeper++;
        }
        Assert.assertTrue(wicketkeeper > 0, " wicket-keeper");
    }

    @Test
    public void TC2 () {
  
		List<String> players = JsonPath.from(team).getList("player.country");
        int foreignerplayer = 0;
         for (String player : players) {
            if (!player.equalsIgnoreCase("India"))
                foreignerplayer++;
        }
        Assert.assertTrue(foreignerplayer < 5, " 4 foreign Players");
    }

}