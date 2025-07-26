   package com.example.demo.repositories;

   import com.example.demo.entities.Role;
   import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

   @Repository
   public interface Rolerepository extends JpaRepository<Role, Integer> {
       // Additional query methods can be defined here if needed
   }
   

