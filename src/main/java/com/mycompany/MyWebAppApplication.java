package com.mycompany;

import com.mycompany.user.User;
import com.mycompany.user.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyWebAppApplication.class, args);
    }



//    private static final Logger log = LoggerFactory.getLogger(MyWebAppApplication.class);


//    @Bean
//    public CommandLineRunner User(UserRepository repository) {
//        return (args) -> {
////                 save a few customers
//                repository.save(new User("jk@gmail.com", "Jack", "Bauer", "babyjack", 1));
//
//                // fetch all users
//                log.info("Customers found with findAll():");
//                log.info("-------------------------------");
//                for (User user : repository.findAll()) {
//                    log.info(user.toString());
//                }
//                log.info("");
//
//                // fetch an individual customer by ID
//                User user = repository.findById(1L);
//                log.info("Customer found with findById(1L):");
//                log.info("--------------------------------");
//                log.info(user.toString());
//                log.info("");
//
//                // fetch customers by last name
//                log.info("Customer found with findByLastName('Bauer'):");
//                log.info("--------------------------------------------");
//                repository.findByLastName("Bauer").forEach(bauer -> {
//                    log.info(bauer.toString());
//                });
//                // for (Customer bauer : repository.findByLastName("Bauer")) {
//                //  log.info(bauer.toString());
//                // }
//                log.info("");
//            };
//        }
//
//    }

}
