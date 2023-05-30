package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if ((name.length() >= 3 && name.length() <20 && name.contains(" ") == true)&& (name.substring(0,1).isBlank() == false) && (name.substring(name.length()-1, name.length()).isBlank() == false)){
            return true;
        }
        return false;
    }
}