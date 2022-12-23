package io.wisoft.buildimagetutorial

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@WebMvcTest
class BuildImageTutorialApplicationTests {

    @Autowired
    lateinit var client: MockMvc

    @Test
    fun `test hello`() {
        client
            .get("/")
            .andExpect {
                content {
                    string("Hello Docker World")
                }
            }
    }
}
