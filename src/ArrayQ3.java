public class ArrayQ3 {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, false},
                {false, true}
        };
        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<board[i].length; j++) {
                if (board[i][j] == true) {
                    System.out.println("검은돌(●) 위치: (" + i + "," + j + ")");
                }
            }
        }
    }
}

// 'board[i][j] == true'를 'board[i][j]'(으)로 단순화 가능