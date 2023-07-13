package com.elk.main.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.elk.main.data.LoremData;

public interface LoremDataRepository extends ElasticsearchRepository<LoremData, String> {
}
