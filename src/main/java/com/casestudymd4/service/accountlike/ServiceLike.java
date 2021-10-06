package com.casestudymd4.service.accountlike;

import com.casestudymd4.model.AccountLike;
import com.casestudymd4.repository.ILikeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ServiceLike implements IServiceLike{
    @Autowired
    private ILikeRepo likeRepo;
    @Override
    public Iterable<AccountLike> findAll() {
        return likeRepo.findAll();
    }

    @Override
    public Optional<AccountLike> findById(Long id) {
        return likeRepo.findById(id);
    }

    @Override
    public void save(AccountLike accountLike) {
        likeRepo.save(accountLike);
    }

    @Override
    public void remove(Long id) {
        likeRepo.deleteById(id);
    }
}
