package com.casestudy2.blog.service;

import com.casestudy2.blog.model.blogs;
import com.casestudy2.blog.repository.blogRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class blogService {
    @Autowired
    blogRepository BlogRepository;

    public List<blogs> allBlogs(){ return BlogRepository.findAll();}
    public blogs addOneBlog(blogs blog){
        return BlogRepository.save(blog);
    }
    public Optional<blogs> getBlog(Long id)
    {
        return BlogRepository.findById(id);
    }
    public List<blogs> deleteBlog(Long id) {
        BlogRepository.deleteById(id);
        return BlogRepository.findAll();
    }
}
