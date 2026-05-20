package bookstoread;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class BookShelf {
    private final List<String> books = new ArrayList<>();

    public List<String> books() {
        return Collections.unmodifiableList(books);
    }
    public void add(String... booksToAdd) {
        books.addAll(Arrays.asList(booksToAdd));
    }

    public List<String> arrange() {
        books.sort(Comparator.naturalOrder());
        return books;
    }
}