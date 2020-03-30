package hu.elte.CataflixBackEnd;

import hu.elte.CataflixBackEnd.controllers.AuthController;
import hu.elte.CataflixBackEnd.controllers.UserController;
import hu.elte.CataflixBackEnd.entities.UserEntity;
import hu.elte.CataflixBackEnd.payload.request.SignupRequest;
import hu.elte.CataflixBackEnd.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CataflixBackEndApplicationTests {


	@Autowired
	private UserController userController;

	@Autowired
	UserRepository userRepository;

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	void contextLoads() {
		assertThat(userController).isNotNull();
	}

	@Test
	void userAdded() {
		assertThat(this.testRestTemplate.getForObject("http://localhost:8080", String.class).contains("Hello"));
	}


}
