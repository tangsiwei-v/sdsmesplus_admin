package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProdFinishedProductPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProdFinishedProductPOExample() {
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

        public Criteria andFpIdIsNull() {
            addCriterion("fp_id is null");
            return (Criteria) this;
        }

        public Criteria andFpIdIsNotNull() {
            addCriterion("fp_id is not null");
            return (Criteria) this;
        }

        public Criteria andFpIdEqualTo(Integer value) {
            addCriterion("fp_id =", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdNotEqualTo(Integer value) {
            addCriterion("fp_id <>", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdGreaterThan(Integer value) {
            addCriterion("fp_id >", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fp_id >=", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdLessThan(Integer value) {
            addCriterion("fp_id <", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdLessThanOrEqualTo(Integer value) {
            addCriterion("fp_id <=", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdIn(List<Integer> values) {
            addCriterion("fp_id in", values, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdNotIn(List<Integer> values) {
            addCriterion("fp_id not in", values, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdBetween(Integer value1, Integer value2) {
            addCriterion("fp_id between", value1, value2, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fp_id not between", value1, value2, "fpId");
            return (Criteria) this;
        }

        public Criteria andPoCodeIsNull() {
            addCriterion("po_code is null");
            return (Criteria) this;
        }

        public Criteria andPoCodeIsNotNull() {
            addCriterion("po_code is not null");
            return (Criteria) this;
        }

        public Criteria andPoCodeEqualTo(String value) {
            addCriterion("po_code =", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotEqualTo(String value) {
            addCriterion("po_code <>", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeGreaterThan(String value) {
            addCriterion("po_code >", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("po_code >=", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeLessThan(String value) {
            addCriterion("po_code <", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeLessThanOrEqualTo(String value) {
            addCriterion("po_code <=", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeLike(String value) {
            addCriterion("po_code like", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotLike(String value) {
            addCriterion("po_code not like", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeIn(List<String> values) {
            addCriterion("po_code in", values, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotIn(List<String> values) {
            addCriterion("po_code not in", values, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeBetween(String value1, String value2) {
            addCriterion("po_code between", value1, value2, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotBetween(String value1, String value2) {
            addCriterion("po_code not between", value1, value2, "poCode");
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

        public Criteria andFpRfidIsNull() {
            addCriterion("fp_rfid is null");
            return (Criteria) this;
        }

        public Criteria andFpRfidIsNotNull() {
            addCriterion("fp_rfid is not null");
            return (Criteria) this;
        }

        public Criteria andFpRfidEqualTo(String value) {
            addCriterion("fp_rfid =", value, "fpRfid");
            return (Criteria) this;
        }

        public Criteria andFpRfidNotEqualTo(String value) {
            addCriterion("fp_rfid <>", value, "fpRfid");
            return (Criteria) this;
        }

        public Criteria andFpRfidGreaterThan(String value) {
            addCriterion("fp_rfid >", value, "fpRfid");
            return (Criteria) this;
        }

        public Criteria andFpRfidGreaterThanOrEqualTo(String value) {
            addCriterion("fp_rfid >=", value, "fpRfid");
            return (Criteria) this;
        }

        public Criteria andFpRfidLessThan(String value) {
            addCriterion("fp_rfid <", value, "fpRfid");
            return (Criteria) this;
        }

        public Criteria andFpRfidLessThanOrEqualTo(String value) {
            addCriterion("fp_rfid <=", value, "fpRfid");
            return (Criteria) this;
        }

        public Criteria andFpRfidLike(String value) {
            addCriterion("fp_rfid like", value, "fpRfid");
            return (Criteria) this;
        }

        public Criteria andFpRfidNotLike(String value) {
            addCriterion("fp_rfid not like", value, "fpRfid");
            return (Criteria) this;
        }

        public Criteria andFpRfidIn(List<String> values) {
            addCriterion("fp_rfid in", values, "fpRfid");
            return (Criteria) this;
        }

        public Criteria andFpRfidNotIn(List<String> values) {
            addCriterion("fp_rfid not in", values, "fpRfid");
            return (Criteria) this;
        }

        public Criteria andFpRfidBetween(String value1, String value2) {
            addCriterion("fp_rfid between", value1, value2, "fpRfid");
            return (Criteria) this;
        }

        public Criteria andFpRfidNotBetween(String value1, String value2) {
            addCriterion("fp_rfid not between", value1, value2, "fpRfid");
            return (Criteria) this;
        }

        public Criteria andFpStatusIsNull() {
            addCriterion("fp_status is null");
            return (Criteria) this;
        }

        public Criteria andFpStatusIsNotNull() {
            addCriterion("fp_status is not null");
            return (Criteria) this;
        }

        public Criteria andFpStatusEqualTo(String value) {
            addCriterion("fp_status =", value, "fpStatus");
            return (Criteria) this;
        }

        public Criteria andFpStatusNotEqualTo(String value) {
            addCriterion("fp_status <>", value, "fpStatus");
            return (Criteria) this;
        }

        public Criteria andFpStatusGreaterThan(String value) {
            addCriterion("fp_status >", value, "fpStatus");
            return (Criteria) this;
        }

        public Criteria andFpStatusGreaterThanOrEqualTo(String value) {
            addCriterion("fp_status >=", value, "fpStatus");
            return (Criteria) this;
        }

        public Criteria andFpStatusLessThan(String value) {
            addCriterion("fp_status <", value, "fpStatus");
            return (Criteria) this;
        }

        public Criteria andFpStatusLessThanOrEqualTo(String value) {
            addCriterion("fp_status <=", value, "fpStatus");
            return (Criteria) this;
        }

        public Criteria andFpStatusLike(String value) {
            addCriterion("fp_status like", value, "fpStatus");
            return (Criteria) this;
        }

        public Criteria andFpStatusNotLike(String value) {
            addCriterion("fp_status not like", value, "fpStatus");
            return (Criteria) this;
        }

        public Criteria andFpStatusIn(List<String> values) {
            addCriterion("fp_status in", values, "fpStatus");
            return (Criteria) this;
        }

        public Criteria andFpStatusNotIn(List<String> values) {
            addCriterion("fp_status not in", values, "fpStatus");
            return (Criteria) this;
        }

        public Criteria andFpStatusBetween(String value1, String value2) {
            addCriterion("fp_status between", value1, value2, "fpStatus");
            return (Criteria) this;
        }

        public Criteria andFpStatusNotBetween(String value1, String value2) {
            addCriterion("fp_status not between", value1, value2, "fpStatus");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeIsNull() {
            addCriterion("box_barcode is null");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeIsNotNull() {
            addCriterion("box_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeEqualTo(String value) {
            addCriterion("box_barcode =", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNotEqualTo(String value) {
            addCriterion("box_barcode <>", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeGreaterThan(String value) {
            addCriterion("box_barcode >", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("box_barcode >=", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeLessThan(String value) {
            addCriterion("box_barcode <", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeLessThanOrEqualTo(String value) {
            addCriterion("box_barcode <=", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeLike(String value) {
            addCriterion("box_barcode like", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNotLike(String value) {
            addCriterion("box_barcode not like", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeIn(List<String> values) {
            addCriterion("box_barcode in", values, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNotIn(List<String> values) {
            addCriterion("box_barcode not in", values, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeBetween(String value1, String value2) {
            addCriterion("box_barcode between", value1, value2, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNotBetween(String value1, String value2) {
            addCriterion("box_barcode not between", value1, value2, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeIsNull() {
            addCriterion("fp_barcode is null");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeIsNotNull() {
            addCriterion("fp_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeEqualTo(String value) {
            addCriterion("fp_barcode =", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeNotEqualTo(String value) {
            addCriterion("fp_barcode <>", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeGreaterThan(String value) {
            addCriterion("fp_barcode >", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("fp_barcode >=", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeLessThan(String value) {
            addCriterion("fp_barcode <", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeLessThanOrEqualTo(String value) {
            addCriterion("fp_barcode <=", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeLike(String value) {
            addCriterion("fp_barcode like", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeNotLike(String value) {
            addCriterion("fp_barcode not like", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeIn(List<String> values) {
            addCriterion("fp_barcode in", values, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeNotIn(List<String> values) {
            addCriterion("fp_barcode not in", values, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeBetween(String value1, String value2) {
            addCriterion("fp_barcode between", value1, value2, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeNotBetween(String value1, String value2) {
            addCriterion("fp_barcode not between", value1, value2, "fpBarcode");
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