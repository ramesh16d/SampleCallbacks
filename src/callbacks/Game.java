/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callbacks;

import java.util.Random;

/**
 *
 * @author User
 */
public class Game  implements StudentGameContract{
    
    GameStudentContaract student;
    Game (Student student)
    {
     this.student = student;
    }
   public void result()
   {  boolean result;
       Random myRandomNumber = new Random(20L);
       myRandomNumber.nextInt();
       if( myRandomNumber.nextInt()%2 != 0)
       {
         result = true;
         student.itwon();
       } else {
         result = false;
         student.itloose();
        
        }
   
   }

    @Override
    public void provideGender(IGender igender) {
         Random myRandomNumber = new Random(20L);
         myRandomNumber.nextInt();
         
       if( myRandomNumber.nextInt()%2 != 0)
       {
        igender.female("Female");
       } else {    
        igender.male("Male");
        }
    }
    
   
}
