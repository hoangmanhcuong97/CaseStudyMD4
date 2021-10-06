package com.casestudymd4.service.image;

import com.casestudymd4.model.Image;
import com.casestudymd4.repository.IImageRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ServiceImage implements IServiceImage{
    @Autowired
    private IImageRepo iImageRepo;
    @Override
    public Iterable<Image> findAll() {
        return iImageRepo.findAll();
    }

    @Override
    public Optional<Image> findById(Long id) {
        return iImageRepo.findById(id);
    }

    @Override
    public void save(Image image) {
        iImageRepo.save(image);
    }

    @Override
    public void remove(Long id) {
        iImageRepo.deleteById(id);
    }
}
