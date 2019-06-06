package com.xll.xc.sellergoods.Service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.xll.xc.sellergoods.Dao.GoodsDao;
import com.xll.xc.sellergoods.Pojo.Goods;

@Service
@Transactional
public class GoodsService {
	@Autowired
	private GoodsDao goodsDao;
	
	/**
	 * Title : findAllGoods
	 * Description : 查询所有商品
	 * CreateDate : 2019年4月26日 下午11:12:09
	 * Author : Yudachi
	 * @return
	 * List<Goods>
	 * @throws
	 */
	public List<Goods> findAllGoods(){
		return goodsDao.findAll();
	}
	
	/**
	 * Title : findCategory1GoodsByPage
	 * Description : 根据一级分类目录分页查询所有商品(分页条件查询 默认设置为第1页开始 每页4条记录)
	 * CreateDate : 2019年4月26日 下午11:13:46
	 * Author : Yudachi
	 * @param categoryid_1
	 * @param page
	 * @param size
	 * @return
	 * Page<Goods>
	 * @throws
	 */
	public Page<Goods> findCategory1GoodsByPage(Long categoryid_1,int page,int size){
		//封装一个分页对象
        Pageable pageable = PageRequest.of(page-1,size);
        
        return goodsDao.findAll(new Specification<Goods>() {
            /**
             *  root 根对象，也就是要把条件封装到哪个对象中。 where 类名 = label.getId;
             *  criteriaQuery   封装的都是查询关键字  如group by, order by
             *  criteriaBuilder   用来封装条件对象 如果直接返回Null 表示不需要任何条件
             **/
            @Override
            public Predicate toPredicate(Root<Goods> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                //select * from tb_label where category1_id = xxx;
                Predicate predicate = criteriaBuilder.equal((root.get("category1_id").as(Long.class)),categoryid_1);
                return predicate;
            }
        }, pageable);
    }
}
