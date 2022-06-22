package com.example.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.mysql.model.Blog;
import java.util.List;

@Repository
public interface BlogRespository extends JpaRepository<Blog, Integer> {


}