package exception;

/**
 * @author 紫英
 * @version 1.0
 * @discription 异常练习——两数相除，对数据格式不正确、缺少参数、除0进行异常处理
 */
public class ExceptionHomework01 {
    public static void main(String[] args) {

        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
           int n1= Integer.parseInt(args[0]);
           int n2= Integer.parseInt(args[1]);
           double res = cal(n1,n2);
            System.out.println("res="+res);

        } catch (ArrayIndexOutOfBoundsException e) {
           e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("参数格式不正确！");
        }catch (ArithmeticException e){
            System.out.println("除0异常");
        }

    }

    public static int cal(int n1, int n2) {
        return n1 / n2;
    }
}

