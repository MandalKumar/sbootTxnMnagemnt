package com.example_Transaction.repository;

import com.example_Transaction.entity.PassangerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassangerInfoRepository  extends JpaRepository<PassangerInfo ,Long > {
}
