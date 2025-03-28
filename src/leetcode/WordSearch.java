package leetcode;

/**
 * 79. Word Search
 *
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != word.charAt(0)) continue;
                if (bt(new boolean[board.length][board[0].length], i, j, board, word, 0)) return true;
            }
        }

        return false;
    }

    private boolean bt(boolean[][] visited, int i, int j, char[][] board, String word, int currentIndex) {
        if (currentIndex == word.length()) return true;

        if (i < 0 || i >= board.length) return false;
        if (j < 0 || j >= board[0].length) return false;
        if (visited[i][j]) return false;
        if (board[i][j] != word.charAt(currentIndex)) return false;

        visited[i][j] = true;
        boolean btRight = bt(visited, i, j + 1, board, word, currentIndex + 1);
        boolean btBot = bt(visited, i + 1, j, board, word, currentIndex + 1);
        boolean btLeft = bt(visited, i, j - 1, board, word, currentIndex + 1);
        boolean btTop = bt(visited, i - 1, j, board, word, currentIndex + 1);
        visited[i][j] = false;

        return btLeft || btTop || btRight || btBot;
    }
}
