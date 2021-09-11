package arrays;

import java.util.Arrays;

public class ArrayMethods {

    //1.принимает массив чаров, возвращает строку состоящую из символов массива
    public String convertArrayCharToString(char[] charArray) {
        return new String(charArray);
    }

    //2.принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива.
    //Если значения в массиве нет возвращает -1
    public int getIndexArray(int[] intArray, int arrayElement) {
        for (int i = 0; i < intArray.length; i++) {
            if (arrayElement == intArray[i]) {
                return i;
            }
        }
        return -1;
    }

    //3.принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с конца массива.
    public int getIndexEndArray(int[] intArray, int arrayElement) {
        for (int i = 0; i < intArray.length; i++) {
            if (arrayElement == intArray[i]) {
                return (intArray.length - 1) - i;
            }
        }
        return -1;
    }

    //4.приминает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
    public void showMultipleElement(int[] intArray, int arrayElement) {
        for (int i = 0; i < intArray.length; i++) {
            if ((intArray[i] % arrayElement) == 0) {
                System.out.println(intArray[i]);
            }
        }
    }

    //5.метод принимает массив интов сортирует его по возрастанию
    public int[] sortedByAscending(int[] intArray) {
        return Arrays.stream(intArray).sorted().toArray();
    }

    //6.принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
    public Boolean isRepeatElement(byte[] byteArray) {
        for (int i = 0; i < byteArray.length; i++) {
            for (int j = i + 1; j < byteArray.length; j++) {
                if (byteArray[i] == byteArray[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //7.метод приминимает массив интов сортирует его по убыванию (нельзя использовать методы сторонних классов)
    public int[] sortedByDescend(int[] intArray) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] < intArray[i + 1]) {
                    int tmp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = tmp;
                    needIteration = true;
                }
            }
        }
        return intArray;
    }

    //8.принимает 2-мерный массив строк, выводит его на экран
    public void showTwoDimensionalArray(String[][] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                System.out.print(" " + stringArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    //9.принимает 2-мерный массив интов, возвращает 2-мерный массив чаров, каждый символ в позиции массива соответствует коду символа передаваемого инта
    public char[][] convertArrayIntToArrayChar(int[][] intArray) {
        char[][] charArray = new char[intArray.length][intArray[0].length];
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                charArray[i][j] = (char) intArray[i][j];
            }
        }
        return charArray;
    }

    //10.принимает 2-мерный массив интов, ивертирует массив интов (каждое значение в передаваемом массиве меняет знак)
    public int[][] intInversion(int[][] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = intArray[i][j] * -1;
            }
        }
        return intArray;
    }

    //11.принимает два массива интов одинаковых по длинне, возращает массив интов который состоит из перемноженных елементов входящих массивов
    public int[] arraysMultiplying(int[] intArray1, int[] intArray2) {
        int[] resultArray = new int[intArray1.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = intArray1[i] * intArray2[i];
        }
        return resultArray;
    }

    //12.принимает 3 инта
    //-размер выходного массива
    //-нижняя граница
    //-верхняя граница
    //возвращает массив интов заданой длинный, который содержит случайные числа от нижней границы до верхней границы
    public int[] randomArray(int size, int bottom, int upper) {
        int[] resultArray = new int[size];
        for (int i = 0; i < size; i++) {
            resultArray[i] = (int) (Math.random() * (upper - bottom) + bottom);
        }
        return resultArray;
    }

}
