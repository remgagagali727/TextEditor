import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("Text Editor");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Screen screen = new Screen();

        window.pack();

        window.setSize(screen.getWidth(),screen.getHeight());

        window.setVisible(true);

    }

}
