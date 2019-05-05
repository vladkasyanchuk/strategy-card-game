package ua.od.game.dto;

import java.util.List;

public class UpgradeDto {
    private Integer id;
    private String name;
    private String description;
    private Integer defaultNumber;
    private List<ResourceSetDto> resourceSetList;
    private List<BuildingSetDto> buildingSetList;
}