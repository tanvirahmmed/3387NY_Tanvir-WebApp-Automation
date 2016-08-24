package home.page;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by rinko on 8/23/2016.
 */
public class Search extends Base {

    @Test
    public void searchNews() throws InterruptedException {
        //clickByCss(".button.search-button");
        typeByCss("#gh-search-input", "hp spectre x360");
        sleepFor(10);
    }


}
