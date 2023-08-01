import org.testng.annotations.*;

public class Sample1 {

    @BeforeTest
    public void p1()
    {
        System.out.println("login to application");
    }

    @AfterTest
    public void p2()
    {
        System.out.println("logout of application");
    }

    @BeforeMethod
    public void database1()
    {
        System.out.println("Connect to DB");
    }

    @AfterMethod
    public void database2()
    {
        System.out.println("Disconnect from DB");
    }

    @Test(priority = 1,description = "This is login")
    public void loginTest()
    {
        System.out.println("Login is successful");
    }

    @Test(priority = 2,description = "This is logout")
    public void logoutTest()
    {
        System.out.println("Logout is successful");
    }
}
