import java.sql.SQLOutput;

public class Match {
    Fighter f1 ;

    Fighter f2 ;
    int minWeigh;
    int maxWeigh;
    Match(Fighter f1 , Fighter f2 , int minWeigh, int maxWeigh){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeigh = minWeigh;
        this.maxWeigh = maxWeigh;

    }
     void run(){
        if(isCheck()){
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println(" ========Yeni ROUNT========");
                this.f2.health = this.f1.hit(f2);
                System.out.println( this.f2.name+" "+this.f2.health);
                if(isWin()) break ;
                this.f1.health = this.f2.hit(f1);
                System.out.println(this.f1.name + " " + f2.health);
                if(isWin()) break ;
                System.out.println(this.f1.name);



            }

        }else {
            System.out.println("Orta siklet box müsabakasıdır sporcuların kiloları 90 ve 100 arasında olması laızımdır ! ");
        }
    } boolean isCheck(){
        return (this.f1.weight >= minWeigh && this.f1.weight <= maxWeigh) && (this.f2.weight >= minWeigh && this.f2.weight <= maxWeigh);

    }boolean isWin(){
        if(this.f1.health ==0) {
            System.out.println( " Tekbrikler kazanan "+this.f2.name);
            return true;
        }
        if(this.f2.health ==0) {
            System.out.println(" Tebrikler kazanan" + this.f1.name) ;
            return false ;
        }return false ;
    }
}
