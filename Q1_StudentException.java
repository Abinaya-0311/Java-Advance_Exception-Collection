// Custom exception for age
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for name validation
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) 
            throws AgeNotWithinRangeException, NameNotValidException {
        // Validate age
        if (age < 15 || age > 21)
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");

        // Validate name (only letters and spaces)
        if (!name.matches("[A-Za-z ]+"))
            throw new NameNotValidException("Name should not contain numbers or special characters.");

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

// Test Q1
class StudentDemo {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Ramesh Kumar", 18, "B.Tech");
            s1.display();

            // Uncomment to test exceptions
            // Student s2 = new Student(102, "Ritu123", 19, "B.Sc");
            // Student s3 = new Student(103, "Anil", 22, "BBA");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}