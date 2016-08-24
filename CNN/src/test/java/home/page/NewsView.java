package home.page;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by rinko on 8/23/2016.
 */
public class NewsView extends Base {

    @Test
    public void NewsLinkView() throws InterruptedException {
       clickByXpath("//*[@id='nav']/div[2]/div[2]/a[3]");
        typeById("search-input-field","USA Elections");

       // typeByCss("#gh-search-input", "hp spectre x360");
       // clickByCss("nav-menu-links__link");
       // driver.findElement(By.xpath("//*[@id='nav']/div[2]/div[2]/a[3]")).click();

        sleepFor(15);
    }


}
