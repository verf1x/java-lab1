package MyFirstPackage;

import java.util.Random;

public class MySecondClass {
    private int[] numbers;
    
    public MySecondClass(int size) {
        numbers = new int[size];
        Random random = new Random();
        
        for (int i = 0; i < size; i++)
            numbers[i] = random.nextInt(100) + 1;
    }
    
    public int getElement(int index) {
        if (index >= 0 && index < numbers.length)
            return numbers[index];
        else
            throw new IndexOutOfBoundsException("Неверный индекс");
    
    }
    
    public void setElement(int index, int value) {
        if (index >= 0 && index < numbers.length)
            numbers[index] = value;
        else
            throw new IndexOutOfBoundsException("Неверный индекс");
    }

    public double getAverage() {
        if (numbers.length == 0) {
            return 0.0;
        }
        
        long sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        return (double) sum / numbers.length;
    }
    
    public void printArray() {
        System.out.print("Массив: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1)
                System.out.print(", ");
        }
    }
}