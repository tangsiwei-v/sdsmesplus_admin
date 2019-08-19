package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProdPrinterLogPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProdPrinterLogPOExample() {
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

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeTypeIsNull() {
            addCriterion("barcode_type is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeTypeIsNotNull() {
            addCriterion("barcode_type is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeTypeEqualTo(String value) {
            addCriterion("barcode_type =", value, "barcodeType");
            return (Criteria) this;
        }

        public Criteria andBarcodeTypeNotEqualTo(String value) {
            addCriterion("barcode_type <>", value, "barcodeType");
            return (Criteria) this;
        }

        public Criteria andBarcodeTypeGreaterThan(String value) {
            addCriterion("barcode_type >", value, "barcodeType");
            return (Criteria) this;
        }

        public Criteria andBarcodeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode_type >=", value, "barcodeType");
            return (Criteria) this;
        }

        public Criteria andBarcodeTypeLessThan(String value) {
            addCriterion("barcode_type <", value, "barcodeType");
            return (Criteria) this;
        }

        public Criteria andBarcodeTypeLessThanOrEqualTo(String value) {
            addCriterion("barcode_type <=", value, "barcodeType");
            return (Criteria) this;
        }

        public Criteria andBarcodeTypeLike(String value) {
            addCriterion("barcode_type like", value, "barcodeType");
            return (Criteria) this;
        }

        public Criteria andBarcodeTypeNotLike(String value) {
            addCriterion("barcode_type not like", value, "barcodeType");
            return (Criteria) this;
        }

        public Criteria andBarcodeTypeIn(List<String> values) {
            addCriterion("barcode_type in", values, "barcodeType");
            return (Criteria) this;
        }

        public Criteria andBarcodeTypeNotIn(List<String> values) {
            addCriterion("barcode_type not in", values, "barcodeType");
            return (Criteria) this;
        }

        public Criteria andBarcodeTypeBetween(String value1, String value2) {
            addCriterion("barcode_type between", value1, value2, "barcodeType");
            return (Criteria) this;
        }

        public Criteria andBarcodeTypeNotBetween(String value1, String value2) {
            addCriterion("barcode_type not between", value1, value2, "barcodeType");
            return (Criteria) this;
        }

        public Criteria andPrintDetailIsNull() {
            addCriterion("print_detail is null");
            return (Criteria) this;
        }

        public Criteria andPrintDetailIsNotNull() {
            addCriterion("print_detail is not null");
            return (Criteria) this;
        }

        public Criteria andPrintDetailEqualTo(String value) {
            addCriterion("print_detail =", value, "printDetail");
            return (Criteria) this;
        }

        public Criteria andPrintDetailNotEqualTo(String value) {
            addCriterion("print_detail <>", value, "printDetail");
            return (Criteria) this;
        }

        public Criteria andPrintDetailGreaterThan(String value) {
            addCriterion("print_detail >", value, "printDetail");
            return (Criteria) this;
        }

        public Criteria andPrintDetailGreaterThanOrEqualTo(String value) {
            addCriterion("print_detail >=", value, "printDetail");
            return (Criteria) this;
        }

        public Criteria andPrintDetailLessThan(String value) {
            addCriterion("print_detail <", value, "printDetail");
            return (Criteria) this;
        }

        public Criteria andPrintDetailLessThanOrEqualTo(String value) {
            addCriterion("print_detail <=", value, "printDetail");
            return (Criteria) this;
        }

        public Criteria andPrintDetailLike(String value) {
            addCriterion("print_detail like", value, "printDetail");
            return (Criteria) this;
        }

        public Criteria andPrintDetailNotLike(String value) {
            addCriterion("print_detail not like", value, "printDetail");
            return (Criteria) this;
        }

        public Criteria andPrintDetailIn(List<String> values) {
            addCriterion("print_detail in", values, "printDetail");
            return (Criteria) this;
        }

        public Criteria andPrintDetailNotIn(List<String> values) {
            addCriterion("print_detail not in", values, "printDetail");
            return (Criteria) this;
        }

        public Criteria andPrintDetailBetween(String value1, String value2) {
            addCriterion("print_detail between", value1, value2, "printDetail");
            return (Criteria) this;
        }

        public Criteria andPrintDetailNotBetween(String value1, String value2) {
            addCriterion("print_detail not between", value1, value2, "printDetail");
            return (Criteria) this;
        }

        public Criteria andPrinterIpIsNull() {
            addCriterion("printer_ip is null");
            return (Criteria) this;
        }

        public Criteria andPrinterIpIsNotNull() {
            addCriterion("printer_ip is not null");
            return (Criteria) this;
        }

        public Criteria andPrinterIpEqualTo(String value) {
            addCriterion("printer_ip =", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpNotEqualTo(String value) {
            addCriterion("printer_ip <>", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpGreaterThan(String value) {
            addCriterion("printer_ip >", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpGreaterThanOrEqualTo(String value) {
            addCriterion("printer_ip >=", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpLessThan(String value) {
            addCriterion("printer_ip <", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpLessThanOrEqualTo(String value) {
            addCriterion("printer_ip <=", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpLike(String value) {
            addCriterion("printer_ip like", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpNotLike(String value) {
            addCriterion("printer_ip not like", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpIn(List<String> values) {
            addCriterion("printer_ip in", values, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpNotIn(List<String> values) {
            addCriterion("printer_ip not in", values, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpBetween(String value1, String value2) {
            addCriterion("printer_ip between", value1, value2, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpNotBetween(String value1, String value2) {
            addCriterion("printer_ip not between", value1, value2, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterMacIsNull() {
            addCriterion("printer_mac is null");
            return (Criteria) this;
        }

        public Criteria andPrinterMacIsNotNull() {
            addCriterion("printer_mac is not null");
            return (Criteria) this;
        }

        public Criteria andPrinterMacEqualTo(String value) {
            addCriterion("printer_mac =", value, "printerMac");
            return (Criteria) this;
        }

        public Criteria andPrinterMacNotEqualTo(String value) {
            addCriterion("printer_mac <>", value, "printerMac");
            return (Criteria) this;
        }

        public Criteria andPrinterMacGreaterThan(String value) {
            addCriterion("printer_mac >", value, "printerMac");
            return (Criteria) this;
        }

        public Criteria andPrinterMacGreaterThanOrEqualTo(String value) {
            addCriterion("printer_mac >=", value, "printerMac");
            return (Criteria) this;
        }

        public Criteria andPrinterMacLessThan(String value) {
            addCriterion("printer_mac <", value, "printerMac");
            return (Criteria) this;
        }

        public Criteria andPrinterMacLessThanOrEqualTo(String value) {
            addCriterion("printer_mac <=", value, "printerMac");
            return (Criteria) this;
        }

        public Criteria andPrinterMacLike(String value) {
            addCriterion("printer_mac like", value, "printerMac");
            return (Criteria) this;
        }

        public Criteria andPrinterMacNotLike(String value) {
            addCriterion("printer_mac not like", value, "printerMac");
            return (Criteria) this;
        }

        public Criteria andPrinterMacIn(List<String> values) {
            addCriterion("printer_mac in", values, "printerMac");
            return (Criteria) this;
        }

        public Criteria andPrinterMacNotIn(List<String> values) {
            addCriterion("printer_mac not in", values, "printerMac");
            return (Criteria) this;
        }

        public Criteria andPrinterMacBetween(String value1, String value2) {
            addCriterion("printer_mac between", value1, value2, "printerMac");
            return (Criteria) this;
        }

        public Criteria andPrinterMacNotBetween(String value1, String value2) {
            addCriterion("printer_mac not between", value1, value2, "printerMac");
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