package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

public interface PromoService {
    //根据itemId获取正在进行的和即将进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);
}
