import java.util.HashMap;

class StudentGrades {
    private HashMap<String, Integer> grades = new HashMap<>();

    public void addStudent(String name, int grade) {
        grades.put(name, grade);
        System.out.println(name + " added with grade " + grade);
    }

    public void removeStudent(String name) {
        if (grades.containsKey(name)) {
            grades.remove(name);
            System.out.println(name + " removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayStudent(String name) {
        if (grades.containsKey(name)) {
            System.out.println(name + "'s grade: " + grades.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayAll() {
        if (grades.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("All student grades:");
        grades.forEach((name, grade) -> System.out.println(name + ": " + grade));
    }

    // Test Q4
    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();
        sg.addStudent("Amit", 85);
        sg.addStudent("Bhavna", 93);
        sg.displayStudent("Amit");
        sg.removeStudent("Amit");
        sg.displayAll();
    }
}