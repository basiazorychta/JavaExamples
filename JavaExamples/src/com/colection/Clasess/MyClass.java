package com.colection.Clasess;


public class MyClass {
	
	
	public static void main(String[] args) {

		Student person1 = new Student("Affaf", 1111, 17,  "Pakistan");

		/*
		person1.setName("Affaf");		
		person1.setId(1111);
		person1.setAge(17);
		person1.setAddress("Pakistan");
		*/
		String intro = person1.speak();

		person1.calculateYearsToRetirement();

		//System.out.println(intro);

		Student person2 = new Student("Asif", 2222, 40, "Sweden");

		/*
		person2.setName("Asif");
		person2.setId(2222);
		person2.setAge(40);
		person2.setAddress("Sweden");
		*/
		intro = person2.speak();

		/*System.out.println(intro);

		person1.setAge(29);
		intro = person1.speak();
		System.out.println(intro);

		person2.setId(6666);
		intro = person2.speak();
		System.out.println(intro);
		*/
		
		Car car1 = new Car ("Renault", "red", 2002, 5, 210, 15000);
		
		/*car1.setType("Renault");
		car1.setColor("red");
		car1.setModel(2002);
		car1.setNumbersDoors(5);
		car1.setMaxSpeed(210);
		car1.setCost(15000);
		*/
		
		
		/*String description = car1.info();
		System.out.println(description);
		
		car1.setCost(12000);
		description = car1.info();
		System.out.println(description);
		*/
		
		Person person = new Person ("Basia", "Khan", "0798987865", "Tuna", 87678956, 38, 62.5, 170.0);
		
		/* String introduction = person.info();
		System.out.println(introduction);
		
		person.setWeight(61.8);
		introduction = person.info();
		System.out.println(introduction);
		*/
		
		Book book1 = new Book ();
		
		book1.setName("Princess of Ice");
		book1.setAuthor("Camila Lackberg");
		book1.setNumbersPages(360);
		
		/*String info = book1.info();
		System.out.println(info);
		*/
		
		Cat pet1 = new Cat ();
		
		pet1.setPetName("Kity");
		pet1.setPetColor("black");
		pet1.setPetAge(2);
		
		//pet1.speak();
		
		Lynx wildAnimal = new Lynx ();
		
		wildAnimal.setPetName("Hijinx");
		wildAnimal.setPetAge(5);
		wildAnimal.setSizeOfEar(5.3);
		
		//wildAnimal.growl();
		
		Cat stray = new Lynx ();
		
		stray.setPetName("Strayname");
		stray.setPetColor("brown");
		
		//stray.speak();
		
		
		Insect insect = new Insect (2, 6);
		Spider spider = new Spider (13, 8, true);
		Cricket cricket = new Cricket (5, 6, 1.25);
		
		
		/*insect.says ();
		insect.crawl ();
		
		
		spider.says();
		
		
		cricket.says();
		cricket.jump();
		cricket.crawl();
		
		if (spider instanceof Insect && spider instanceof Spider) {
			System.out.println("Spider is an Insect and a spider");
		}
		*/
	
	}
	
}
