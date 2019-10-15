import java.util.*;
public class TheGuessingGame{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		GuessGame game=new GuessGame();
		char ch='y';
		while(ch=='y'||ch=='Y'){
			game.startGame();
			if(!game.foundWinner){
				System.out.println("No one won, Better luck next time :)");
			}
			System.out.println("Wanna, Play Again??(y/n)");
			ch=scan.next().charAt(0);
		}
	}
}
class Player{
	int number=0;
	Scanner scan=new Scanner(System.in);
	public int guess(){
		System.out.print("Make your guess(1-20): ");
		number=scan.nextInt();
		return number;
	}
}
class GuessGame{
	Player player1=new Player();
	Player player2=new Player();
	Player player3=new Player();
	boolean foundWinner=false;
	public void startGame(){
		int num=(int)(Math.random()*20)+1;
		System.out.print("Player1 - ");
		int num1=player1.guess();
		System.out.print("Player2 - ");
		int num2=player2.guess();
		System.out.print("Player3 - ");
		int num3=player3.guess();
		if(num1==num){
			System.out.println("Player1 won!!");
			foundWinner=true;
		}else if(num2==num){
			System.out.println("Player2 won!!");
			foundWinner=true;
		}else if(num3==num){
			System.out.println("Player3 won!!");
			foundWinner=true;
		}
	}
}
