package ua.od.game.service.impl;

import ua.od.game.dto.ResourceDto;
import ua.od.game.dto.RoomDto;
import ua.od.game.repository.dao.ResourceDao;
import ua.od.game.repository.dao.RoomDao;
import ua.od.game.service.ResourceService;

import javax.inject.Inject;
import java.util.LinkedList;
import java.util.List;

public class ResourceServiceImpl implements ResourceService {
    @Inject
    public ResourceDao resourceDao;

    @Override
    public List<ResourceDto> getAllResourceList() {
        final List<ResourceDto> resourceDtos = new LinkedList<>();
        resourceDao.getAllResourceList().forEach(roomEntity -> resourceDtos.add(new ResourceDto() {{
            setId(roomEntity.getId());
            setName(roomEntity.getName());
            setDescription(roomEntity.getDescription());
        }}));
        return resourceDtos;
    }
}
