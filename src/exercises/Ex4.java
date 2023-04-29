// Реализовать алгоритм пирамидальной сортировки HeapSort
package exercises;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Ex4 
{
    public static void Run() 
    {
        int size = 20;
        int[] srcArray = GetRandomArray(size);
        System.out.println(Arrays.toString(srcArray));
        for (int i = size - 1; i > 0 ; i--) // проходимся по массиву с конца до начала
        {
            BuildTree(srcArray, i); // перестраиваем дерево
            int tmp = srcArray[i]; // свапаем значение с корня дерева (максимальное значение массива) в конец диапазона
            srcArray[i] = srcArray[0];
            srcArray[0] = tmp;
        }
        System.out.println(Arrays.toString(srcArray)); // выводим на печать готовый массив
    }

    private static void HeapSort(int[] arr, int i, int len) // Сортировка кучи: извлечение максимального значения в корень дерева
    {
        int max = i; // принимаем, что максимальное значение находится в корне дерева
        int left = 2 * i + 1; // вычисляем индекс левой ветви
        int right = 2 * i + 2; // вычисляем индекс правой ветви
        if (left < len && arr[max] < arr[left]) // если левая ветка существует и её значение больше, чем в корне, меняем индекс максимального значения
            max = left;
        if (right < len && arr[max] < arr[right]) // если правая ветка существует и её значение больше, чем в корне, меняем индекс максимального значения
            max = right;
        if (arr[max] != arr[i]) // если после всех проверок у нас максимальное значение не в корне, свапаем значения и рекурсивно ещё раз проходимся по дереву
        {
            int tmp = arr[i];
            arr[i] = arr[max];
            arr[max] = tmp;
            HeapSort(arr, i, len);
        }
    }

    public static void BuildTree(int[] arr, int lMax) // Построение бинарного дерева
    {
        for (int i = lMax; i >= 0; i--) 
        {
            HeapSort(arr, i, lMax);
        }
    }

    public static int[] GetRandomArray(int size) // Генератор случайного массива
    {
        int[] result = new int[size]; // size Размер массива
        for (int i = 0; i < size; i++) 
        {
            result[i] = (int) (Math.random() * 100);
        }
        return result;
    }
}
