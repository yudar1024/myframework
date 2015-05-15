package com.roger.mapper;

import com.roger.entity.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by roger chen on 2015/5/15.
 */
@Component
public interface ResourceMapper {
    public Resource createResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);
    List<Resource> findAll();
}
