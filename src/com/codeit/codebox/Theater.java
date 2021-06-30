package com.codeit.codebox;

public class Theater {

    // 여기에 코드를 작성하세요.
    private Seat[][] seats;

    private int rowCount;
    private int colCount;

    public Theater(int rowCount, int colCount){
        this.seats = new Seat[rowCount][colCount];
        if (rowCount > 26) {
            rowCount = 26; // number of alphabets
        }
        this.rowCount = rowCount;
        this.colCount = colCount;
        for(int i=0;i<rowCount;i++){
            for(int j=0;j<colCount;j++){
                seats[i][j] = new Seat();
            }
        }
    }

    private int getRowIndex(char uppercaseChar){
        return (int)uppercaseChar-65;
    }

    public boolean reserve(String name, char rowChar, int col, int numSet){
        if('A'>=Character.toLowerCase(rowChar) || Character.toUpperCase(rowChar)>='Z') return false;

        if(col<1 || col>9) return false;
        for(int i=0;i< numSet;i++){
            if (i+col>colCount) return false;
            if(seats[getRowIndex(rowChar)][col+i-1].isOccupied()) return false;
        }
        for(int i=0;i< numSet;i++){
            seats[getRowIndex(rowChar)][col+i-1].reserve(name);
        }

        return true;
    }

    public int cancel(String name){
        int cancelNum =0;
        for(int i=0; i<rowCount;i++){
            for(int j=0; j<colCount;j++){
                if(seats[i][j].getName() != null && seats[i][j].getName().equals(name)){
                    cancelNum++;
                    seats[i][j].cancel();
                }
            }
        }
        return cancelNum;
    }
    public int cancel(char rowChar, int col, int numSet){
        int cancelNum =0;
        for(int i=0;i< numSet;i++){
            if(seats[getRowIndex(rowChar)][col+i-1].isOccupied()){
                seats[getRowIndex(rowChar)][col+i-1].cancel();
                cancelNum++;
            }
        }

        return cancelNum;
    }

    public int getNumberOfReservedSeat(){
        int reserveNum=0;
        for(int i=0; i<rowCount;i++){
            for(int j=0; j<colCount;j++){
                if(seats[i][j].isOccupied()){
                    reserveNum++;
                }
            }
        }
        return reserveNum;
    }

    public void printSeatMatrix() {
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        for (int i = 0; i < rowCount; i++) {
            System.out.print((char) ('A' + i) + ": ");
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if ( s.isOccupied()) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }
}