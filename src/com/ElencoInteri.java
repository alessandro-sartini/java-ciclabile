package com;

public class ElencoInteri {

    public int[] arrayIterno;
    public int nextIndex;

    public ElencoInteri(int[] array) {
        this.arrayIterno = array;
        this.nextIndex=0;
    }

    public int getElementoSuccessivo() {
        int nextInt = arrayIterno[nextIndex];
        nextIndex++;
        return nextInt;

    }

    public boolean hasAncoraElementi(){
        boolean hasNext=true;

        if (nextIndex >= arrayIterno.length) {
            hasNext=false;
        }

        return hasNext;
    }

    public void addInt(int newInt){
        int[] updated=new int[arrayIterno.length+1];
        for(int i=0;i<this.arrayIterno.length;i++){
            updated[i]=this.arrayIterno[i];
        }
        updated[updated.length-1]=newInt;
        this.arrayIterno=updated;
    }
       
        

}
