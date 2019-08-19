package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodePackagePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodePackagePOExample() {
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

        public Criteria andCpIdIsNull() {
            addCriterion("cp_id is null");
            return (Criteria) this;
        }

        public Criteria andCpIdIsNotNull() {
            addCriterion("cp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpIdEqualTo(Integer value) {
            addCriterion("cp_id =", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotEqualTo(Integer value) {
            addCriterion("cp_id <>", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThan(Integer value) {
            addCriterion("cp_id >", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cp_id >=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThan(Integer value) {
            addCriterion("cp_id <", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThanOrEqualTo(Integer value) {
            addCriterion("cp_id <=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdIn(List<Integer> values) {
            addCriterion("cp_id in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotIn(List<Integer> values) {
            addCriterion("cp_id not in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdBetween(Integer value1, Integer value2) {
            addCriterion("cp_id between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cp_id not between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andHuTypeIsNull() {
            addCriterion("hu_type is null");
            return (Criteria) this;
        }

        public Criteria andHuTypeIsNotNull() {
            addCriterion("hu_type is not null");
            return (Criteria) this;
        }

        public Criteria andHuTypeEqualTo(String value) {
            addCriterion("hu_type =", value, "huType");
            return (Criteria) this;
        }

        public Criteria andHuTypeNotEqualTo(String value) {
            addCriterion("hu_type <>", value, "huType");
            return (Criteria) this;
        }

        public Criteria andHuTypeGreaterThan(String value) {
            addCriterion("hu_type >", value, "huType");
            return (Criteria) this;
        }

        public Criteria andHuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hu_type >=", value, "huType");
            return (Criteria) this;
        }

        public Criteria andHuTypeLessThan(String value) {
            addCriterion("hu_type <", value, "huType");
            return (Criteria) this;
        }

        public Criteria andHuTypeLessThanOrEqualTo(String value) {
            addCriterion("hu_type <=", value, "huType");
            return (Criteria) this;
        }

        public Criteria andHuTypeLike(String value) {
            addCriterion("hu_type like", value, "huType");
            return (Criteria) this;
        }

        public Criteria andHuTypeNotLike(String value) {
            addCriterion("hu_type not like", value, "huType");
            return (Criteria) this;
        }

        public Criteria andHuTypeIn(List<String> values) {
            addCriterion("hu_type in", values, "huType");
            return (Criteria) this;
        }

        public Criteria andHuTypeNotIn(List<String> values) {
            addCriterion("hu_type not in", values, "huType");
            return (Criteria) this;
        }

        public Criteria andHuTypeBetween(String value1, String value2) {
            addCriterion("hu_type between", value1, value2, "huType");
            return (Criteria) this;
        }

        public Criteria andHuTypeNotBetween(String value1, String value2) {
            addCriterion("hu_type not between", value1, value2, "huType");
            return (Criteria) this;
        }

        public Criteria andPkgDayIsNull() {
            addCriterion("pkg_day is null");
            return (Criteria) this;
        }

        public Criteria andPkgDayIsNotNull() {
            addCriterion("pkg_day is not null");
            return (Criteria) this;
        }

        public Criteria andPkgDayEqualTo(String value) {
            addCriterion("pkg_day =", value, "pkgDay");
            return (Criteria) this;
        }

        public Criteria andPkgDayNotEqualTo(String value) {
            addCriterion("pkg_day <>", value, "pkgDay");
            return (Criteria) this;
        }

        public Criteria andPkgDayGreaterThan(String value) {
            addCriterion("pkg_day >", value, "pkgDay");
            return (Criteria) this;
        }

        public Criteria andPkgDayGreaterThanOrEqualTo(String value) {
            addCriterion("pkg_day >=", value, "pkgDay");
            return (Criteria) this;
        }

        public Criteria andPkgDayLessThan(String value) {
            addCriterion("pkg_day <", value, "pkgDay");
            return (Criteria) this;
        }

        public Criteria andPkgDayLessThanOrEqualTo(String value) {
            addCriterion("pkg_day <=", value, "pkgDay");
            return (Criteria) this;
        }

        public Criteria andPkgDayLike(String value) {
            addCriterion("pkg_day like", value, "pkgDay");
            return (Criteria) this;
        }

        public Criteria andPkgDayNotLike(String value) {
            addCriterion("pkg_day not like", value, "pkgDay");
            return (Criteria) this;
        }

        public Criteria andPkgDayIn(List<String> values) {
            addCriterion("pkg_day in", values, "pkgDay");
            return (Criteria) this;
        }

        public Criteria andPkgDayNotIn(List<String> values) {
            addCriterion("pkg_day not in", values, "pkgDay");
            return (Criteria) this;
        }

        public Criteria andPkgDayBetween(String value1, String value2) {
            addCriterion("pkg_day between", value1, value2, "pkgDay");
            return (Criteria) this;
        }

        public Criteria andPkgDayNotBetween(String value1, String value2) {
            addCriterion("pkg_day not between", value1, value2, "pkgDay");
            return (Criteria) this;
        }

        public Criteria andFcPkgIdIsNull() {
            addCriterion("fc_pkg_id is null");
            return (Criteria) this;
        }

        public Criteria andFcPkgIdIsNotNull() {
            addCriterion("fc_pkg_id is not null");
            return (Criteria) this;
        }

        public Criteria andFcPkgIdEqualTo(String value) {
            addCriterion("fc_pkg_id =", value, "fcPkgId");
            return (Criteria) this;
        }

        public Criteria andFcPkgIdNotEqualTo(String value) {
            addCriterion("fc_pkg_id <>", value, "fcPkgId");
            return (Criteria) this;
        }

        public Criteria andFcPkgIdGreaterThan(String value) {
            addCriterion("fc_pkg_id >", value, "fcPkgId");
            return (Criteria) this;
        }

        public Criteria andFcPkgIdGreaterThanOrEqualTo(String value) {
            addCriterion("fc_pkg_id >=", value, "fcPkgId");
            return (Criteria) this;
        }

        public Criteria andFcPkgIdLessThan(String value) {
            addCriterion("fc_pkg_id <", value, "fcPkgId");
            return (Criteria) this;
        }

        public Criteria andFcPkgIdLessThanOrEqualTo(String value) {
            addCriterion("fc_pkg_id <=", value, "fcPkgId");
            return (Criteria) this;
        }

        public Criteria andFcPkgIdLike(String value) {
            addCriterion("fc_pkg_id like", value, "fcPkgId");
            return (Criteria) this;
        }

        public Criteria andFcPkgIdNotLike(String value) {
            addCriterion("fc_pkg_id not like", value, "fcPkgId");
            return (Criteria) this;
        }

        public Criteria andFcPkgIdIn(List<String> values) {
            addCriterion("fc_pkg_id in", values, "fcPkgId");
            return (Criteria) this;
        }

        public Criteria andFcPkgIdNotIn(List<String> values) {
            addCriterion("fc_pkg_id not in", values, "fcPkgId");
            return (Criteria) this;
        }

        public Criteria andFcPkgIdBetween(String value1, String value2) {
            addCriterion("fc_pkg_id between", value1, value2, "fcPkgId");
            return (Criteria) this;
        }

        public Criteria andFcPkgIdNotBetween(String value1, String value2) {
            addCriterion("fc_pkg_id not between", value1, value2, "fcPkgId");
            return (Criteria) this;
        }

        public Criteria andPkgSysteamIsNull() {
            addCriterion("pkg_systeam is null");
            return (Criteria) this;
        }

        public Criteria andPkgSysteamIsNotNull() {
            addCriterion("pkg_systeam is not null");
            return (Criteria) this;
        }

        public Criteria andPkgSysteamEqualTo(String value) {
            addCriterion("pkg_systeam =", value, "pkgSysteam");
            return (Criteria) this;
        }

        public Criteria andPkgSysteamNotEqualTo(String value) {
            addCriterion("pkg_systeam <>", value, "pkgSysteam");
            return (Criteria) this;
        }

        public Criteria andPkgSysteamGreaterThan(String value) {
            addCriterion("pkg_systeam >", value, "pkgSysteam");
            return (Criteria) this;
        }

        public Criteria andPkgSysteamGreaterThanOrEqualTo(String value) {
            addCriterion("pkg_systeam >=", value, "pkgSysteam");
            return (Criteria) this;
        }

        public Criteria andPkgSysteamLessThan(String value) {
            addCriterion("pkg_systeam <", value, "pkgSysteam");
            return (Criteria) this;
        }

        public Criteria andPkgSysteamLessThanOrEqualTo(String value) {
            addCriterion("pkg_systeam <=", value, "pkgSysteam");
            return (Criteria) this;
        }

        public Criteria andPkgSysteamLike(String value) {
            addCriterion("pkg_systeam like", value, "pkgSysteam");
            return (Criteria) this;
        }

        public Criteria andPkgSysteamNotLike(String value) {
            addCriterion("pkg_systeam not like", value, "pkgSysteam");
            return (Criteria) this;
        }

        public Criteria andPkgSysteamIn(List<String> values) {
            addCriterion("pkg_systeam in", values, "pkgSysteam");
            return (Criteria) this;
        }

        public Criteria andPkgSysteamNotIn(List<String> values) {
            addCriterion("pkg_systeam not in", values, "pkgSysteam");
            return (Criteria) this;
        }

        public Criteria andPkgSysteamBetween(String value1, String value2) {
            addCriterion("pkg_systeam between", value1, value2, "pkgSysteam");
            return (Criteria) this;
        }

        public Criteria andPkgSysteamNotBetween(String value1, String value2) {
            addCriterion("pkg_systeam not between", value1, value2, "pkgSysteam");
            return (Criteria) this;
        }

        public Criteria andPkgCounterIsNull() {
            addCriterion("pkg_counter is null");
            return (Criteria) this;
        }

        public Criteria andPkgCounterIsNotNull() {
            addCriterion("pkg_counter is not null");
            return (Criteria) this;
        }

        public Criteria andPkgCounterEqualTo(Integer value) {
            addCriterion("pkg_counter =", value, "pkgCounter");
            return (Criteria) this;
        }

        public Criteria andPkgCounterNotEqualTo(Integer value) {
            addCriterion("pkg_counter <>", value, "pkgCounter");
            return (Criteria) this;
        }

        public Criteria andPkgCounterGreaterThan(Integer value) {
            addCriterion("pkg_counter >", value, "pkgCounter");
            return (Criteria) this;
        }

        public Criteria andPkgCounterGreaterThanOrEqualTo(Integer value) {
            addCriterion("pkg_counter >=", value, "pkgCounter");
            return (Criteria) this;
        }

        public Criteria andPkgCounterLessThan(Integer value) {
            addCriterion("pkg_counter <", value, "pkgCounter");
            return (Criteria) this;
        }

        public Criteria andPkgCounterLessThanOrEqualTo(Integer value) {
            addCriterion("pkg_counter <=", value, "pkgCounter");
            return (Criteria) this;
        }

        public Criteria andPkgCounterIn(List<Integer> values) {
            addCriterion("pkg_counter in", values, "pkgCounter");
            return (Criteria) this;
        }

        public Criteria andPkgCounterNotIn(List<Integer> values) {
            addCriterion("pkg_counter not in", values, "pkgCounter");
            return (Criteria) this;
        }

        public Criteria andPkgCounterBetween(Integer value1, Integer value2) {
            addCriterion("pkg_counter between", value1, value2, "pkgCounter");
            return (Criteria) this;
        }

        public Criteria andPkgCounterNotBetween(Integer value1, Integer value2) {
            addCriterion("pkg_counter not between", value1, value2, "pkgCounter");
            return (Criteria) this;
        }

        public Criteria andPkgCodeIsNull() {
            addCriterion("pkg_code is null");
            return (Criteria) this;
        }

        public Criteria andPkgCodeIsNotNull() {
            addCriterion("pkg_code is not null");
            return (Criteria) this;
        }

        public Criteria andPkgCodeEqualTo(String value) {
            addCriterion("pkg_code =", value, "pkgCode");
            return (Criteria) this;
        }

        public Criteria andPkgCodeNotEqualTo(String value) {
            addCriterion("pkg_code <>", value, "pkgCode");
            return (Criteria) this;
        }

        public Criteria andPkgCodeGreaterThan(String value) {
            addCriterion("pkg_code >", value, "pkgCode");
            return (Criteria) this;
        }

        public Criteria andPkgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pkg_code >=", value, "pkgCode");
            return (Criteria) this;
        }

        public Criteria andPkgCodeLessThan(String value) {
            addCriterion("pkg_code <", value, "pkgCode");
            return (Criteria) this;
        }

        public Criteria andPkgCodeLessThanOrEqualTo(String value) {
            addCriterion("pkg_code <=", value, "pkgCode");
            return (Criteria) this;
        }

        public Criteria andPkgCodeLike(String value) {
            addCriterion("pkg_code like", value, "pkgCode");
            return (Criteria) this;
        }

        public Criteria andPkgCodeNotLike(String value) {
            addCriterion("pkg_code not like", value, "pkgCode");
            return (Criteria) this;
        }

        public Criteria andPkgCodeIn(List<String> values) {
            addCriterion("pkg_code in", values, "pkgCode");
            return (Criteria) this;
        }

        public Criteria andPkgCodeNotIn(List<String> values) {
            addCriterion("pkg_code not in", values, "pkgCode");
            return (Criteria) this;
        }

        public Criteria andPkgCodeBetween(String value1, String value2) {
            addCriterion("pkg_code between", value1, value2, "pkgCode");
            return (Criteria) this;
        }

        public Criteria andPkgCodeNotBetween(String value1, String value2) {
            addCriterion("pkg_code not between", value1, value2, "pkgCode");
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