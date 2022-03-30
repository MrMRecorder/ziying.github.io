package exception;

/**
 * @author 紫英
 * @version 1.0
 * @discription 自定义异常
 */
public class Exception03 {
    public static void main(String[] args) {
        int age = 19;
        if (!(age>18 && age <120)){
            throw new AgeException("年龄需要在18-120之间！");
        }else{
            System.out.println("age="+age);
        }
        System.out.println("continue...");
f1();

    }
    public static void f1() throws ArithmeticException{
        int num = 4;
        int a=num/0;
    }
}
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
