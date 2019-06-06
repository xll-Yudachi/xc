package com.xll.xc.search.Service;

import static org.mockito.Mockito.timeout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.xll.xc.search.Dao.SearchDao;
import com.xll.xc.search.Pojo.Item;

import util.IdWorker;

@Service
public class SearchService {

	@Autowired
	private SearchDao searchDao;
	@Autowired
	private IdWorker idWorker;
	
	public void save(Item item) {
		item.setId(idWorker.nextId());
		searchDao.save(item);
	}
	
	public Page<Item> findByKey(String key,int page,int size){
		Pageable pageable = PageRequest.of(page-1, size);
		return searchDao.findByTitleOrSellerLike(key, key, pageable);
	}
}
