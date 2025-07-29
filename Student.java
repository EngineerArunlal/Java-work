class Student {
    String name;
    String id;
    int year;
    
    Student(String name, String id, int year) {
    this.name = name;
    this.id = id;
    this.year = year;
    System.out.println("Student: " + name + ", ID: " + id + ", Year: " + year);
    }
    
    public static void main(String[] args) {
    MSStudent ms = new MSStudent("Zara", "MS123", 2023, 3.9, "Gold Medal", "AI", 2);
    ms.Award();
    ms.Publication();
    }
    }
    
    class BSStudent extends Student {
    double gpa;
    String award;
    
    BSStudent(String name, String id, int year, double gpa, String award) {
    super(name, id, year);
    this.gpa = gpa;
    this.award = award;
    }
    
    void Award() {
    System.out.println("Name: " + name + ", ID: " + id + ", Year: " + year + ", GPA: " + gpa + ", Award: " + award);
    }
    }
    
    class MSStudent extends BSStudent {
    String specialization;
    int publication;
    
    MSStudent(String name, String id, int year, double gpa, String award, String specialization, int publication) {
    super(name, id, year, gpa, award);
    this.specialization = specialization;
    this.publication = publication;
    }
    
    void Publication() {
    System.out.println("Name: " + name + ", ID: " + id + ", Year: " + year + ", Specialization: " + specialization + ", Publications: " + publication);
    }
    }
    