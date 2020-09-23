package com.example.ashwani.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

public class TagRequest {

    @NotBlank(message = "should not be blank")
    @NotNull(message = "should not be NULL")
    private String tag_name;
    
    private List<String> tag_id;

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    public List<String> getTag_id() {
        return tag_id;
    }

    public void setTag_id(List<String> tag_id) {
        this.tag_id = tag_id;
    }
}
