package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int n = (sideLength / 2) + 1;
        for (int x = 1; x <= sideLength; x++){
            for (int y = 1; y <= sideLength; y++){
                if (x == n){
                    System.out.print(8);
                } else if (y == n) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
