package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

class Tuple{
    int row;
    int col;
    Tuple(int row, int col){
        this.row = row;
        this.col = col;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple test = (Tuple) o;
        return this.row == test.row && this.col == test.col;
    }
}

public class Recursion18 {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0}, 
            {1, 1, 0, 1}, 
            {1, 1, 0, 0}, 
            {1, 1, 1, 1} 
        };
        ArrayList<String> arr = new ArrayList<>();
        int i = 0;
        RatInAMaze(maze, 0, 0, "", arr, new ArrayList<>(), i);

        System.out.println(arr);
    }

    public static void RatInAMaze(int[][] arr, int row, int col,String Path, ArrayList<String> ans,
    ArrayList<Tuple> visitedNodes, int i){
        //if (i > 1) return;
        if (row == arr.length-1 && col == arr[0].length-1){
            ans.add(new String(Path));
            return;
        }
        //Down, Left, Right, Up

        //Down movement
        if (row < arr.length - 1 && arr[row+1][col] == 1 && !visitedNodes.contains(new Tuple(row+1, col))){
            visitedNodes.add(new Tuple(row, col));
            System.out.println("Going to " + (row+1) + " " + col);
            RatInAMaze(arr, row+1, col, Path + "D", ans, visitedNodes,i++);
            visitedNodes.remove(visitedNodes.size()-1);
        }

        //Left 
        if (col > 1 && arr[row][col-1] == 1 && !visitedNodes.contains(new Tuple(row, col-1))){
            visitedNodes.add(new Tuple (row, col));
            System.out.println("Going to " + row + " " + (col - 1));
            RatInAMaze(arr, row, col-1, Path + "L", ans, visitedNodes, i++);
            
            visitedNodes.remove(visitedNodes.size()-1);
        }

        //Right
        if (col < arr[0].length - 1 && arr[row][col+1] == 1 && !visitedNodes.contains(new Tuple(row, col+1))){
            visitedNodes.add(new Tuple (row, col));
            System.out.println("Going to " + row + " " + (col + 1));
            RatInAMaze(arr, row, col+1, Path + "R", ans, visitedNodes,i++);
            visitedNodes.remove(visitedNodes.size()-1);

        }

        //Up
        if (row >  1 && arr[row-1][col] == 1 && !visitedNodes.contains(new Tuple(row - 1, col))){
            visitedNodes.add(new Tuple (row, col));
            System.out.println("Going to " + (row-1) + " " + col);
            RatInAMaze(arr, row-1, col, Path + "U", ans, visitedNodes,i++);
            visitedNodes.remove(visitedNodes.size()-1);

        }

    }
}
