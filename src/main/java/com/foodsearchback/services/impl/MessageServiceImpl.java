package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsMessage;
import com.foodsearchback.repository.MessageRepository;
import com.foodsearchback.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageRepository messageRepository;

    @Override
    public void add(FsMessage type) {
        messageRepository.save(type);
    }

    @Override
    public void delete(FsMessage type) {
        messageRepository.delete(type);
    }

    @Override
    public void update(FsMessage type) {
        messageRepository.save(type);
    }

    @Override
    public List<FsMessage> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public FsMessage findById(long id) {
        return messageRepository.findById(id).get();
    }
}
