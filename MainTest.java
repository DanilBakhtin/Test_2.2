package Main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Исходные данные для проверки
    private int mass[] = new int[]{1,2,3,4,5};

    @Test
    void TestGetSummMainMethod() {
        //Вызываем метод суммы чисел в массиве
        int expected = Main.getSumm(mass);
        //Число которое должно получиться
        int actual = 15;
        //Вызываем метод тестирования
        Assert.assertEquals(expected, actual);
    }

    @Test
    void TestGetMultiMainMethod() {
        //Вызываем метод суммы чисел в массиве
        long expected = Main.getMulti(mass);
        //Число которое должно получиться
        long actual = 120;
        //Вызываем метод тестирования
        Assert.assertEquals(expected, actual);
    }
}