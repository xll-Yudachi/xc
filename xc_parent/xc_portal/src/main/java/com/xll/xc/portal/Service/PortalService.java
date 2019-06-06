package com.xll.xc.portal.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xll.xc.portal.Dao.PortalDao;
import com.xll.xc.portal.Pojo.ItemCat;

@Service
@Transactional
public class PortalService {
	@Autowired
	private PortalDao portalDao;
	
	/**
	 * Title : findByParentId
	 * Description : 根据父级分类查询子级分类
	 * CreateDate : 2019年4月26日 下午11:19:31
	 * Author : Yudachi
	 * @param categoryId
	 * @return
	 * List<ItemCat>
	 * @throws
	 */
	public List<ItemCat> findByParentId(Long categoryId){
		return portalDao.findByParentid(categoryId);
	}
	
	/**
	 * <p> Title : findAllSub </p>
	 * <p> Description : 查询所有父级目录对应的子目录  </p>
	 * CreateDate : 2019年4月7日 下午5:10:29
	 * Author : Yudachi
	 * @param categoryId
	 * @return
	 * Map<Long,List<ItemCat>>
	 * @throws
	 */
	public Map<Long, List<ItemCat>> findAllSub(){
	
		Map<Long, List<ItemCat>> map = new HashMap<>();
		List<ItemCat> list = portalDao.findByParentid(0L);
		for(ItemCat itemCat : list) {
			map.put(itemCat.getId(), portalDao.findByParentid(itemCat.getId()));
		}
		return map;
		
	}
}
