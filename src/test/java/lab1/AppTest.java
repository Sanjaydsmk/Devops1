package lab1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testPass() {
        Assert.assertEquals(App.display(55), "pass");
    }

    @Test
    public void testFail() {
        Assert.assertEquals(App.display(35), "fail");
    }

    @Test
    public void testInvalid() {
        Assert.assertEquals(App.display(-5), "invalid");
    }
}
