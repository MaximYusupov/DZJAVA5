import exercises.*;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер case: ");
        int ex = scan.nextInt();
        switch (ex) 
        {
            case 1: // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
                Ex1 phoneDB = new Ex1(); //Ex1.RunRev(20);
                phoneDB.AddRecord(new PhoneData("Михаил","Петров", "8-914-345-2144"));  // Добавляем запись
                System.out.println(phoneDB.phoneDataBase);        // Смотрим, как она хранится в БД
                System.out.println(phoneDB.GetRecord("Михаил", "Петров").mobilePhone); // Ищем запись и печатаем телефон:
                break;
            case 2: // программа находит и выводит повторяющиеся имена с количеством повторений, сортирует по убыванию популярности
                Ex2.Run();
                break;
            case 3: // метод переводит число из римского формата записи в арабский
                Ex3.Run();
                break;
            case 4: // алгоритм пирамидальной сортировки HeapSort
                Ex4.Run();
                break;
        }
    }
}