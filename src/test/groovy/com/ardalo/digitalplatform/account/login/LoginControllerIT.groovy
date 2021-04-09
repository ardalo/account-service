package com.ardalo.digitalplatform.account.login

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import spock.lang.Specification

@SpringBootTest
@AutoConfigureMockMvc
class LoginControllerIT extends Specification {

  @Autowired
  MockMvc mockMvc

  def "should provide login page"() {
    when:
    def result = mockMvc.perform(MockMvcRequestBuilders.get("/api/pages/login")).andReturn()

    then:
    result.response.status == 200
    result.response.contentAsString.contains("<h1>Login</h1>")
  }
}
