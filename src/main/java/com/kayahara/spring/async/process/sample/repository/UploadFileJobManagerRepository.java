package com.kayahara.spring.async.process.sample.repository;

import com.kayahara.spring.async.process.sample.entity.UploadFileJobManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UploadFileJobManagerRepository extends JpaRepository<UploadFileJobManager, Integer> {
}
