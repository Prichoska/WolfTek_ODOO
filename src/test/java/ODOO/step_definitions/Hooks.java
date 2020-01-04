package ODOO.step_definitions;

import ODOO.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

   @Before
    public void setup(){
       System.out.println("==========================");
        System.out.println("Test setup");
        Driver.get().manage().window().maximize();
    }

    @After
    public void teardown(Scenario scenario){

       if(scenario.isFailed()){
           System.out.println("Test failed");
       } else {
           System.out.println("clean up");
           System.out.println("Test completed");
       }
        System.out.println("==========================");
        Driver.closeDriver();
   }
}
