import java.util.Scanner;

class taskSecond2 
{
    int[] myDeck = new int[52];
        static String[] cardType = { "spade", "Heart", "Daimond", "club" };
       static String[] allCard = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

    protected static void storeResult(String[] myDeck) 
    {
        for (int i = 0; i < myDeck.length; i++) 
        {
            myDeck[i] = allCard[i % 13] + " " + cardType[i / 13];
                // System.out.println(myDeck[i]);
        }
    }

        protected static void mySuffell(String[] myDeck) 
        {
            for (int i = 0; i < myDeck.length; i++) 
            {
                int index = (int) (Math.random() * myDeck.length);

                String temp = myDeck[i];
                myDeck[i] = myDeck[index];
                myDeck[index] = temp;
            }
        }

    protected static void printSuffellCards(String[] myDeck)
        {
            for(String ansSuffel : myDeck)
            {
                System.out.println(ansSuffel + " ");
            }
        }

    }

    public class taskSecond extends taskSecond2 {

        public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             String first = sc.next();
            String[] myDeck = new String[52];
            taskSecond2.storeResult(myDeck);
            taskSecond2.mySuffell(myDeck);
            taskSecond2.printSuffellCards(myDeck);
            String ans = n + " " + first;
            System.out.println("After Removing the Card from That");
            //For Choosing the Card
            for( int i=0; i<myDeck.length; i++)
            {
                if(ans == myDeck[i])
                {
                    myDeck[i] = "";
                }
            }
            taskSecond2.printSuffellCards(myDeck);
    }
}
