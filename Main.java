import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println((int)(Math.random()*10+1));
    System.out.println((int)(Math.random()*3+19));
    int n=(int)(Math.random()*26+97);
    char letter=(char)(n);
    System.out.println(letter);
    String name="Ryan";
    System.out.println(name.charAt(0));

    //Random Letter Guesser
    //make a random letter
      //loop
      // allow us to guess
      //say right or wrong
    //It took you ___ amout of tries
    int b=1;
    Scanner in=new Scanner(System.in);

    System.out.print("Guess a random letter ");
    //print
    //variable=in.nextLine();
    String RLG=in.nextLine();
    char GLR=RLG.charAt(0);
    while (GLR!=letter)
    {
      System.out.print("Sorry, try again. ");
      RLG=in.nextLine();
      GLR=RLG.charAt(0);
      b+=1;
    }
    System.out.print("You Won!!!");
    System.out.print("You took "+b+" amount of tries.");
  }
}