
import java.lang.Math;
public class Number {
    public boolean isPrime(int num){
        if(num < 2){
            return false;
        }else{
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public void display(){
        for(int i = 0; i < 100; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Number n = new Number();
        n.display();
    }
}
