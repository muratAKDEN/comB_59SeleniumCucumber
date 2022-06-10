package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DTpage {
    public DTpage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
