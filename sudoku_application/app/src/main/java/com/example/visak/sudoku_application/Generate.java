package com.example.visak.sudoku_application;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by visak on 2018-02-02.
 */

public class Generate {

    public int[][] generatedSudoku = new int[9][9];

    public ArrayList<Integer> possibleValues = new ArrayList<>();

    public void generatePossibleValues(){
        possibleValues.clear();
        for (int i=1; i <=9; i++){
            possibleValues.add(i);
        }
    }

    public void setGeneratedSudoku(){
        int positionToBeFilled = 0;
        setInitialValuesForGrid();
        while (positionToBeFilled < 81){
            int xPosition = positionToBeFilled % 9;
            int yPosition = positionToBeFilled / 9 ;
            if (generatedSudoku[xPosition][yPosition]==-1){
                generatePossibleValues();
                for (int value: possibleValues) {

                }
            }
            else {
                Log.d("PositionFilled","Position"+positionToBeFilled+"has been already filled");
                positionToBeFilled++;
            }
        }
    }

    public void setInitialValuesForGrid(){
        for (int x =0; x <= 8 ; x++){
            for (int y =0; y<=8; y++){
                generatedSudoku[x][y]=-1;
            }
        }
    }

    public Boolean checkForConflicts(int valueTobeChecked, int rowPosition, int columnPosition){
        Boolean valueTobeReturned = false;
        checkRowConflict(valueTobeChecked, rowPosition);
        return valueTobeReturned;
    }

    public Boolean checkRowConflict(int valueTobeChecked, int rowPosition){
        Boolean rowConflict = false;
        for (int c = 0; c<=8; c++){
            if (generatedSudoku[rowPosition][c]==valueTobeChecked){
                rowConflict = true;
                break;
            }
        }
        return rowConflict;
    }

    public Boolean checkColumnConflict(int valueTobeChecked, int columnPosition){
        Boolean columnConflict = false;
        for (int r = 0; r <=8; r++){
            if (generatedSudoku[r][columnPosition]==valueTobeChecked){
                columnConflict = true;
                break;
            }
        }
        return columnConflict;
    }

    public Boolean checkBoxConflict(){
        Boolean boxConflict = false;
        
        return boxConflict;
    }

}
