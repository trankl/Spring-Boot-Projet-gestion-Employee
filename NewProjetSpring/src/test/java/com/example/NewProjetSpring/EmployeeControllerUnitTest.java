package com.example.NewProjetSpring;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.NewProjetSpring.Control.EmployeeController;
import com.example.NewProjetSpring.Service.EmployeeService;

@SpringBootTest
@AutoConfigureMockMvc

public class EmployeeControllerUnitTest {

	@Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/employeesList"))
            .andExpect(status().isOk());
        System.out.println("test is good!");
    }
}
