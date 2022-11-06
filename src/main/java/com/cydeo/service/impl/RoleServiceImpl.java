package com.cydeo.service.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import com.cydeo.mapper.RoleMapper;
import com.cydeo.repository.RoleRepository;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

 private final RoleRepository roleRepository;
 private final RoleMapper roleMapper;


    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }



    @Override
    public List<RoleDTO> listAllRoles() {
        //controlled called me and requesting all roles to be presented in the ui
        // but this list of role should be in the database
        //how to make a call to db and request the roles(talking to db means busniss logic in DB)
        //talking to db means sql talk
        //by connecting to repository and find (ROle repository )
        //find service in roleRepository (service means method ) that provide you with all the roles from the table
        //do : go to repo and find a service(method) that gives me the role : role repository
        //how I can call method from different class? DI
        List <Role> roleList=roleRepository.findAll();
        //this method returns role
        // and the service method returns dto how to convert entity object to dto object
        //we are bringing Role from REpo ..but this method should return RoleDTO to send it to ui
        //how we gonna map Enity ----->> DTO solution use third party mappers (model mapper)
        //Use Mappers thirdparty library by adding dependency in pom file
        // create a bean in runner steps are there
        //create a role mapper and inject modelmapper in it
        //create conversion methods dto<<------>>entity
        //other way you can set each record in table entity to dto using setters
        return roleList.stream().map(roleMapper::convertToDto).collect(Collectors.toList());
//return roleRepository.findAll().stream().map(roleMapper::convertToDto).collect(Collectors.toList())

    }

    @Override
    public RoleDTO findById(Long id) {
        return null;
    }
}
