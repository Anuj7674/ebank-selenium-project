package banking_pom;


import lombok.experimental.FieldDefaults;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class new_customer {

    WebDriver ldriver;

    public new_customer(WebDriver rdriver){

        ldriver =rdriver;
        PageFactory.initElements(rdriver , this);

    }
    @FindBy(how = How.NAME,using ="name")
    WebElement customername;

    @FindBy(how = How.XPATH,using = "//input[@value='m']")
    WebElement male;

    @FindBy(how = How.XPATH,using = "//input[@value='f']")
    WebElement female;

    @FindBy(how = How.ID,using = "dob")
    WebElement dob;


    @FindBy(how = How.XPATH,using = "//textarea[@name='addr']")
    WebElement addr;
    @FindBy(how = How.XPATH,using = "//input[@name='city']")
    WebElement city;
    @FindBy(how = How.XPATH,using = "//input[@name='state']")
    WebElement state;

    @FindBy(how = How.XPATH,using = "//input[@name='pinno']")
    WebElement pin;
    @FindBy(how = How.XPATH,using = "//input[@name='telephoneno']")
    WebElement tele;
    @FindBy(how = How.XPATH,using = "//input[@name='emailid']")
    WebElement email;
    @FindBy(how = How.XPATH,using = "//input[@name='password']")
    WebElement pass;
    @FindBy(how = How.XPATH,using = "//input[@name='sub']")
    WebElement submit;
    @FindBy(how = How.XPATH,using = "//input[@name='res']")
    WebElement reset;

    public void custmrname(String name){
        customername.sendKeys(name);

    }

    public void male(){
        male.click();
    }
    public void female(){

        female.click();
    }

    public void dob(String d , String b, String c)
    {
        dob.sendKeys(d);
        dob.sendKeys(b);
        dob.sendKeys(c);
    }

    public  void addres(String address){

        addr.sendKeys(address);
    }

    public void city(String cityname){
        city.sendKeys(cityname);
    }
    public void state (String statename){
        state.sendKeys(statename);

    }
    public void pin(String pinno){
        pin.sendKeys(pinno);
    }
    public void phone(String phonno){
        tele.sendKeys(phonno);
    }
    public void email(String emailn){
        email.sendKeys(emailn);
    }
    public  void pass(String passw){

        pass.sendKeys(passw);
    }
public void sub_btn(){

        submit.click();
}
}
