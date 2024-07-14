import com.aluracursos.conversormonedas.Conversor;
import com.aluracursos.conversormonedas.Menu;

public class Main {
    public static void main(String[] args) {

        Conversor converter = new Conversor();
        converter.setApiKey("882d374838f4b0a4a8faaebd");

        Menu menu = new Menu(converter);
        menu.displayMenu();
    }
}