package oops;

class Cat{
	String name,breed;
	
	public void eating(){
		System.out.println("Cat "+name+" is eating ");
	}
	
}

class Dog{
	String name , breed ;
	public void running() {
		System.out.println("Dog "+name+" is running ");
	}
	
	
}


public class ManinClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1=new Cat();
		Cat cat2 = new Cat();
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		cat1.name= "Cat1";
		cat2.name = "Cat2";
		dog1.name= "Dog 1";
		dog2.name = "Dog 2";
		cat1.eating();
		cat2.eating();
		dog1.running();
		dog2.running();
	}

}
