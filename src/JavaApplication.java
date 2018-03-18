import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaApplication {
    public static void main(String[] args) {
        User user1 = new User(1, "Ava", "Bell", "Ava123");
        User user2 = new User(2, "Peter", "Brown", "Peter123");
        User user3 = new User(3, "Megan", "Campbell", "Megan123");

        List<User> users = new ArrayList<>(3);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        //Java 8 stream function: users to string
        System.out.println(users.stream().map(User::toString).collect(Collectors.joining(",")));

        System.out.println("\n\n");

        //Java 8 stream function + lambda expression: users to string
        System.out.println(users.stream().map(u -> u.toString()).collect(Collectors.joining(",")));
    }
}
