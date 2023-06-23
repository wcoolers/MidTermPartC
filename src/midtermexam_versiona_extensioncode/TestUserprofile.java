/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author HP
 */

/*
Create a class called TestUserprofile with main method  
where a user wants to create a new profile. 
The user will enter their name 
and choose their favourite Genre from a displayed list of the possible Genres. 
The user will then see a message that their userProfile was created. 

Now in YOUR git hub account, create a public  
repository "MidTermPartC" .  now initialize git , 
commit and push to remote repository.
*/
public class TestUserprofile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your userID: ");
        String userID = input.next();
        
        System.out.print("Please state your genre: \n Options: \n\t {\"Comedy\", \"Drama\", \"Action\", \"Mystery\"}");
        String userGenre = input.next();
        
        UserProfile user1 = new UserProfile(userID, userGenre);
        
        System.out.println("Congrats, your user profile: userId - " + 
                user1.getUserID() + ", genre - " + user1.getGenre() +
                ", has been created");
    }
    
}
