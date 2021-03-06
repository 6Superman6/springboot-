package demo.model;

public class Dxyarea {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.id
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.province_name
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String provinceName;         // 省名

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.province_englishname
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String provinceEnglishname;  // 省名（英）

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.province_confirmedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String provinceConfirmedcount;  // 确诊人数（省）

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.province_suspectedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String provinceSuspectedcount;  // 疑似人数（省）

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.province_curedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String provinceCuredcount;  // 治愈人数（省）

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.province_deadcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String provinceDeadcount;  // 死亡人数（省）

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.city_confirmedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String cityConfirmedcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.city_curedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String cityCuredcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.city_deadcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String cityDeadcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.province_zipcode
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String provinceZipcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.city_name
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String cityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.city_englishname
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String cityEnglishname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.city_zipcode
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String cityZipcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.city_suspectedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String citySuspectedcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dxyarea.update_time
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    private String updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.id
     *
     * @return the value of dxyarea.id
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.id
     *
     * @param id the value for dxyarea.id
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.province_name
     *
     * @return the value of dxyarea.province_name
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.province_name
     *
     * @param provinceName the value for dxyarea.province_name
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.province_englishname
     *
     * @return the value of dxyarea.province_englishname
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getProvinceEnglishname() {
        return provinceEnglishname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.province_englishname
     *
     * @param provinceEnglishname the value for dxyarea.province_englishname
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setProvinceEnglishname(String provinceEnglishname) {
        this.provinceEnglishname = provinceEnglishname == null ? null : provinceEnglishname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.province_confirmedcount
     *
     * @return the value of dxyarea.province_confirmedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getProvinceConfirmedcount() {
        return provinceConfirmedcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.province_confirmedcount
     *
     * @param provinceConfirmedcount the value for dxyarea.province_confirmedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setProvinceConfirmedcount(String provinceConfirmedcount) {
        this.provinceConfirmedcount = provinceConfirmedcount == null ? null : provinceConfirmedcount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.province_suspectedcount
     *
     * @return the value of dxyarea.province_suspectedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getProvinceSuspectedcount() {
        return provinceSuspectedcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.province_suspectedcount
     *
     * @param provinceSuspectedcount the value for dxyarea.province_suspectedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setProvinceSuspectedcount(String provinceSuspectedcount) {
        this.provinceSuspectedcount = provinceSuspectedcount == null ? null : provinceSuspectedcount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.province_curedcount
     *
     * @return the value of dxyarea.province_curedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getProvinceCuredcount() {
        return provinceCuredcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.province_curedcount
     *
     * @param provinceCuredcount the value for dxyarea.province_curedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setProvinceCuredcount(String provinceCuredcount) {
        this.provinceCuredcount = provinceCuredcount == null ? null : provinceCuredcount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.province_deadcount
     *
     * @return the value of dxyarea.province_deadcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getProvinceDeadcount() {
        return provinceDeadcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.province_deadcount
     *
     * @param provinceDeadcount the value for dxyarea.province_deadcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setProvinceDeadcount(String provinceDeadcount) {
        this.provinceDeadcount = provinceDeadcount == null ? null : provinceDeadcount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.city_confirmedcount
     *
     * @return the value of dxyarea.city_confirmedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getCityConfirmedcount() {
        return cityConfirmedcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.city_confirmedcount
     *
     * @param cityConfirmedcount the value for dxyarea.city_confirmedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setCityConfirmedcount(String cityConfirmedcount) {
        this.cityConfirmedcount = cityConfirmedcount == null ? null : cityConfirmedcount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.city_curedcount
     *
     * @return the value of dxyarea.city_curedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getCityCuredcount() {
        return cityCuredcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.city_curedcount
     *
     * @param cityCuredcount the value for dxyarea.city_curedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setCityCuredcount(String cityCuredcount) {
        this.cityCuredcount = cityCuredcount == null ? null : cityCuredcount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.city_deadcount
     *
     * @return the value of dxyarea.city_deadcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getCityDeadcount() {
        return cityDeadcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.city_deadcount
     *
     * @param cityDeadcount the value for dxyarea.city_deadcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setCityDeadcount(String cityDeadcount) {
        this.cityDeadcount = cityDeadcount == null ? null : cityDeadcount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.province_zipcode
     *
     * @return the value of dxyarea.province_zipcode
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getProvinceZipcode() {
        return provinceZipcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.province_zipcode
     *
     * @param provinceZipcode the value for dxyarea.province_zipcode
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setProvinceZipcode(String provinceZipcode) {
        this.provinceZipcode = provinceZipcode == null ? null : provinceZipcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.city_name
     *
     * @return the value of dxyarea.city_name
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.city_name
     *
     * @param cityName the value for dxyarea.city_name
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.city_englishname
     *
     * @return the value of dxyarea.city_englishname
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getCityEnglishname() {
        return cityEnglishname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.city_englishname
     *
     * @param cityEnglishname the value for dxyarea.city_englishname
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setCityEnglishname(String cityEnglishname) {
        this.cityEnglishname = cityEnglishname == null ? null : cityEnglishname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.city_zipcode
     *
     * @return the value of dxyarea.city_zipcode
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getCityZipcode() {
        return cityZipcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.city_zipcode
     *
     * @param cityZipcode the value for dxyarea.city_zipcode
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setCityZipcode(String cityZipcode) {
        this.cityZipcode = cityZipcode == null ? null : cityZipcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.city_suspectedcount
     *
     * @return the value of dxyarea.city_suspectedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getCitySuspectedcount() {
        return citySuspectedcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.city_suspectedcount
     *
     * @param citySuspectedcount the value for dxyarea.city_suspectedcount
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setCitySuspectedcount(String citySuspectedcount) {
        this.citySuspectedcount = citySuspectedcount == null ? null : citySuspectedcount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dxyarea.update_time
     *
     * @return the value of dxyarea.update_time
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dxyarea.update_time
     *
     * @param updateTime the value for dxyarea.update_time
     *
     * @mbggenerated Wed Mar 18 11:28:45 CST 2020
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }



}