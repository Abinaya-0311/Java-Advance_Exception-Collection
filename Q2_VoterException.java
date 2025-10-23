class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18)
            throw new InvalidVoterAgeException("Invalid age for voter");
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Voter ID: " + voterId + ", Name: " + name + ", Age: " + age);
    }
}

// Test Q2
class VoterDemo {
    public static void main(String[] args) {
        try {
            Voter v1 = new Voter(2001, "Priya Sharma", 19);
            v1.display();

            // Uncomment to test exception
            // Voter v2 = new Voter(2002, "Rahul Verma", 16);
        } catch (InvalidVoterAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}