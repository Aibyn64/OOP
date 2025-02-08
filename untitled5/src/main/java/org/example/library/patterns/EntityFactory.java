package org.libr.patterns;
import org.libr.models.BaseEntity;
import org.libr.models.Book;
import org.libr.models.User;

public class EntityFactory {
    public static BaseEntity createEntity(String type, int id, String name, String emailOrAuthor, boolean isBorrowed) {
        if ("User".equalsIgnoreCase(type)) {
            return new User(id, name, emailOrAuthor);
        } else if ("Book".equalsIgnoreCase(type)) {
            return new Book(id, name, emailOrAuthor, isBorrowed);
        }
        return null;
    }
}
