package it.figuccia;

public class TestGenericsClass {
    public static void main(String[] args) {
        GenericsClass<Integer> firstElement = new GenericsClass<>();
        GenericsClass<Integer> secondElement = new GenericsClass<>();
        GenericsClass<String> thirdElement = new GenericsClass<>();
        GenericsClass<String> fourthElement = new GenericsClass<>();

        firstElement.setT(12);
        secondElement.setT(13);
        thirdElement.setT("This is a string");
        fourthElement.setT("This is a string");

        boolean isEqual1 = GenericsClass.isEqual(firstElement, secondElement);
        System.out.println("First element is equal to second element? " + isEqual1);

        boolean isEqual2 = GenericsClass.isEqual(thirdElement, fourthElement);
        System.out.println("Third element is equal to fourth element? " + isEqual2);
    }
}
