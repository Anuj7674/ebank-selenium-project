package banking_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homepage {

    WebDriver ldriver;

    public homepage(WebDriver rdriver){
        ldriver = rdriver;

        PageFactory.initElements(rdriver, this);




    }
    @FindBy(how = How.XPATH,using = "//a[@href='addcustomerpage.php']")
    WebElement newcustomer;

    public void newcustomer(){
        newcustomer.click();

    }
}

