package ru.mirea.task12;

public class SortingStudentsByGPA implements Comparator{
    Object[][] sp;

    public SortingStudentsByGPA(Object[][] sp) {
        this.sp = sp;
    }

    @Override
    public void swap(int i, int j) {
        Object[] temp = this.sp[i]; // меняем два значения местами
        this.sp[i] = this.sp[j];
        this.sp[j] = temp;
    }

    @Override
    public int divide(int start, int end) {
        Object[] pivot = this.sp[end]; // за опорный элемент будем считать самый правый
        // основной - то есть тот, с которым будем сравнивать остальные
        int i = start; // начальный индекс
        for(int j = start; j <= end - 1; j++) {
            if ((Integer)this.sp[j][1] > (Integer)pivot[1]) {
                // все элементы, которые больше опорного элемента, ставятся слева от него
                // остальные остаются справа
                swap(i, j);
                i++;
            }
        }
        swap(i, end); // ставим опорный элемент между числами, меньшими его и большими его
        return i;
    }

    @Override
    public void quickSort(int start, int end) {
        if (start < end) {
            int pivot = divide(start, end);
            quickSort(start, pivot - 1); // сортируем левую и правую части
            quickSort(pivot + 1, end);
        }
    }
}
