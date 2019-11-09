package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysProcessParamPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysProcessParamPOExample() {
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

        public Criteria andPpIdIsNull() {
            addCriterion("pp_id is null");
            return (Criteria) this;
        }

        public Criteria andPpIdIsNotNull() {
            addCriterion("pp_id is not null");
            return (Criteria) this;
        }

        public Criteria andPpIdEqualTo(Integer value) {
            addCriterion("pp_id =", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotEqualTo(Integer value) {
            addCriterion("pp_id <>", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdGreaterThan(Integer value) {
            addCriterion("pp_id >", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pp_id >=", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdLessThan(Integer value) {
            addCriterion("pp_id <", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdLessThanOrEqualTo(Integer value) {
            addCriterion("pp_id <=", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdIn(List<Integer> values) {
            addCriterion("pp_id in", values, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotIn(List<Integer> values) {
            addCriterion("pp_id not in", values, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdBetween(Integer value1, Integer value2) {
            addCriterion("pp_id between", value1, value2, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pp_id not between", value1, value2, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpCodeIsNull() {
            addCriterion("pp_code is null");
            return (Criteria) this;
        }

        public Criteria andPpCodeIsNotNull() {
            addCriterion("pp_code is not null");
            return (Criteria) this;
        }

        public Criteria andPpCodeEqualTo(String value) {
            addCriterion("pp_code =", value, "ppCode");
            return (Criteria) this;
        }

        public Criteria andPpCodeNotEqualTo(String value) {
            addCriterion("pp_code <>", value, "ppCode");
            return (Criteria) this;
        }

        public Criteria andPpCodeGreaterThan(String value) {
            addCriterion("pp_code >", value, "ppCode");
            return (Criteria) this;
        }

        public Criteria andPpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pp_code >=", value, "ppCode");
            return (Criteria) this;
        }

        public Criteria andPpCodeLessThan(String value) {
            addCriterion("pp_code <", value, "ppCode");
            return (Criteria) this;
        }

        public Criteria andPpCodeLessThanOrEqualTo(String value) {
            addCriterion("pp_code <=", value, "ppCode");
            return (Criteria) this;
        }

        public Criteria andPpCodeLike(String value) {
            addCriterion("pp_code like", value, "ppCode");
            return (Criteria) this;
        }

        public Criteria andPpCodeNotLike(String value) {
            addCriterion("pp_code not like", value, "ppCode");
            return (Criteria) this;
        }

        public Criteria andPpCodeIn(List<String> values) {
            addCriterion("pp_code in", values, "ppCode");
            return (Criteria) this;
        }

        public Criteria andPpCodeNotIn(List<String> values) {
            addCriterion("pp_code not in", values, "ppCode");
            return (Criteria) this;
        }

        public Criteria andPpCodeBetween(String value1, String value2) {
            addCriterion("pp_code between", value1, value2, "ppCode");
            return (Criteria) this;
        }

        public Criteria andPpCodeNotBetween(String value1, String value2) {
            addCriterion("pp_code not between", value1, value2, "ppCode");
            return (Criteria) this;
        }

        public Criteria andPpNameIsNull() {
            addCriterion("pp_name is null");
            return (Criteria) this;
        }

        public Criteria andPpNameIsNotNull() {
            addCriterion("pp_name is not null");
            return (Criteria) this;
        }

        public Criteria andPpNameEqualTo(String value) {
            addCriterion("pp_name =", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameNotEqualTo(String value) {
            addCriterion("pp_name <>", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameGreaterThan(String value) {
            addCriterion("pp_name >", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameGreaterThanOrEqualTo(String value) {
            addCriterion("pp_name >=", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameLessThan(String value) {
            addCriterion("pp_name <", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameLessThanOrEqualTo(String value) {
            addCriterion("pp_name <=", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameLike(String value) {
            addCriterion("pp_name like", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameNotLike(String value) {
            addCriterion("pp_name not like", value, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameIn(List<String> values) {
            addCriterion("pp_name in", values, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameNotIn(List<String> values) {
            addCriterion("pp_name not in", values, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameBetween(String value1, String value2) {
            addCriterion("pp_name between", value1, value2, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpNameNotBetween(String value1, String value2) {
            addCriterion("pp_name not between", value1, value2, "ppName");
            return (Criteria) this;
        }

        public Criteria andPpOrderIsNull() {
            addCriterion("pp_order is null");
            return (Criteria) this;
        }

        public Criteria andPpOrderIsNotNull() {
            addCriterion("pp_order is not null");
            return (Criteria) this;
        }

        public Criteria andPpOrderEqualTo(Integer value) {
            addCriterion("pp_order =", value, "ppOrder");
            return (Criteria) this;
        }

        public Criteria andPpOrderNotEqualTo(Integer value) {
            addCriterion("pp_order <>", value, "ppOrder");
            return (Criteria) this;
        }

        public Criteria andPpOrderGreaterThan(Integer value) {
            addCriterion("pp_order >", value, "ppOrder");
            return (Criteria) this;
        }

        public Criteria andPpOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("pp_order >=", value, "ppOrder");
            return (Criteria) this;
        }

        public Criteria andPpOrderLessThan(Integer value) {
            addCriterion("pp_order <", value, "ppOrder");
            return (Criteria) this;
        }

        public Criteria andPpOrderLessThanOrEqualTo(Integer value) {
            addCriterion("pp_order <=", value, "ppOrder");
            return (Criteria) this;
        }

        public Criteria andPpOrderIn(List<Integer> values) {
            addCriterion("pp_order in", values, "ppOrder");
            return (Criteria) this;
        }

        public Criteria andPpOrderNotIn(List<Integer> values) {
            addCriterion("pp_order not in", values, "ppOrder");
            return (Criteria) this;
        }

        public Criteria andPpOrderBetween(Integer value1, Integer value2) {
            addCriterion("pp_order between", value1, value2, "ppOrder");
            return (Criteria) this;
        }

        public Criteria andPpOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("pp_order not between", value1, value2, "ppOrder");
            return (Criteria) this;
        }

        public Criteria andPpShowIsNull() {
            addCriterion("pp_show is null");
            return (Criteria) this;
        }

        public Criteria andPpShowIsNotNull() {
            addCriterion("pp_show is not null");
            return (Criteria) this;
        }

        public Criteria andPpShowEqualTo(Boolean value) {
            addCriterion("pp_show =", value, "ppShow");
            return (Criteria) this;
        }

        public Criteria andPpShowNotEqualTo(Boolean value) {
            addCriterion("pp_show <>", value, "ppShow");
            return (Criteria) this;
        }

        public Criteria andPpShowGreaterThan(Boolean value) {
            addCriterion("pp_show >", value, "ppShow");
            return (Criteria) this;
        }

        public Criteria andPpShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pp_show >=", value, "ppShow");
            return (Criteria) this;
        }

        public Criteria andPpShowLessThan(Boolean value) {
            addCriterion("pp_show <", value, "ppShow");
            return (Criteria) this;
        }

        public Criteria andPpShowLessThanOrEqualTo(Boolean value) {
            addCriterion("pp_show <=", value, "ppShow");
            return (Criteria) this;
        }

        public Criteria andPpShowIn(List<Boolean> values) {
            addCriterion("pp_show in", values, "ppShow");
            return (Criteria) this;
        }

        public Criteria andPpShowNotIn(List<Boolean> values) {
            addCriterion("pp_show not in", values, "ppShow");
            return (Criteria) this;
        }

        public Criteria andPpShowBetween(Boolean value1, Boolean value2) {
            addCriterion("pp_show between", value1, value2, "ppShow");
            return (Criteria) this;
        }

        public Criteria andPpShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pp_show not between", value1, value2, "ppShow");
            return (Criteria) this;
        }

        public Criteria andPpTypeIsNull() {
            addCriterion("pp_type is null");
            return (Criteria) this;
        }

        public Criteria andPpTypeIsNotNull() {
            addCriterion("pp_type is not null");
            return (Criteria) this;
        }

        public Criteria andPpTypeEqualTo(String value) {
            addCriterion("pp_type =", value, "ppType");
            return (Criteria) this;
        }

        public Criteria andPpTypeNotEqualTo(String value) {
            addCriterion("pp_type <>", value, "ppType");
            return (Criteria) this;
        }

        public Criteria andPpTypeGreaterThan(String value) {
            addCriterion("pp_type >", value, "ppType");
            return (Criteria) this;
        }

        public Criteria andPpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pp_type >=", value, "ppType");
            return (Criteria) this;
        }

        public Criteria andPpTypeLessThan(String value) {
            addCriterion("pp_type <", value, "ppType");
            return (Criteria) this;
        }

        public Criteria andPpTypeLessThanOrEqualTo(String value) {
            addCriterion("pp_type <=", value, "ppType");
            return (Criteria) this;
        }

        public Criteria andPpTypeLike(String value) {
            addCriterion("pp_type like", value, "ppType");
            return (Criteria) this;
        }

        public Criteria andPpTypeNotLike(String value) {
            addCriterion("pp_type not like", value, "ppType");
            return (Criteria) this;
        }

        public Criteria andPpTypeIn(List<String> values) {
            addCriterion("pp_type in", values, "ppType");
            return (Criteria) this;
        }

        public Criteria andPpTypeNotIn(List<String> values) {
            addCriterion("pp_type not in", values, "ppType");
            return (Criteria) this;
        }

        public Criteria andPpTypeBetween(String value1, String value2) {
            addCriterion("pp_type between", value1, value2, "ppType");
            return (Criteria) this;
        }

        public Criteria andPpTypeNotBetween(String value1, String value2) {
            addCriterion("pp_type not between", value1, value2, "ppType");
            return (Criteria) this;
        }

        public Criteria andPpIsOkIsNull() {
            addCriterion("pp_is_ok is null");
            return (Criteria) this;
        }

        public Criteria andPpIsOkIsNotNull() {
            addCriterion("pp_is_ok is not null");
            return (Criteria) this;
        }

        public Criteria andPpIsOkEqualTo(Boolean value) {
            addCriterion("pp_is_ok =", value, "ppIsOk");
            return (Criteria) this;
        }

        public Criteria andPpIsOkNotEqualTo(Boolean value) {
            addCriterion("pp_is_ok <>", value, "ppIsOk");
            return (Criteria) this;
        }

        public Criteria andPpIsOkGreaterThan(Boolean value) {
            addCriterion("pp_is_ok >", value, "ppIsOk");
            return (Criteria) this;
        }

        public Criteria andPpIsOkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pp_is_ok >=", value, "ppIsOk");
            return (Criteria) this;
        }

        public Criteria andPpIsOkLessThan(Boolean value) {
            addCriterion("pp_is_ok <", value, "ppIsOk");
            return (Criteria) this;
        }

        public Criteria andPpIsOkLessThanOrEqualTo(Boolean value) {
            addCriterion("pp_is_ok <=", value, "ppIsOk");
            return (Criteria) this;
        }

        public Criteria andPpIsOkIn(List<Boolean> values) {
            addCriterion("pp_is_ok in", values, "ppIsOk");
            return (Criteria) this;
        }

        public Criteria andPpIsOkNotIn(List<Boolean> values) {
            addCriterion("pp_is_ok not in", values, "ppIsOk");
            return (Criteria) this;
        }

        public Criteria andPpIsOkBetween(Boolean value1, Boolean value2) {
            addCriterion("pp_is_ok between", value1, value2, "ppIsOk");
            return (Criteria) this;
        }

        public Criteria andPpIsOkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pp_is_ok not between", value1, value2, "ppIsOk");
            return (Criteria) this;
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