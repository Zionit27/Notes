package ru.geekbrains.mynotes.domain;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public class Structure {

    @StringRes
    private int number;
    private int name;

    @DrawableRes
    private int description;
    private int date;

    public Structure(int number, int name, int description, int date) {
        this.number = date;
        this.name = date;
        this.description = date;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public int getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }

    public int getDate() {
        return date;
    }
}


//          1. Создайте класс данных со структурой заметок: название заметки, описание заметки, дата создания и т. п.
//        2. Создайте фрагмент для вывода этих данных.
//        3. Встройте этот фрагмент в активити. У вас должен получиться экран с заметками, который мы будем улучшать с каждым новым уроком.
//        4. Добавьте фрагмент, в котором открывается заметка. По аналогии с примером из урока: если нажать на элемент списка в портретной
//        ориентации — открывается новое окно, если нажать в ландшафтной — окно открывается рядом.