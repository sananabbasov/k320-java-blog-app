package az.edu.compar.services;

import az.edu.compar.dtos.BlogHomeDto;

import java.util.List;

public interface BlogService {
    List<BlogHomeDto> getHomeBlogs();
}
