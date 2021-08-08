package com.example.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {

	}
	@Test
	public void testfuc(){
		Album newTest= new Album("Hello from the other side","Aseel",4,120,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbTfqcPQVYpS7wb-uCEzjMx_kMBMZ-dNWekg&usqp=CAU");
		assertEquals("Hello from the other side",newTest.getTitle());
		newTest.setTitle("set titel");
		//assertEquals("Hello from the other side",newTest.getTitle());
	}

}
