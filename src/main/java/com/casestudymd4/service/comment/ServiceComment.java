package com.casestudymd4.service.comment;

import com.casestudymd4.model.Comment;
import com.casestudymd4.repository.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ServiceComment implements IServiceComment{
    @Autowired
    private ICommentRepo commentRepo;
    @Override
    public Iterable<Comment> findAll() {
        return commentRepo.findAll();
    }

    @Override
    public Optional<Comment> findById(Long id) {
        return commentRepo.findById(id);
    }

    @Override
    public void save(Comment comment) {
        commentRepo.save(comment);
    }

    @Override
    public void remove(Long id) {
        commentRepo.deleteById(id);
    }
}
