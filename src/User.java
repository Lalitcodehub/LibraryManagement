public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }
    public User(){
        this.userId = generateUniqueId();
    }

    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }
    public User(User user){
        this.userId = generateUniqueId();
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }

    abstract void displayDashboard();
    abstract boolean canBorrowBooks();
    public abstract void returnBooks();
private final String generateUniqueId(){
    totalUsers++;
    return " " + totalUsers;
}

}
