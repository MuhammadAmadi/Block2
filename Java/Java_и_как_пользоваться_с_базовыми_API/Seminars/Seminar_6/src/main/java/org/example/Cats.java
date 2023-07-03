package org.example;
//Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//а) Информационной системой ветеринарной клиники
//б) Архивом выставки котов
//в) Информационной системой Театра кошек Ю.Д.Куклачёва
//можно записать в текстовом виде необязательно в java

import java.util.Objects;

public class Cats {
    private String nick;
    private String color;
    private String breed;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats cats = (Cats) o;
        return Objects.equals(nick, cats.nick) && Objects.equals(color, cats.color) && Objects.equals(breed, cats.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, color, breed);
    }

    @Override
    public String toString() {
        return "nick='" + nick + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed ;
    }
}
