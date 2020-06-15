package homework3;

//Сортировка массивов:
//1. Сортировка выбором
//2. Сортировка с помощью обменов:
//    2.1. Пузырьковая сортировка
//    2.2. Шейкерная сортировка
//3. Сортировка с помощью включения
//4. Сортировка слиянием
//5. Сортировка с помощью разделения

import java.util.Scanner;

public class Task1<printArray> {
    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        a = scanner.nextInt();
        int[] array = new int[a]; // создала массив длинны а
        System.out.println("Enter array elements: ");
        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt(); //
        }

        System.out.println("1. Selection sort: ");
        //Каждый проход выбирать самый минимальный элемент и смещать его в начало.
        // При этом каждый новый проход начинать сдвигаясь вправо, то есть первый проход — с первого элемента, второй проход — со второго
        selectionSort(array);

        System.out.println("2.1. Bubble sort: ");
        //Начиная с начала массива просматриваем попарно по 2 элемента (первый со вторым, второй с третим, третий с четвертым и т.д.).
        //Если второй элемент в паре меньше первого элемента – перемещаем его на место первого, а первый на место второго. Это мы делаем для всех элементов.
        bubbleSort(array);

        System.out.println("2.2. Shaker sort: ");
        //От последней перестановки до конца (начала) массива находятся отсортированные элементы
        //Границы сортируемой части массива сдвигаются на 1 позицию на каждой итерации.
        shakerSort(array);

        System.out.println("3. Insertion sort: ");
        //Элементы массива просматриваются по одному.
        //Каждый новый поступивший элемент размещается в подходящее место среди ранее упорядоченных элементов
        insertionSort(array);

        System.out.println("4. Merge sort: ");
        //Разделяем массив на части, пока он не будет равен 1 элементу. Каждый 1 элемент является отсортированным.
        //Слияние отсортированных элементов по принципу двух колод карт. Кладем 2 колоды карт на стол вверх значениями, и карту которая из них младше, кладем
        // в третью результирующую стопку карт.
        // В конечном итоге, если карты в какой-то колоде закончились, перекладываем их по очереди в результирующую.
        mergeSort(array, array.length);
        printArray(array);

        System.out.println("5. Quick sort: ");
        //Массив делится на несколько массивов, каждый из который сортируется по отдельности и потом объединяется в один массив
        quickSort(array, 0, array.length - 1);
        printArray(array);
    }

    private static void shakerSort(int[] array) {
        boolean swapped = true;
        int start = 0;
        int end = array.length;

        while (swapped) {
            swapped = false;
            for (int i = start; i < end - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            swapped = false;

            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            start = start + 1;
        }
        printArray(array);
    }

    private static void bubbleSort(int[] array) {
        boolean isSorted = false; //показывает отсортирован массив или нет
        int d;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    d = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = d;

                }
            }
        }
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i3 : array) {
            System.out.println(i3);
        }
    }

    private static void selectionSort(int[] array) {
        int b;
        for (b = 0; b < array.length - 1; b++) {
            int min = b;
            for (int c = b + 1; c < array.length; c++) {
                if (array[c] < array[min]) {
                    min = c;
                    int temp = array[min];
                    array[min] = array[b];
                    array[b] = temp;
                }
            }
        }
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        printArray(array);
    }

    public static void mergeSort(int[] array, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(array, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}



