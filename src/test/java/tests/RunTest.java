package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.ClassRule;
import org.junit.runner.RunWith;
import util.TestRule;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features = "classpath:src/test/resources/features",
        features = "src/test/resources/features",
        tags = "@compra",
        glue = {""}
)
public class RunTest {

    @ClassRule
    public static TestRule testRule = new TestRule();

}