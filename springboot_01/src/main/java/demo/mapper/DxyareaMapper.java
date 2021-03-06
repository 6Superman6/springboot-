package demo.mapper;

import demo.model.Dxyarea;
import demo.model.DxyareaExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DxyareaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dxyarea
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    int countByExample(DxyareaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dxyarea
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    int deleteByExample(DxyareaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dxyarea
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dxyarea
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    int insert(Dxyarea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dxyarea
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    int insertSelective(Dxyarea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dxyarea
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    List<Dxyarea> selectByExample(DxyareaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dxyarea
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    Dxyarea selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dxyarea
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    int updateByExampleSelective(@Param("record") Dxyarea record, @Param("example") DxyareaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dxyarea
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    int updateByExample(@Param("record") Dxyarea record, @Param("example") DxyareaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dxyarea
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    int updateByPrimaryKeySelective(Dxyarea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dxyarea
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    int updateByPrimaryKey(Dxyarea record);

    // 累计全国确认人数
}