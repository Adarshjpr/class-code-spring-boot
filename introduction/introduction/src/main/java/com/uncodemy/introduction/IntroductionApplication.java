package com.uncodemy.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //root => main class main 
public class IntroductionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IntroductionApplication.class, args);
		System.out.println(" hey i am  static ");
	}

@Autowired
	private Cab cab;

	public IntroductionApplication( Cab cab){
		this.cab = cab;

	}

	

	
	@Override
	public void run(String... args) throws Exception {

	cab.book();
	}




}

// @Beans 


//  PROJECT 

//   PHONE  =>  SOFTWARE  => OLA  APP  =
// > JAVA

//  PHONE 2 => OLA ,UBER 
// SPRING BOOT
// @Autowired // dependency   
// private  Uber obj;	     
	
// 	public IntroductionApplication(Uber obj) {  // dependency  (LOSSEILY  COUPLE   FLEAX ) => ADVANCE JAVA 
// 		this.obj = obj;
// 	}
// // Ola obj = new Ola(); => CORE JAVA  (TIGHT  EASY CHANEG  )


// 	@Override
// 	public void run(String... args) throws Exception {
		
// 		obj.book();

// 	}