package test;

/**
 * @author 紫英
 * @version 1.0
 * @discription 随便写
 */
class Test {
    String str = new String("hello");
    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {
        //System.out.println(Math.pow('a',2));//9409
        Test test = new Test();
        test.change(test.str, test.ch);
        System.out.println(test.str + " and");
        System.out.println(test.ch);


    }

    public void change(String str, char[] ch) {

        str = "test ok";
        ch[0] = '啦';
        //char[] chars = {'a'};
        //ch = chars;
    }
}





