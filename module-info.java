import java.util.*;
interface Sweets{
    int weight=5;
    public int findweight();
}
class Chocalate implements Sweets{
    int c,w;
    public Chocalate(int n){
        c=n;
    }
    public int findweight(){
       w=weight*c; 
       return w;
    }
}
class Candy implements Sweets{
    int c,w;
    public Candy(int n){
        c=n;
    }
    public int findweight(){
       w=weight*c;
       return w;
    }
}
class reward{
    int choc,cha,t;
    reward(int ch,int ca){
        cha=ca;
        choc=ch;
    }
    int totalWeight(){
        Chocalate ch1=new Chocalate(choc);
        Candy c=new Candy(cha);
        t=ch1.findweight()+c.findweight();
        
        return t;
    }
}
public class Demo
{
	public static void main(String[] args) {
		reward g=new reward(3,4);
		reward g1=new reward(3,5);
		reward g2=new reward(3,2);
		int x[]=new int[3];
		x[0]=g.totalWeight();
		x[1]=g1.totalWeight();
		x[2]=g2.totalWeight();
		Arrays.sort(x);
		for(int i=0;i<3;i++){
		    System.out.println(x[i]);
		}
	}
}