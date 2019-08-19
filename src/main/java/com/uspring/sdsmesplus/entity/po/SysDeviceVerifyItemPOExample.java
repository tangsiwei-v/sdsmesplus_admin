package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysDeviceVerifyItemPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysDeviceVerifyItemPOExample() {
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

        public Criteria andDviIdIsNull() {
            addCriterion("dvi_id is null");
            return (Criteria) this;
        }

        public Criteria andDviIdIsNotNull() {
            addCriterion("dvi_id is not null");
            return (Criteria) this;
        }

        public Criteria andDviIdEqualTo(Integer value) {
            addCriterion("dvi_id =", value, "dviId");
            return (Criteria) this;
        }

        public Criteria andDviIdNotEqualTo(Integer value) {
            addCriterion("dvi_id <>", value, "dviId");
            return (Criteria) this;
        }

        public Criteria andDviIdGreaterThan(Integer value) {
            addCriterion("dvi_id >", value, "dviId");
            return (Criteria) this;
        }

        public Criteria andDviIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dvi_id >=", value, "dviId");
            return (Criteria) this;
        }

        public Criteria andDviIdLessThan(Integer value) {
            addCriterion("dvi_id <", value, "dviId");
            return (Criteria) this;
        }

        public Criteria andDviIdLessThanOrEqualTo(Integer value) {
            addCriterion("dvi_id <=", value, "dviId");
            return (Criteria) this;
        }

        public Criteria andDviIdIn(List<Integer> values) {
            addCriterion("dvi_id in", values, "dviId");
            return (Criteria) this;
        }

        public Criteria andDviIdNotIn(List<Integer> values) {
            addCriterion("dvi_id not in", values, "dviId");
            return (Criteria) this;
        }

        public Criteria andDviIdBetween(Integer value1, Integer value2) {
            addCriterion("dvi_id between", value1, value2, "dviId");
            return (Criteria) this;
        }

        public Criteria andDviIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dvi_id not between", value1, value2, "dviId");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNull() {
            addCriterion("line_id is null");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNotNull() {
            addCriterion("line_id is not null");
            return (Criteria) this;
        }

        public Criteria andLineIdEqualTo(Integer value) {
            addCriterion("line_id =", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotEqualTo(Integer value) {
            addCriterion("line_id <>", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThan(Integer value) {
            addCriterion("line_id >", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_id >=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThan(Integer value) {
            addCriterion("line_id <", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("line_id <=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdIn(List<Integer> values) {
            addCriterion("line_id in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotIn(List<Integer> values) {
            addCriterion("line_id not in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdBetween(Integer value1, Integer value2) {
            addCriterion("line_id between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("line_id not between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andDevCodeIsNull() {
            addCriterion("dev_code is null");
            return (Criteria) this;
        }

        public Criteria andDevCodeIsNotNull() {
            addCriterion("dev_code is not null");
            return (Criteria) this;
        }

        public Criteria andDevCodeEqualTo(String value) {
            addCriterion("dev_code =", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeNotEqualTo(String value) {
            addCriterion("dev_code <>", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeGreaterThan(String value) {
            addCriterion("dev_code >", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dev_code >=", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeLessThan(String value) {
            addCriterion("dev_code <", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeLessThanOrEqualTo(String value) {
            addCriterion("dev_code <=", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeLike(String value) {
            addCriterion("dev_code like", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeNotLike(String value) {
            addCriterion("dev_code not like", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeIn(List<String> values) {
            addCriterion("dev_code in", values, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeNotIn(List<String> values) {
            addCriterion("dev_code not in", values, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeBetween(String value1, String value2) {
            addCriterion("dev_code between", value1, value2, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeNotBetween(String value1, String value2) {
            addCriterion("dev_code not between", value1, value2, "devCode");
            return (Criteria) this;
        }

        public Criteria andDviItemIsNull() {
            addCriterion("dvi_item is null");
            return (Criteria) this;
        }

        public Criteria andDviItemIsNotNull() {
            addCriterion("dvi_item is not null");
            return (Criteria) this;
        }

        public Criteria andDviItemEqualTo(String value) {
            addCriterion("dvi_item =", value, "dviItem");
            return (Criteria) this;
        }

        public Criteria andDviItemNotEqualTo(String value) {
            addCriterion("dvi_item <>", value, "dviItem");
            return (Criteria) this;
        }

        public Criteria andDviItemGreaterThan(String value) {
            addCriterion("dvi_item >", value, "dviItem");
            return (Criteria) this;
        }

        public Criteria andDviItemGreaterThanOrEqualTo(String value) {
            addCriterion("dvi_item >=", value, "dviItem");
            return (Criteria) this;
        }

        public Criteria andDviItemLessThan(String value) {
            addCriterion("dvi_item <", value, "dviItem");
            return (Criteria) this;
        }

        public Criteria andDviItemLessThanOrEqualTo(String value) {
            addCriterion("dvi_item <=", value, "dviItem");
            return (Criteria) this;
        }

        public Criteria andDviItemLike(String value) {
            addCriterion("dvi_item like", value, "dviItem");
            return (Criteria) this;
        }

        public Criteria andDviItemNotLike(String value) {
            addCriterion("dvi_item not like", value, "dviItem");
            return (Criteria) this;
        }

        public Criteria andDviItemIn(List<String> values) {
            addCriterion("dvi_item in", values, "dviItem");
            return (Criteria) this;
        }

        public Criteria andDviItemNotIn(List<String> values) {
            addCriterion("dvi_item not in", values, "dviItem");
            return (Criteria) this;
        }

        public Criteria andDviItemBetween(String value1, String value2) {
            addCriterion("dvi_item between", value1, value2, "dviItem");
            return (Criteria) this;
        }

        public Criteria andDviItemNotBetween(String value1, String value2) {
            addCriterion("dvi_item not between", value1, value2, "dviItem");
            return (Criteria) this;
        }

        public Criteria andDviReqIsNull() {
            addCriterion("dvi_req is null");
            return (Criteria) this;
        }

        public Criteria andDviReqIsNotNull() {
            addCriterion("dvi_req is not null");
            return (Criteria) this;
        }

        public Criteria andDviReqEqualTo(String value) {
            addCriterion("dvi_req =", value, "dviReq");
            return (Criteria) this;
        }

        public Criteria andDviReqNotEqualTo(String value) {
            addCriterion("dvi_req <>", value, "dviReq");
            return (Criteria) this;
        }

        public Criteria andDviReqGreaterThan(String value) {
            addCriterion("dvi_req >", value, "dviReq");
            return (Criteria) this;
        }

        public Criteria andDviReqGreaterThanOrEqualTo(String value) {
            addCriterion("dvi_req >=", value, "dviReq");
            return (Criteria) this;
        }

        public Criteria andDviReqLessThan(String value) {
            addCriterion("dvi_req <", value, "dviReq");
            return (Criteria) this;
        }

        public Criteria andDviReqLessThanOrEqualTo(String value) {
            addCriterion("dvi_req <=", value, "dviReq");
            return (Criteria) this;
        }

        public Criteria andDviReqLike(String value) {
            addCriterion("dvi_req like", value, "dviReq");
            return (Criteria) this;
        }

        public Criteria andDviReqNotLike(String value) {
            addCriterion("dvi_req not like", value, "dviReq");
            return (Criteria) this;
        }

        public Criteria andDviReqIn(List<String> values) {
            addCriterion("dvi_req in", values, "dviReq");
            return (Criteria) this;
        }

        public Criteria andDviReqNotIn(List<String> values) {
            addCriterion("dvi_req not in", values, "dviReq");
            return (Criteria) this;
        }

        public Criteria andDviReqBetween(String value1, String value2) {
            addCriterion("dvi_req between", value1, value2, "dviReq");
            return (Criteria) this;
        }

        public Criteria andDviReqNotBetween(String value1, String value2) {
            addCriterion("dvi_req not between", value1, value2, "dviReq");
            return (Criteria) this;
        }

        public Criteria andDviTimeIsNull() {
            addCriterion("dvi_time is null");
            return (Criteria) this;
        }

        public Criteria andDviTimeIsNotNull() {
            addCriterion("dvi_time is not null");
            return (Criteria) this;
        }

        public Criteria andDviTimeEqualTo(String value) {
            addCriterion("dvi_time =", value, "dviTime");
            return (Criteria) this;
        }

        public Criteria andDviTimeNotEqualTo(String value) {
            addCriterion("dvi_time <>", value, "dviTime");
            return (Criteria) this;
        }

        public Criteria andDviTimeGreaterThan(String value) {
            addCriterion("dvi_time >", value, "dviTime");
            return (Criteria) this;
        }

        public Criteria andDviTimeGreaterThanOrEqualTo(String value) {
            addCriterion("dvi_time >=", value, "dviTime");
            return (Criteria) this;
        }

        public Criteria andDviTimeLessThan(String value) {
            addCriterion("dvi_time <", value, "dviTime");
            return (Criteria) this;
        }

        public Criteria andDviTimeLessThanOrEqualTo(String value) {
            addCriterion("dvi_time <=", value, "dviTime");
            return (Criteria) this;
        }

        public Criteria andDviTimeLike(String value) {
            addCriterion("dvi_time like", value, "dviTime");
            return (Criteria) this;
        }

        public Criteria andDviTimeNotLike(String value) {
            addCriterion("dvi_time not like", value, "dviTime");
            return (Criteria) this;
        }

        public Criteria andDviTimeIn(List<String> values) {
            addCriterion("dvi_time in", values, "dviTime");
            return (Criteria) this;
        }

        public Criteria andDviTimeNotIn(List<String> values) {
            addCriterion("dvi_time not in", values, "dviTime");
            return (Criteria) this;
        }

        public Criteria andDviTimeBetween(String value1, String value2) {
            addCriterion("dvi_time between", value1, value2, "dviTime");
            return (Criteria) this;
        }

        public Criteria andDviTimeNotBetween(String value1, String value2) {
            addCriterion("dvi_time not between", value1, value2, "dviTime");
            return (Criteria) this;
        }

        public Criteria andIsSwitchActiveIsNull() {
            addCriterion("is_switch_active is null");
            return (Criteria) this;
        }

        public Criteria andIsSwitchActiveIsNotNull() {
            addCriterion("is_switch_active is not null");
            return (Criteria) this;
        }

        public Criteria andIsSwitchActiveEqualTo(Boolean value) {
            addCriterion("is_switch_active =", value, "isSwitchActive");
            return (Criteria) this;
        }

        public Criteria andIsSwitchActiveNotEqualTo(Boolean value) {
            addCriterion("is_switch_active <>", value, "isSwitchActive");
            return (Criteria) this;
        }

        public Criteria andIsSwitchActiveGreaterThan(Boolean value) {
            addCriterion("is_switch_active >", value, "isSwitchActive");
            return (Criteria) this;
        }

        public Criteria andIsSwitchActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_switch_active >=", value, "isSwitchActive");
            return (Criteria) this;
        }

        public Criteria andIsSwitchActiveLessThan(Boolean value) {
            addCriterion("is_switch_active <", value, "isSwitchActive");
            return (Criteria) this;
        }

        public Criteria andIsSwitchActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_switch_active <=", value, "isSwitchActive");
            return (Criteria) this;
        }

        public Criteria andIsSwitchActiveIn(List<Boolean> values) {
            addCriterion("is_switch_active in", values, "isSwitchActive");
            return (Criteria) this;
        }

        public Criteria andIsSwitchActiveNotIn(List<Boolean> values) {
            addCriterion("is_switch_active not in", values, "isSwitchActive");
            return (Criteria) this;
        }

        public Criteria andIsSwitchActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_switch_active between", value1, value2, "isSwitchActive");
            return (Criteria) this;
        }

        public Criteria andIsSwitchActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_switch_active not between", value1, value2, "isSwitchActive");
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