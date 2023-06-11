package Recursion;

public class WordSearch {
    public static void main(String[] args) {
        char[][] maze =  {{'A','B','C','E'},
                        {'S','F','C','S'},
                        {'A','D','E','E'}};

        search("", maze, 0,0, "ABCCED");
    }
    static void search(String p, char[][] maze, int r, int c, String word){
        if(p.equals(word)){
            System.out.println(true);
            return;
        }
        if(maze[r][c] == '0'){
            return;
        }
        char tmp = maze[r][c];
        maze[r][c] = '0';
        if(r < maze.length -1){
            search(p + tmp, maze, r + 1, c , word);
        }
        if(c < maze[0].length -1){
            search(p + tmp, maze, r, c + 1 ,word);
        }
        if(r > 0){
             search(p + tmp, maze , r -1, c, word);
        }
        if(c > 0){
             search(p + tmp, maze, r, c-1, word);
        }
        maze[r][c] = tmp;
    }
}
