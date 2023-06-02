package ru.netology.hw_exeptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Товар имеющий id = " + id + " не найден");
    }
}
