package com.superthis_animal;

public class Animal {
	int cat=10;
	public void eat(){
		System.out.println("cat="+cat);
		System.out.println("eating...");
	}
	public void eat(String msg){
		int cat=30;
		System.out.println("cat="+cat);
		System.out.println("eating..."+msg);
		this.eat(10);
	
	}
	public void eat(long l){
		System.out.println("cat="+cat);
		System.out.println("eating...value:"+l);
	
	}

}
