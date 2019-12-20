package ODOO.step_definitions;

import ODOO.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("\n\tThis is coming from before scenario");
    }

    @After
    public void tearDown() {
        System.out.println("\tThis is coming from after scenario\n");
        Driver.closeDriver();
    }
}
