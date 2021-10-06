package com.casestudymd4.service.friend;

import com.casestudymd4.model.Friend;
import com.casestudymd4.repository.IFriendRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ServiceFriend implements IServiceFriend{
    @Autowired
    private IFriendRepo friendRepo;
    @Override
    public Iterable<Friend> findAll() {
        return friendRepo.findAll();
    }

    @Override
    public Optional<Friend> findById(Long id) {
        return friendRepo.findById(id);
    }

    @Override
    public void save(Friend friend) {
        friendRepo.save(friend);
    }

    @Override
    public void remove(Long id) {
        friendRepo.deleteById(id);
    }
}
