package joe.doba.seckill_demo1.db.mappers;

import joe.doba.seckill_demo1.db.pojo.Activity;

import java.util.List;

public interface ActivityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

    int lockInventory(Long id);

    int deductInventory(Long id);

    List<Activity> queryActivitysByStatus(int status);
}