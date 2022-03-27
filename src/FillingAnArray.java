public class FillingAnArray {
    public static void main(String[] args) {
        int numbers[] = new int[10];

        //loop to fill array
        for (int i = 0; i < numbers.length; i++) numbers[i] = numbers.length - 1 - i;

        for (int i = 0; i < numbers.length; i++) System.out.println("Array[" + i + "] = " + numbers[i]);
    }
}