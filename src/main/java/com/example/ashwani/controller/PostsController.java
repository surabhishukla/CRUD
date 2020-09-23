package com.example.ashwani.controller;

import com.example.ashwani.dto.PostsDto;
import com.example.ashwani.entity.Posts;
import com.example.ashwani.request.PostsRequest;
import com.example.ashwani.service.PostsService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostsController {

    @Autowired
    private PostsService postsService;

    @RequestMapping(method = RequestMethod.POST)
    public void createPosts(@Valid @RequestBody PostsRequest postsRequest) {
        postsService.savePosts(postsRequest);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public void deletePosts(@PathVariable String id) {
        postsService.deletePosts(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = "application/json")
    public void updatePosts(@PathVariable(name = "id") String id,@Valid @RequestBody Posts posts) {
        Session session=null;
        posts.setPost_id(id);
         postsService.updatePosts(id,posts,session);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public PostsDto getPostById(@PathVariable String id) {
        Session session=null;
        return postsService.getPostById(id,session);
    }

}
