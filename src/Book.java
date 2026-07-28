public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable = true;

    public abstract void displayBookDetails();
    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()){
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }
}
