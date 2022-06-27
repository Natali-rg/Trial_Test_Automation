import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testik extends Base{


    @Test
    public void Test() {
        driver.get("https://www.youtube.com/");
        if (driver.getTitle().equals("YouTube")){
            System.out.println("OK!");
        }else {
            System.out.println("not ok");
        }
    }
@Test
    public void Test1(){
        driver.get("https://shakhtar.com/");
        if (driver.getTitle().equals("Офіційний сайт ФК «Шахтар» (Донецьк)")){
            System.out.println("It is Shakhtar site");
        }else {
            System.out.println("not ok");
        }
}


}
