// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.
package exercises;
import java.util.*;

public class Ex2 
{
    private static String[] names = new String[]
    {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Иван Иванов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Иван Иванов",
            "Мария Рыкова",
            "Анна Крутова",
            "Марина Лугова",
            "Анна Владимирова",
            "Петр Лыков",
            "Иван Мечников",
            "Петр Петин",
            "Петр Лыков",
            "Иван Ежов"
    };

    public static void Run() 
    {
        Map<String, Integer> nameTop = new HashMap<>();
        for (String nameFull : names) 
        {
            String lastName = nameFull.split(" ")[0].toLowerCase(); // Выбираем имя из строки и приводим всё к нижнему регистру
            nameTop.put(lastName, nameTop.get(lastName) == null ? 1 : nameTop.get(lastName) + 1); // Считаем, сколько раз выстретилось данное имя:
        }
        
        List<Integer> ratingOfNames = new ArrayList<>(nameTop.values()); // создаём список со значениями количества повторов
        ratingOfNames.removeIf(x -> x <= 1); // отсеиваем единицы
        Collections.sort(ratingOfNames, Collections.reverseOrder()); // Сортируем по убыванию
       
        for (int rating : ratingOfNames) // Проходимся по списку
        { 
            for (var name : nameTop.entrySet()) 
            {
                if (name.getValue() == rating) // Выводим на печать имена  с заданным количеством совпадений
                    // Печатаем первый символ имени с большой буквы
                    System.out.println(name.getKey().substring(0,1).toUpperCase() + name.getKey().substring(1) + " встречается " + name.getValue() + " раз(а)");
            }
        }
    }
}
