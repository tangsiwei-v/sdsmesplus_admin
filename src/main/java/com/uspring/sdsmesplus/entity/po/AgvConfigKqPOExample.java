package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgvConfigKqPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgvConfigKqPOExample() {
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

        public Criteria andAgvcfgIdIsNull() {
            addCriterion("agvcfg_id is null");
            return (Criteria) this;
        }

        public Criteria andAgvcfgIdIsNotNull() {
            addCriterion("agvcfg_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgvcfgIdEqualTo(Integer value) {
            addCriterion("agvcfg_id =", value, "agvcfgId");
            return (Criteria) this;
        }

        public Criteria andAgvcfgIdNotEqualTo(Integer value) {
            addCriterion("agvcfg_id <>", value, "agvcfgId");
            return (Criteria) this;
        }

        public Criteria andAgvcfgIdGreaterThan(Integer value) {
            addCriterion("agvcfg_id >", value, "agvcfgId");
            return (Criteria) this;
        }

        public Criteria andAgvcfgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agvcfg_id >=", value, "agvcfgId");
            return (Criteria) this;
        }

        public Criteria andAgvcfgIdLessThan(Integer value) {
            addCriterion("agvcfg_id <", value, "agvcfgId");
            return (Criteria) this;
        }

        public Criteria andAgvcfgIdLessThanOrEqualTo(Integer value) {
            addCriterion("agvcfg_id <=", value, "agvcfgId");
            return (Criteria) this;
        }

        public Criteria andAgvcfgIdIn(List<Integer> values) {
            addCriterion("agvcfg_id in", values, "agvcfgId");
            return (Criteria) this;
        }

        public Criteria andAgvcfgIdNotIn(List<Integer> values) {
            addCriterion("agvcfg_id not in", values, "agvcfgId");
            return (Criteria) this;
        }

        public Criteria andAgvcfgIdBetween(Integer value1, Integer value2) {
            addCriterion("agvcfg_id between", value1, value2, "agvcfgId");
            return (Criteria) this;
        }

        public Criteria andAgvcfgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agvcfg_id not between", value1, value2, "agvcfgId");
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

        public Criteria andProdCodeIsNull() {
            addCriterion("prod_code is null");
            return (Criteria) this;
        }

        public Criteria andProdCodeIsNotNull() {
            addCriterion("prod_code is not null");
            return (Criteria) this;
        }

        public Criteria andProdCodeEqualTo(String value) {
            addCriterion("prod_code =", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotEqualTo(String value) {
            addCriterion("prod_code <>", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeGreaterThan(String value) {
            addCriterion("prod_code >", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prod_code >=", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLessThan(String value) {
            addCriterion("prod_code <", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLessThanOrEqualTo(String value) {
            addCriterion("prod_code <=", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLike(String value) {
            addCriterion("prod_code like", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotLike(String value) {
            addCriterion("prod_code not like", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeIn(List<String> values) {
            addCriterion("prod_code in", values, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotIn(List<String> values) {
            addCriterion("prod_code not in", values, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeBetween(String value1, String value2) {
            addCriterion("prod_code between", value1, value2, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotBetween(String value1, String value2) {
            addCriterion("prod_code not between", value1, value2, "prodCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNull() {
            addCriterion("customer_code is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNotNull() {
            addCriterion("customer_code is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeEqualTo(String value) {
            addCriterion("customer_code =", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotEqualTo(String value) {
            addCriterion("customer_code <>", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThan(String value) {
            addCriterion("customer_code >", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_code >=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThan(String value) {
            addCriterion("customer_code <", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThanOrEqualTo(String value) {
            addCriterion("customer_code <=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLike(String value) {
            addCriterion("customer_code like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotLike(String value) {
            addCriterion("customer_code not like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIn(List<String> values) {
            addCriterion("customer_code in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotIn(List<String> values) {
            addCriterion("customer_code not in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeBetween(String value1, String value2) {
            addCriterion("customer_code between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotBetween(String value1, String value2) {
            addCriterion("customer_code not between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andFpQtyBeforeIsNull() {
            addCriterion("fp_qty_before is null");
            return (Criteria) this;
        }

        public Criteria andFpQtyBeforeIsNotNull() {
            addCriterion("fp_qty_before is not null");
            return (Criteria) this;
        }

        public Criteria andFpQtyBeforeEqualTo(Integer value) {
            addCriterion("fp_qty_before =", value, "fpQtyBefore");
            return (Criteria) this;
        }

        public Criteria andFpQtyBeforeNotEqualTo(Integer value) {
            addCriterion("fp_qty_before <>", value, "fpQtyBefore");
            return (Criteria) this;
        }

        public Criteria andFpQtyBeforeGreaterThan(Integer value) {
            addCriterion("fp_qty_before >", value, "fpQtyBefore");
            return (Criteria) this;
        }

        public Criteria andFpQtyBeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fp_qty_before >=", value, "fpQtyBefore");
            return (Criteria) this;
        }

        public Criteria andFpQtyBeforeLessThan(Integer value) {
            addCriterion("fp_qty_before <", value, "fpQtyBefore");
            return (Criteria) this;
        }

        public Criteria andFpQtyBeforeLessThanOrEqualTo(Integer value) {
            addCriterion("fp_qty_before <=", value, "fpQtyBefore");
            return (Criteria) this;
        }

        public Criteria andFpQtyBeforeIn(List<Integer> values) {
            addCriterion("fp_qty_before in", values, "fpQtyBefore");
            return (Criteria) this;
        }

        public Criteria andFpQtyBeforeNotIn(List<Integer> values) {
            addCriterion("fp_qty_before not in", values, "fpQtyBefore");
            return (Criteria) this;
        }

        public Criteria andFpQtyBeforeBetween(Integer value1, Integer value2) {
            addCriterion("fp_qty_before between", value1, value2, "fpQtyBefore");
            return (Criteria) this;
        }

        public Criteria andFpQtyBeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("fp_qty_before not between", value1, value2, "fpQtyBefore");
            return (Criteria) this;
        }

        public Criteria andFirstBoxQtyIsNull() {
            addCriterion("first_box_qty is null");
            return (Criteria) this;
        }

        public Criteria andFirstBoxQtyIsNotNull() {
            addCriterion("first_box_qty is not null");
            return (Criteria) this;
        }

        public Criteria andFirstBoxQtyEqualTo(Integer value) {
            addCriterion("first_box_qty =", value, "firstBoxQty");
            return (Criteria) this;
        }

        public Criteria andFirstBoxQtyNotEqualTo(Integer value) {
            addCriterion("first_box_qty <>", value, "firstBoxQty");
            return (Criteria) this;
        }

        public Criteria andFirstBoxQtyGreaterThan(Integer value) {
            addCriterion("first_box_qty >", value, "firstBoxQty");
            return (Criteria) this;
        }

        public Criteria andFirstBoxQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_box_qty >=", value, "firstBoxQty");
            return (Criteria) this;
        }

        public Criteria andFirstBoxQtyLessThan(Integer value) {
            addCriterion("first_box_qty <", value, "firstBoxQty");
            return (Criteria) this;
        }

        public Criteria andFirstBoxQtyLessThanOrEqualTo(Integer value) {
            addCriterion("first_box_qty <=", value, "firstBoxQty");
            return (Criteria) this;
        }

        public Criteria andFirstBoxQtyIn(List<Integer> values) {
            addCriterion("first_box_qty in", values, "firstBoxQty");
            return (Criteria) this;
        }

        public Criteria andFirstBoxQtyNotIn(List<Integer> values) {
            addCriterion("first_box_qty not in", values, "firstBoxQty");
            return (Criteria) this;
        }

        public Criteria andFirstBoxQtyBetween(Integer value1, Integer value2) {
            addCriterion("first_box_qty between", value1, value2, "firstBoxQty");
            return (Criteria) this;
        }

        public Criteria andFirstBoxQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("first_box_qty not between", value1, value2, "firstBoxQty");
            return (Criteria) this;
        }

        public Criteria andCallGapQtyIsNull() {
            addCriterion("call_gap_qty is null");
            return (Criteria) this;
        }

        public Criteria andCallGapQtyIsNotNull() {
            addCriterion("call_gap_qty is not null");
            return (Criteria) this;
        }

        public Criteria andCallGapQtyEqualTo(Integer value) {
            addCriterion("call_gap_qty =", value, "callGapQty");
            return (Criteria) this;
        }

        public Criteria andCallGapQtyNotEqualTo(Integer value) {
            addCriterion("call_gap_qty <>", value, "callGapQty");
            return (Criteria) this;
        }

        public Criteria andCallGapQtyGreaterThan(Integer value) {
            addCriterion("call_gap_qty >", value, "callGapQty");
            return (Criteria) this;
        }

        public Criteria andCallGapQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("call_gap_qty >=", value, "callGapQty");
            return (Criteria) this;
        }

        public Criteria andCallGapQtyLessThan(Integer value) {
            addCriterion("call_gap_qty <", value, "callGapQty");
            return (Criteria) this;
        }

        public Criteria andCallGapQtyLessThanOrEqualTo(Integer value) {
            addCriterion("call_gap_qty <=", value, "callGapQty");
            return (Criteria) this;
        }

        public Criteria andCallGapQtyIn(List<Integer> values) {
            addCriterion("call_gap_qty in", values, "callGapQty");
            return (Criteria) this;
        }

        public Criteria andCallGapQtyNotIn(List<Integer> values) {
            addCriterion("call_gap_qty not in", values, "callGapQty");
            return (Criteria) this;
        }

        public Criteria andCallGapQtyBetween(Integer value1, Integer value2) {
            addCriterion("call_gap_qty between", value1, value2, "callGapQty");
            return (Criteria) this;
        }

        public Criteria andCallGapQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("call_gap_qty not between", value1, value2, "callGapQty");
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