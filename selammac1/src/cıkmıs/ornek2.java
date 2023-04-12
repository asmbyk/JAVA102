package cıkmıs;
public class ornek2 {
    public static double coz(){
        int j=1,k=1,fak=1,üs=1;
        for (int i = 2; i <3; i++) {
            j=j+i;
            k=k*i;
        }
        j=j+1;
        for (int i = 1; i <k ; i++) {
            fak=fak*i;
        }
        for (int i = 1; i <fak; i++) {
            üs=üs*j;
        }
        return üs/Math.cos(k);
    }
    public static void main(String[] args){
        System.out.println(coz());
    }
}
