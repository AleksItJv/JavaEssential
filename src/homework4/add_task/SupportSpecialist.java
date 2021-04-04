package homework4.add_task;
import java.util.*;

public class SupportSpecialist extends Profile {

    int id;
    String username;
    String password;
    List<Integer> Tiketid;
    int profileID;
    Integer count;

    public void addSupportSpecialist(int id, String username, String password, String firstName, String lastName, String email, String phoneNumber){
        this.id = id;
        this.username = username;
        this.password = password;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.profileID = Profile.newIndex();

    }


}
