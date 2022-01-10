
import java.util.*;

public class Main {

	public static void main(String[] args) {
	  Scanner cin=new Scanner(System.in);
		  
		  
		  Random random=new Random();
		  
		  System.out.println("welcome to game of (Find The Hidden Number ) !");
		  System.out.print("please enter your name: ");
		  String name=cin.nextLine();
		  
		  
		  System.out.println("Hello "+name+"\nyou want play wich type of this game? ");
		  
		  System.out.println("\t1-Easy\n\t2-Medium\n\t3-Hard");
		  
		  System.out.println();
		  
		  System.out.print("please choose one of them: ");
		  int choice=cin.nextInt();
		  
		  int round=1;
		  boolean m=true;

		  if(choice==1) {
			  
			 int game=random.nextInt(15)+1;
			  System.out.println();
			  System.out.println("your game is Easy and the number between 1 to 15 ");
			  System.out.println("be careful you only have 5 rounds! ");
			  do {
				  System.out.println();
				  if(round==6)
					  break;
				  
			  System.out.print("round "+round+", please enter a number: ");
			  int n=cin.nextInt();
			  
			  if(n>=1&&n<=15) {
			  if(n<game) {
				  
				  if(round<5) {
				  System.out.println("Enter higher ! ");
				  m=false; }
				  
				  else 
					  System.out.println("you lose ! the number was "+game);
				  
			  }
			  
			  else if(n>game) {
				  if(round<5) {
				  System.out.println("Enter Lower! ");
				  m=false; }
				  else
				  System.out.println("you lose ! the number was "+game);
				  
				  
			  }
			  
			  else {
				  
				  System.out.println("Congratulations you finded in   "+round+" round!");
				  m=true;
			  }
			  
			  round++;
			 
			  
			  }
			  
			  else {
				  
				  System.out.println("i said between 1 to 15 ! ");
				  m=false;
			  }
			  
				  
			  
			  }while(m==false);
			  
		  }
		  
		  
		  else if(choice==2) {
			  int game=random.nextInt(25)+1;
			
			  System.out.println();
			  System.out.println("your game is Medium and the number between 1 to 25 ");
			  System.out.println("be careful you only have 5 rounds! ");
			  do {
				  System.out.println();
				  if(round==6)
					  break;
				  
			  System.out.print("round "+round+", please enter a number: ");
			  int n=cin.nextInt();
			  if(n>=1&&n<=25) {
			  if(n<game) {
				  
				  if(round<5) {
				  System.out.println("Enter higher ! ");
				  m=false; }
				  
				  else 
					  System.out.println("you lose ! the number was "+game);
				  
			  }
			  
			  else if(n>game) {
				  if(round<5) {
				  System.out.println("Enter Lower ! ");
				  m=false; }
				  else
				  System.out.println("you lose ! the number was  "+game);
				  
				  
			  }
			  
			  else {
				  
				  System.out.println("Congratulations you finded in   "+round+" round!");
				  m=true;
			  }
			  
			  round++;
			  
			  
			  }
			  
                   else {
				  
				  System.out.println("i said between 1 to 25 ! ");
				  m=false;
			  }
				  
			  
			  }while(m==false);
			  
			  
			  
		  }
		  
		  
		  else if(choice==3) {
			  
			  int game=random.nextInt(35)+1;
			
			  System.out.println();
			  System.out.println("your game is Hard and the number between 1 to 35 ");
			  System.out.println("be careful you only have 5 rounds! ");
			  do {
				  System.out.println();
				  if(round==6)
					  break;
				  
				  
					  
						  
			  System.out.print("round "+round+", please enter a number: ");
			  int n=cin.nextInt();
			  if(n>=1&&n<=35) {
			  if(n<game) {
				  
				  if(round<5) {
				  System.out.println("Enter higher ! ");
				  m=false; }
				  
				  else 
					  System.out.println("you lose ! the number was "+game);
				  
			  }
			  
			  else if(n>game) {
				  if(round<5) {
				  System.out.println("Enter lower ! ");
				  m=false; }
				  else
				  System.out.println("you lose ! the number was  "+game);
				  
				  
			  }
			  
			  else {
				  
				  System.out.println("Congratulations you finded in   "+round+" round!");
				  m=true;
			  }
			  
			  round++;
			  
			  }
                  else {
				  
				  System.out.println("i said between 1 to 35 ! ");
				  m=false;
			  }
			  
				  
			  
			  }while(m==false);
			  
			  
			  
			  
		  }
		  
		  
		  System.out.println("END");
		  
		  
		  
		  

	}
	


}

	
