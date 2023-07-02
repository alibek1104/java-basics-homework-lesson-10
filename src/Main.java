import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 1.

        for (Color myColor : Color.values()) {
            System.out.println(myColor);
        }
        System.out.println("");

        // 2.

//        for (Weekday day : Weekday.values()) {
//            whichDay(day);
//        }
//    }
//
//    public static void whichDay(Weekday day) {
//        if (day.isHoliday()) {
//            System.out.println(day + " - holiday");
//        } else {
//            System.out.println(day + " - weekday");
//        }

        // 3.

        Car bmw = new Car();

        bmw.setLight(true);
        bmw.blinkLight();

        Car mercedes = new Car();
        mercedes.startEngine();
        mercedes.setLight(false);
        mercedes.blinkLight();
        mercedes.stopEngine();

        System.out.println("");

        // 4.
        Student myStudent = new Student(70);
        Student myStudent1 = new Student(80);
        Student myStudent2 = new Student(90);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(myStudent);
        students.add(myStudent1);
        students.add(myStudent2);

        System.out.println("Students: ");

        for (Student student : students) {
            System.out.println("Grade: " + student.getGrade());
        }

        System.out.println("");

        // 5.

        // 6.
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("RED");
        colors.add("WHITE");
        colors.add("BLACK");
        colors.add("GREEN");

        System.out.println(colors);

        System.out.println("");

        // 7.

        ArrayList<String> myCities = new ArrayList<String>();
        myCities.add("ALMATY");
        myCities.add("ASTANA");
        myCities.add("KARAGANDA");

        ArrayList<String> myCities1 = new ArrayList<String>();
        myCities1.add("ALMATY");
        myCities1.add("ASTANA");

        boolean isEqual = myCities.size() == myCities1.size();

        if (isEqual) {
            System.out.println("Списки равны");
        } else {
            System.out.println("Списки не равны");
        }

        System.out.println("");

        // 8.

        ArrayList<Integer> myIntegers = new ArrayList<>();

        myIntegers.add(1);
        myIntegers.add(24);
        myIntegers.add(-3);
        myIntegers.add(44);

        System.out.println(myIntegers);

        myIntegers.set(2, 22);
        System.out.println(myIntegers);

        System.out.println("");

        // 9.

        LinkedList<String> myFruits = new LinkedList<>();

        myFruits.add("Mango");
        myFruits.add("Papaya");
        myFruits.add("Orange");
        myFruits.add("Apple");
        myFruits.add("Banana");

        int firstIndex = myFruits.indexOf("Mango");
        int lastIndex = myFruits.lastIndexOf("Banana");

        System.out.println("Первое вхождение: " + firstIndex);
        System.out.println("Последние вхождение: " + lastIndex);

        System.out.println("");

        // 10.

        LinkedList<String> myCars = new LinkedList<>();

        myCars.add("Toyota");
        myCars.add("Lexus");
        myCars.add("Hyundai");
        myCars.add("Kia");
        myCars.add("Chevrolet");
        System.out.println("До изменения: " + myCars);

        myCars.removeFirst();
        myCars.removeLast();

        myCars.addFirst("BMW");
        myCars.addLast("Mercedes");
        System.out.println("После изменения: " + myCars);

        System.out.println("");

        // 11.

        HashSet<String> myCars1 = new HashSet<>();

        myCars1.add("Toyota");
        myCars1.add("Lexus");
        myCars1.add("Hyundai");
        myCars1.add("Kia");
        myCars1.add("Chevrolet");

        HashSet<String> myCars2 = new HashSet<>();

        myCars2.add("BMW");
        myCars2.add("Lexus");
        myCars2.add("Hyundai");
        myCars2.add("Kia");
        myCars2.add("Mercedes");

        System.out.println("Первый список машин: " + myCars1);
        System.out.println("Второй список машин: " + myCars2);

        HashSet<String> combineCars = new HashSet<>();

        for (String combine : myCars1) {
            if (myCars2.contains(combine)) {
                combineCars.add(combine);
            }
        }

        System.out.println("Общие машины: " + combineCars);

        System.out.println("");

        // 12.

        HashSet<String> myCars3 = new HashSet<>();

        myCars3.add("Volvo");
        myCars3.add("BMW");

        if (myCars3.size() == 0) {
            System.out.println("Пусто");
        } else {
            System.out.println("Не пусто");
        }

        System.out.println("");

        // 13. Напишите программу для копирования всех записей из одной HashMap в другую.

        HashMap<String, String> myCities2 = new HashMap<String, String>();

        myCities2.put("Kazakhstan ", " Almaty");
        myCities2.put("USA ", " New York");
        myCities2.put("England ", " Birmingham");

        System.out.println(myCities2);

        HashMap<String, String> myCities3 = new HashMap<String, String>(myCities2);

        System.out.println(myCities3);

        System.out.println("");

        // 14.

        HashMap<String, String> myCities4 = new HashMap<>();

        myCities4.put("Kazakhstan", "Almaty");
        myCities4.put("USA", "New York");
        myCities4.put("England", "Birmingham");

        String valueToCheck = "Almaty";

        boolean containsValue = myCities4.containsValue(valueToCheck);

        if (containsValue) {
            System.out.println("Имеется значение: " + valueToCheck);
        } else {
            System.out.println("Отсутствует значение : " + valueToCheck);
        }
    }


}
