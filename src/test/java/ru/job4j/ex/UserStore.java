package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User a: users) {
            if (a.getUsername().equals(login)) {
                result =  a;
                break;
            }
        }
        if (result == null) {
            throw new UserNotFoundException("Пользователь не найден");
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() > 3) {
            return true;
        } else {
            throw new UserInvalidException(" Пользователь не вадилен ");
        }
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", false)
        };
        try {
           User user  = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            System.out.println(ui.fillInStackTrace());
        } catch (UserNotFoundException unf) {
            System.out.println(unf.fillInStackTrace());
        }
        }

    }

