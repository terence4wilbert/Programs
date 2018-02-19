import java.util.Arrays;

public class arrays{


    public class Friend {
        private String name;
        private int phoneNumber;
        private int areaCode;

        public Friend(String name, int phoneNumber, int areaCode){
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.areaCode = areaCode;
        }
        @Override
        public String toString(){
            return String.format("Name: %s | Phone Number: (%d)-%d", name , areaCode, phoneNumber);
        }

    }
    public static void main(String[] arg) {
        String[] friends = new String[5];

        friends[0] = "Imani";
        friends[1] = "Andres";
        friends[2] = "Keith";
        friends[3] = "Sasha";
        friends[4] = "Tabitha";

        String firstFriend = friends[0];
        System.out.println("First friend is " + firstFriend);
        // prints "First friend is Imani"
        System.out.println("Last friend is " + friends[friends.length - 1]);
        System.out.println("Second to last Friend is " + friends[friends.length - 2]);
        System.out.println("Contents of Array: " + Arrays.toString(friends));
        // prints "Last friend is Tabitha"
        // (friends[friends.length - 1]) is giving the total amount of items in the list, subtract one becasue arrays are 0 based.

        friends[0] = null;
        friends[1] = "Alejandro";
        System.out.println();
        System.out.println("First friend is now " + friends[0]);
        // prints "First friends is now null"
        System.out.println("Second friend changed name to " + friends[1]);
        // prints "Second friends name to Alejandro"

        System.out.println();
        for( int index = 0; index < friends.length; index++) {
            System.out.printf("Friend %d: %s\n", index, friends[index]);
        }

        // intialize a new array with length of old array friends
        int [] friendsPhoneNumbers = new int[friends.length];
        friendsPhoneNumbers[0] = 555_8000;
        friendsPhoneNumbers[1] = 5554448;
        friendsPhoneNumbers[2] = 555_4311;
        friendsPhoneNumbers[3] = 555_7898;
        friendsPhoneNumbers[4] = 555_6710;

        System.out.println();

        for(int index = 0; index < friends.length; index++){
            String friend = friends[index];
            if(friend != null) {
                System.out.printf("Friend %d: %s's phone number is %d\n", index, friend, friendsPhoneNumbers[index] );
            } else {
                System.out.println("#Alert: No frien at index " + index);
            }
        }

        Friend[] phoneBook = new Friend[5];

        phoneBook[0] = new Friend("Imani", 215, 555_8000);
        phoneBook[1] = new Friend("Andres", 484, 5554448);
        phoneBook[2] = new Friend("Keith", 329, 555_4311);
        phonebook[3] = new Friend("Sasha", 212, 555_7898);
        phoneBook[4] = new Friend("Tabitha", 212, 555_6710);


        // for(int index = 0; index < friends.length; index++) {
        //     Friend friend = phonebook[index];
        //     if( friend != null) {
        //         System.out.println("Friend " + index + "-> " + friend);
        //     }
        // }


        // Friend friend2 = phoneBook[1];
        // friend2.changeName("Alejandro");
        // System.out.println(friend2);
        
    }
}