package ab;

public class A extends Template{
    @Override
    void job() {
        int sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum+=i;
        }
    }
}
