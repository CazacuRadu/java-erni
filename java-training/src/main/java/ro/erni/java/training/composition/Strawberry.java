package ro.erni.java.training.composition;

public class Strawberry extends Fruit {
	
	private String hello1;
	private String hello2;
	
	Strawberry(){
		
	}
	
	public Strawberry(String m){
		this.hello1 = m;
	}
	
	public Strawberry(String m, String n){
		this.hello1 = m;
		this.hello2 = n;
		
	}
	
	@Override
	public void grow(){
		System.out.println("The Strawberry is growing");
	}
	
	public String concatenate(){
		
		return hello1 + hello2;
	}
}
