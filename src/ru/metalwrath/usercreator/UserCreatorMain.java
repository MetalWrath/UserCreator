package ru.metalwrath.usercreator;

import java.util.Date;
// Вариант Андрея через стринг.
public class UserCreatorMain {
    public static void main(String[] args) {
        Date date1 = new Date();
        int needLength = 30000;   // Размер для полей юзер и пассворд.
        String user = "";  //Создали объекты Стринг бюлдера, они не плодят объекты.
        String pswrd = ""; //Они изменяют созданный объект.

        //Создаем алфавит содержащий все нужные нам символы. При необходимости добавь еще какие-нибудь.
        String[] alphabet = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H",
        "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a",
        "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m", "1", "2", "3", "4", "5", "6", "7",
        "8", "9", "0"};
        //Цикл заполнения для юзера
        for (int i = 0; i < needLength; i++){
            int random = (int)(Math.random() * (alphabet.length - 1) + 1);
            user = user + (alphabet[random]);
        }
        //Цикл заполнения для пассворда
        for (int i = 0; i < needLength; i++){
            int random = (int)(Math.random() * (alphabet.length - 1) + 1);
            pswrd = pswrd + (alphabet[random]);
        }


        //Саутим результат.
        System.out.println(user);
        System.out.println(pswrd);
        Date date2 = new Date();
        System.out.println(date2.getTime() - date1.getTime());






    }

}
