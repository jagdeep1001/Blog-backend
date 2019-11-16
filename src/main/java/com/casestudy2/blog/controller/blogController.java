package com.casestudy2.blog.controller;

import com.casestudy2.blog.model.blogs;
import com.casestudy2.blog.service.blogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
public class blogController {
    @Autowired
    blogService BlogService;
    @GetMapping(value="/blogs")
    public List<blogs> allBlogs(){
        return BlogService.allBlogs();
    }
    @PostMapping(value="/addBlog")
//    @ResponseBody
    public blogs addBlog(@RequestBody blogs blog){

        System.out.println(BlogService.addOneBlog(blog));
        return BlogService.addOneBlog(blog);
    }
    @GetMapping(value="/blog-details/{id}")
    public Optional<blogs> getBlog(@PathVariable("id") Long id) {
        return BlogService.getBlog(id);
    }
    @GetMapping(value="blog/{id}/delete")
    public List<blogs> deleteProduct(@PathVariable("id") Long id)
    {
        return BlogService.deleteBlog(id);
    }

}
