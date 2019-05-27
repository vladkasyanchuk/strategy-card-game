package ua.od.game.service.impl;

import ua.od.game.dto.ResourceDto;
<<<<<<< HEAD
import ua.od.game.dto.RoomDto;
import ua.od.game.repository.dao.ResourceDao;
import ua.od.game.repository.dao.RoomDao;
=======
import ua.od.game.repository.dao.ResourceDao;
>>>>>>> 97beff14a81d7bc76edd4333b4acb687ed4c3d2e
import ua.od.game.service.ResourceService;

import javax.inject.Inject;
import java.util.LinkedList;
import java.util.List;

public class ResourceServiceImpl implements ResourceService {
<<<<<<< HEAD
    @Inject
    public ResourceDao resourceDao;

    @Override
    public List<ResourceDto> getAllResourceList() {
        final List<ResourceDto> resourceDtos = new LinkedList<>();
        resourceDao.getAllResourceList().forEach(roomEntity -> resourceDtos.add(new ResourceDto() {{
            setId(roomEntity.getId());
            setName(roomEntity.getName());
            setDescription(roomEntity.getDescription());
=======

    @Inject
    public ResourceDao resourceDao;

    public void setResourceDao(ResourceDao resourceDao) {
        this.resourceDao = resourceDao;
    }

    @Override
    public List<ResourceDto> getAllResourceList() {
        final List<ResourceDto> resourceDtos = new LinkedList<>();
        resourceDao.getAllResourceList().forEach(resourceEntity -> resourceDtos.add(new ResourceDto() {{
            setId(resourceEntity.getId());
            setName(resourceEntity.getName());
            setDescription(resourceEntity.getDescription());
>>>>>>> 97beff14a81d7bc76edd4333b4acb687ed4c3d2e
        }}));
        return resourceDtos;
    }
}
