package StudentGeneric;

public class StudentMain {
    public static void main(String[] args) {
                Student<String> student1 = new Student<>("Avi", "Salomon", 27, "Fullstack");
                student1.printStudent();

                System.out.println();

                Student<Integer> student2 = new Student<>("Shalom", "Simon", 31, 12345);
                student2.printStudent();
            }
        }
