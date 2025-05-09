package com;

public class ElencoInteri {

    private int[] arrayIterno;
    private int nextIndex;

    public ElencoInteri(int[] array) {
        this.arrayIterno = array;
        this.nextIndex = 0;
    }

    public int[] getArrayIterno() {
        return this.arrayIterno;
    }

    public void setArrayIterno(int[] arrayIterno) {
        this.arrayIterno = arrayIterno;
    }

    public int getNextIndex() {
        return this.nextIndex;
    }

    public void setNextIndex(int nextIndex) {
        this.nextIndex = nextIndex;
    }

    public ElencoInteri() {
        this.arrayIterno = new int[0];
    }

    public int getElementoSuccessivo() {
        int nextInt = arrayIterno[nextIndex];
        nextIndex++;
        return nextInt;

    }

    public boolean hasAncoraElementi() {
        boolean hasNext = true;

        if (nextIndex >= arrayIterno.length) {
            hasNext = false;
        }

        return hasNext;
    }

    public void addInt(int newInt) {
        int[] updated = new int[arrayIterno.length + 1];
        for (int i = 0; i < this.arrayIterno.length; i++) {
            updated[i] = this.arrayIterno[i];
        }
        updated[updated.length - 1] = newInt;
        this.arrayIterno = updated;
    }

}
