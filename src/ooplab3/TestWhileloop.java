package ooplab3;

public class TestWhileloop {
    public static void main(String[] args) {
        //while
        int i = 1;
        while (i++<=100) {
            if (i%3==0&&i%5==0)
                System.out.print(i+" ");
            i++;

        }//while
//      do-while
        System.out.println();
        int j = 1;
        do {
            if (i % 3 == 0 && 5 == 0)
                System.out.print(j + " ");
        }while (++j<=100);
    }

}