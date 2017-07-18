/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callbacks;

/**
 *
 * @author User
 */
public class Student implements GameStudentContaract{
    StudentGameContract myGame;

    public Student(StudentGameContract myGame) {
        this.myGame = myGame;
    }
    
    private void won(){
        System.out.println("I won");
    }
    private void lost()
    {System.out.println("I lost");
     
    }
    

    @Override
    public void itwon() {
        won();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itloose() {
        lost();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void printGender( )
    {
       myGame.provideGender(new IGender() {
           @Override
           public void male(String male) {
               System.out.println("I am Male"+ male);      }

           @Override
           public void female(String female) {
               System.out.println("I am Female"+ female);
           }
       });
    }
   
}
