package org.example.cicd250426.domain.User.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void homeEndpoint_ReturnsHelloMessage() throws Exception {
        mockMvc.perform(get("/"))  // 🔥 루트 경로 호출
                .andExpect(status().isOk())  // 상태 코드 200 OK 확인
                .andExpect(content().string("Hello from UserControllerqwe!"));  // 응답 메시지 확인
    }
}
