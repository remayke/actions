package br.com.group.artifact;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@WebMvcTest
class NameApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testPassando() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Hello world")));
	}

	// @Test
	// void testFalhando() throws Exception {
	// 	mockMvc.perform(MockMvcRequestBuilders.get("/paginaInexistetne"))
	// 			.andExpect(MockMvcResultMatchers.status().isOk())
	// 			.andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Hello world")));
	// }

}
