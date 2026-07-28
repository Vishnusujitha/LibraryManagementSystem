public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUser = 0;

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public static int getTotalUser() {
        return totalUser;
    }

    protected final String generateUniqueId(){
        totalUser++;
        return "USER " + totalUser;
    }
    public User(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(){
        this.userId = generateUniqueId();
    }

    public User(User other){
        this.userId = other.generateUniqueId();
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }

}
