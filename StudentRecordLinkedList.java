import java.util.Scanner;

public class StudentRecordLinkedList {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        StudentRecordMGMT admin = new StudentRecordMGMT(); // create admin object

        Record record = new Record();

        // initial employee record
        // mutators to hard code data
        record.setName("John Doe");
        record.setIdNumber(1); // employee ID number set to 1
        record.setContactNumber("210-291-0000");
        record.setAddress("123 Firefly Lane");
        record.setEmail("johndoe@school.edu");
        record.setGPA(0.00); // employee, no GPA
        record.setAttendancePercentage(97); //

        admin.add(record);

        int option = 0;

        do {
            menu();
            System.out.print("Select an option: ");
            option = scnr.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Add a student ID number (> 100): "); // student IDs start at 101
                    int idNumber = scnr.nextInt();

                    while(admin.find(idNumber)) {
                        System.out.println();
                        System.out.print("CRITICAL ERROR: \nID Number: (" + idNumber + ") already in use. Enter a new ID: ");
                        idNumber = scnr.nextInt();
                    }

                    System.out.print("Add the student/guardian(s) contact number: ");
                    scnr.nextLine();
                    String contactNumber = scnr.nextLine();

                    System.out.print("Add the students current address: ");
                    String address = scnr.nextLine();

                    System.out.print("Add the students/guardian(s) current e-mail: ");
                    String email = scnr.nextLine();

                    System.out.print("Add the students current GPA (4pt scale): ");
                    double GPA = scnr.nextDouble();

                    System.out.print("Add the students current attendance percentage: ");
                    double attendancePercentage = scnr.nextDouble();

                    System.out.print("Add the students name: ");
                    scnr.nextLine();
                    String name = scnr.nextLine();

                    System.out.println();

                    record = new Record(name, idNumber, contactNumber, address, email, GPA, attendancePercentage);

                    admin.add(record);
                    System.out.println(record.toString());

                    break;

                case 2:
                    System.out.print("What is the student ID number? ");
                    int rID = scnr.nextInt();

                    admin.delete(rID);

                    break;

                case 3:
                    System.out.print("What is the student ID number? ");
                    int rIDNo = scnr.nextInt();

                    admin.updateOptions(rIDNo, scnr);

                    break;

                case 4:
                    System.out.println("What is the student ID number? ");
                    int recordID = scnr.nextInt();

                    if(!admin.find(recordID)) {
                        System.out.println("Student ID does not exist. \n");
                    }

                    break;

                case 5:
                    admin.display();
                    break;

                case 9:
                    System.out.println("\nProgram exited successfully, goodbye!");
                    System.exit(0);

                    break;

                default:
                    System.out.println("\nInvalid input, try again. \n");
                    break;
            }
        }

        while(option != 9);
    }

    public static void menu() {
        System.out.println("\nSCHOOL RECORD MENU OPTIONS:");
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Update Student");
        System.out.println("4: Search Students");
        System.out.println("5: Display Students");
        System.out.println("9: Exit Application");
    }
}
