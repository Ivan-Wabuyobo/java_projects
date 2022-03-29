import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        String[] students = new String[5];
        students[0] = "Ivan";
        students[1] = "Wabuyobo";
        students[2] = "Ellie";
        students[3] = "Edekebone";
        students[4] = "Moses";

        String[] employees = { "Ivan", "Edekebone", "Moses", "Wamukota" };
        String[] contacts = { "077347573", "07892739", "076293018", "0782902903", "0782999990" };

        for (int i = 0; i < employees.length; i++) {
             System.out.println(employees[i]);
         }


        System.out.println("Please enter a name:");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        for(int i=0; i<employees.length; i++){
            if(name.equals(employees[i])){
                System.out.println("The employees contact is: " + contacts[i]);
            }
        }
        Student ivan = new Student("Ivan", "19/u/0082/GCS", 23);
        ivan.getName();
        ivan.getRegNo();
        ivan.getAge();
    }
}
