import MyFirstPackage.MySecondClass;

public class MyFirstClass {
    public static void main(String[] args) {
        MySecondClass arrayObject = new MySecondClass(5);
        
        System.out.println("Исходный массив:");
        arrayObject.printArray();
        
        arrayObject.setElement(0, 100);
        System.out.println("\nМассив после замены первого элемента на 100:");
        arrayObject.printArray();
        
        double average = arrayObject.getAverage();
        System.out.println("\nСреднее арифметическое: " + average);
        
        System.out.println("\nИтоговый массив:");
        arrayObject.printArray();
    }
}