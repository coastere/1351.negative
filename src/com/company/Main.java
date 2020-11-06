package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][] grid={{5,1,0},{-5,-5,-5}};
      //  int [][] grid={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int sum=0;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if (grid[i][j] < 0) {
                    sum = sum + (grid[0].length - j);

                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
