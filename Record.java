public class Record {
    private String name;
    private String address;
    private String email;
    private String contactNumber;
    double attendancePercentage;
    double GPA;
    private int idNumber;

    public Record() {}

    public Record(String name, int idNumber, String contactNumber, String address, String email, double GPA, double attendancePercentage) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.attendancePercentage = attendancePercentage;
        this.GPA = GPA;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() { // returning contact number
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) { // set contact # -> records
        this.contactNumber = contactNumber;
    }

    public int getIdNumber() {
        return idNumber; // getting id number
    }

    public void setIdNumber(int idNumber) { // set ID -> records
        this.idNumber = idNumber;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) { // set GPA -> records
        this.GPA = GPA;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(double attendancePercentage){ // set attendance percentage -> records
        this.attendancePercentage = attendancePercentage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) { // set email -> records
        this.email = email;
    }

    public String getName() { // return name
        return name;
    }

    public void setName (String name) { // setting name -> records
        this.name = name;
    }

    public String getAddress() { // return address
        return address;
    }

    public void setAddress(String address) { // set address -> records
        this.address = address;
    }

    @Override
    public String toString() { //  return all records
        return "\nRecords for " + name + " (ID: " + idNumber + ")" + "\n EMAIL: " + email + "\n ADDRESS: " + address
                + "\n ATTENDANCE %: " + attendancePercentage + "\n GPA: " + GPA + "\n CONTACT #: " + contactNumber;

    }
}
