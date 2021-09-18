package co.com.choucair.certification.lindeman.tasks;

import co.com.choucair.certification.lindeman.userinterfaces.ChoucairSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Search implements Task  {

    private String course;
    public Search(String course) {
        this.course = course;
    }



    public static Performable the(String course) {
        return Tasks.instrumented(Search.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairSearchPage.COURSE_OPTION.of(course)));
        actor.attemptsTo(Click.on(ChoucairSearchPage.SELECT_UNIT));
    }
}
