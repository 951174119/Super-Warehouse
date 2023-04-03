package 泛型;

public interface data<E> {
    void add(E e);
    void delete(int id);
    void update(E e);
    E query(int id);
}
