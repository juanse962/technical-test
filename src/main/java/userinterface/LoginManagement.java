package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginManagement {
    public static final Target MAKE_APPOINTMENT = Target.the("Seleccioanr el input de login")
            .locatedBy("#btn-make-appointment");
    public static final Target INPUT_USER = Target.the("Selecciona el input password")
            .locatedBy("#txt-username");
    public static final Target INPUT_PASS = Target.the("Selecciona el input password")
            .locatedBy("#txt-password");

    public static final Target LOGIN_BUTTON = Target.the("Seleccioanr el boton")
            .locatedBy("#btn-login");
    public static final Target FACILITY = Target.the("Visualiza el texto de bienvenida a mis productos")
            .locatedBy("#combo_facility");
    public static final Target FACILITY_LIST = Target.the("Visualiza el texto de bienvenida a mis productos")
            .locatedBy("#combo_facility > option:nth-child(2)");
    public static final Target HOSPITAL_CHECK = Target.the("Visualiza el texto de bienvenida a mis productos")
            .locatedBy("#chk_hospotal_readmission");

    public static final Target HEALTH_CARE = Target.the("Visualiza el texto de bienvenida a mis productos")
            .locatedBy("#radio_program_medicaid");
    public static final Target VISIT_DATE = Target.the("Visualiza el texto de bienvenida a mis productos")
            .locatedBy("#txt_visit_date");
    public static final Target INPUT_COMMENT = Target.the("Visualiza el texto de bienvenida a mis productos")
            .locatedBy("#txt_comment");
    public static final Target BOOK_APPOINTMENT = Target.the("Visualiza el texto de bienvenida a mis productos")
            .locatedBy("#btn-book-appointment");
    public static final Target HOME_PAGE = Target.the("Visualiza el texto de bienvenida a mis productos")
            .locatedBy(".text-center > h2");
}
