package com.lovefn.grace.demo.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * table : t_regulate_config
 * Created by Mybatis Generator on 2020-07-28
 */
@SuppressWarnings("all")
public class TRegulateConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    // 添加[for update wait]条件语句，请谨慎使用，注意锁表情况，避免死锁
    protected Integer forUpdate;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TRegulateConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setForUpdate(Integer forUpdate) {
        this.forUpdate=forUpdate;
    }

    public Integer getForUpdate() {
        return forUpdate;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFidIsNull() {
            addCriterion("Fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("Fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("Fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("Fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("Fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("Fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("Fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("Fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("Fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("Fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("Fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFchannelIdIsNull() {
            addCriterion("Fchannel_id is null");
            return (Criteria) this;
        }

        public Criteria andFchannelIdIsNotNull() {
            addCriterion("Fchannel_id is not null");
            return (Criteria) this;
        }

        public Criteria andFchannelIdEqualTo(Integer value) {
            addCriterion("Fchannel_id =", value, "fchannelId");
            return (Criteria) this;
        }

        public Criteria andFchannelIdNotEqualTo(Integer value) {
            addCriterion("Fchannel_id <>", value, "fchannelId");
            return (Criteria) this;
        }

        public Criteria andFchannelIdGreaterThan(Integer value) {
            addCriterion("Fchannel_id >", value, "fchannelId");
            return (Criteria) this;
        }

        public Criteria andFchannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fchannel_id >=", value, "fchannelId");
            return (Criteria) this;
        }

        public Criteria andFchannelIdLessThan(Integer value) {
            addCriterion("Fchannel_id <", value, "fchannelId");
            return (Criteria) this;
        }

        public Criteria andFchannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("Fchannel_id <=", value, "fchannelId");
            return (Criteria) this;
        }

        public Criteria andFchannelIdIn(List<Integer> values) {
            addCriterion("Fchannel_id in", values, "fchannelId");
            return (Criteria) this;
        }

        public Criteria andFchannelIdNotIn(List<Integer> values) {
            addCriterion("Fchannel_id not in", values, "fchannelId");
            return (Criteria) this;
        }

        public Criteria andFchannelIdBetween(Integer value1, Integer value2) {
            addCriterion("Fchannel_id between", value1, value2, "fchannelId");
            return (Criteria) this;
        }

        public Criteria andFchannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Fchannel_id not between", value1, value2, "fchannelId");
            return (Criteria) this;
        }

        public Criteria andFpriorityIsNull() {
            addCriterion("Fpriority is null");
            return (Criteria) this;
        }

        public Criteria andFpriorityIsNotNull() {
            addCriterion("Fpriority is not null");
            return (Criteria) this;
        }

        public Criteria andFpriorityEqualTo(Integer value) {
            addCriterion("Fpriority =", value, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityNotEqualTo(Integer value) {
            addCriterion("Fpriority <>", value, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityGreaterThan(Integer value) {
            addCriterion("Fpriority >", value, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fpriority >=", value, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityLessThan(Integer value) {
            addCriterion("Fpriority <", value, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityLessThanOrEqualTo(Integer value) {
            addCriterion("Fpriority <=", value, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityIn(List<Integer> values) {
            addCriterion("Fpriority in", values, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityNotIn(List<Integer> values) {
            addCriterion("Fpriority not in", values, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityBetween(Integer value1, Integer value2) {
            addCriterion("Fpriority between", value1, value2, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("Fpriority not between", value1, value2, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFactiveFlagIsNull() {
            addCriterion("Factive_flag is null");
            return (Criteria) this;
        }

        public Criteria andFactiveFlagIsNotNull() {
            addCriterion("Factive_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFactiveFlagEqualTo(Integer value) {
            addCriterion("Factive_flag =", value, "factiveFlag");
            return (Criteria) this;
        }

        public Criteria andFactiveFlagNotEqualTo(Integer value) {
            addCriterion("Factive_flag <>", value, "factiveFlag");
            return (Criteria) this;
        }

        public Criteria andFactiveFlagGreaterThan(Integer value) {
            addCriterion("Factive_flag >", value, "factiveFlag");
            return (Criteria) this;
        }

        public Criteria andFactiveFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Factive_flag >=", value, "factiveFlag");
            return (Criteria) this;
        }

        public Criteria andFactiveFlagLessThan(Integer value) {
            addCriterion("Factive_flag <", value, "factiveFlag");
            return (Criteria) this;
        }

        public Criteria andFactiveFlagLessThanOrEqualTo(Integer value) {
            addCriterion("Factive_flag <=", value, "factiveFlag");
            return (Criteria) this;
        }

        public Criteria andFactiveFlagIn(List<Integer> values) {
            addCriterion("Factive_flag in", values, "factiveFlag");
            return (Criteria) this;
        }

        public Criteria andFactiveFlagNotIn(List<Integer> values) {
            addCriterion("Factive_flag not in", values, "factiveFlag");
            return (Criteria) this;
        }

        public Criteria andFactiveFlagBetween(Integer value1, Integer value2) {
            addCriterion("Factive_flag between", value1, value2, "factiveFlag");
            return (Criteria) this;
        }

        public Criteria andFactiveFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("Factive_flag not between", value1, value2, "factiveFlag");
            return (Criteria) this;
        }

        public Criteria andFdelFlagIsNull() {
            addCriterion("Fdel_flag is null");
            return (Criteria) this;
        }

        public Criteria andFdelFlagIsNotNull() {
            addCriterion("Fdel_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFdelFlagEqualTo(Integer value) {
            addCriterion("Fdel_flag =", value, "fdelFlag");
            return (Criteria) this;
        }

        public Criteria andFdelFlagNotEqualTo(Integer value) {
            addCriterion("Fdel_flag <>", value, "fdelFlag");
            return (Criteria) this;
        }

        public Criteria andFdelFlagGreaterThan(Integer value) {
            addCriterion("Fdel_flag >", value, "fdelFlag");
            return (Criteria) this;
        }

        public Criteria andFdelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fdel_flag >=", value, "fdelFlag");
            return (Criteria) this;
        }

        public Criteria andFdelFlagLessThan(Integer value) {
            addCriterion("Fdel_flag <", value, "fdelFlag");
            return (Criteria) this;
        }

        public Criteria andFdelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("Fdel_flag <=", value, "fdelFlag");
            return (Criteria) this;
        }

        public Criteria andFdelFlagIn(List<Integer> values) {
            addCriterion("Fdel_flag in", values, "fdelFlag");
            return (Criteria) this;
        }

        public Criteria andFdelFlagNotIn(List<Integer> values) {
            addCriterion("Fdel_flag not in", values, "fdelFlag");
            return (Criteria) this;
        }

        public Criteria andFdelFlagBetween(Integer value1, Integer value2) {
            addCriterion("Fdel_flag between", value1, value2, "fdelFlag");
            return (Criteria) this;
        }

        public Criteria andFdelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("Fdel_flag not between", value1, value2, "fdelFlag");
            return (Criteria) this;
        }

        public Criteria andFmodCountIsNull() {
            addCriterion("Fmod_count is null");
            return (Criteria) this;
        }

        public Criteria andFmodCountIsNotNull() {
            addCriterion("Fmod_count is not null");
            return (Criteria) this;
        }

        public Criteria andFmodCountEqualTo(Integer value) {
            addCriterion("Fmod_count =", value, "fmodCount");
            return (Criteria) this;
        }

        public Criteria andFmodCountNotEqualTo(Integer value) {
            addCriterion("Fmod_count <>", value, "fmodCount");
            return (Criteria) this;
        }

        public Criteria andFmodCountGreaterThan(Integer value) {
            addCriterion("Fmod_count >", value, "fmodCount");
            return (Criteria) this;
        }

        public Criteria andFmodCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fmod_count >=", value, "fmodCount");
            return (Criteria) this;
        }

        public Criteria andFmodCountLessThan(Integer value) {
            addCriterion("Fmod_count <", value, "fmodCount");
            return (Criteria) this;
        }

        public Criteria andFmodCountLessThanOrEqualTo(Integer value) {
            addCriterion("Fmod_count <=", value, "fmodCount");
            return (Criteria) this;
        }

        public Criteria andFmodCountIn(List<Integer> values) {
            addCriterion("Fmod_count in", values, "fmodCount");
            return (Criteria) this;
        }

        public Criteria andFmodCountNotIn(List<Integer> values) {
            addCriterion("Fmod_count not in", values, "fmodCount");
            return (Criteria) this;
        }

        public Criteria andFmodCountBetween(Integer value1, Integer value2) {
            addCriterion("Fmod_count between", value1, value2, "fmodCount");
            return (Criteria) this;
        }

        public Criteria andFmodCountNotBetween(Integer value1, Integer value2) {
            addCriterion("Fmod_count not between", value1, value2, "fmodCount");
            return (Criteria) this;
        }

        public Criteria andFhashIsNull() {
            addCriterion("Fhash is null");
            return (Criteria) this;
        }

        public Criteria andFhashIsNotNull() {
            addCriterion("Fhash is not null");
            return (Criteria) this;
        }

        public Criteria andFhashEqualTo(String value) {
            addCriterion("Fhash =", value, "fhash");
            return (Criteria) this;
        }

        public Criteria andFhashNotEqualTo(String value) {
            addCriterion("Fhash <>", value, "fhash");
            return (Criteria) this;
        }

        public Criteria andFhashGreaterThan(String value) {
            addCriterion("Fhash >", value, "fhash");
            return (Criteria) this;
        }

        public Criteria andFhashGreaterThanOrEqualTo(String value) {
            addCriterion("Fhash >=", value, "fhash");
            return (Criteria) this;
        }

        public Criteria andFhashLessThan(String value) {
            addCriterion("Fhash <", value, "fhash");
            return (Criteria) this;
        }

        public Criteria andFhashLessThanOrEqualTo(String value) {
            addCriterion("Fhash <=", value, "fhash");
            return (Criteria) this;
        }

        public Criteria andFhashLike(String value) {
            addCriterion("Fhash like", value, "fhash");
            return (Criteria) this;
        }

        public Criteria andFhashNotLike(String value) {
            addCriterion("Fhash not like", value, "fhash");
            return (Criteria) this;
        }

        public Criteria andFhashIn(List<String> values) {
            addCriterion("Fhash in", values, "fhash");
            return (Criteria) this;
        }

        public Criteria andFhashNotIn(List<String> values) {
            addCriterion("Fhash not in", values, "fhash");
            return (Criteria) this;
        }

        public Criteria andFhashBetween(String value1, String value2) {
            addCriterion("Fhash between", value1, value2, "fhash");
            return (Criteria) this;
        }

        public Criteria andFhashNotBetween(String value1, String value2) {
            addCriterion("Fhash not between", value1, value2, "fhash");
            return (Criteria) this;
        }

        public Criteria andFcreateUserIsNull() {
            addCriterion("Fcreate_user is null");
            return (Criteria) this;
        }

        public Criteria andFcreateUserIsNotNull() {
            addCriterion("Fcreate_user is not null");
            return (Criteria) this;
        }

        public Criteria andFcreateUserEqualTo(String value) {
            addCriterion("Fcreate_user =", value, "fcreateUser");
            return (Criteria) this;
        }

        public Criteria andFcreateUserNotEqualTo(String value) {
            addCriterion("Fcreate_user <>", value, "fcreateUser");
            return (Criteria) this;
        }

        public Criteria andFcreateUserGreaterThan(String value) {
            addCriterion("Fcreate_user >", value, "fcreateUser");
            return (Criteria) this;
        }

        public Criteria andFcreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("Fcreate_user >=", value, "fcreateUser");
            return (Criteria) this;
        }

        public Criteria andFcreateUserLessThan(String value) {
            addCriterion("Fcreate_user <", value, "fcreateUser");
            return (Criteria) this;
        }

        public Criteria andFcreateUserLessThanOrEqualTo(String value) {
            addCriterion("Fcreate_user <=", value, "fcreateUser");
            return (Criteria) this;
        }

        public Criteria andFcreateUserLike(String value) {
            addCriterion("Fcreate_user like", value, "fcreateUser");
            return (Criteria) this;
        }

        public Criteria andFcreateUserNotLike(String value) {
            addCriterion("Fcreate_user not like", value, "fcreateUser");
            return (Criteria) this;
        }

        public Criteria andFcreateUserIn(List<String> values) {
            addCriterion("Fcreate_user in", values, "fcreateUser");
            return (Criteria) this;
        }

        public Criteria andFcreateUserNotIn(List<String> values) {
            addCriterion("Fcreate_user not in", values, "fcreateUser");
            return (Criteria) this;
        }

        public Criteria andFcreateUserBetween(String value1, String value2) {
            addCriterion("Fcreate_user between", value1, value2, "fcreateUser");
            return (Criteria) this;
        }

        public Criteria andFcreateUserNotBetween(String value1, String value2) {
            addCriterion("Fcreate_user not between", value1, value2, "fcreateUser");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeIsNull() {
            addCriterion("Fcreate_time is null");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeIsNotNull() {
            addCriterion("Fcreate_time is not null");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeEqualTo(Date value) {
            addCriterion("Fcreate_time =", value, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeNotEqualTo(Date value) {
            addCriterion("Fcreate_time <>", value, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeGreaterThan(Date value) {
            addCriterion("Fcreate_time >", value, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Fcreate_time >=", value, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeLessThan(Date value) {
            addCriterion("Fcreate_time <", value, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Fcreate_time <=", value, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeIn(List<Date> values) {
            addCriterion("Fcreate_time in", values, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeNotIn(List<Date> values) {
            addCriterion("Fcreate_time not in", values, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeBetween(Date value1, Date value2) {
            addCriterion("Fcreate_time between", value1, value2, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Fcreate_time not between", value1, value2, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserIsNull() {
            addCriterion("Fmodify_user is null");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserIsNotNull() {
            addCriterion("Fmodify_user is not null");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserEqualTo(String value) {
            addCriterion("Fmodify_user =", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserNotEqualTo(String value) {
            addCriterion("Fmodify_user <>", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserGreaterThan(String value) {
            addCriterion("Fmodify_user >", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("Fmodify_user >=", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserLessThan(String value) {
            addCriterion("Fmodify_user <", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserLessThanOrEqualTo(String value) {
            addCriterion("Fmodify_user <=", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserLike(String value) {
            addCriterion("Fmodify_user like", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserNotLike(String value) {
            addCriterion("Fmodify_user not like", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserIn(List<String> values) {
            addCriterion("Fmodify_user in", values, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserNotIn(List<String> values) {
            addCriterion("Fmodify_user not in", values, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserBetween(String value1, String value2) {
            addCriterion("Fmodify_user between", value1, value2, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserNotBetween(String value1, String value2) {
            addCriterion("Fmodify_user not between", value1, value2, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeIsNull() {
            addCriterion("Fmodify_time is null");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeIsNotNull() {
            addCriterion("Fmodify_time is not null");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeEqualTo(Date value) {
            addCriterion("Fmodify_time =", value, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeNotEqualTo(Date value) {
            addCriterion("Fmodify_time <>", value, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeGreaterThan(Date value) {
            addCriterion("Fmodify_time >", value, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Fmodify_time >=", value, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeLessThan(Date value) {
            addCriterion("Fmodify_time <", value, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("Fmodify_time <=", value, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeIn(List<Date> values) {
            addCriterion("Fmodify_time in", values, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeNotIn(List<Date> values) {
            addCriterion("Fmodify_time not in", values, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeBetween(Date value1, Date value2) {
            addCriterion("Fmodify_time between", value1, value2, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("Fmodify_time not between", value1, value2, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescIsNull() {
            addCriterion("Fmodify_desc is null");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescIsNotNull() {
            addCriterion("Fmodify_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescEqualTo(String value) {
            addCriterion("Fmodify_desc =", value, "fmodifyDesc");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescNotEqualTo(String value) {
            addCriterion("Fmodify_desc <>", value, "fmodifyDesc");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescGreaterThan(String value) {
            addCriterion("Fmodify_desc >", value, "fmodifyDesc");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescGreaterThanOrEqualTo(String value) {
            addCriterion("Fmodify_desc >=", value, "fmodifyDesc");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescLessThan(String value) {
            addCriterion("Fmodify_desc <", value, "fmodifyDesc");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescLessThanOrEqualTo(String value) {
            addCriterion("Fmodify_desc <=", value, "fmodifyDesc");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescLike(String value) {
            addCriterion("Fmodify_desc like", value, "fmodifyDesc");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescNotLike(String value) {
            addCriterion("Fmodify_desc not like", value, "fmodifyDesc");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescIn(List<String> values) {
            addCriterion("Fmodify_desc in", values, "fmodifyDesc");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescNotIn(List<String> values) {
            addCriterion("Fmodify_desc not in", values, "fmodifyDesc");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescBetween(String value1, String value2) {
            addCriterion("Fmodify_desc between", value1, value2, "fmodifyDesc");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescNotBetween(String value1, String value2) {
            addCriterion("Fmodify_desc not between", value1, value2, "fmodifyDesc");
            return (Criteria) this;
        }

        public Criteria andFhashLikeInsensitive(String value) {
            addCriterion("upper(Fhash) like", value.toUpperCase(), "fhash");
            return (Criteria) this;
        }

        public Criteria andFcreateUserLikeInsensitive(String value) {
            addCriterion("upper(Fcreate_user) like", value.toUpperCase(), "fcreateUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserLikeInsensitive(String value) {
            addCriterion("upper(Fmodify_user) like", value.toUpperCase(), "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyDescLikeInsensitive(String value) {
            addCriterion("upper(Fmodify_desc) like", value.toUpperCase(), "fmodifyDesc");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}