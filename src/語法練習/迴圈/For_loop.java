package 迴圈;

public class For_loop {
    public static void main(String[] args) {
        //99乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++)
                if (j == 9) {
                    System.out.println(j + "×" + i + "=" + i * j);
                } else {
                    System.out.print(j + "×" + i + "=" + i * j + "\t");
                }
        }System.out.println("\n");
        //另類相乘表
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }System.out.println("\n");
        //等腰三角形
        int layer=5;//指定中間的層數
        for(int i=layer;i>=1;i--) {
            for (int j = layer; j >= i; j--)
                System.out.print("*");
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            System.out.println();
        }
        for(int i=1;i<=layer;i++) {
            for (int j = layer; j > i; j--)
                System.out.print("*");
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            System.out.println();
        }

        //畫出菱形
        int floor = 8;//指定中間的層數
        for (int i = 1; i <= floor; i++) { //拆成三個三角形依序繪出
            for (int j = floor; j >= i; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int x = floor-1; x >= 1; x--) { //倒過來的三角形
            for (int y = floor; y >= x; y--)
                System.out.print(" ");
            for (int y = 1; y <= x; y++)
                System.out.print("*");
            for (int y = 1; y < x; y++)
                System.out.print("*");
            System.out.println();
        }
    }
}
