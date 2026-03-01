import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private String name;
    private Integer age;
    private String workplace;
    private String address;

    public User(String uname, Integer uage, String uworkplace, String uaddress){
        this.name = uname;
        this.age = uage;
        this.workplace = uworkplace;
        this.address = uaddress;
    }
    public static Map<Integer, List<User>> groupUsers(List<User> users){
        Map<Integer, List<User>> mapuser = new HashMap<Integer, List<User>>();
        for(User user: users){
            if(mapuser.containsKey(user.age)){
                List<User> sameageusers = mapuser.get(user.age);
                sameageusers.add(user);
                mapuser.put(user.age, sameageusers);
            } else {
                List<User> sameageusers = new ArrayList<>();
                sameageusers.add(user);
                mapuser.put(user.age, sameageusers);
            }
        }
        return mapuser;
    }
    public static void main(String[] args){
        User user1 = new User("Oleg", 19, "school", "NY");
        User user2 = new User("Alex", 20, "office", "LA");
        User user3 = new User("Igor", 21, "farm", "NM");
        User user4 = new User("Ivan", 19, "fabric", "NY");
        User user5 = new User("Anna", 20, "school", "LA");
        User user6 = new User("Poly", 21, "office", "NM");
        User user7 = new User("Max", 19, "farm", "CH");
        User user8 = new User("Tima", 21, "fabric", "DT");
        User user9 = new User("Yoru", 20, "station", "CH");
        User user10 = new User("Dima", 19, "station", "DT");
        List<User> userlist = new ArrayList<>();
        userlist.add(user1);
        userlist.add(user2);
        userlist.add(user3);
        userlist.add(user4);
        userlist.add(user5);
        userlist.add(user6);
        userlist.add(user7);
        userlist.add(user8);
        userlist.add(user9);
        userlist.add(user10);
        Map<Integer, List<User>> mapuser = groupUsers(userlist);
        System.out.println(mapuser);
    }
}
