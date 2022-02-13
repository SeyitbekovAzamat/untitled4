package com.company;

public class Skeleton extends Boss {
    private int numbersOfArrows;

    public int getNumbersOfArrows() {
        return numbersOfArrows;
    }

    public void setNumbersOfArrows(int numbersOfArrows) {
        this.numbersOfArrows = numbersOfArrows;
    }

    public String info() {
        return super.info() + " " + this.numbersOfArrows;
    }
}
