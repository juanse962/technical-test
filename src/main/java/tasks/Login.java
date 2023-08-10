package tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.Map;

import static userinterface.LoginManagement.*;

public class Login implements Task {

    private final Map<String,String> dataCredentials;

    public Login(Map<String,String> dataCredentials) {
        this.dataCredentials = dataCredentials;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(MAKE_APPOINTMENT).afterWaitingUntilPresent(),
                Enter.theValue(dataCredentials.get("username")).into(INPUT_USER),
                Enter.theValue(dataCredentials.get("pwd")).into(INPUT_PASS),
                Click.on(LOGIN_BUTTON).afterWaitingUntilPresent(),
                Click.on(FACILITY).afterWaitingUntilPresent(),
                Click.on(FACILITY_LIST).afterWaitingUntilPresent(),
                Click.on(HOSPITAL_CHECK).afterWaitingUntilPresent(),
                Click.on(HEALTH_CARE).afterWaitingUntilPresent(),
                Enter.theValue(dataCredentials.get("date")).into(VISIT_DATE),
                Enter.theValue(dataCredentials.get("input")).into(INPUT_COMMENT),
                Click.on(BOOK_APPOINTMENT).afterWaitingUntilPresent()
        );
    }

    public static Login inPage(Map<String, String> dataCredentials) {
        return Tasks.instrumented(Login.class, dataCredentials);
    }
}