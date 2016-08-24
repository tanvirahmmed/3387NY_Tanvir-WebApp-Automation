package fb.login;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by rinko on 8/23/2016.
 */
public class login extends Base {

    @Test
    public void NewsLinkView() throws InterruptedException {

        typeByXpathValue("//*[@id='email']","rinko.ewu@gmail.com");
        typeByXpathValue("//*[@id='pass']","rinko11435");
        clickByXpath("//*[@id='loginbutton']");
        sleepFor(15);
    }


}
