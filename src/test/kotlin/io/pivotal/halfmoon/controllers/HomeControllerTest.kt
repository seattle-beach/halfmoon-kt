package io.pivotal.halfmoon.controllers

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.view
import org.springframework.test.web.servlet.setup.MockMvcBuilders

@RunWith(SpringRunner::class)
@SpringBootTest
class HomeControllerTest {
    lateinit var mockMvc: MockMvc

    @Autowired
    lateinit var subject: HomeController

    @Before
    fun setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(subject).build()
    }

    @Test
    fun index() {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk)
                .andExpect(view().name("index"))
    }
}