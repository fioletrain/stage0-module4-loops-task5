package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int x = 1; x <= sideLength; x++){
            System.out.print(8);
            for (int y = 2; y < sideLength; y++){
                if (x == 1 || (x == sideLength)) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(8);
        }
    }
}
