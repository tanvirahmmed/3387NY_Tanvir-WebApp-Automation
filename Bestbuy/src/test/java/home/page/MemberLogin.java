package home.page;

import common.Base;
import org.junit.Test;

/**
 * Created by rinko on 8/23/2016.
 */
public class MemberLogin extends Base {

    @Test
    public void MemberLogin() throws InterruptedException {
        clickByCss("#user link-text");
       // typeByCss("#gh-search-input", "hp laptop");
        sleepFor(10);
    }
}
