// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        student s2 = new student("shamsa",12,"CS",2.5);

        student S1 = new student();
        S1.name = "shamsa";
        S1.id = 151380;
        S1.college = "sohar uni";
        S1.gpa = 3.15;
        S1.printname();
        S1.printid();
        S1.printcllege();
        S1.printgpa();
//        student S1= new student(
    }
}
    class student {

    student() {

    }
        student(String n , int i , String c,double g) {
            name = n;
            college = c;
            id = i;
            gpa = g;
        }

        String name;
        int id;
        String college;
        double gpa;

        void printname() {
            System.out.println(name);
        }

        void printid() {
            System.out.println(id);
        }

        void printcllege() {
            System.out.println(college);
        }

        void printgpa() {
            System.out.println(gpa);
        }

    }
