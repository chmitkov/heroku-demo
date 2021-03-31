//package com.ch.demo.repository;
//
//import com.ch.demo.model.UserEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface UserRepository extends JpaRepository<UserEntity, Long> {
//
//    @Query("SELECT u.username FROM UserEntity u ORDER BY u.username")
//    List<String> findAllUsernames();
//}
