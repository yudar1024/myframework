package com.roger.mapper;

import com.roger.entity.UrlFilter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by roger chen on 2015/5/15.
 */
@Component
public interface UrlFilterMapper {
    public UrlFilter createUrlFilter(UrlFilter urlFilter);
    public UrlFilter updateUrlFilter(UrlFilter urlFilter);
    public void deleteUrlFilter(Long urlFilterId);

    public UrlFilter findOne(Long urlFilterId);
    public List<UrlFilter> findAll();

}
