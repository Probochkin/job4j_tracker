package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс реализует работу банка
 * @author Semion
 * @version 1.0
 */
public class BankService {
    /**
     * Хранит список пользователей бакнов с их аккаунтами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет нового пользователя
     * @param user пользователь
     */
    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    /**
     * Добавляет акканут пользователю
     * @param passport паспорт пользователя для поиска пользователи
     * @param account аккаунт
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
                List<Account> accounts = users.get(user);
                if (!accounts.contains(account)) {
                    accounts.add(account);
                }
        }

    }

    /**
     * Метод ищет пользователя по паспорту
     * @param passport паспорт
     * @return возвращает найденого пользователя или null если пользователь не найден
     */
    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst().orElse(null);
    }

    /**
     * Ищет аккаунт пользователя по реквизитам
     * @param passport паспорт пользователя
     * @param requisite реквизиты аккаунта
     * @return возвращает аккаунт или null если аккаунт не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            result = accounts.stream().filter(account -> account.getRequisite().equals(requisite)).findFirst().orElse(null);
        }
        return result;
    }

    /**
     * Метод переводит деньги с одного аккаунта на другой
     * @param srcPassport паспорт отправителя
     * @param srcRequisite реквизиты отправителя
     * @param destPassport паспорт получателя
     * @param destRequisite ревизиты получателя
     * @param amount сумма перевода
     * @return возвращает результат выполнения перевода true или false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
      Account srcAccount = findByRequisite(srcPassport, srcRequisite);
      Account destAccount = findByRequisite(destPassport, destRequisite);
       double srcAccountBalance = srcAccount.getBalance();
        if (srcAccount != null && srcAccountBalance >= amount) {
            srcAccount.setBalance(srcAccountBalance - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
