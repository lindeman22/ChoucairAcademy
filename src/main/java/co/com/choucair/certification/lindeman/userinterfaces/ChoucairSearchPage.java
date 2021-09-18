package co.com.choucair.certification.lindeman.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairSearchPage extends PageObject {

    public static final Target COURSE_OPTION = Target.the("search for course option").locatedBy("//*[@id='course-info-container-1279-8']/div/div[1]/a/span[3]");

    public static  final  Target SELECT_UNIT = Target.the("select unit one").located(By.xpath("//*[@id='module-3894']/div/div/div[2]/div[1]/a/span"));

    public static  final  Target COURSE_NAME = Target.the("select Name course").located(By.xpath("//*[@id='page-header']/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));



}
