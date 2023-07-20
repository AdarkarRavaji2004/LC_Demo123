package com.example.LC_Demo.Repository;

import com.example.LC_Demo.Entity.Admission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmissionRepo extends JpaRepository<Admission,Integer>
{
}
