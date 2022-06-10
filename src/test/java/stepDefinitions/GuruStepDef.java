package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDef {
    GuruPage guruPage = new GuruPage();

    @Given("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {


        List<WebElement> tabloBaslikListesi = guruPage.baslikListesi;
        int istenenBaslikIndex = -1;
        for (int i = 0; i < tabloBaslikListesi.size(); i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)) {
                istenenBaslikIndex = i+1;
                break;
            }
        }
List<WebElement>istenenSutundakiElementler= Driver.getDriver()
        .findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndex+"]"));

        for (WebElement w:istenenSutundakiElementler
             ) {
            System.out.println(w.getText());

        }



        }




}
