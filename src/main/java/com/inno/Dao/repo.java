package com.inno.Dao;






import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inno.model.Employee;
@Repository
public interface repo extends JpaRepository<Employee,Integer> {
 
}
