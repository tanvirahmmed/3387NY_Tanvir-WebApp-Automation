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


        sleepFor(15);
        //test by Sifat
        //test by Nahreen
        //test by Ranin
        //test by Ahmmed
    }


}
