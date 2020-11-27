/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author shaheerimran
 */
public class Game {

    public static void main(String[] args) {
        System.out.println("You drive up to the university.");
        System.out.println("'First day of school, nothing to worry about', you think to yourself.");
        System.out.println("You walk up to the school, you don't see any other students.");
        System.out.println("'Why is there no one here, it is nearly 8 a.m.', yoou think to yourself.");
        System.out.println("Just as you enter in, you hear a shreik and a girl running from down the hall.");
        System.out.println("You ask the girl,'What's happening'.");
        System.out.println("'There's an outbreak at the school. It spread through the ramen that the students ate. It makes them act like monsters.', she says.");
        System.out.println("'One of them is after us right now.', the girl says");
        System.out.println("You spot a student, a boy no older than 20, down the hall, he acts weird walking on all fours and constantly yelling annoying outdated memes.");
        System.out.println("The infected boy spots you and the girl, he charges at you both while Rick Rolling you.");
        System.out.println("You both run down the other side of the hall.");
        System.out.println("You are at a crossroads, going to the left leads to the biology class, going to the run runs to your class, computer science.");
        System.out.println("If you go to the biology class, you can learn more about the sickness, giving you a greater chance of survival");
        System.out.println("If you go to the right, you can make it to your class on time and avoid an angry teacher");
        System.out.println("You only have a couple seconds to decide(Type '0' to go left and type '1' to go right)");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        if(answer == "0"){
            System.out.println("You yell, 'Left', and you both drift into the left hall going towards the biology class");
            System.out.println("You both make it to class and then everything goes dark for you");
            System.out.println("You wake up in your bed and realize that you are still in highschool.");
        }
        else{
            System.out.println("You yell, 'Right', and you both drift into the right hall going towards the computer science class");
            System.out.println("You both make it to class and then everything goes dark for you");
            System.out.println("You wake up in your bed and realize that you are still in highschool.");
        }
    }

}
