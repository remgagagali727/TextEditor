import java.awt.*;

public class Screen {

    private Dimension sSize;
    private double width, height;
    public Screen(){
        sSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = sSize.getWidth();
        height = sSize.getHeight();
    }

    public int getWidth(){
        return (int)width/3*2;
    }

    public int getHeight(){
        return (int)height/3*2;
    }

}
