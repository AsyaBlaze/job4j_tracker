package ru.job4j.hmap.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс реализовывает управление банковскими операциями
 * @author Выборова Анастасия
 * @version 1.0
 */
public class BankService {
    /**
     *  Хранение всех пользователей этого сервиса
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * @param user добавление пользователя в список банка
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Нахождение пользователя по паспорту для его удаления
     * @param passport паспорт пользователя для удаления
     * @return успешно ли прошла операция удаления
     */

    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Привязка нового аккаунта
     * @param passport паспорт пользователя (обязательно уже добавленного в базу банка!)
     * @param account аккаунт для добавления
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
     * Нахождение пользователя по паспорту
     * @param passport паспорт
     * @return пользователя, с данным паспортом или null-объект
     */
    public User findByPassport(String passport) {
        User user = null;
        for (User us : users.keySet()) {
            if (us.getPassport().equals(passport)) {
                user = us;
                break;
            }
        }
        return user;
    }

    /**
     * Нахождение аккаунта по реквизитам и пользователю
     * @param passport паспорт пользователя
     * @param requisite реквизит счета
     * @return аккаунт(счет) с данным реквизитом
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        List<Account> accounts = users.get(user);
        for (Account acc : accounts) {
            if (acc.getRequisite().equals(requisite)) {
                return acc;
            }
        }
        return null;
    }

    /**
     * Перевод денег с аккаунта на другой аккаунт
     * @param srcPassport паспорт человека который переводит деньги
     * @param srcRequisite реквизит счета с которого переводят деньги
     * @param destPassport паспорт человека которому переводят деньги
     * @param destRequisite реквизит счета на который переводят деньги
     * @param amount количество переводимых денег
     * @return успешно ли совершен перевод
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if ((srcAccount == null || destAccount == null) || (srcAccount.getBalance() < amount)) {
            return false;
        }
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);
        return true;
    }

    /**
     * Возвращает все счета пользователя
     * @param user пользователь счета которого необходимо возвратить
     * @return все счета пользователя(Лист)
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
