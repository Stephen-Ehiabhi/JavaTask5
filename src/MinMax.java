import java.util.Random;

public class MinMax {
    public static void main(String[] args) {
        int MAX = 100, MIN = 0;
        int numbers []= new int[10];

        Random r  = new Random();

       for (int i = 0;i < numbers.length; i++) numbers[i] = r.nextInt(100);

       for(int i = 0;  i < numbers.length; i++) {
           System.out.println(numbers[i]);
           if(numbers[i] <= MAX) MAX = numbers[i];
           if(numbers[i] >= MIN) MIN = numbers[i];
       }

       System.out.println("Max number is: " + MAX + " and Min number is: " + MIN);
    }
}
