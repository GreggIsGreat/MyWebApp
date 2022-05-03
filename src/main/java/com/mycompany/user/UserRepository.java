package com.mycompany.user;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    public  Long countById(Integer id);

    @Query("SELECT u FROM User u WHERE CONCAT(u.firstName, u.lastName) LIKE %?1%")
    public List<User> search(String keyword);

}


