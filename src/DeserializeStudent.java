import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeStudent {
    public static void main(String[] args) {
        Student student = null;

        try (FileInputStream fileIn = new FileInputStream("student.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            student = (Student) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (student != null) {
            System.out.println("Deserialized Student:");
            System.out.println(student);
        }
    }
}
