package com.casestudymd4.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private String privacy;
    private Date timePost;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post", fetch = FetchType.EAGER)
    private List<Image> images = new ArrayList<>();

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "post", fetch = FetchType.EAGER)
    private List<AccountLike> likeList = new ArrayList<>();

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "post", fetch = FetchType.EAGER)
    private List<Comment> commentList = new ArrayList<>();
    @ManyToOne
    private Account account;

    public Post() {
    }

    public Post(Long id, String content, String privacy, Date timePost, List<Image> images,
                List<AccountLike> likeList, List<Comment> commentList, Account account) {
        this.id = id;
        this.content = content;
        this.privacy = privacy;
        this.timePost = timePost;
        this.images = images;
        this.likeList = likeList;
        this.commentList = commentList;
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public Date getTimePost() {
        return timePost;
    }

    public void setTimePost(Date timePost) {
        this.timePost = timePost;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<AccountLike> getLikeList() {
        return likeList;
    }

    public void setLikeList(List<AccountLike> likeList) {
        this.likeList = likeList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
