package ru.mirea.task12;

class Main{
    static void swap(int[] sp, int i, int j) {
        int temp = sp[i]; // меняем два значения местами
        sp[i] = sp[j];
        sp[j] = temp;
    }

    static int divide(int[] sp, int start, int end) {
        int pivot = sp[end]; // за опорный элемент будем считать самый правый
        // основной - то есть тот, с которым будем сравнивать остальные
        int i = start; // начальный индекс
        for(int j = start; j <= end - 1; j++) {
            if (sp[j] > pivot) {
                // все элементы, которые больше опорного элемента, ставятся слева от него
                // остальные остаются справа
                swap(sp, i, j);
                i++;
            }
        }
        swap(sp, i, end); // ставим опорный элемент между числами, меньшими его и большими его
        return i;
    }

    static void quickSort(int[] sp, int start, int end) {
        if (start < end) {
            int pivot = divide(sp, start, end);
            quickSort(sp, start, pivot - 1); // сортируем левую и правую части
            quickSort(sp, pivot + 1, end);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted list: ");
        for (int j : arr) System.out.print(j + " ");
    }
}
