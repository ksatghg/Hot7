 package Mine;
   
   import java.util.Random;
   
   /**
    * The type Mine sweeper.
    */
   public class MineSweeper {
   
       private static final String MINE = " X ";
       private static final String NONE = " 0 ";
       private static final int ROW = 10;
       private static final int COL = 10;
       private static final int MINE_COUNT = 10;
       private String[][] mineBoard;
   
       public static void main(String[] args) {
           MineSweeper mineSweeper = new MineSweeper();
           mineSweeper.initBoard();
           mineSweeper.setMineLocation();
           mineSweeper.setBoardValues();
           mineSweeper.printBoard();
       }
   
       public MineSweeper() {
           this.mineBoard = new String[ROW][COL];
       }
   
      /**
       * 배열 0으로 초기화
       */
       public void initBoard() {
           for (int i = 0; i < ROW; i++) {
               for (int j = 0; j < COL; j++) {
                   mineBoard[i][j] = NONE;
               }
           }
       }
   
       /**
        * Mine 위치 설정
        */
       public void setMineLocation() {
           int mineCnt = MINE_COUNT;
           Random random = new Random();
   
           while (mineCnt-- > 0) {
               int ranRow = random.nextInt(ROW);
               int ranCol = random.nextInt(COL);
   
               if (isMine(ranRow, ranCol)) {
                   mineCnt++;
               } else {
                   mineBoard[ranRow][ranCol] = MINE;
               }
           }
       }
   
       /**
        * 배열의 값(주변 mine 갯수)설정
        */
       public void setBoardValues() {
           for (int i = 0; i < ROW; i++) {
               for (int j = 0; j < COL; j++) {
                   if (isNotMine(i, j)) mineBoard[i][j] = getNearMineCount(i, j);
               }
           }
       }
   
       /**
        * 기준 위치 주변 mine 갯수
        *
        * @param row
        * @param col
        * @return 주변 mine 갯수 String
        */
       public String getNearMineCount(int row, int col) {
           int count = 0;
   
           if (isMine(row - 1, col - 1)) count++;
           if (isMine(row - 1, col)) count++;
           if (isMine(row - 1, col + 1)) count++;
           if (isMine(row, col - 1)) count++;
           if (isMine(row, col + 1)) count++;
           if (isMine(row + 1, col - 1)) count++;
           if (isMine(row + 1, col)) count++;
           if (isMine(row + 1, col + 1)) count++;
   
           return " " + count + " ";
       }
   
       /**
        * 기준 위치의 값이 mine 인지 체크
        *
        * @param row
        * @param col
        * @return isExistMine(row, col)=true 면 mine
        */
       private boolean isMine(int row, int col) {
           try {
               return mineBoard[row][col].equals(MINE);
           } catch (IndexOutOfBoundsException e) {
               // row, col이 Board 위의 유요한 값이 아닐 때
               return false;
           }
       }
   
       private boolean isNotMine(int i, int j) {
           return !isMine(i, j);
       }
   
       /**
        * Board 출력
        */
       public void printBoard() {
   
           System.out.println("ROW : " + ROW);
           System.out.println("COL : " + COL);
           System.out.println("Total Mine Count: " + COL);
           System.out.println("--------------------------------");
   
           for (int i = 0; i < ROW; i++) {
               for (int j = 0; j < COL; j++) {
                   System.out.print(mineBoard[i][j]);
               }
               System.out.println();
           }
       }
   }