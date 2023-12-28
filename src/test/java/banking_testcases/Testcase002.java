package banking_testcases;
import banking_pom.homepage;
import banking_pom.loginpage;
import banking_pom.new_customer;
import org.testng.annotations.Test;

public class Testcase002 extends  baseClass{

    @Test
    public void new_customer_test() throws InterruptedException {

        driver.get(baseurl);
        Logger.info("Website open");
        loginpage lp = new loginpage(driver);
        lp.email(username);
        Logger.info("email entered");
        lp.pass(password);
        Logger.info("entered pasword");
        lp.btn();
        homepage hm = new homepage(driver);
        Logger.info("homepage object created");
        hm.newcustomer();
        Logger.info("clicked on new customer");
        new_customer nc = new new_customer(driver);
        Thread.sleep(5000);
        Logger.info("wait and object created");
        nc.custmrname("anuj");
        Thread.sleep(1000);
        nc.email("anjmusic");
        Thread.sleep(1000);
        Logger.info("email entered");
       nc.dob("14", "09", "1998");
        Thread.sleep(1000);
        nc.addres("j7/xc");
        Thread.sleep(1000);
        nc.city("up");
        Thread.sleep(1000);

        nc.male();
        Thread.sleep(1000);
        nc.phone("8081456987");
        Thread.sleep(1000);
        nc.pin("221001");
        Thread.sleep(1000);
        nc.pass("123456789");
        Thread.sleep(1000);
        nc.sub_btn();
    }

}
