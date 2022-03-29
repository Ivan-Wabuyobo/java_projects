import java.util.ArrayList;

public class Collections{
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("ivan");
        students.add("wabuyobo");
        students.remove(0);

        System.out.println(students.get(0));
    }
}
