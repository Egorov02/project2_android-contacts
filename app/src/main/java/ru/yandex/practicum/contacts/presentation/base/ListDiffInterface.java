package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <T>{
    boolean theSameAs(T typeObjects);
    boolean equals(Object o);
}
