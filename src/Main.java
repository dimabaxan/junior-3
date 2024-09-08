import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(" Adina ", 21, 3.75);

        try (FileOutputStream fileOut = new FileOutputStream("student.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(student);
            System.out.println("Student object serialized to student.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}




