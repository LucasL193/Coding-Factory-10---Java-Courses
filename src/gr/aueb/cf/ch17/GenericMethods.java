package gr.aueb.cf.ch17;

public class GenericMethods {

    public static void main(String[] args) {
    String[] strArr = {"Hello", "World"};
    printArray(strArr);
    Integer[] intArr = {1, 2, 3};
    printArray(intArr);
    }

    public static <T> void printArray(T [] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }

    public static void print(GenericNode<?> node) {
        System.out.println(node.getValue());
    }

    public static void printNumbers(GenericNode<? extends Number> node) {
        System.out.println(node.getValue());
    }

    public static void printNumber2(GenericNode<? super Number> node) {
        System.out.println(node.getValue());
    }
}
