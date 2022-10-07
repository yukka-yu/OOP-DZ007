import Exception.FigureException;
import Exception.IncorrectRadiusException;
import Exception.IncorrectSideException;
import Figures.FigureFactory;
import Repository.DialogsRepository;
import Repository.FigureRepository;
import Controller.Controller;
import View.View;
import java.util.ArrayList;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) throws FigureException, IncorrectRadiusException, IncorrectSideException {
        View view = new View(new DialogsRepository(new ArrayList()), new Controller(new FigureRepository(new ArrayList()), new FigureFactory()));
        view.start();

    }
}