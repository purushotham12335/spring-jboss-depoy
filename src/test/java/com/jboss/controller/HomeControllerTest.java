package com.jboss.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HomeController.class)
class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetHome() throws Exception {
        mockMvc.perform(get("/api/gethome"))
                .andExpect(status().isOk())
                .andExpect(content().string("Welcome Home"));
    }

    @Test
    void testGetHome1() throws Exception {
        mockMvc.perform(get("/api/gethome1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Welcome Home1"));
    }
}