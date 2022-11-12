package com.cybersoft.StudentController;


import com.cybersoft.StudentController.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class GetStudent {
    @Bean
    public ArrayList<Student> getStudent() {

        return new ArrayList<Student>();
    }
}
