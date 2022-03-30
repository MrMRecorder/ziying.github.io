package enums;

/**
 * @author 紫英
 * @version 1.0
 * @discription enum实现接口
 */
@SuppressWarnings("unused")
public class EnumInterface {

    public static void main(String[] args) {
        Music.POPMUSIC.play();
    }
}

interface Iplay {

    public void play();
}

enum Music implements Iplay {
    POPMUSIC;
    @Override
    public void play() {
        System.out.println("lalalalala");
    }
}
