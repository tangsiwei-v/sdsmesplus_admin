package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysMaterialInheritPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMaterialInheritPOExample() {
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

        public Criteria andMathIdIsNull() {
            addCriterion("math_id is null");
            return (Criteria) this;
        }

        public Criteria andMathIdIsNotNull() {
            addCriterion("math_id is not null");
            return (Criteria) this;
        }

        public Criteria andMathIdEqualTo(Integer value) {
            addCriterion("math_id =", value, "mathId");
            return (Criteria) this;
        }

        public Criteria andMathIdNotEqualTo(Integer value) {
            addCriterion("math_id <>", value, "mathId");
            return (Criteria) this;
        }

        public Criteria andMathIdGreaterThan(Integer value) {
            addCriterion("math_id >", value, "mathId");
            return (Criteria) this;
        }

        public Criteria andMathIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("math_id >=", value, "mathId");
            return (Criteria) this;
        }

        public Criteria andMathIdLessThan(Integer value) {
            addCriterion("math_id <", value, "mathId");
            return (Criteria) this;
        }

        public Criteria andMathIdLessThanOrEqualTo(Integer value) {
            addCriterion("math_id <=", value, "mathId");
            return (Criteria) this;
        }

        public Criteria andMathIdIn(List<Integer> values) {
            addCriterion("math_id in", values, "mathId");
            return (Criteria) this;
        }

        public Criteria andMathIdNotIn(List<Integer> values) {
            addCriterion("math_id not in", values, "mathId");
            return (Criteria) this;
        }

        public Criteria andMathIdBetween(Integer value1, Integer value2) {
            addCriterion("math_id between", value1, value2, "mathId");
            return (Criteria) this;
        }

        public Criteria andMathIdNotBetween(Integer value1, Integer value2) {
            addCriterion("math_id not between", value1, value2, "mathId");
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

        public Criteria andMatCodeIsNull() {
            addCriterion("mat_code is null");
            return (Criteria) this;
        }

        public Criteria andMatCodeIsNotNull() {
            addCriterion("mat_code is not null");
            return (Criteria) this;
        }

        public Criteria andMatCodeEqualTo(String value) {
            addCriterion("mat_code =", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeNotEqualTo(String value) {
            addCriterion("mat_code <>", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeGreaterThan(String value) {
            addCriterion("mat_code >", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mat_code >=", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeLessThan(String value) {
            addCriterion("mat_code <", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeLessThanOrEqualTo(String value) {
            addCriterion("mat_code <=", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeLike(String value) {
            addCriterion("mat_code like", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeNotLike(String value) {
            addCriterion("mat_code not like", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeIn(List<String> values) {
            addCriterion("mat_code in", values, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeNotIn(List<String> values) {
            addCriterion("mat_code not in", values, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeBetween(String value1, String value2) {
            addCriterion("mat_code between", value1, value2, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeNotBetween(String value1, String value2) {
            addCriterion("mat_code not between", value1, value2, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatNameIsNull() {
            addCriterion("mat_name is null");
            return (Criteria) this;
        }

        public Criteria andMatNameIsNotNull() {
            addCriterion("mat_name is not null");
            return (Criteria) this;
        }

        public Criteria andMatNameEqualTo(String value) {
            addCriterion("mat_name =", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameNotEqualTo(String value) {
            addCriterion("mat_name <>", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameGreaterThan(String value) {
            addCriterion("mat_name >", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameGreaterThanOrEqualTo(String value) {
            addCriterion("mat_name >=", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameLessThan(String value) {
            addCriterion("mat_name <", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameLessThanOrEqualTo(String value) {
            addCriterion("mat_name <=", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameLike(String value) {
            addCriterion("mat_name like", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameNotLike(String value) {
            addCriterion("mat_name not like", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameIn(List<String> values) {
            addCriterion("mat_name in", values, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameNotIn(List<String> values) {
            addCriterion("mat_name not in", values, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameBetween(String value1, String value2) {
            addCriterion("mat_name between", value1, value2, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameNotBetween(String value1, String value2) {
            addCriterion("mat_name not between", value1, value2, "matName");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatCodeIsNull() {
            addCriterion("furnace_mat_code is null");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatCodeIsNotNull() {
            addCriterion("furnace_mat_code is not null");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatCodeEqualTo(String value) {
            addCriterion("furnace_mat_code =", value, "furnaceMatCode");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatCodeNotEqualTo(String value) {
            addCriterion("furnace_mat_code <>", value, "furnaceMatCode");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatCodeGreaterThan(String value) {
            addCriterion("furnace_mat_code >", value, "furnaceMatCode");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatCodeGreaterThanOrEqualTo(String value) {
            addCriterion("furnace_mat_code >=", value, "furnaceMatCode");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatCodeLessThan(String value) {
            addCriterion("furnace_mat_code <", value, "furnaceMatCode");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatCodeLessThanOrEqualTo(String value) {
            addCriterion("furnace_mat_code <=", value, "furnaceMatCode");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatCodeLike(String value) {
            addCriterion("furnace_mat_code like", value, "furnaceMatCode");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatCodeNotLike(String value) {
            addCriterion("furnace_mat_code not like", value, "furnaceMatCode");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatCodeIn(List<String> values) {
            addCriterion("furnace_mat_code in", values, "furnaceMatCode");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatCodeNotIn(List<String> values) {
            addCriterion("furnace_mat_code not in", values, "furnaceMatCode");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatCodeBetween(String value1, String value2) {
            addCriterion("furnace_mat_code between", value1, value2, "furnaceMatCode");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatCodeNotBetween(String value1, String value2) {
            addCriterion("furnace_mat_code not between", value1, value2, "furnaceMatCode");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatNameIsNull() {
            addCriterion("furnace_mat_name is null");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatNameIsNotNull() {
            addCriterion("furnace_mat_name is not null");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatNameEqualTo(String value) {
            addCriterion("furnace_mat_name =", value, "furnaceMatName");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatNameNotEqualTo(String value) {
            addCriterion("furnace_mat_name <>", value, "furnaceMatName");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatNameGreaterThan(String value) {
            addCriterion("furnace_mat_name >", value, "furnaceMatName");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatNameGreaterThanOrEqualTo(String value) {
            addCriterion("furnace_mat_name >=", value, "furnaceMatName");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatNameLessThan(String value) {
            addCriterion("furnace_mat_name <", value, "furnaceMatName");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatNameLessThanOrEqualTo(String value) {
            addCriterion("furnace_mat_name <=", value, "furnaceMatName");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatNameLike(String value) {
            addCriterion("furnace_mat_name like", value, "furnaceMatName");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatNameNotLike(String value) {
            addCriterion("furnace_mat_name not like", value, "furnaceMatName");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatNameIn(List<String> values) {
            addCriterion("furnace_mat_name in", values, "furnaceMatName");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatNameNotIn(List<String> values) {
            addCriterion("furnace_mat_name not in", values, "furnaceMatName");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatNameBetween(String value1, String value2) {
            addCriterion("furnace_mat_name between", value1, value2, "furnaceMatName");
            return (Criteria) this;
        }

        public Criteria andFurnaceMatNameNotBetween(String value1, String value2) {
            addCriterion("furnace_mat_name not between", value1, value2, "furnaceMatName");
            return (Criteria) this;
        }

        public Criteria andBatchMatCodeIsNull() {
            addCriterion("batch_mat_code is null");
            return (Criteria) this;
        }

        public Criteria andBatchMatCodeIsNotNull() {
            addCriterion("batch_mat_code is not null");
            return (Criteria) this;
        }

        public Criteria andBatchMatCodeEqualTo(String value) {
            addCriterion("batch_mat_code =", value, "batchMatCode");
            return (Criteria) this;
        }

        public Criteria andBatchMatCodeNotEqualTo(String value) {
            addCriterion("batch_mat_code <>", value, "batchMatCode");
            return (Criteria) this;
        }

        public Criteria andBatchMatCodeGreaterThan(String value) {
            addCriterion("batch_mat_code >", value, "batchMatCode");
            return (Criteria) this;
        }

        public Criteria andBatchMatCodeGreaterThanOrEqualTo(String value) {
            addCriterion("batch_mat_code >=", value, "batchMatCode");
            return (Criteria) this;
        }

        public Criteria andBatchMatCodeLessThan(String value) {
            addCriterion("batch_mat_code <", value, "batchMatCode");
            return (Criteria) this;
        }

        public Criteria andBatchMatCodeLessThanOrEqualTo(String value) {
            addCriterion("batch_mat_code <=", value, "batchMatCode");
            return (Criteria) this;
        }

        public Criteria andBatchMatCodeLike(String value) {
            addCriterion("batch_mat_code like", value, "batchMatCode");
            return (Criteria) this;
        }

        public Criteria andBatchMatCodeNotLike(String value) {
            addCriterion("batch_mat_code not like", value, "batchMatCode");
            return (Criteria) this;
        }

        public Criteria andBatchMatCodeIn(List<String> values) {
            addCriterion("batch_mat_code in", values, "batchMatCode");
            return (Criteria) this;
        }

        public Criteria andBatchMatCodeNotIn(List<String> values) {
            addCriterion("batch_mat_code not in", values, "batchMatCode");
            return (Criteria) this;
        }

        public Criteria andBatchMatCodeBetween(String value1, String value2) {
            addCriterion("batch_mat_code between", value1, value2, "batchMatCode");
            return (Criteria) this;
        }

        public Criteria andBatchMatCodeNotBetween(String value1, String value2) {
            addCriterion("batch_mat_code not between", value1, value2, "batchMatCode");
            return (Criteria) this;
        }

        public Criteria andBatchMatNameIsNull() {
            addCriterion("batch_mat_name is null");
            return (Criteria) this;
        }

        public Criteria andBatchMatNameIsNotNull() {
            addCriterion("batch_mat_name is not null");
            return (Criteria) this;
        }

        public Criteria andBatchMatNameEqualTo(String value) {
            addCriterion("batch_mat_name =", value, "batchMatName");
            return (Criteria) this;
        }

        public Criteria andBatchMatNameNotEqualTo(String value) {
            addCriterion("batch_mat_name <>", value, "batchMatName");
            return (Criteria) this;
        }

        public Criteria andBatchMatNameGreaterThan(String value) {
            addCriterion("batch_mat_name >", value, "batchMatName");
            return (Criteria) this;
        }

        public Criteria andBatchMatNameGreaterThanOrEqualTo(String value) {
            addCriterion("batch_mat_name >=", value, "batchMatName");
            return (Criteria) this;
        }

        public Criteria andBatchMatNameLessThan(String value) {
            addCriterion("batch_mat_name <", value, "batchMatName");
            return (Criteria) this;
        }

        public Criteria andBatchMatNameLessThanOrEqualTo(String value) {
            addCriterion("batch_mat_name <=", value, "batchMatName");
            return (Criteria) this;
        }

        public Criteria andBatchMatNameLike(String value) {
            addCriterion("batch_mat_name like", value, "batchMatName");
            return (Criteria) this;
        }

        public Criteria andBatchMatNameNotLike(String value) {
            addCriterion("batch_mat_name not like", value, "batchMatName");
            return (Criteria) this;
        }

        public Criteria andBatchMatNameIn(List<String> values) {
            addCriterion("batch_mat_name in", values, "batchMatName");
            return (Criteria) this;
        }

        public Criteria andBatchMatNameNotIn(List<String> values) {
            addCriterion("batch_mat_name not in", values, "batchMatName");
            return (Criteria) this;
        }

        public Criteria andBatchMatNameBetween(String value1, String value2) {
            addCriterion("batch_mat_name between", value1, value2, "batchMatName");
            return (Criteria) this;
        }

        public Criteria andBatchMatNameNotBetween(String value1, String value2) {
            addCriterion("batch_mat_name not between", value1, value2, "batchMatName");
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