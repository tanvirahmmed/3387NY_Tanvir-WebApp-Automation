package search;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by rinko on 8/23/2016.
 */
public class SearchContent extends Base {
    @Test
    public void searchNews(){
        clickByCss(".button.search-button");
        typeByCss("#search-input", "Olympic");
    }
}
