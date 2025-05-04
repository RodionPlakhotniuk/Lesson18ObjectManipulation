package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    public Optional<User> findUserById(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public Optional<User> findUserByEmail(String email) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public Optional<List<User>> findAllUsers() {
        if (userList.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(userList);
        }
    }
}
