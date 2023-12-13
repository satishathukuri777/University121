/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

// Write your code here
package com.example.university.controller;
import com.example.university.course;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface CourseJpaRepository extends JpaRepository<Course, Long> {
    // Additional methods if needed
}
