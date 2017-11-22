package com.example.demo.repository;



import com.example.demo.model.Skills;
import org.springframework.data.repository.CrudRepository;

public interface SkillsRepostory extends CrudRepository<Skills,Long> {
}