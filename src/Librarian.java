public class Librarian extends User{
    private String employeeNumber;

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("The Librarian  dashboard user id is "+getEmployeeNumber());
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book book){
        //implement in next module
    }

    public void removeBook(Book book){
        //implement in next module
    }
}
