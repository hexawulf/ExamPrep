package claudeAI2;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    
    //getter and setter methods for Customer
    
    public String getFirstName(){
    return firstName;
    }
    public void setFirstName(String firstName) {
    this.firstName = firstName;}
    
    public String getLastName() {
    return lastName;}
    public void setLastName(String lastName) {
    this.lastName = lastName;}
    
    public String getEmail(){
    return email;}
    public void setEmail(String email) {
    this.email = email;}
    
    
    @Override
    public String toString() {
    return "Customer{ " +firstName +" + " +lastName +" + " + email +" }";
    }
    
}
