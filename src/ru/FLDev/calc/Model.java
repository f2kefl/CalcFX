package ru.FLDev.calc;

/**
 * Created by F4KEFLY on 05.05.2016.
 * Description:
 * TODO:
 */
class Model
{
    double calculation(double a, double b, String operator)
    {
        if (operator.equals("+")) {
            return a + b;
        }
        else if (operator.equals("-")) {
            return a - b;
        }
        else if (operator.equals("/")) {
            if (b == 0) return 0;
            return a / b;
        }
        else if (operator.equals("*")) {
            return a * b;
        }
        return 0;
    }
}
