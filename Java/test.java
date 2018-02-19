public class test { 
    public static void main (String args[]){

        int money = 3;
        int moneyB = 2;
        int[] thisArray = {12, 3, 55, 1, 22, 7};
        System.out.println("Yeah, we are here");
        System.out.println(money + moneyB);
        for(int i=0; i < thisArray.length; i++){
            if (thisArray[i] > 7){
                System.out.println(thisArray[i]);
            } else {
                System.out.println("Too low homie");
            }
            
        }
    }
}
