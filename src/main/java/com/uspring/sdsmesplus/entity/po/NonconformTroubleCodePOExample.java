package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NonconformTroubleCodePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NonconformTroubleCodePOExample() {
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

        public Criteria andTrcIdIsNull() {
            addCriterion("trc_id is null");
            return (Criteria) this;
        }

        public Criteria andTrcIdIsNotNull() {
            addCriterion("trc_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrcIdEqualTo(Integer value) {
            addCriterion("trc_id =", value, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdNotEqualTo(Integer value) {
            addCriterion("trc_id <>", value, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdGreaterThan(Integer value) {
            addCriterion("trc_id >", value, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trc_id >=", value, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdLessThan(Integer value) {
            addCriterion("trc_id <", value, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdLessThanOrEqualTo(Integer value) {
            addCriterion("trc_id <=", value, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdIn(List<Integer> values) {
            addCriterion("trc_id in", values, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdNotIn(List<Integer> values) {
            addCriterion("trc_id not in", values, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdBetween(Integer value1, Integer value2) {
            addCriterion("trc_id between", value1, value2, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trc_id not between", value1, value2, "trcId");
            return (Criteria) this;
        }

        public Criteria andFcIdIsNull() {
            addCriterion("fc_id is null");
            return (Criteria) this;
        }

        public Criteria andFcIdIsNotNull() {
            addCriterion("fc_id is not null");
            return (Criteria) this;
        }

        public Criteria andFcIdEqualTo(Integer value) {
            addCriterion("fc_id =", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdNotEqualTo(Integer value) {
            addCriterion("fc_id <>", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdGreaterThan(Integer value) {
            addCriterion("fc_id >", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fc_id >=", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdLessThan(Integer value) {
            addCriterion("fc_id <", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdLessThanOrEqualTo(Integer value) {
            addCriterion("fc_id <=", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdIn(List<Integer> values) {
            addCriterion("fc_id in", values, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdNotIn(List<Integer> values) {
            addCriterion("fc_id not in", values, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdBetween(Integer value1, Integer value2) {
            addCriterion("fc_id between", value1, value2, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fc_id not between", value1, value2, "fcId");
            return (Criteria) this;
        }

        public Criteria andVsmIdIsNull() {
            addCriterion("vsm_id is null");
            return (Criteria) this;
        }

        public Criteria andVsmIdIsNotNull() {
            addCriterion("vsm_id is not null");
            return (Criteria) this;
        }

        public Criteria andVsmIdEqualTo(Integer value) {
            addCriterion("vsm_id =", value, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdNotEqualTo(Integer value) {
            addCriterion("vsm_id <>", value, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdGreaterThan(Integer value) {
            addCriterion("vsm_id >", value, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vsm_id >=", value, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdLessThan(Integer value) {
            addCriterion("vsm_id <", value, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdLessThanOrEqualTo(Integer value) {
            addCriterion("vsm_id <=", value, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdIn(List<Integer> values) {
            addCriterion("vsm_id in", values, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdNotIn(List<Integer> values) {
            addCriterion("vsm_id not in", values, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdBetween(Integer value1, Integer value2) {
            addCriterion("vsm_id between", value1, value2, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vsm_id not between", value1, value2, "vsmId");
            return (Criteria) this;
        }

        public Criteria andOpCodeIsNull() {
            addCriterion("op_code is null");
            return (Criteria) this;
        }

        public Criteria andOpCodeIsNotNull() {
            addCriterion("op_code is not null");
            return (Criteria) this;
        }

        public Criteria andOpCodeEqualTo(String value) {
            addCriterion("op_code =", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotEqualTo(String value) {
            addCriterion("op_code <>", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeGreaterThan(String value) {
            addCriterion("op_code >", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("op_code >=", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeLessThan(String value) {
            addCriterion("op_code <", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeLessThanOrEqualTo(String value) {
            addCriterion("op_code <=", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeLike(String value) {
            addCriterion("op_code like", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotLike(String value) {
            addCriterion("op_code not like", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeIn(List<String> values) {
            addCriterion("op_code in", values, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotIn(List<String> values) {
            addCriterion("op_code not in", values, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeBetween(String value1, String value2) {
            addCriterion("op_code between", value1, value2, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotBetween(String value1, String value2) {
            addCriterion("op_code not between", value1, value2, "opCode");
            return (Criteria) this;
        }

        public Criteria andTrcCodeIsNull() {
            addCriterion("trc_code is null");
            return (Criteria) this;
        }

        public Criteria andTrcCodeIsNotNull() {
            addCriterion("trc_code is not null");
            return (Criteria) this;
        }

        public Criteria andTrcCodeEqualTo(String value) {
            addCriterion("trc_code =", value, "trcCode");
            return (Criteria) this;
        }

        public Criteria andTrcCodeNotEqualTo(String value) {
            addCriterion("trc_code <>", value, "trcCode");
            return (Criteria) this;
        }

        public Criteria andTrcCodeGreaterThan(String value) {
            addCriterion("trc_code >", value, "trcCode");
            return (Criteria) this;
        }

        public Criteria andTrcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("trc_code >=", value, "trcCode");
            return (Criteria) this;
        }

        public Criteria andTrcCodeLessThan(String value) {
            addCriterion("trc_code <", value, "trcCode");
            return (Criteria) this;
        }

        public Criteria andTrcCodeLessThanOrEqualTo(String value) {
            addCriterion("trc_code <=", value, "trcCode");
            return (Criteria) this;
        }

        public Criteria andTrcCodeLike(String value) {
            addCriterion("trc_code like", value, "trcCode");
            return (Criteria) this;
        }

        public Criteria andTrcCodeNotLike(String value) {
            addCriterion("trc_code not like", value, "trcCode");
            return (Criteria) this;
        }

        public Criteria andTrcCodeIn(List<String> values) {
            addCriterion("trc_code in", values, "trcCode");
            return (Criteria) this;
        }

        public Criteria andTrcCodeNotIn(List<String> values) {
            addCriterion("trc_code not in", values, "trcCode");
            return (Criteria) this;
        }

        public Criteria andTrcCodeBetween(String value1, String value2) {
            addCriterion("trc_code between", value1, value2, "trcCode");
            return (Criteria) this;
        }

        public Criteria andTrcCodeNotBetween(String value1, String value2) {
            addCriterion("trc_code not between", value1, value2, "trcCode");
            return (Criteria) this;
        }

        public Criteria andTrcNameIsNull() {
            addCriterion("trc_name is null");
            return (Criteria) this;
        }

        public Criteria andTrcNameIsNotNull() {
            addCriterion("trc_name is not null");
            return (Criteria) this;
        }

        public Criteria andTrcNameEqualTo(String value) {
            addCriterion("trc_name =", value, "trcName");
            return (Criteria) this;
        }

        public Criteria andTrcNameNotEqualTo(String value) {
            addCriterion("trc_name <>", value, "trcName");
            return (Criteria) this;
        }

        public Criteria andTrcNameGreaterThan(String value) {
            addCriterion("trc_name >", value, "trcName");
            return (Criteria) this;
        }

        public Criteria andTrcNameGreaterThanOrEqualTo(String value) {
            addCriterion("trc_name >=", value, "trcName");
            return (Criteria) this;
        }

        public Criteria andTrcNameLessThan(String value) {
            addCriterion("trc_name <", value, "trcName");
            return (Criteria) this;
        }

        public Criteria andTrcNameLessThanOrEqualTo(String value) {
            addCriterion("trc_name <=", value, "trcName");
            return (Criteria) this;
        }

        public Criteria andTrcNameLike(String value) {
            addCriterion("trc_name like", value, "trcName");
            return (Criteria) this;
        }

        public Criteria andTrcNameNotLike(String value) {
            addCriterion("trc_name not like", value, "trcName");
            return (Criteria) this;
        }

        public Criteria andTrcNameIn(List<String> values) {
            addCriterion("trc_name in", values, "trcName");
            return (Criteria) this;
        }

        public Criteria andTrcNameNotIn(List<String> values) {
            addCriterion("trc_name not in", values, "trcName");
            return (Criteria) this;
        }

        public Criteria andTrcNameBetween(String value1, String value2) {
            addCriterion("trc_name between", value1, value2, "trcName");
            return (Criteria) this;
        }

        public Criteria andTrcNameNotBetween(String value1, String value2) {
            addCriterion("trc_name not between", value1, value2, "trcName");
            return (Criteria) this;
        }

        public Criteria andTrcDescIsNull() {
            addCriterion("trc_desc is null");
            return (Criteria) this;
        }

        public Criteria andTrcDescIsNotNull() {
            addCriterion("trc_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTrcDescEqualTo(String value) {
            addCriterion("trc_desc =", value, "trcDesc");
            return (Criteria) this;
        }

        public Criteria andTrcDescNotEqualTo(String value) {
            addCriterion("trc_desc <>", value, "trcDesc");
            return (Criteria) this;
        }

        public Criteria andTrcDescGreaterThan(String value) {
            addCriterion("trc_desc >", value, "trcDesc");
            return (Criteria) this;
        }

        public Criteria andTrcDescGreaterThanOrEqualTo(String value) {
            addCriterion("trc_desc >=", value, "trcDesc");
            return (Criteria) this;
        }

        public Criteria andTrcDescLessThan(String value) {
            addCriterion("trc_desc <", value, "trcDesc");
            return (Criteria) this;
        }

        public Criteria andTrcDescLessThanOrEqualTo(String value) {
            addCriterion("trc_desc <=", value, "trcDesc");
            return (Criteria) this;
        }

        public Criteria andTrcDescLike(String value) {
            addCriterion("trc_desc like", value, "trcDesc");
            return (Criteria) this;
        }

        public Criteria andTrcDescNotLike(String value) {
            addCriterion("trc_desc not like", value, "trcDesc");
            return (Criteria) this;
        }

        public Criteria andTrcDescIn(List<String> values) {
            addCriterion("trc_desc in", values, "trcDesc");
            return (Criteria) this;
        }

        public Criteria andTrcDescNotIn(List<String> values) {
            addCriterion("trc_desc not in", values, "trcDesc");
            return (Criteria) this;
        }

        public Criteria andTrcDescBetween(String value1, String value2) {
            addCriterion("trc_desc between", value1, value2, "trcDesc");
            return (Criteria) this;
        }

        public Criteria andTrcDescNotBetween(String value1, String value2) {
            addCriterion("trc_desc not between", value1, value2, "trcDesc");
            return (Criteria) this;
        }

        public Criteria andTrcIndexIsNull() {
            addCriterion("trc_index is null");
            return (Criteria) this;
        }

        public Criteria andTrcIndexIsNotNull() {
            addCriterion("trc_index is not null");
            return (Criteria) this;
        }

        public Criteria andTrcIndexEqualTo(Integer value) {
            addCriterion("trc_index =", value, "trcIndex");
            return (Criteria) this;
        }

        public Criteria andTrcIndexNotEqualTo(Integer value) {
            addCriterion("trc_index <>", value, "trcIndex");
            return (Criteria) this;
        }

        public Criteria andTrcIndexGreaterThan(Integer value) {
            addCriterion("trc_index >", value, "trcIndex");
            return (Criteria) this;
        }

        public Criteria andTrcIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("trc_index >=", value, "trcIndex");
            return (Criteria) this;
        }

        public Criteria andTrcIndexLessThan(Integer value) {
            addCriterion("trc_index <", value, "trcIndex");
            return (Criteria) this;
        }

        public Criteria andTrcIndexLessThanOrEqualTo(Integer value) {
            addCriterion("trc_index <=", value, "trcIndex");
            return (Criteria) this;
        }

        public Criteria andTrcIndexIn(List<Integer> values) {
            addCriterion("trc_index in", values, "trcIndex");
            return (Criteria) this;
        }

        public Criteria andTrcIndexNotIn(List<Integer> values) {
            addCriterion("trc_index not in", values, "trcIndex");
            return (Criteria) this;
        }

        public Criteria andTrcIndexBetween(Integer value1, Integer value2) {
            addCriterion("trc_index between", value1, value2, "trcIndex");
            return (Criteria) this;
        }

        public Criteria andTrcIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("trc_index not between", value1, value2, "trcIndex");
            return (Criteria) this;
        }

        public Criteria andTrcAlarmIsNull() {
            addCriterion("trc_alarm is null");
            return (Criteria) this;
        }

        public Criteria andTrcAlarmIsNotNull() {
            addCriterion("trc_alarm is not null");
            return (Criteria) this;
        }

        public Criteria andTrcAlarmEqualTo(Boolean value) {
            addCriterion("trc_alarm =", value, "trcAlarm");
            return (Criteria) this;
        }

        public Criteria andTrcAlarmNotEqualTo(Boolean value) {
            addCriterion("trc_alarm <>", value, "trcAlarm");
            return (Criteria) this;
        }

        public Criteria andTrcAlarmGreaterThan(Boolean value) {
            addCriterion("trc_alarm >", value, "trcAlarm");
            return (Criteria) this;
        }

        public Criteria andTrcAlarmGreaterThanOrEqualTo(Boolean value) {
            addCriterion("trc_alarm >=", value, "trcAlarm");
            return (Criteria) this;
        }

        public Criteria andTrcAlarmLessThan(Boolean value) {
            addCriterion("trc_alarm <", value, "trcAlarm");
            return (Criteria) this;
        }

        public Criteria andTrcAlarmLessThanOrEqualTo(Boolean value) {
            addCriterion("trc_alarm <=", value, "trcAlarm");
            return (Criteria) this;
        }

        public Criteria andTrcAlarmIn(List<Boolean> values) {
            addCriterion("trc_alarm in", values, "trcAlarm");
            return (Criteria) this;
        }

        public Criteria andTrcAlarmNotIn(List<Boolean> values) {
            addCriterion("trc_alarm not in", values, "trcAlarm");
            return (Criteria) this;
        }

        public Criteria andTrcAlarmBetween(Boolean value1, Boolean value2) {
            addCriterion("trc_alarm between", value1, value2, "trcAlarm");
            return (Criteria) this;
        }

        public Criteria andTrcAlarmNotBetween(Boolean value1, Boolean value2) {
            addCriterion("trc_alarm not between", value1, value2, "trcAlarm");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("is_active is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("is_active is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Boolean value) {
            addCriterion("is_active =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Boolean value) {
            addCriterion("is_active <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Boolean value) {
            addCriterion("is_active >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_active >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Boolean value) {
            addCriterion("is_active <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_active <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Boolean> values) {
            addCriterion("is_active in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Boolean> values) {
            addCriterion("is_active not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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