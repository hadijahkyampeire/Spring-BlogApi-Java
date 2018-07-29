package com.andelaUg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.PathVariable;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BlogControllerTests {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void getIndex() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/blog").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
//    @Test
//    public void getShow(@PathVariable String id) throws Exception{
//        mockMvc.perform(MockMvcRequestBuilders.get("/blog/{id}").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//    }

}
