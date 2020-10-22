package dev.romero.main;

public class Main {

	public static void main(String[] args) {
		
		Ball myBall= new Ball();
		
		myBall.capacity = 10;
		
		BasketBall BasketBall = new BasketBall();
		Baseball baseBball = new Baseball();
		
		BasketBall.color="Blue";
		BasketBall.name="BasketBall";
		BasketBall.isNBA="true";
		BasketBall.capacity="23";
		
		Baseball.color="Brown";
		BasketBall.name="Baseball";
		
		
		BasketBall.bounce();
		Baseball.isNBA();
		
		System.out.println(myBall.capacity);
	}
}
