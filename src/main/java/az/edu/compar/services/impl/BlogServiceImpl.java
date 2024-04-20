package az.edu.compar.services.impl;

import az.edu.compar.dtos.BlogHomeDto;
import az.edu.compar.entities.Blog;
import az.edu.compar.services.BlogService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogServiceImpl implements BlogService {

    List<Blog> blogs = new ArrayList<>();


    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<BlogHomeDto> getHomeBlogs() {
       List<BlogHomeDto> blogHomeDtos = blogs.stream().map(blog-> modelMapper.map(blog,BlogHomeDto.class)).collect(Collectors.toList());
        return blogHomeDtos;
    }
}
