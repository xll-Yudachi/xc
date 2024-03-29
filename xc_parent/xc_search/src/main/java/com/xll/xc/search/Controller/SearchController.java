package com.xll.xc.search.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xll.xc.search.Pojo.Item;
import com.xll.xc.search.Service.SearchService;

import entity.PageResult;
import entity.Result;
import entity.StatusCode;

@RestController
@CrossOrigin
@RequestMapping("/search")
public class SearchController {
	@Autowired
	private SearchService searchService;
	
	@PostMapping
	public Result save(@RequestBody Item item) {
		searchService.save(item);
		return new Result(true,StatusCode.OK,"添加成功");
	}
	
	@RequestMapping("/{key}/{page}/{size}")
	public Result findByKey(@PathVariable String key,@PathVariable int page, @PathVariable int size) {
		 Page<Item> pageData = searchService.findByKey(key,page,size);
		 return new Result(true,StatusCode.OK,"查询成功",new PageResult<>(pageData.getTotalElements(), pageData.getContent()));
	}
}
