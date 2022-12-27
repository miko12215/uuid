package com.uuid.uuid;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("test")
@SpringBootTest
class UuidApplicationTests {

	@Test
	void contextLoads() {


		assertEquals(1, 2);


	}

	@Test
	void contextLoad2s() {
		System.out.println(1);

	}

	@Test
	void someTest(){
		System.out.println(2);



	}

}
