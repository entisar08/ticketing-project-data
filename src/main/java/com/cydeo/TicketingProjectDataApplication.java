package com.cydeo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TicketingProjectDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketingProjectDataApplication.class, args);
    }



    @Bean
        public ModelMapper mapper(){
        return new ModelMapper();
        }


    //I am trying to add bean in the container thru @Bean annotation
    /*1 Create class annotated by @Configuration
    * 2. write a method wich return the objject that you trying to add to the container
    * 3. annotate this method with @Bean*/



}
