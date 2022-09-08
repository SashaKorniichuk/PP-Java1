import Fibonacci.Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s = Size();
        Fibonacci[] Array = CreateArr(s);
        Solve(Array,s);
    }

    /**
     * метод вводу розміра масиву чисел Фібоначчі
     * @return розмір даного масиву
     */
    public static int Size()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = scan.nextInt();
        return size;
    }
    /**
     * метод створення ,заповнення і виведення масиву класу {@link Fibonacci} з параметрами номер  і значення числа Фібоначчі
     * @param size - розмір масиву
     * @return масив чисел Фібоначчі
     */
    public static Fibonacci[] CreateArr(int size)
    {
        Fibonacci[] Arr = new Fibonacci[size];
        Arr[0] = new Fibonacci( 0, 1);
        Arr[1] = new Fibonacci(1,1);
        System.out.print(Arr[0].getNumb() + "  " + Arr[0].getData() + "\n");
        System.out.print(Arr[1].getNumb() + "  " + Arr[1].getData() + "\n");
        for(int i = 2;i < size;i++)
        {
            Arr[i] = new Fibonacci(i,Arr[i - 1].getData() + Arr[i-2].getData());
            System.out.print(Arr[i].getNumb() + "  " + Arr[i].getData() + "\n");
        }
        return Arr;
    }

    /**
     * метод знаходження чисел Фібоначчі , які є на 1 більшими ніж певний куб
     * @param Arr масив чисел Фібоначчі
     * @param size розмір масиву Arr
     */
    public static void Solve(Fibonacci[] Arr, int size)
    {
        for (int i=0;i<size;i++)
        {
            int tmp=Arr[i].getData()-1;
            if(Math.pow(tmp,1/3)==(int)tmp)
            {
                System.out.print(Arr[i].getNumb() +" - число Фібоначчі яке є на 1 більше ніж куб числа "+tmp+"\n");
            }
        }
    }
}
