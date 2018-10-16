package org.eviac.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.eviac.blog.SpringbootWebappApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootWebappApplication.class)
@WebAppConfiguration
public class SpringbootWebappApplicationTests {

	@Test
	public void contextLoads() {
	}

}
