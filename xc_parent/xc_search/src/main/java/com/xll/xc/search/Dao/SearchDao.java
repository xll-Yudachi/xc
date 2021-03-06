package com.xll.xc.search.Dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.xll.xc.search.Pojo.Item;

public interface SearchDao extends ElasticsearchRepository<Item, Long>{
	public Page<Item> findByTitleOrSellerLike(String title,String seller,Pageable pageable);
}
