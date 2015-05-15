package com.roger.shiro.customization.dynamic.url.control.service;

import com.roger.entity.Organization;
import com.roger.mapper.OrganizationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Resource
    private OrganizationMapper organizationMapper;


    public Organization createOrganization(Organization organization) {
        return organizationMapper.createOrganization(organization);
    }


    public Organization updateOrganization(Organization organization) {
        return organizationMapper.updateOrganization(organization);
    }


    public void deleteOrganization(Long organizationId) {
        organizationMapper.deleteOrganization(organizationId);
    }


    public Organization findOne(Long organizationId) {
        return organizationMapper.findOne(organizationId);
    }


    public List<Organization> findAll() {
        return organizationMapper.findAll();
    }


    public List<Organization> findAllWithExclude(Organization excludeOraganization) {
        return organizationMapper.findAllWithExclude(excludeOraganization);
    }


    public void move(Organization source, Organization target) {
        organizationMapper.move(source, target);
    }
}
