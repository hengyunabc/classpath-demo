package com.example.democlasspath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoClasspathApplicationTests {

	@Test
	public void contextLoads() throws IOException {
		System.in.read();
	}

}
