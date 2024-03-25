package cPreguntas.encontrarWord;

import java.util.Arrays;

public class EncontrarPalabra {

    public void encontrar(String[] matrix) {
        char[][] map = converterListStringToCharMatrix(matrix);
        System.out.println("The word is: " + extractWord(map));
    }

    private char[][] converterListStringToCharMatrix(String[] matrix){
        int sizeM = matrix.length;
        char[][] map = new char[sizeM][sizeM];

        for (int i = 0; i < sizeM; i++) {
            map[i] = matrix[i].toCharArray();
        }
        return map;
    }

    private String extractWord(char[][] map){
        boolean isFound = false;
        StringBuilder word =new StringBuilder();

        int x = 0;
        int y = 0;
        word.append(map[x][y]);
        map[x][y] = '*';

        while (!isFound) {
            int[] moved = move2(x,y,map);

            if(moved[0] == 0 && moved[1] == 0){
                isFound = true;
            } else {
                x = moved[0];
                y = moved[1];

                word.append(map[x][y]);
                map[x][y] = '*';
            }
        }

        return word.toString();
    }

    private int[] move(int x, int y, char[][] map){
        int[] move = new int[2];
        //Right X
        if(map.length > x+1) {
            if  (map[x+1][y] != '*') {
                move[0] = x+1;
                move[1] = y;
//                System.out.println("x,y: " +map[x+1][y]);
                return move;
            }
        }

        //Left X
        if(0 <= x-1) {
            if  (map[x-1][y]!= '*') {
                move[0] = x-1;
                move[1] = y;
//                System.out.println("x,y: " +map[x-1][y]);
                return move;
            }
        }

        //Up Y
        if(0 <= y-1) {
            if  (map[x][y-1]!= '*') {
                move[0] = x;
                move[1] = y-1;
 //               System.out.println("x,y: " +map[x][y-1]);
                return move;
            }
        }

        //Down Y
        if(map.length > y+1) {
            if  (map[x][y+1] != '*') {
                move[0] = x;
                move[1] = y+1;
//                System.out.println("x,y: " +map[x][y+1]);
                return move;
            }
        }
        return move;
    }

    private int[] move2(int x, int y, char[][] map){
        int[] move = new int[2];
        //Right X
        if(map.length > x+1 && map[x+1][y] != '*') {
                move[0] = x+1;
                move[1] = y;
//                System.out.println("x,y: " +map[x+1][y]);
                return move;
        }

        //Left X
        if(0 <= x-1 && map[x-1][y]!= '*') {
                move[0] = x-1;
                move[1] = y;
//                System.out.println("x,y: " +map[x-1][y]);
                return move;
        }

        //Up Y
        if(0 <= y-1 && map[x][y-1]!= '*') {
                move[0] = x;
                move[1] = y-1;
                //               System.out.println("x,y: " +map[x][y-1]);
                return move;

        }

        //Down Y
        if(map.length > y+1 && map[x][y+1] != '*') {
                move[0] = x;
                move[1] = y+1;
//                System.out.println("x,y: " +map[x][y+1]);
                return move;
        }
        return move;
    }

}
