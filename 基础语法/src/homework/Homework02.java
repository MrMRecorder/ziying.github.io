package homework;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Homework02 {
    public static void main(String[] args) {
        Car car = new Car(0);
        car.getAir().flow();


    }
}
class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }
    public Air getAir(){
        return new Air();
    }
    class Air{
        public void flow(){
            if (temperature>40.0){
                System.out.println("冷风呼呼呼...");
            }else if (temperature<0.0){
                System.out.println("暖风呼呼呼...");
            }else{
                System.out.println("空调已关闭");
            }

        }
    }
}
