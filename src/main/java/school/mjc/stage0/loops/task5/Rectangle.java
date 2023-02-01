package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int x = 1; x <= height; x++){
            System.out.print(8);
            for (int y = 2; y < length; y++){
                if (x == 1 || (x == height)) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(8);
        }
    }
}
