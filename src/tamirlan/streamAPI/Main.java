package tamirlan.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Stream api -> jdk 8
        // stream - поток
        // stream API(application programming interface)
        // client -> (API) -> JSON -> server app
        // JDK - Java development kit - инструменты разработчика

        // declarative approach Старый подход
        String text[] = new String[]{"Hello", "goodbye", "message"};

//        int count = 0;
//        for (String s : text) {
//           if (s.length() > 5) {
//               count++;
//           }
//        }
//        String lengthGreaterThanFive[] = new String[count];
//        int index = 0;
//        for (String s : text) {
//            if (s.length() > 5) {
//                lengthGreaterThanFive[index] = s;
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(lengthGreaterThanFive));

        // imperative approach Современный подход

//        long count = Arrays.stream(text).filter(x -> x.length() > 5).count();
//        System.out.println(count);

        List<Person> people = new ArrayList<>();
        Collections.addAll(people,
                new Person("Erlan", 230000, "erlanurbergen@gmail.com", Position.MIDDLE),
                new Person("Arman", 300000, "armanurbergen@gmail.com", Position.JUNIOR),
                new Person("Usman", 180000, "usmanurbergen@gmail.com", Position.SENIOR),
                new Person("Amangeldi", 220000, "Amangeldi@gmail.com", Position.JUNIOR)
                );

        // sorted

        // terminate ruturning
//        List<Person> newArrayList = people.stream().sorted(Comparator.comparing(Person::getSalary)).collect(Collectors.toList());
//
//        System.out.println(newArrayList);

        // filter
//        List<Person> people1 = people.stream()
//                .filter(person -> person.getName().startsWith("A"))
//                .toList();
//        System.out.println(people1);

        // ArrayList 3
        // Junior -
        // Middle -
        // Senior -


        // group in by
//        Map<Position, List<Person>> collect = people.stream().collect(Collectors.groupingBy(Person::getPosition));
//
//        collect.forEach((position, personList) -> {
//            System.out.println(position);
//            personList.forEach(System.out::println);
//        });


        // anyMatch
//        boolean b = people.stream().anyMatch(person -> person.getSalary() > 1000000);
//        System.out.println(b);

        // allMatch
//        boolean b1 = people.stream().allMatch(person -> person.getSalary() > 50000);
//        System.out.println(b1);

        // noneMatch
//        people.stream().noneMatch(person -> person.getSalary() == 200000);


    }


}

enum Position {
    JUNIOR, MIDDLE, SENIOR
}


class Person {
    private String name;
    private double salary;
    private String email;
    private Position position;

    public Person(String name, double salary, String email, Position position) {
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", position=" + position +
                '}';
    }
}
