import java.util.Scanner;
import java.util.LinkedList;
public class StudentRecordMGMT {
    LinkedList<Record> list;

    public StudentRecordMGMT() {
        list = new LinkedList<>();
    }

    /**
     * Method I
     * Add records
     *
     * @param record
     */
    public void add(Record record) {
        if (!find(record.getIdNumber())) {
            list.add(record);
        } else {
            System.out.println("Record is already present in Records list.");
            System.out.println("Please try again.");
        }
    }

    /**
     * Method II
     * Delete Record method
     *
     * @param recIdNumber
     */
    public void delete(int recIdNumber) {
        Record recordDelete = null;

        for (Record ll : list) { // iterate through records
            if (ll.getIdNumber() == recIdNumber) { // find records to be deleted by ID number
                recordDelete = ll;
            }
        }

        if (recordDelete == null) {
            System.out.println("Invalid Record ID, please try again.");
        } else {
            list.remove(recordDelete);
            // display success message for deletion of record
            System.out.println("Successfully removed record from the list");
        }
    }

    int option = 0;

    /**
     * Method III
     * Update Options Method
     * @param id
     * @param scnr
     */

    public void updateOptions(int id, Scanner scnr) {

        if (find(id)) {
            Record record = findRecord(id);
            do {
                updateOptionsMenu();
                option = scnr.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("What is the new student name? : ");
                        scnr.nextLine();
                        String name = scnr.nextLine();
                        record.setName(name);

                        break;

                    case 2:
                        System.out.print("What is the new student/guardians e-mail? : ");
                        scnr.nextLine();
                        String email = scnr.nextLine();
                        record.setEmail(email);

                        break;

                    case 3:
                        System.out.print("What is the new student address? : ");
                        scnr.nextLine();
                        String address = scnr.nextLine();
                        record.setAddress(address);

                        break;

                    case 4:
                        System.out.print("What is the new student/guardians contact number? : ");
                        scnr.nextLine();
                        String contactNumber = scnr.nextLine();
                        record.setContactNumber(contactNumber);

                        break;

                    case 5:
                        System.out.print("What is the new student attendance percentage? : ");
                        double attendancePercentage = scnr.nextDouble();
                        record.setAttendancePercentage(attendancePercentage);

                        break;

                    case 6:
                        System.out.println("What is the new student GPA? : ");
                        double GPA = scnr.nextDouble();
                        record.setGPA(GPA);

                        break;

                    case 7:
                        System.out.print("What is the new Student ID number? : ");
                        int idNumber = scnr.nextInt();
                        record.setIdNumber(idNumber);

                        break;

                    case 8:
                        System.out.println("Saved student records, successfully returned.");
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
            while (option != 8);
        } else {
            System.out.println("Record not found in the Student Records. Please try again.");
        }
    }

    /**
     * Method IV
     * Search records for existing records, safeguard duplicating records
     *
     * @param idNumber
     * @return
     */
    public boolean find(int idNumber) {
        for (Record l : list) {

            if (l.getIdNumber() == idNumber) {
                System.out.print(l);
                return true;
            }
        }
        return false;
    }


    /**
     * Method V
     * Find record method using ID number
     *
     * @param idNumber
     * @return
     */
    public Record findRecord(int idNumber) {
        for (Record l : list) {
            if (l.getIdNumber() == idNumber) {
                return l;
            }
        }
        return null;
    }

    /**
     * Method VI
     * Display Records
     */
    public void display() {
        if (list.isEmpty()) {
            System.out.println("The list currently has no records\n");
        }

        for (Record record : list) {
            System.out.println(record.toString());
        }
    }


    /**
     * Method VII
     * Menu for updateOptions method
     */
    public void updateOptionsMenu() {
        System.out.println();
        System.out.println("\nUPDATE OPTIONS");
        System.out.println("1: NAME");
        System.out.println("2: EMAIL");
        System.out.println("3: ADDRESS");
        System.out.println("4: CONTACT NUMBER");
        System.out.println("5: ATTENDANCE PERCENTAGE");
        System.out.println("6: GPA");
        System.out.println("7: ID NUMBER");
        System.out.println("8: SAVE/GO BACK");
        System.out.print("Select an option: ");


        }
    }
