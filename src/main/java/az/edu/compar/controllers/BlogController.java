package az.edu.compar.controllers;


import az.edu.compar.dtos.BlogFeaturedDto;
import az.edu.compar.dtos.BlogHomeDto;
import az.edu.compar.services.BlogService;
import az.edu.compar.services.impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/home")
    public ResponseEntity<List<BlogHomeDto>> getAll()
    {
        List<BlogHomeDto> result = blogService.getHomeBlogs();
        return new ResponseEntity<>(result, HttpStatus.CREATED); // 201
    }

    @GetMapping("/featured")
    public List<BlogFeaturedDto> getAllFeatured()
    {
        return null;
    }
}
