package practice8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void human() {
        Scanner scanner = new Scanner(System.in);
        Map<User, Integer> users = new HashMap<>();
        users.put(new User("Alex"), 11212);
        users.put(new User("Alex1"), 43543);
        users.put(new User("Alex2"), 43545);
        users.put(new User("Alex3"), 345435);
        users.put(new User("Alex4"), 454355);
        String nickName = scanner.nextLine();
        for (var par : users.entrySet()) {
            if (par.getKey().getName().equals(nickName)) {
                System.out.println(par.getValue());
                return;
            }


        }

    }

    public static void main(String[] args) {
        User.human();
    }
}
