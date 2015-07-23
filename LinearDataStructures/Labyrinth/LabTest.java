package Labyrinth;

public class LabTest {
    public static void main(String[] args) {
        String[][] labyrinth = new String[][] { 
                                            { "0", "0", "0", "x", "0", "x" },
                                            { "0", "x", "0", "x", "0", "x" },
                                            { "0", "*", "x", "0", "x", "0" }, 
                                            { "0", "x", "0", "0", "0", "0" }, 
                                            { "0", "0", "0", "x", "x", "0" },
                                            { "0", "0", "0", "x", "0", "x" } };
        int startX = 2;
        int startY = 1;
        //int step = 1;
        
        LabSolver ls = new LabSolver(startX, startY);
        ls.solve(labyrinth);
        
        for (int i = 0; i < labyrinth.length; i++) {
            for (int j = 0; j < labyrinth[0].length; j++) {
                System.out.print(labyrinth[i][j] + "  ");
            }
            System.out.println();
        }

    }

}
