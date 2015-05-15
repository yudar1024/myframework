package com.roger.mapper;

import com.roger.entity.Organization;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by roger chen on 2015/5/15.
 */
@Component
public interface OrganizationMapper {
    public Organization createOrganization(Organization organization);
    public Organization updateOrganization(Organization organization);
    public void deleteOrganization(Long organizationId);

    Organization findOne(Long organizationId);
    List<Organization> findAll();

    List<Organization> findAllWithExclude(Organization excludeOraganization);

    void move(Organization source, Organization target);
}
