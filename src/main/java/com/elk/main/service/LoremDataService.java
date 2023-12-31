package com.elk.main.service;
import org.springframework.stereotype.Service;

import com.elk.main.data.LoremData;
import com.elk.main.repo.LoremDataRepository;

@Service
public class LoremDataService {

    private final LoremDataRepository loremDataRepository;

    public LoremDataService(LoremDataRepository loremDataRepository) {
        this.loremDataRepository = loremDataRepository;
    }

    public void pushLoremData(String text) {
        LoremData loremData = new LoremData();
        loremData.setText(text);
        loremDataRepository.save(loremData);
    }
}