package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictDataPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictDataPOExample() {
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

        public Criteria andDdIdIsNull() {
            addCriterion("dd_id is null");
            return (Criteria) this;
        }

        public Criteria andDdIdIsNotNull() {
            addCriterion("dd_id is not null");
            return (Criteria) this;
        }

        public Criteria andDdIdEqualTo(Integer value) {
            addCriterion("dd_id =", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdNotEqualTo(Integer value) {
            addCriterion("dd_id <>", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdGreaterThan(Integer value) {
            addCriterion("dd_id >", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dd_id >=", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdLessThan(Integer value) {
            addCriterion("dd_id <", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdLessThanOrEqualTo(Integer value) {
            addCriterion("dd_id <=", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdIn(List<Integer> values) {
            addCriterion("dd_id in", values, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdNotIn(List<Integer> values) {
            addCriterion("dd_id not in", values, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdBetween(Integer value1, Integer value2) {
            addCriterion("dd_id between", value1, value2, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dd_id not between", value1, value2, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdCodeIsNull() {
            addCriterion("dd_code is null");
            return (Criteria) this;
        }

        public Criteria andDdCodeIsNotNull() {
            addCriterion("dd_code is not null");
            return (Criteria) this;
        }

        public Criteria andDdCodeEqualTo(String value) {
            addCriterion("dd_code =", value, "ddCode");
            return (Criteria) this;
        }

        public Criteria andDdCodeNotEqualTo(String value) {
            addCriterion("dd_code <>", value, "ddCode");
            return (Criteria) this;
        }

        public Criteria andDdCodeGreaterThan(String value) {
            addCriterion("dd_code >", value, "ddCode");
            return (Criteria) this;
        }

        public Criteria andDdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dd_code >=", value, "ddCode");
            return (Criteria) this;
        }

        public Criteria andDdCodeLessThan(String value) {
            addCriterion("dd_code <", value, "ddCode");
            return (Criteria) this;
        }

        public Criteria andDdCodeLessThanOrEqualTo(String value) {
            addCriterion("dd_code <=", value, "ddCode");
            return (Criteria) this;
        }

        public Criteria andDdCodeLike(String value) {
            addCriterion("dd_code like", value, "ddCode");
            return (Criteria) this;
        }

        public Criteria andDdCodeNotLike(String value) {
            addCriterion("dd_code not like", value, "ddCode");
            return (Criteria) this;
        }

        public Criteria andDdCodeIn(List<String> values) {
            addCriterion("dd_code in", values, "ddCode");
            return (Criteria) this;
        }

        public Criteria andDdCodeNotIn(List<String> values) {
            addCriterion("dd_code not in", values, "ddCode");
            return (Criteria) this;
        }

        public Criteria andDdCodeBetween(String value1, String value2) {
            addCriterion("dd_code between", value1, value2, "ddCode");
            return (Criteria) this;
        }

        public Criteria andDdCodeNotBetween(String value1, String value2) {
            addCriterion("dd_code not between", value1, value2, "ddCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeIsNull() {
            addCriterion("dt_code is null");
            return (Criteria) this;
        }

        public Criteria andDtCodeIsNotNull() {
            addCriterion("dt_code is not null");
            return (Criteria) this;
        }

        public Criteria andDtCodeEqualTo(String value) {
            addCriterion("dt_code =", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeNotEqualTo(String value) {
            addCriterion("dt_code <>", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeGreaterThan(String value) {
            addCriterion("dt_code >", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dt_code >=", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeLessThan(String value) {
            addCriterion("dt_code <", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeLessThanOrEqualTo(String value) {
            addCriterion("dt_code <=", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeLike(String value) {
            addCriterion("dt_code like", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeNotLike(String value) {
            addCriterion("dt_code not like", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeIn(List<String> values) {
            addCriterion("dt_code in", values, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeNotIn(List<String> values) {
            addCriterion("dt_code not in", values, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeBetween(String value1, String value2) {
            addCriterion("dt_code between", value1, value2, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeNotBetween(String value1, String value2) {
            addCriterion("dt_code not between", value1, value2, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDdNameIsNull() {
            addCriterion("dd_name is null");
            return (Criteria) this;
        }

        public Criteria andDdNameIsNotNull() {
            addCriterion("dd_name is not null");
            return (Criteria) this;
        }

        public Criteria andDdNameEqualTo(String value) {
            addCriterion("dd_name =", value, "ddName");
            return (Criteria) this;
        }

        public Criteria andDdNameNotEqualTo(String value) {
            addCriterion("dd_name <>", value, "ddName");
            return (Criteria) this;
        }

        public Criteria andDdNameGreaterThan(String value) {
            addCriterion("dd_name >", value, "ddName");
            return (Criteria) this;
        }

        public Criteria andDdNameGreaterThanOrEqualTo(String value) {
            addCriterion("dd_name >=", value, "ddName");
            return (Criteria) this;
        }

        public Criteria andDdNameLessThan(String value) {
            addCriterion("dd_name <", value, "ddName");
            return (Criteria) this;
        }

        public Criteria andDdNameLessThanOrEqualTo(String value) {
            addCriterion("dd_name <=", value, "ddName");
            return (Criteria) this;
        }

        public Criteria andDdNameLike(String value) {
            addCriterion("dd_name like", value, "ddName");
            return (Criteria) this;
        }

        public Criteria andDdNameNotLike(String value) {
            addCriterion("dd_name not like", value, "ddName");
            return (Criteria) this;
        }

        public Criteria andDdNameIn(List<String> values) {
            addCriterion("dd_name in", values, "ddName");
            return (Criteria) this;
        }

        public Criteria andDdNameNotIn(List<String> values) {
            addCriterion("dd_name not in", values, "ddName");
            return (Criteria) this;
        }

        public Criteria andDdNameBetween(String value1, String value2) {
            addCriterion("dd_name between", value1, value2, "ddName");
            return (Criteria) this;
        }

        public Criteria andDdNameNotBetween(String value1, String value2) {
            addCriterion("dd_name not between", value1, value2, "ddName");
            return (Criteria) this;
        }

        public Criteria andDdSeqIsNull() {
            addCriterion("dd_seq is null");
            return (Criteria) this;
        }

        public Criteria andDdSeqIsNotNull() {
            addCriterion("dd_seq is not null");
            return (Criteria) this;
        }

        public Criteria andDdSeqEqualTo(Integer value) {
            addCriterion("dd_seq =", value, "ddSeq");
            return (Criteria) this;
        }

        public Criteria andDdSeqNotEqualTo(Integer value) {
            addCriterion("dd_seq <>", value, "ddSeq");
            return (Criteria) this;
        }

        public Criteria andDdSeqGreaterThan(Integer value) {
            addCriterion("dd_seq >", value, "ddSeq");
            return (Criteria) this;
        }

        public Criteria andDdSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("dd_seq >=", value, "ddSeq");
            return (Criteria) this;
        }

        public Criteria andDdSeqLessThan(Integer value) {
            addCriterion("dd_seq <", value, "ddSeq");
            return (Criteria) this;
        }

        public Criteria andDdSeqLessThanOrEqualTo(Integer value) {
            addCriterion("dd_seq <=", value, "ddSeq");
            return (Criteria) this;
        }

        public Criteria andDdSeqIn(List<Integer> values) {
            addCriterion("dd_seq in", values, "ddSeq");
            return (Criteria) this;
        }

        public Criteria andDdSeqNotIn(List<Integer> values) {
            addCriterion("dd_seq not in", values, "ddSeq");
            return (Criteria) this;
        }

        public Criteria andDdSeqBetween(Integer value1, Integer value2) {
            addCriterion("dd_seq between", value1, value2, "ddSeq");
            return (Criteria) this;
        }

        public Criteria andDdSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("dd_seq not between", value1, value2, "ddSeq");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Boolean value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Boolean value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Boolean value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Boolean value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Boolean> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Boolean> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsFixedIsNull() {
            addCriterion("is_fixed is null");
            return (Criteria) this;
        }

        public Criteria andIsFixedIsNotNull() {
            addCriterion("is_fixed is not null");
            return (Criteria) this;
        }

        public Criteria andIsFixedEqualTo(Boolean value) {
            addCriterion("is_fixed =", value, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedNotEqualTo(Boolean value) {
            addCriterion("is_fixed <>", value, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedGreaterThan(Boolean value) {
            addCriterion("is_fixed >", value, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_fixed >=", value, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedLessThan(Boolean value) {
            addCriterion("is_fixed <", value, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_fixed <=", value, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedIn(List<Boolean> values) {
            addCriterion("is_fixed in", values, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedNotIn(List<Boolean> values) {
            addCriterion("is_fixed not in", values, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_fixed between", value1, value2, "isFixed");
            return (Criteria) this;
        }

        public Criteria andIsFixedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_fixed not between", value1, value2, "isFixed");
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

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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