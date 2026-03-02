import java.util.*;

public class User {
    private String name;
    private Integer age;
    private String job;
    private String address;
    private static List<String> VALIDJOBS = Arrays.asList("Google", "Uber", "Amazon");
    private static List<String> VALID_ADDRESSES = Arrays.asList("London", "New York", "Amsterdam");

    public User(String uname, Integer uage, String ujob, String uaddress){
        if (!uname.isEmpty()){
            if (uage>=18) {
                if (VALIDJOBS.contains(ujob)) {
                    if (VALID_ADDRESSES.contains(uaddress)) {
                        this.name = uname;
                        this.age = uage;
                        this.job = ujob;
                        this.address = uaddress;
                    } else {
                        throw new IllegalArgumentException("Not valid address");
                    }
                } else {
                    throw new IllegalArgumentException("Not valid job");
                }
            } else {
                throw new IllegalArgumentException("Not valid age");
            }
        } else {
            throw new IllegalArgumentException("Name is empty");
        }
    }

    public static void main(String[] args){
        User user1 = new User("Oleg", 19, "Google", "London");
        User user2 = new User("Alex", 20, "Uber", "New York");
        User user3 = new User("Igor", 18, "Amazon", "Amsterdam");
        User user4 = new User("Mira", 19, "Uber", "London");
        List<User> userlist = new ArrayList<>();
        userlist.add(user1);
        userlist.add(user2);
        userlist.add(user3);
        userlist.add(user4);
        System.out.println(userlist);
    }
}
