package com.example.ashwani.request;

import com.example.ashwani.entity.Tag;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

public class PostsRequest {


    @NotBlank(message = "should not be blank")
    @NotNull(message = "should not be NULL")
    private String post_name;

    @NotBlank(message = "should not be blank")
    @NotNull(message = "should not be NULL")
    private String post_title;

    @NotBlank(message = "should not be blank")
    @NotNull(message = "should not be NULL")
    private  Set<Tag> tags;

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTag_id(Set<Tag> tag_id) {
        this.tags = tag_id;
    }
}
