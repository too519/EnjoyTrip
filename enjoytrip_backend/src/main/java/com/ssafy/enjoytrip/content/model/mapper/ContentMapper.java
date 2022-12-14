package com.ssafy.enjoytrip.content.model.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.enjoytrip.content.model.AreaDto;
import com.ssafy.enjoytrip.content.model.PlaceDto;
import com.ssafy.enjoytrip.content.model.PlanDto;
import com.ssafy.enjoytrip.content.model.PlanPlaceDto;
import com.ssafy.enjoytrip.content.model.SigunguDto;

@Mapper
public interface ContentMapper {
    List<AreaDto> getAreaCode() throws SQLException;

    List<SigunguDto> getSigunguCode(int areaCode) throws SQLException;

    List<PlaceDto> getPlaceInfo(Map<String, Object> map) throws SQLException;

    List<PlaceDto> getRandomPlaceInfo() throws SQLException;

    List<PlaceDto> getSearchPlaceInfo(Map<String, Object> map) throws SQLException;

    void writePlan(PlanDto planDto) throws SQLException;

    void writePlanPlace(PlanDto planDto) throws SQLException;

    List<PlanDto> getPlanList() throws SQLException;

    List<PlanDto> getUserPlanList(String userId) throws SQLException;

    List<PlanPlaceDto> getPlanPlaceList(int articleNo) throws SQLException;

    PlaceDto getPlaceItem(int contentId) throws SQLException;

    void updateHit(int articleNo) throws SQLException;

    void deletePlan(int articleNo) throws SQLException;

    void deletePlanPlace(int articleNo) throws SQLException;
}
