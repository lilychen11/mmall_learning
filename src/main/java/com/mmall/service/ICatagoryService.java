package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

public interface ICatagoryService {
    ServerResponse addCategory(String catagoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId, String catagoryName);
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
