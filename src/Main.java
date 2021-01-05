import java.text.NumberFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(0.12);
        System.out.println(result);


//        int[] numbers = {1,2,4,5,6,7,7};
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
    }
}
