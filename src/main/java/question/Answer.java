package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.LoginManagement.HOME_PAGE;

public class Answer implements Question<Boolean> {
    private final String question;

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    public Answer(String question) {
        this.question = question;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String welcome = Text.of(HOME_PAGE).viewedBy(actor).asString();
        return question.equals(welcome);
    }
}