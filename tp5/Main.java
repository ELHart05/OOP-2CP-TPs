import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void add_student(String Name, double NoteTP, ArrayList<Student> arr) {
        Student newStudent = new Student(Name, NoteTP);
        arr.add(newStudent);
    }

    public static void show_all_student(ArrayList<Student> arr) {
        for (Student student : arr) {
            student.showInfo();
        }
    }

    public static void search_one(String Name, ArrayList<Student> arr) {
        for (Student student : arr) {
            if (student.Name.contains(Name)) {
                student.showInfo();
                return;
            }
        }
        System.out.println("no student found");
    }

    public static void search_many(String Name, ArrayList<Student> arr) {
        for (Student student : arr) {
            if (student.Name.contains(Name)) {
                student.showInfo();
            }
        }
    }

    public static void compute_avergae_notes(ArrayList<Student> arr) {
        double avrg = 0;
        for (Student student : arr) {
            avrg += student.NoteTP;
        }
        System.out.println(avrg / arr.size());
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        // ArrayList<String> arr = new ArrayList<String>();
        // boolean stop = false;

        // while (!stop) {
        // System.out.println("enter the item you want add?");
        // String toEnter = scan.nextLine();
        // arr.add(toEnter);
        // System.out.println("added successfuly");
        // System.out.println("do you want to continue y/n?");
        // toEnter = scan.nextLine();
        // stop = (toEnter.equals("n"));
        // }
        // System.out.println(arr);

        // System.out.println("do you want to search for a value?");
        // String searched = scan.nextLine();

        // if (arr.contains(searched)) {
        // System.out.println("found " + searched + " on index number " +
        // arr.indexOf(searched));
        // } else {
        // System.out.println("not found unfortunatly!");
        // }

        // boolean stop = false;
        // ArrayList<Student> students = new ArrayList<Student>();
        // String newSName;
        // double noteTP;
        // String operation;
        // while (!stop) {
        // System.out.println("welcome to the system:");
        // System.out.println("enter (add) to show all student");
        // System.out.println("enter (show) to search student by its name");
        // System.out.println("enter (search) to search student by its name");
        // System.out.println("enter (searchAll) to search students");
        // System.out.println("enter (avg) to compute and display the class average");
        // System.out.println("enter (exit) to exit the program");
        // System.out.println("enter the operation you want?");
        // operation = scan.nextLine();
        // switch (operation) {
        // case "add":
        // System.out.println("enter students name to add");
        // newSName = scan.nextLine();
        // System.out.println("enter students note tp to add");
        // noteTP = scan.nextDouble();
        // scan.nextLine();
        // add_student(newSName, noteTP, students);
        // break;

        // case "show":
        // show_all_student(students);
        // break;

        // case "search":
        // System.out.println("enter the one student you want to search");
        // newSName = scan.nextLine();
        // search_one(newSName, students);
        // break;

        // case "searchAll":
        // System.out.println("enter the students you want to search");
        // newSName = scan.nextLine();
        // search_many(newSName, students);
        // break;

        // case "avg":
        // compute_avergae_notes(students);
        // break;

        // case "dir":
        // System.out.println("enter the index");
        // newSName = scan.nextLine();
        // System.out.println(students.remove(operation));
        // break;

        // case "exit":
        // stop = true;
        // break;
        // }
        // System.out.println("---------------------------");
        // }

        Salle A1 = new Salle(0, "A1", "Rallange, Tableau", "prepa");
        TP_Salle STP01 = new TP_Salle(1, "Salle TP 01", "Datashow, Rallonges", "prepa", true);

        PC macbook = new PC(0, "1564", "18-10-2022", "used", "I7", "16");
        Datashow Epsi = new Datashow(0, "9865", "21-09-2022", "not used", "EpsiData", "10");

        STP01.add_materials_to_TPSalle(Epsi);
        STP01.add_materials_to_TPSalle(macbook);

        A1.printSalleInfos();
        STP01.print_salleTP_infos();
    }
}

class Student {
    static int ID;
    public String Name;
    public double NoteTP;

    Student(String Name, double NoteTP) {
        ID++;
        this.Name = Name;
        this.NoteTP = NoteTP;
    }

    void showInfo() {
        System.out.println("Name: " + this.Name);
        System.out.println("NoteTP: " + this.NoteTP);
        System.out.println("############################");
    }
}