package arrays;

import java.math.BigDecimal;

//NumberConverter
// can use toCharArray
//Написать класс с одноименным названием.
//Класс должен содержать в себе 4 статических метода для конвертации :
//int -> String
//String -> int
//double -> String
//String -> double
//1) Нельзя использовать стандартные методы для конвертации.
//2) При контеканации можно за раз использовать не больше 1 символа (т.е. при переводе из числа в строку, из числа нужно
// достать по одной цифре)
//3) Числа могут быть отрицательными
//4) Числа с плавающей точкой могут и не содержать дробную часть (12345)
//5) При переводе из строки, не нужны проверки на корректность строки. Расчитываем что строка всегда содержит корректное число.
//п.с. Можно использовать методы класса Math
public class NumberConverter {

    public static String convertIntToString(int element) {
        String result = new String();
        String str = new String();
        int proxElement = element;
        while (proxElement != 0) {
            str += (proxElement % 10);
            proxElement /= 10;
        }
        char[] array = str.toCharArray();
        if (element > 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                result = result + array[i];
            }
        } else {
            result = "-";
            for (int i = array.length - 1; i >= 0; i--) {
                if (!(array[i] == '-')) {
                    result = result + array[i];
                }
            }
        }
        return result;
    }

    public static int convertStringToInt(String string) {
        int result = 0;
        char[] array = string.toCharArray();
        int size = array.length - 1;
        if (!(string.charAt(0) == '-')) {
            for (char element :
                    array
            ) {
                int numberValue = Character.getNumericValue(element);
                double runge = Math.pow(10, size);
                result += numberValue * runge;
                size--;
            }
        } else {
            for (int i = 1; i < array.length; i++) {
                int numberValue = Character.getNumericValue(array[i]);
                double runge = Math.pow(10, size - 1);
                result += numberValue * runge;
                size--;
            }
            result = result * -1;
        }
        return result;
    }

    public static String convertDoubleToString(double element) {
        int scale = BigDecimal.valueOf(element).scale();
        if (element % 1 == 0) {
            scale = 0;
        }
        double pow = Math.pow(10, scale);
        int newElement = Math.toIntExact(Math.round(element * pow));
        String result = new String();
        String str = new String();
        int proxElement = newElement;
        while (proxElement != 0) {
            str += (proxElement % 10);
            proxElement /= 10;
        }
        char[] array = str.toCharArray();
        if (element > 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                result = result + array[i];
                if (i == scale) {
                    result = result + ".";
                }
            }
        } else {
            result = "-";

            for (int i = array.length - 1; i > 0; i--) {
                if (!(array[i] == '-')) {
                    result = result + array[i];
                }
            }
            result = new StringBuffer(result).insert(result.length() - scale, ".").toString();
        }
        return result;
    }

    public static double convertStringToDouble(String string) {
        double result = 0;
        char[] array = string.toCharArray();
        int size = array.length;
        int middleSize = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '.') {
                middleSize = i;
            }
        }
        if (!(string.charAt(0) == '-')) {
            for (int i = 0; i < array.length; i++) {
                if (!(array[i] == '.')) {
                    int numberValue = Character.getNumericValue(array[i]);
                    double runge = Math.pow(10, size - 2);
                    result += numberValue * runge;
                    size--;
                }
            }
            result = result / Math.pow(10, ((array.length - 1) - middleSize));
        } else {
            for (int i = 1; i < array.length; i++) {
                if (!(array[i] == '.')) {
                    int numberValue = Character.getNumericValue(array[i]);
                    double runge = Math.pow(10, size - 2);
                    result += numberValue * runge;
                    size--;
                }
            }
            result = result / Math.pow(10, ((array.length - 1) - (middleSize - 1))) * -1;
        }
        return result;
    }

}
