package com.arvin.mapper;


import com.arvin.po.Items;
import com.arvin.po.ItemsCustom;
import com.arvin.po.ItemsVO;

import java.util.List;

public interface ItemsMapperCustom
{
    public List<ItemsCustom> queryItemsByName(ItemsVO itemsVO) throws Exception;

    public void deleteItemsByIds(Integer[] ids) throws Exception;

    public void updateBatch(List<ItemsCustom> itemsCustomList)throws Exception;
}