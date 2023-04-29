// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
package exercises;
import java.util.HashMap;
import java.util.Map;

public class Ex1 
{
    public Map<String, PhoneData> phoneDataBase = new HashMap<>();
    public void AddRecord(PhoneData pd) // Метод для добавления записи в телефонную книгу, @param pd Данные со всеми записями по данному человеку
    {
        phoneDataBase.putIfAbsent(pd.firstName.toLowerCase() + pd.lastName.toLowerCase(), pd);  // Приводим ключ к нижнему регистру,т.к. все данные хранятся в классе PhoneData
    }

    public PhoneData GetRecord(String fName, String lName) // Метод возвращает данные человека по Фамилии и Имени
    {
        if (phoneDataBase.containsKey(fName.toLowerCase() + lName.toLowerCase())) // fName Имя, lName Фамилия
            return phoneDataBase.get(fName.toLowerCase() + lName.toLowerCase());
        else
            throw new RuntimeException("Запись не найдени!");
    }
}
