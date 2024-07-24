package BuilderPattern;

public class MainApp {
    public static void main(String[] args) {
        // Example usage:
        UserInfo user = new UserInfo.UserBuilder()
                .lastName("Manalili")
                .firstName("James")
                .age(21)
                .email("james.manalili@neu.edu.ph")
                .Address("Bagong Silang, Caloocan City")
                .PhoneNum("09122458356")
                .build();

        System.out.println("Name: "+user.lastName +", " + user.firstName
        +"\nAge: " + user.age +
        "\nEmail: " + user.email+
        "\nAddress: " + user.address +
        "\nPhone number: " + user.phone);
    }
}
