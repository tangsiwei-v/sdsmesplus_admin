package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysQrcodeRulePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysQrcodeRulePOExample() {
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

        public Criteria andSqrIdIsNull() {
            addCriterion("sqr_id is null");
            return (Criteria) this;
        }

        public Criteria andSqrIdIsNotNull() {
            addCriterion("sqr_id is not null");
            return (Criteria) this;
        }

        public Criteria andSqrIdEqualTo(Integer value) {
            addCriterion("sqr_id =", value, "sqrId");
            return (Criteria) this;
        }

        public Criteria andSqrIdNotEqualTo(Integer value) {
            addCriterion("sqr_id <>", value, "sqrId");
            return (Criteria) this;
        }

        public Criteria andSqrIdGreaterThan(Integer value) {
            addCriterion("sqr_id >", value, "sqrId");
            return (Criteria) this;
        }

        public Criteria andSqrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sqr_id >=", value, "sqrId");
            return (Criteria) this;
        }

        public Criteria andSqrIdLessThan(Integer value) {
            addCriterion("sqr_id <", value, "sqrId");
            return (Criteria) this;
        }

        public Criteria andSqrIdLessThanOrEqualTo(Integer value) {
            addCriterion("sqr_id <=", value, "sqrId");
            return (Criteria) this;
        }

        public Criteria andSqrIdIn(List<Integer> values) {
            addCriterion("sqr_id in", values, "sqrId");
            return (Criteria) this;
        }

        public Criteria andSqrIdNotIn(List<Integer> values) {
            addCriterion("sqr_id not in", values, "sqrId");
            return (Criteria) this;
        }

        public Criteria andSqrIdBetween(Integer value1, Integer value2) {
            addCriterion("sqr_id between", value1, value2, "sqrId");
            return (Criteria) this;
        }

        public Criteria andSqrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sqr_id not between", value1, value2, "sqrId");
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

        public Criteria andQrcodeLengthIsNull() {
            addCriterion("qrcode_length is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeLengthIsNotNull() {
            addCriterion("qrcode_length is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeLengthEqualTo(Integer value) {
            addCriterion("qrcode_length =", value, "qrcodeLength");
            return (Criteria) this;
        }

        public Criteria andQrcodeLengthNotEqualTo(Integer value) {
            addCriterion("qrcode_length <>", value, "qrcodeLength");
            return (Criteria) this;
        }

        public Criteria andQrcodeLengthGreaterThan(Integer value) {
            addCriterion("qrcode_length >", value, "qrcodeLength");
            return (Criteria) this;
        }

        public Criteria andQrcodeLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("qrcode_length >=", value, "qrcodeLength");
            return (Criteria) this;
        }

        public Criteria andQrcodeLengthLessThan(Integer value) {
            addCriterion("qrcode_length <", value, "qrcodeLength");
            return (Criteria) this;
        }

        public Criteria andQrcodeLengthLessThanOrEqualTo(Integer value) {
            addCriterion("qrcode_length <=", value, "qrcodeLength");
            return (Criteria) this;
        }

        public Criteria andQrcodeLengthIn(List<Integer> values) {
            addCriterion("qrcode_length in", values, "qrcodeLength");
            return (Criteria) this;
        }

        public Criteria andQrcodeLengthNotIn(List<Integer> values) {
            addCriterion("qrcode_length not in", values, "qrcodeLength");
            return (Criteria) this;
        }

        public Criteria andQrcodeLengthBetween(Integer value1, Integer value2) {
            addCriterion("qrcode_length between", value1, value2, "qrcodeLength");
            return (Criteria) this;
        }

        public Criteria andQrcodeLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("qrcode_length not between", value1, value2, "qrcodeLength");
            return (Criteria) this;
        }

        public Criteria andQrcodeStartIsNull() {
            addCriterion("qrcode_start is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeStartIsNotNull() {
            addCriterion("qrcode_start is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeStartEqualTo(String value) {
            addCriterion("qrcode_start =", value, "qrcodeStart");
            return (Criteria) this;
        }

        public Criteria andQrcodeStartNotEqualTo(String value) {
            addCriterion("qrcode_start <>", value, "qrcodeStart");
            return (Criteria) this;
        }

        public Criteria andQrcodeStartGreaterThan(String value) {
            addCriterion("qrcode_start >", value, "qrcodeStart");
            return (Criteria) this;
        }

        public Criteria andQrcodeStartGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode_start >=", value, "qrcodeStart");
            return (Criteria) this;
        }

        public Criteria andQrcodeStartLessThan(String value) {
            addCriterion("qrcode_start <", value, "qrcodeStart");
            return (Criteria) this;
        }

        public Criteria andQrcodeStartLessThanOrEqualTo(String value) {
            addCriterion("qrcode_start <=", value, "qrcodeStart");
            return (Criteria) this;
        }

        public Criteria andQrcodeStartLike(String value) {
            addCriterion("qrcode_start like", value, "qrcodeStart");
            return (Criteria) this;
        }

        public Criteria andQrcodeStartNotLike(String value) {
            addCriterion("qrcode_start not like", value, "qrcodeStart");
            return (Criteria) this;
        }

        public Criteria andQrcodeStartIn(List<String> values) {
            addCriterion("qrcode_start in", values, "qrcodeStart");
            return (Criteria) this;
        }

        public Criteria andQrcodeStartNotIn(List<String> values) {
            addCriterion("qrcode_start not in", values, "qrcodeStart");
            return (Criteria) this;
        }

        public Criteria andQrcodeStartBetween(String value1, String value2) {
            addCriterion("qrcode_start between", value1, value2, "qrcodeStart");
            return (Criteria) this;
        }

        public Criteria andQrcodeStartNotBetween(String value1, String value2) {
            addCriterion("qrcode_start not between", value1, value2, "qrcodeStart");
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