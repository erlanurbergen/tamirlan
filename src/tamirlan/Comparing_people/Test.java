package tamirlan.Comparing_people;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream inputStream = null;

        try {
             objectInputStream = new ObjectInputStream(new FileInputStream("meta.dat"));
            inputStream = new ObjectOutputStream(new FileOutputStream("meta.dat"));
            inputStream.writeObject(new Person("person"));
             Person p = (Person) objectInputStream.readObject();
            System.out.println(p);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            objectInputStream.close();
        }

    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
