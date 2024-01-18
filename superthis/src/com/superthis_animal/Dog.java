package com.superthis_animal;

public class Dog extends Animal {
	public void eat(){
		System.out.println("cat="+super.cat);
		System.out.println("eating bread...");
	}
	public void bark(){
		System.out.println("barking...");
	}
	public void work(){
		super.eat("Mango");
		eat();
		bark();
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.work();
	}

}
