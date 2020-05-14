package com.miguo.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
 
 
 
public class demo14 {
        private static final char START_SYMBOL = '2';
        private static final char END_SYMBOL = '3';
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = reader.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        char[][] cs = new char[n][m];
        for(int i=0;i<n;i++){
            String arg = reader.readLine();
            for(int j=0;j<m;j++){
                cs[i][j] = arg.charAt(j);
            }
        }
       System.out.println( bfs(cs, n, m, getStart(cs, n, m)));
         
    }
     
     
    public static int bfs(char[][] c,int n,int m,int [] start){
        final int END = '3';
        final int[][] move = new int[][]{ { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 }};
        final int nextstep = 4;
        boolean[][][] visited = new boolean[n][m][1024];
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(new Node(start[0], start[1], 0, 0));
         
        visited[0][0][0] = true;
        while(!queue.isEmpty()){
            Node node  =queue.poll();
             
            for(int i=0;i<nextstep;i++){
                int x = node.getX()+move[i][0];
                int y = node.getY()+move[i][1];
                int keys = node.getKeys();
                if(x<0||y<0||x>=n||y>=m||c[x][y]=='0'){
                    continue;
                }else if(c[x][y] == '3'){
                    return node.getSteps()+1;
                }else if('a'<=c[x][y]&&c[x][y]<='z'){
                    keys|=(1<<(c[x][y]-'a'));
                }else if('A'<=c[x][y] && c[x][y]<='Z'&&((1<<(c[x][y]-'A'))&keys)==0 ){
                    continue;
                }
                 
                if(!visited[x][y][keys]){
                    visited[x][y][keys]=true;
                    queue.offer(new Node(x, y, keys, node.getSteps()+1));
                }
            }
             
        }
        return -1;
         
    }
     private static int[] getStart(char[][] c, int n, int m) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (c[i][j] == START_SYMBOL) {
                        return new int[] { i, j };
                    }
                }
            }
            return null;
        }
 
}
 
class Node {
    private int x;
    private int y;
    private int keys;
    private int steps;
    public Node(int x,int y,int keys,int steps){
        this.x = x;
        this.y = y;
        this.keys = keys;
        this.steps = steps;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getKeys() {
        return keys;
    }
    public void setKeys(int keys) {
        this.keys = keys;
    }
    public int getSteps() {
        return steps;
    }
    public void setSteps(int steps) {
        this.steps = steps;
    }
    @Override
    public String toString() {
        return "Node [x=" + x + ", y=" + y + ", keys=" + keys + ", step=" + steps + "]";
    }
 
}
