package LumoSysTestCucumber;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@Cucumber.Options(format = {"json", "html:target/cucumber"}) 

public class CucumbberRunner {

}
