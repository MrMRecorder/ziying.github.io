package homework;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Homework03 {
    public static void main(String[] args) {
        Colour colour = Colour.GREEN;
        colour.show();
        switch (colour) {
            //枚举类传入switch方法
            case RED:
                System.out.println("red");
                break;
            case BLUE:
                System.out.println("BLUE");
                break;
            case BLACK:
                System.out.println("BLACK");
                break;
            case GREEN:
                System.out.println("GREEN");
                break;
            case YELLOW:
                System.out.println("YELLOW");
                break;

        }

    }
}

interface Ia {
    public void show();
}

enum Colour implements Ia {
    RED(255, 0, 0), BLUE(0, 0, 255), BLACK(0, 0, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Colour(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }


    @Override
    public void show() {
        System.out.println("redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue
        );
    }
}
