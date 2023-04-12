package java101ornek;
/*
    //Kendisine parametre olarak gelen bir tamsayı dizisinde en büyük elmanın indisini hesaplayan rekürsif fonk.
 */
public class ornek40 {
    public static int enbuyuk(int[] dizi,int ind,int enbind){
        if (dizi.length==ind) {
            return dizi[enbind];
        }
        else if (dizi[enbind]<dizi[ind]) {
            return enbuyuk(dizi,ind+1,ind);
        }
        else
            return enbuyuk(dizi,ind+1,enbind);
    }
    public static void main(String[] args) {
        int[] d={4,7,8,5,1};
        int x=enbuyuk(d,0,0);
        System.out.println(x);
    }
}
