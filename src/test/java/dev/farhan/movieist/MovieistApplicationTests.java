package dev.farhan.movieist;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
		"env.MONGO_DATABASE=moviedb",
		"env.MONGO_CLUSTER=63.179.145.50:27017"
})
class MovieistApplicationTests {

	@Test
	void contextLoads() {
	}

}
