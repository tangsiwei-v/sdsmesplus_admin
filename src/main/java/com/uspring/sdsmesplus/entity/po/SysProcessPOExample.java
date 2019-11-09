package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysProcessPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysProcessPOExample() {
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

        public Criteria andSpIdIsNull() {
            addCriterion("sp_id is null");
            return (Criteria) this;
        }

        public Criteria andSpIdIsNotNull() {
            addCriterion("sp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdEqualTo(Integer value) {
            addCriterion("sp_id =", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotEqualTo(Integer value) {
            addCriterion("sp_id <>", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThan(Integer value) {
            addCriterion("sp_id >", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_id >=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThan(Integer value) {
            addCriterion("sp_id <", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThanOrEqualTo(Integer value) {
            addCriterion("sp_id <=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdIn(List<Integer> values) {
            addCriterion("sp_id in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotIn(List<Integer> values) {
            addCriterion("sp_id not in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdBetween(Integer value1, Integer value2) {
            addCriterion("sp_id between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_id not between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpCodeIsNull() {
            addCriterion("sp_code is null");
            return (Criteria) this;
        }

        public Criteria andSpCodeIsNotNull() {
            addCriterion("sp_code is not null");
            return (Criteria) this;
        }

        public Criteria andSpCodeEqualTo(String value) {
            addCriterion("sp_code =", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotEqualTo(String value) {
            addCriterion("sp_code <>", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeGreaterThan(String value) {
            addCriterion("sp_code >", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sp_code >=", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeLessThan(String value) {
            addCriterion("sp_code <", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeLessThanOrEqualTo(String value) {
            addCriterion("sp_code <=", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeLike(String value) {
            addCriterion("sp_code like", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotLike(String value) {
            addCriterion("sp_code not like", value, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeIn(List<String> values) {
            addCriterion("sp_code in", values, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotIn(List<String> values) {
            addCriterion("sp_code not in", values, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeBetween(String value1, String value2) {
            addCriterion("sp_code between", value1, value2, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpCodeNotBetween(String value1, String value2) {
            addCriterion("sp_code not between", value1, value2, "spCode");
            return (Criteria) this;
        }

        public Criteria andSpNameIsNull() {
            addCriterion("sp_name is null");
            return (Criteria) this;
        }

        public Criteria andSpNameIsNotNull() {
            addCriterion("sp_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpNameEqualTo(String value) {
            addCriterion("sp_name =", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotEqualTo(String value) {
            addCriterion("sp_name <>", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameGreaterThan(String value) {
            addCriterion("sp_name >", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_name >=", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLessThan(String value) {
            addCriterion("sp_name <", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLessThanOrEqualTo(String value) {
            addCriterion("sp_name <=", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLike(String value) {
            addCriterion("sp_name like", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotLike(String value) {
            addCriterion("sp_name not like", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameIn(List<String> values) {
            addCriterion("sp_name in", values, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotIn(List<String> values) {
            addCriterion("sp_name not in", values, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameBetween(String value1, String value2) {
            addCriterion("sp_name between", value1, value2, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotBetween(String value1, String value2) {
            addCriterion("sp_name not between", value1, value2, "spName");
            return (Criteria) this;
        }

        public Criteria andSpOrderIsNull() {
            addCriterion("sp_order is null");
            return (Criteria) this;
        }

        public Criteria andSpOrderIsNotNull() {
            addCriterion("sp_order is not null");
            return (Criteria) this;
        }

        public Criteria andSpOrderEqualTo(Integer value) {
            addCriterion("sp_order =", value, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderNotEqualTo(Integer value) {
            addCriterion("sp_order <>", value, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderGreaterThan(Integer value) {
            addCriterion("sp_order >", value, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_order >=", value, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderLessThan(Integer value) {
            addCriterion("sp_order <", value, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderLessThanOrEqualTo(Integer value) {
            addCriterion("sp_order <=", value, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderIn(List<Integer> values) {
            addCriterion("sp_order in", values, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderNotIn(List<Integer> values) {
            addCriterion("sp_order not in", values, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderBetween(Integer value1, Integer value2) {
            addCriterion("sp_order between", value1, value2, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_order not between", value1, value2, "spOrder");
            return (Criteria) this;
        }

        public Criteria andSpShowIsNull() {
            addCriterion("sp_show is null");
            return (Criteria) this;
        }

        public Criteria andSpShowIsNotNull() {
            addCriterion("sp_show is not null");
            return (Criteria) this;
        }

        public Criteria andSpShowEqualTo(Boolean value) {
            addCriterion("sp_show =", value, "spShow");
            return (Criteria) this;
        }

        public Criteria andSpShowNotEqualTo(Boolean value) {
            addCriterion("sp_show <>", value, "spShow");
            return (Criteria) this;
        }

        public Criteria andSpShowGreaterThan(Boolean value) {
            addCriterion("sp_show >", value, "spShow");
            return (Criteria) this;
        }

        public Criteria andSpShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sp_show >=", value, "spShow");
            return (Criteria) this;
        }

        public Criteria andSpShowLessThan(Boolean value) {
            addCriterion("sp_show <", value, "spShow");
            return (Criteria) this;
        }

        public Criteria andSpShowLessThanOrEqualTo(Boolean value) {
            addCriterion("sp_show <=", value, "spShow");
            return (Criteria) this;
        }

        public Criteria andSpShowIn(List<Boolean> values) {
            addCriterion("sp_show in", values, "spShow");
            return (Criteria) this;
        }

        public Criteria andSpShowNotIn(List<Boolean> values) {
            addCriterion("sp_show not in", values, "spShow");
            return (Criteria) this;
        }

        public Criteria andSpShowBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_show between", value1, value2, "spShow");
            return (Criteria) this;
        }

        public Criteria andSpShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_show not between", value1, value2, "spShow");
            return (Criteria) this;
        }

        public Criteria andSpCheckIsNull() {
            addCriterion("sp_check is null");
            return (Criteria) this;
        }

        public Criteria andSpCheckIsNotNull() {
            addCriterion("sp_check is not null");
            return (Criteria) this;
        }

        public Criteria andSpCheckEqualTo(Boolean value) {
            addCriterion("sp_check =", value, "spCheck");
            return (Criteria) this;
        }

        public Criteria andSpCheckNotEqualTo(Boolean value) {
            addCriterion("sp_check <>", value, "spCheck");
            return (Criteria) this;
        }

        public Criteria andSpCheckGreaterThan(Boolean value) {
            addCriterion("sp_check >", value, "spCheck");
            return (Criteria) this;
        }

        public Criteria andSpCheckGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sp_check >=", value, "spCheck");
            return (Criteria) this;
        }

        public Criteria andSpCheckLessThan(Boolean value) {
            addCriterion("sp_check <", value, "spCheck");
            return (Criteria) this;
        }

        public Criteria andSpCheckLessThanOrEqualTo(Boolean value) {
            addCriterion("sp_check <=", value, "spCheck");
            return (Criteria) this;
        }

        public Criteria andSpCheckIn(List<Boolean> values) {
            addCriterion("sp_check in", values, "spCheck");
            return (Criteria) this;
        }

        public Criteria andSpCheckNotIn(List<Boolean> values) {
            addCriterion("sp_check not in", values, "spCheck");
            return (Criteria) this;
        }

        public Criteria andSpCheckBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_check between", value1, value2, "spCheck");
            return (Criteria) this;
        }

        public Criteria andSpCheckNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_check not between", value1, value2, "spCheck");
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