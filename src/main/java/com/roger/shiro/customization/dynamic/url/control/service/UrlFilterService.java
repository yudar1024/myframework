package com.roger.shiro.customization.dynamic.url.control.service;

import com.roger.entity.UrlFilter;

import java.util.List;


public interface UrlFilterService {

    public UrlFilter createUrlFilter(UrlFilter urlFilter);
    public UrlFilter updateUrlFilter(UrlFilter urlFilter);
    public void deleteUrlFilter(Long urlFilterId);

    public UrlFilter findOne(Long urlFilterId);
    public List<UrlFilter> findAll();
}
