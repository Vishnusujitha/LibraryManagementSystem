public class Member extends User{

    private int borrowedBooksCount;
    public final int MAX_BORROW_LIMIT = 5;

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public Member(String name, String contactInfo, int borrowedBooksCount) {
        super(name, contactInfo);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public Member(Member other) {
        super(other);
        this.borrowedBooksCount = other.borrowedBooksCount;
    }

    @Override
    public void displayDashboard(){
        System.out.println("The member dashboard user id is "+getUserId()
                + " & Book borrowed are "+ borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks(){
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
