package Fibonacci;

/**
 * клас Fibonachi із полями номеру{@link Fibonacci#numb} і значення{@link Fibonacci#data} числа Фібоначчі
 * @author Корнійчук Олександр
 */
public class Fibonacci {

    /**
     * номер числа Фібоначчі
     */
    private int numb;
    /**
     * значення числа Фібоначчі
     */
    private int data;

    /**
     * констуктор класу {@link Fibonacci} із параметрами
     * @param numb номер числа Фібоначчі
     * @param data значення числа Фібоначчі
     */
    public Fibonacci(int numb, int data)
    {
        this.data = data;
        this.numb = numb;
    }

    /**
     * метод класу - повернення значення числа Фібоначчі
     * @return значення числа Фібоначчі
     */
    public int getData() {
        return data;
    }
    /**
     * метод класу - повернення номеру числа Фібоначчі
     * @return номер числа Фібоначчі
     */
    public int getNumb() {
        return numb;
    }
    /**
     * метод класу - задання значення числа Фібоначчі
     * @param data значення числа Фібоначчі
     */
    public void setData(int data) {
        this.data = data;
    }
    /**
     * метод класу - задання номеру числа Фібоначчі
     * @param numb номеру числа Фібоначчі
     */
    public void setNumb(int numb) {
        this.numb = numb;
    }
}
