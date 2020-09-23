package com.example.ashwani.service;

import com.example.ashwani.dao.PostsDao;
import com.example.ashwani.dao.TagDao;
import com.example.ashwani.dto.PostsDto;
import com.example.ashwani.entity.Posts;
import com.example.ashwani.entity.Tag;
import com.example.ashwani.request.PostsRequest;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PostsService {

    @Autowired
    private PostsDao postsDao;

    public void savePosts(PostsRequest postsRequest) {
        Posts posts=new Posts();
        posts.setPost_name(postsRequest.getPost_name());
        posts.setPost_title(postsRequest.getPost_title());
        posts.setTags(postsRequest.getTags());
        postsDao.addPosts(posts);
    }

    public PostsDto getPostById(String id,Session session ) {
        Posts posts= postsDao.getPostsById(id,session);
        return PostsDto.generateFrom(posts);
    }

    public void deletePosts(String id) {
        postsDao.deletePosts(id);
    }

    public void updatePosts(String id, Posts posts, Session session) {
        postsDao.getPostsById(id,session);
        postsDao.updatePosts(id,posts);
    }


}
