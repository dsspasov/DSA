package Labyrinth;

import java.util.LinkedList;
import java.util.Queue;

public class LabSolver {

    private Queue<Coordinate> queue;

    LabSolver(int x, int y) {
        this.queue = new LinkedList<Coordinate>();
        this.queue.add(new Coordinate(x, y));
    }

    public void solve(String[][] lab) {
        int step = 1;
        Queue<Coordinate> queueOfChildren = new LinkedList<Coordinate>();
        while (!this.queue.isEmpty()) {
            while (!this.queue.isEmpty()) {
                Coordinate coord = queue.poll();
                int x = coord.getX();
                int y = coord.getY();
                // System.out.println(lab[x][y]);
                if (isInRange(x - 1, y, lab.length, lab[0].length)) {
                    if (lab[x - 1][y].equals("0")) {
                        lab[x - 1][y] = String.valueOf(step);
                        queueOfChildren.add(new Coordinate(x - 1, y));
                    }
                }

                if (isInRange(x + 1, y, lab.length, lab[0].length)) {
                    if (lab[x + 1][y].equals("0")) {
                        lab[x + 1][y] = String.valueOf(step);
                        queueOfChildren.add(new Coordinate(x + 1, y));
                    }

                }
                if (isInRange(x, y - 1, lab.length, lab[0].length)) {
                    if (lab[x][y - 1].equals("0")) {
                        lab[x][y - 1] = String.valueOf(step);
                        queueOfChildren.add(new Coordinate(x, y - 1));
                    }
                }

                if (isInRange(x, y + 1, lab.length, lab[0].length)) {
                    if (lab[x][y + 1].equals("0")) {
                        lab[x][y + 1] = String.valueOf(step);
                        queueOfChildren.add(new Coordinate(x, y + 1));
                    }
                }
            }
            this.queue.addAll(queueOfChildren);
            queueOfChildren.clear();
            step++;
        }
        
        for(int i = 0; i<lab.length; i++){
            for(int j = 0; j<lab.length; j++){
                if(lab[i][j].equals("0")){
                    lab[i][j] = "u";
                }
            }
        }
    }

    public boolean isInRange(int x, int y, int xLength, int yLength) {
        if (x < 0 || y < 0 || x >= xLength || y >= yLength) {
            return false;
        }
        return true;
    }
}
