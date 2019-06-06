package com.xll.xc.cart.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.xll.xc.cart.Dao.ItemDao;
import com.xll.xc.cart.Pojo.Item;
import com.xll.xc.cart.Pojo.TotalResult;

@Service
@Transactional
public class CartService {

	@Autowired
	private RedisTemplate redisTemplate;
	@Autowired
	private ItemDao itemDao;

	public void addItemToCartList(String userId, String itemid, Integer num) {
		boolean flag = true;
		System.err.println(userId);
		System.err.println(itemid);
		System.err.println(num);

		TotalResult result = new TotalResult();

		List<TotalResult> list = null;

		if (redisTemplate.opsForValue().get("cartList_" + userId) == null) {
			list = new ArrayList<>();

		} else {
			list = (List<TotalResult>) redisTemplate.opsForValue().get("cartList_" + userId);
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(itemid)) {
				list.get(i).setNum(list.get(i).getNum() + num);
				list.get(i).setTotalFee(list.get(i).getPrice().multiply(new BigDecimal(list.get(i).getNum().intValue())));
				list.get(i).setTotalMoney(list.get(i).getTotalFee());
				flag = false;
				break;
			}
		}
		if (flag) {
			Item item = itemDao.findById(itemid).get();
			result.setId(itemid);
			result.setNum(num);
			result.setTitle(item.getTitle());
			result.setPrice(item.getPrice());
			result.setTotalFee(result.getPrice().multiply(new BigDecimal(result.getNum().intValue())));
			result.setTotalMoney(result.getTotalFee());
			result.setImage(item.getImage());
			result.setSellerid(item.getSeller_id());
			list.add(result);
		}
		
		System.err.println(result.getId());
		System.err.println(result.getTitle());
		System.err.println(result.getNum());
		System.err.println(result.getPrice());
		System.err.println(result.getTotalFee());
		System.err.println(result.getTotalMoney());
		redisTemplate.opsForValue().set("cartList_" + userId, list, 1, TimeUnit.HOURS);
	}

	public List<TotalResult> showCartList(String userId) {
		return (List<TotalResult>) redisTemplate.opsForValue().get("cartList_" + userId);
	}
}
