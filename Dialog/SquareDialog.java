package Dialog;
import java.util.Scanner;

public class SquareDialog implements IDialog {
    Scanner in = new Scanner(System.in);
    @Override
    public double [] showDialog() {
        System.out.print("Введите сторону: ");
        double s = in.nextDouble();
        //in.close();
        return new double[]{s, s, s, s};

    } 
}
