package com.ivt.spring.jpa.demo1.repository;

import com.ivt.spring.jpa.demo1.entity.CustomerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {
    List<CustomerEntity> findAll();

    List<CustomerEntity> findByName(String name);

    List<CustomerEntity> findByPhoneOrEmail(String phone, String email);

    @Query("SELECT c FROM customer c WHERE c.id = ?1")
    List<CustomerEntity> findByIdAsList(Integer id);

    @Query("SELECT c FROM customer c WHERE c.sex = 'Male' AND YEAR(CURRENT_DATE) - YEAR(c.birdate) BETWEEN 20 AND 30")
    List<CustomerEntity> findMenAgedBetween20And30();
}
