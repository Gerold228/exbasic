import java.util.*;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Set<String> activites;

    public User(Integer id, String name, Integer age, Set<String> activities){
        this.id = id;
        this.name = name;
        this.age = age;
        this.activites = activities;
    }

    public static Map<User, String> findHobbyLovers(List<User> users, Set<String> any_activities){
        Map<User, String> mapusers = new HashMap<>();
        for (User user: users){
            for (String active: user.activites){
                if (any_activities.contains(active)){
                    mapusers.put(user, active);
                    break;
                }
            }
        }
        return mapusers;
    }
    public static void main(String[] args){
        User user1 = new User(1, "Oleg",  20, Set.of("Snowboard", "Shooting"));
        User user2 = new User(2, "Alex",  21, Set.of("Windsurfing", "Reading"));
        User user3 = new User(3, "Igor",  23, Set.of("Surfing", "Shooting"));
        User user4 = new User(4, "Mira",  18, Set.of("Snowboard", "Windsurfing"));
        List<User> userlist = new ArrayList<>();
        userlist.add(user1);
        userlist.add(user2);
        userlist.add(user3);
        userlist.add(user4);
        Set<String> activities = Set.of("Shooting", "Windsurfing", "Surfing", "Snowboard", "Reading");
        Map<User, String> mapuser = findHobbyLovers(userlist, activities);
        System.out.println(mapuser);
    }
}
