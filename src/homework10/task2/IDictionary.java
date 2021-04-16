package homework10.task2;

public interface IDictionary<TKey, TValue> {

    void addElements(TKey key, TValue value);

    TValue valueOf(int i);

    int countPair();
}
/*Создайте интерфейс IDictionary<TKey, TValue>.
Минимально требуемый интерфейс взаимодействия с экземпляром,
должен включать метод добавления пар элементов,
индексатор для получения значения элемента по указанному индексу
и свойство только для чтения для получения общего количества пар элементов.
Создайте класс MyDictionary который реализует интерфейс IDictionary.
Каждое слово(TKey) в словаре должно быть уникальным.*/
