import java.io.*;
import java.util.*;

class gamerockpaper {
     public static void main(String[] args) throws IOException {
          int yourwin = 0;
          int botwin = 0;
          int matchtie = 0;
          System.out.println("GAME DEVELOPED BY RITURAJ");
          System.out.println("============================================================================");
          Scanner ritu = new Scanner(System.in);
          for (int i = 1; i > 0; i++)// infinite loop for infinite play
          {
               System.out.println("Enter rock,paper or scissor else type Exit if you want to quit");
               String your_play = csc.nextLine().toLowerCase();// lol we can save memory by inputing lower case in same
                                                               // line
               String bot_play = " ";
               int bot_choice = (int) (Math.random() * 1000);// randomly generating the numbers 1,2,3
               if (bot_choice < 400) {
                    bot_play = "rock";
               }
               if (bot_choice >= 400 && bot_choice < 800) {
                    bot_play = "paper";
               }
               if (bot_choice >= 800) {
                    bot_play = "scissor";
               }
               /* FROM HERE THE MAIN COMPARISION OF THE PROGRAM BEGINS!! */
               System.out.println(bot_choice);
               if (your_play.equals("exit")) {
                    System.out.println("Exiting the game....");
                    System.out.println("HERE IS THE POINT TABLE OF GAME:");
                    System.out.println("============================================================================");
                    System.out.println("Your wins" + "\t" + "Your Loses" + "\t" + "Tie Conditions");
                    System.out.println("    " + yourwin + "               " + botwin + "               " + matchtie);
                    if (yourwin > botwin) {
                         System.out.println(
                                   "============================================================================");
                         System.out.println("FINAL RESULT-------------You Won!------------------");
                    }
                    if (yourwin < botwin) {
                         System.out.println(
                                   "============================================================================");
                         System.out.println("FINAL RESULT-------------You Lost!------------------");
                    }
                    if (yourwin == botwin) {
                         System.out.println(
                                   "============================================================================");
                         System.out.println("FINAL RESULT-------------Match Tie!------------------");
                    }
                    System.exit(0);
               }
               if (!your_play.equals("rock") && !your_play.equals("paper") && !your_play.equals("scissor")) {
                    System.out.println("Sorry,you just typed wrong choice");
                    continue;
               }
               if (your_play.equals("rock") || your_play.equals("paper") || your_play.equals("scissor")) {
                    System.out.println("Your's Play" + "     " + "Bot's Play");
                    System.out.println("   " + your_play + "           " + bot_play);
               }
               if (your_play.equals("rock") && bot_play.equals("scissor")
                         || your_play.equals("paper") && bot_play.equals("rock")
                         || your_play.equals("scissor") && bot_play.equals("paper")) {
                    System.out.println("----------You won!----------");
                    System.out.println("============================================================================");
                    ++yourwin;
               }
               if (your_play.equals(bot_play)) {
                    System.out.println("----------Match tie!----------");
                    System.out.println("============================================================================");
                    ++matchtie;
               }
               if (your_play.equals("rock") && bot_play.equals("paper")
                         || your_play.equals("scissor") && bot_play.equals("rock")
                         || your_play.equals("paper") && bot_play.equals("scissor")) {
                    System.out.println("----------You lost!----------");
                    System.out.println("============================================================================");
                    ++botwin;
               }
          }
          ritu.close();
     }
}
