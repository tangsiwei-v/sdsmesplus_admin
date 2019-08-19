package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SafelunchOrderPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SafelunchOrderPOExample() {
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

        public Criteria andSafboxIdIsNull() {
            addCriterion("safbox_id is null");
            return (Criteria) this;
        }

        public Criteria andSafboxIdIsNotNull() {
            addCriterion("safbox_id is not null");
            return (Criteria) this;
        }

        public Criteria andSafboxIdEqualTo(Integer value) {
            addCriterion("safbox_id =", value, "safboxId");
            return (Criteria) this;
        }

        public Criteria andSafboxIdNotEqualTo(Integer value) {
            addCriterion("safbox_id <>", value, "safboxId");
            return (Criteria) this;
        }

        public Criteria andSafboxIdGreaterThan(Integer value) {
            addCriterion("safbox_id >", value, "safboxId");
            return (Criteria) this;
        }

        public Criteria andSafboxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("safbox_id >=", value, "safboxId");
            return (Criteria) this;
        }

        public Criteria andSafboxIdLessThan(Integer value) {
            addCriterion("safbox_id <", value, "safboxId");
            return (Criteria) this;
        }

        public Criteria andSafboxIdLessThanOrEqualTo(Integer value) {
            addCriterion("safbox_id <=", value, "safboxId");
            return (Criteria) this;
        }

        public Criteria andSafboxIdIn(List<Integer> values) {
            addCriterion("safbox_id in", values, "safboxId");
            return (Criteria) this;
        }

        public Criteria andSafboxIdNotIn(List<Integer> values) {
            addCriterion("safbox_id not in", values, "safboxId");
            return (Criteria) this;
        }

        public Criteria andSafboxIdBetween(Integer value1, Integer value2) {
            addCriterion("safbox_id between", value1, value2, "safboxId");
            return (Criteria) this;
        }

        public Criteria andSafboxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("safbox_id not between", value1, value2, "safboxId");
            return (Criteria) this;
        }

        public Criteria andSafelunchOrderIsNull() {
            addCriterion("safelunch_order is null");
            return (Criteria) this;
        }

        public Criteria andSafelunchOrderIsNotNull() {
            addCriterion("safelunch_order is not null");
            return (Criteria) this;
        }

        public Criteria andSafelunchOrderEqualTo(String value) {
            addCriterion("safelunch_order =", value, "safelunchOrder");
            return (Criteria) this;
        }

        public Criteria andSafelunchOrderNotEqualTo(String value) {
            addCriterion("safelunch_order <>", value, "safelunchOrder");
            return (Criteria) this;
        }

        public Criteria andSafelunchOrderGreaterThan(String value) {
            addCriterion("safelunch_order >", value, "safelunchOrder");
            return (Criteria) this;
        }

        public Criteria andSafelunchOrderGreaterThanOrEqualTo(String value) {
            addCriterion("safelunch_order >=", value, "safelunchOrder");
            return (Criteria) this;
        }

        public Criteria andSafelunchOrderLessThan(String value) {
            addCriterion("safelunch_order <", value, "safelunchOrder");
            return (Criteria) this;
        }

        public Criteria andSafelunchOrderLessThanOrEqualTo(String value) {
            addCriterion("safelunch_order <=", value, "safelunchOrder");
            return (Criteria) this;
        }

        public Criteria andSafelunchOrderLike(String value) {
            addCriterion("safelunch_order like", value, "safelunchOrder");
            return (Criteria) this;
        }

        public Criteria andSafelunchOrderNotLike(String value) {
            addCriterion("safelunch_order not like", value, "safelunchOrder");
            return (Criteria) this;
        }

        public Criteria andSafelunchOrderIn(List<String> values) {
            addCriterion("safelunch_order in", values, "safelunchOrder");
            return (Criteria) this;
        }

        public Criteria andSafelunchOrderNotIn(List<String> values) {
            addCriterion("safelunch_order not in", values, "safelunchOrder");
            return (Criteria) this;
        }

        public Criteria andSafelunchOrderBetween(String value1, String value2) {
            addCriterion("safelunch_order between", value1, value2, "safelunchOrder");
            return (Criteria) this;
        }

        public Criteria andSafelunchOrderNotBetween(String value1, String value2) {
            addCriterion("safelunch_order not between", value1, value2, "safelunchOrder");
            return (Criteria) this;
        }

        public Criteria andSaflineIdIsNull() {
            addCriterion("safline_id is null");
            return (Criteria) this;
        }

        public Criteria andSaflineIdIsNotNull() {
            addCriterion("safline_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaflineIdEqualTo(Integer value) {
            addCriterion("safline_id =", value, "saflineId");
            return (Criteria) this;
        }

        public Criteria andSaflineIdNotEqualTo(Integer value) {
            addCriterion("safline_id <>", value, "saflineId");
            return (Criteria) this;
        }

        public Criteria andSaflineIdGreaterThan(Integer value) {
            addCriterion("safline_id >", value, "saflineId");
            return (Criteria) this;
        }

        public Criteria andSaflineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("safline_id >=", value, "saflineId");
            return (Criteria) this;
        }

        public Criteria andSaflineIdLessThan(Integer value) {
            addCriterion("safline_id <", value, "saflineId");
            return (Criteria) this;
        }

        public Criteria andSaflineIdLessThanOrEqualTo(Integer value) {
            addCriterion("safline_id <=", value, "saflineId");
            return (Criteria) this;
        }

        public Criteria andSaflineIdIn(List<Integer> values) {
            addCriterion("safline_id in", values, "saflineId");
            return (Criteria) this;
        }

        public Criteria andSaflineIdNotIn(List<Integer> values) {
            addCriterion("safline_id not in", values, "saflineId");
            return (Criteria) this;
        }

        public Criteria andSaflineIdBetween(Integer value1, Integer value2) {
            addCriterion("safline_id between", value1, value2, "saflineId");
            return (Criteria) this;
        }

        public Criteria andSaflineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("safline_id not between", value1, value2, "saflineId");
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

        public Criteria andProductCountIsNull() {
            addCriterion("product_count is null");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNotNull() {
            addCriterion("product_count is not null");
            return (Criteria) this;
        }

        public Criteria andProductCountEqualTo(Integer value) {
            addCriterion("product_count =", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotEqualTo(Integer value) {
            addCriterion("product_count <>", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThan(Integer value) {
            addCriterion("product_count >", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_count >=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThan(Integer value) {
            addCriterion("product_count <", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThanOrEqualTo(Integer value) {
            addCriterion("product_count <=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountIn(List<Integer> values) {
            addCriterion("product_count in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotIn(List<Integer> values) {
            addCriterion("product_count not in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountBetween(Integer value1, Integer value2) {
            addCriterion("product_count between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotBetween(Integer value1, Integer value2) {
            addCriterion("product_count not between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andPassCountIsNull() {
            addCriterion("pass_count is null");
            return (Criteria) this;
        }

        public Criteria andPassCountIsNotNull() {
            addCriterion("pass_count is not null");
            return (Criteria) this;
        }

        public Criteria andPassCountEqualTo(Integer value) {
            addCriterion("pass_count =", value, "passCount");
            return (Criteria) this;
        }

        public Criteria andPassCountNotEqualTo(Integer value) {
            addCriterion("pass_count <>", value, "passCount");
            return (Criteria) this;
        }

        public Criteria andPassCountGreaterThan(Integer value) {
            addCriterion("pass_count >", value, "passCount");
            return (Criteria) this;
        }

        public Criteria andPassCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pass_count >=", value, "passCount");
            return (Criteria) this;
        }

        public Criteria andPassCountLessThan(Integer value) {
            addCriterion("pass_count <", value, "passCount");
            return (Criteria) this;
        }

        public Criteria andPassCountLessThanOrEqualTo(Integer value) {
            addCriterion("pass_count <=", value, "passCount");
            return (Criteria) this;
        }

        public Criteria andPassCountIn(List<Integer> values) {
            addCriterion("pass_count in", values, "passCount");
            return (Criteria) this;
        }

        public Criteria andPassCountNotIn(List<Integer> values) {
            addCriterion("pass_count not in", values, "passCount");
            return (Criteria) this;
        }

        public Criteria andPassCountBetween(Integer value1, Integer value2) {
            addCriterion("pass_count between", value1, value2, "passCount");
            return (Criteria) this;
        }

        public Criteria andPassCountNotBetween(Integer value1, Integer value2) {
            addCriterion("pass_count not between", value1, value2, "passCount");
            return (Criteria) this;
        }

        public Criteria andFailedCountIsNull() {
            addCriterion("failed_count is null");
            return (Criteria) this;
        }

        public Criteria andFailedCountIsNotNull() {
            addCriterion("failed_count is not null");
            return (Criteria) this;
        }

        public Criteria andFailedCountEqualTo(Integer value) {
            addCriterion("failed_count =", value, "failedCount");
            return (Criteria) this;
        }

        public Criteria andFailedCountNotEqualTo(Integer value) {
            addCriterion("failed_count <>", value, "failedCount");
            return (Criteria) this;
        }

        public Criteria andFailedCountGreaterThan(Integer value) {
            addCriterion("failed_count >", value, "failedCount");
            return (Criteria) this;
        }

        public Criteria andFailedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("failed_count >=", value, "failedCount");
            return (Criteria) this;
        }

        public Criteria andFailedCountLessThan(Integer value) {
            addCriterion("failed_count <", value, "failedCount");
            return (Criteria) this;
        }

        public Criteria andFailedCountLessThanOrEqualTo(Integer value) {
            addCriterion("failed_count <=", value, "failedCount");
            return (Criteria) this;
        }

        public Criteria andFailedCountIn(List<Integer> values) {
            addCriterion("failed_count in", values, "failedCount");
            return (Criteria) this;
        }

        public Criteria andFailedCountNotIn(List<Integer> values) {
            addCriterion("failed_count not in", values, "failedCount");
            return (Criteria) this;
        }

        public Criteria andFailedCountBetween(Integer value1, Integer value2) {
            addCriterion("failed_count between", value1, value2, "failedCount");
            return (Criteria) this;
        }

        public Criteria andFailedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("failed_count not between", value1, value2, "failedCount");
            return (Criteria) this;
        }

        public Criteria andIsPassIsNull() {
            addCriterion("is_pass is null");
            return (Criteria) this;
        }

        public Criteria andIsPassIsNotNull() {
            addCriterion("is_pass is not null");
            return (Criteria) this;
        }

        public Criteria andIsPassEqualTo(Boolean value) {
            addCriterion("is_pass =", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotEqualTo(Boolean value) {
            addCriterion("is_pass <>", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassGreaterThan(Boolean value) {
            addCriterion("is_pass >", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_pass >=", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassLessThan(Boolean value) {
            addCriterion("is_pass <", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassLessThanOrEqualTo(Boolean value) {
            addCriterion("is_pass <=", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassIn(List<Boolean> values) {
            addCriterion("is_pass in", values, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotIn(List<Boolean> values) {
            addCriterion("is_pass not in", values, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pass between", value1, value2, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pass not between", value1, value2, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsCommitIsNull() {
            addCriterion("is_commit is null");
            return (Criteria) this;
        }

        public Criteria andIsCommitIsNotNull() {
            addCriterion("is_commit is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommitEqualTo(Boolean value) {
            addCriterion("is_commit =", value, "isCommit");
            return (Criteria) this;
        }

        public Criteria andIsCommitNotEqualTo(Boolean value) {
            addCriterion("is_commit <>", value, "isCommit");
            return (Criteria) this;
        }

        public Criteria andIsCommitGreaterThan(Boolean value) {
            addCriterion("is_commit >", value, "isCommit");
            return (Criteria) this;
        }

        public Criteria andIsCommitGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_commit >=", value, "isCommit");
            return (Criteria) this;
        }

        public Criteria andIsCommitLessThan(Boolean value) {
            addCriterion("is_commit <", value, "isCommit");
            return (Criteria) this;
        }

        public Criteria andIsCommitLessThanOrEqualTo(Boolean value) {
            addCriterion("is_commit <=", value, "isCommit");
            return (Criteria) this;
        }

        public Criteria andIsCommitIn(List<Boolean> values) {
            addCriterion("is_commit in", values, "isCommit");
            return (Criteria) this;
        }

        public Criteria andIsCommitNotIn(List<Boolean> values) {
            addCriterion("is_commit not in", values, "isCommit");
            return (Criteria) this;
        }

        public Criteria andIsCommitBetween(Boolean value1, Boolean value2) {
            addCriterion("is_commit between", value1, value2, "isCommit");
            return (Criteria) this;
        }

        public Criteria andIsCommitNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_commit not between", value1, value2, "isCommit");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNumberIsNull() {
            addCriterion("check_person_number is null");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNumberIsNotNull() {
            addCriterion("check_person_number is not null");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNumberEqualTo(String value) {
            addCriterion("check_person_number =", value, "checkPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNumberNotEqualTo(String value) {
            addCriterion("check_person_number <>", value, "checkPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNumberGreaterThan(String value) {
            addCriterion("check_person_number >", value, "checkPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNumberGreaterThanOrEqualTo(String value) {
            addCriterion("check_person_number >=", value, "checkPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNumberLessThan(String value) {
            addCriterion("check_person_number <", value, "checkPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNumberLessThanOrEqualTo(String value) {
            addCriterion("check_person_number <=", value, "checkPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNumberLike(String value) {
            addCriterion("check_person_number like", value, "checkPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNumberNotLike(String value) {
            addCriterion("check_person_number not like", value, "checkPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNumberIn(List<String> values) {
            addCriterion("check_person_number in", values, "checkPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNumberNotIn(List<String> values) {
            addCriterion("check_person_number not in", values, "checkPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNumberBetween(String value1, String value2) {
            addCriterion("check_person_number between", value1, value2, "checkPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNumberNotBetween(String value1, String value2) {
            addCriterion("check_person_number not between", value1, value2, "checkPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNameIsNull() {
            addCriterion("check_person_name is null");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNameIsNotNull() {
            addCriterion("check_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNameEqualTo(String value) {
            addCriterion("check_person_name =", value, "checkPersonName");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNameNotEqualTo(String value) {
            addCriterion("check_person_name <>", value, "checkPersonName");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNameGreaterThan(String value) {
            addCriterion("check_person_name >", value, "checkPersonName");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("check_person_name >=", value, "checkPersonName");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNameLessThan(String value) {
            addCriterion("check_person_name <", value, "checkPersonName");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNameLessThanOrEqualTo(String value) {
            addCriterion("check_person_name <=", value, "checkPersonName");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNameLike(String value) {
            addCriterion("check_person_name like", value, "checkPersonName");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNameNotLike(String value) {
            addCriterion("check_person_name not like", value, "checkPersonName");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNameIn(List<String> values) {
            addCriterion("check_person_name in", values, "checkPersonName");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNameNotIn(List<String> values) {
            addCriterion("check_person_name not in", values, "checkPersonName");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNameBetween(String value1, String value2) {
            addCriterion("check_person_name between", value1, value2, "checkPersonName");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNameNotBetween(String value1, String value2) {
            addCriterion("check_person_name not between", value1, value2, "checkPersonName");
            return (Criteria) this;
        }

        public Criteria andBoxPassIsNull() {
            addCriterion("box_pass is null");
            return (Criteria) this;
        }

        public Criteria andBoxPassIsNotNull() {
            addCriterion("box_pass is not null");
            return (Criteria) this;
        }

        public Criteria andBoxPassEqualTo(String value) {
            addCriterion("box_pass =", value, "boxPass");
            return (Criteria) this;
        }

        public Criteria andBoxPassNotEqualTo(String value) {
            addCriterion("box_pass <>", value, "boxPass");
            return (Criteria) this;
        }

        public Criteria andBoxPassGreaterThan(String value) {
            addCriterion("box_pass >", value, "boxPass");
            return (Criteria) this;
        }

        public Criteria andBoxPassGreaterThanOrEqualTo(String value) {
            addCriterion("box_pass >=", value, "boxPass");
            return (Criteria) this;
        }

        public Criteria andBoxPassLessThan(String value) {
            addCriterion("box_pass <", value, "boxPass");
            return (Criteria) this;
        }

        public Criteria andBoxPassLessThanOrEqualTo(String value) {
            addCriterion("box_pass <=", value, "boxPass");
            return (Criteria) this;
        }

        public Criteria andBoxPassLike(String value) {
            addCriterion("box_pass like", value, "boxPass");
            return (Criteria) this;
        }

        public Criteria andBoxPassNotLike(String value) {
            addCriterion("box_pass not like", value, "boxPass");
            return (Criteria) this;
        }

        public Criteria andBoxPassIn(List<String> values) {
            addCriterion("box_pass in", values, "boxPass");
            return (Criteria) this;
        }

        public Criteria andBoxPassNotIn(List<String> values) {
            addCriterion("box_pass not in", values, "boxPass");
            return (Criteria) this;
        }

        public Criteria andBoxPassBetween(String value1, String value2) {
            addCriterion("box_pass between", value1, value2, "boxPass");
            return (Criteria) this;
        }

        public Criteria andBoxPassNotBetween(String value1, String value2) {
            addCriterion("box_pass not between", value1, value2, "boxPass");
            return (Criteria) this;
        }

        public Criteria andBoxFailedIsNull() {
            addCriterion("box_failed is null");
            return (Criteria) this;
        }

        public Criteria andBoxFailedIsNotNull() {
            addCriterion("box_failed is not null");
            return (Criteria) this;
        }

        public Criteria andBoxFailedEqualTo(String value) {
            addCriterion("box_failed =", value, "boxFailed");
            return (Criteria) this;
        }

        public Criteria andBoxFailedNotEqualTo(String value) {
            addCriterion("box_failed <>", value, "boxFailed");
            return (Criteria) this;
        }

        public Criteria andBoxFailedGreaterThan(String value) {
            addCriterion("box_failed >", value, "boxFailed");
            return (Criteria) this;
        }

        public Criteria andBoxFailedGreaterThanOrEqualTo(String value) {
            addCriterion("box_failed >=", value, "boxFailed");
            return (Criteria) this;
        }

        public Criteria andBoxFailedLessThan(String value) {
            addCriterion("box_failed <", value, "boxFailed");
            return (Criteria) this;
        }

        public Criteria andBoxFailedLessThanOrEqualTo(String value) {
            addCriterion("box_failed <=", value, "boxFailed");
            return (Criteria) this;
        }

        public Criteria andBoxFailedLike(String value) {
            addCriterion("box_failed like", value, "boxFailed");
            return (Criteria) this;
        }

        public Criteria andBoxFailedNotLike(String value) {
            addCriterion("box_failed not like", value, "boxFailed");
            return (Criteria) this;
        }

        public Criteria andBoxFailedIn(List<String> values) {
            addCriterion("box_failed in", values, "boxFailed");
            return (Criteria) this;
        }

        public Criteria andBoxFailedNotIn(List<String> values) {
            addCriterion("box_failed not in", values, "boxFailed");
            return (Criteria) this;
        }

        public Criteria andBoxFailedBetween(String value1, String value2) {
            addCriterion("box_failed between", value1, value2, "boxFailed");
            return (Criteria) this;
        }

        public Criteria andBoxFailedNotBetween(String value1, String value2) {
            addCriterion("box_failed not between", value1, value2, "boxFailed");
            return (Criteria) this;
        }

        public Criteria andBoxConfirmedIsNull() {
            addCriterion("box_confirmed is null");
            return (Criteria) this;
        }

        public Criteria andBoxConfirmedIsNotNull() {
            addCriterion("box_confirmed is not null");
            return (Criteria) this;
        }

        public Criteria andBoxConfirmedEqualTo(Boolean value) {
            addCriterion("box_confirmed =", value, "boxConfirmed");
            return (Criteria) this;
        }

        public Criteria andBoxConfirmedNotEqualTo(Boolean value) {
            addCriterion("box_confirmed <>", value, "boxConfirmed");
            return (Criteria) this;
        }

        public Criteria andBoxConfirmedGreaterThan(Boolean value) {
            addCriterion("box_confirmed >", value, "boxConfirmed");
            return (Criteria) this;
        }

        public Criteria andBoxConfirmedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("box_confirmed >=", value, "boxConfirmed");
            return (Criteria) this;
        }

        public Criteria andBoxConfirmedLessThan(Boolean value) {
            addCriterion("box_confirmed <", value, "boxConfirmed");
            return (Criteria) this;
        }

        public Criteria andBoxConfirmedLessThanOrEqualTo(Boolean value) {
            addCriterion("box_confirmed <=", value, "boxConfirmed");
            return (Criteria) this;
        }

        public Criteria andBoxConfirmedIn(List<Boolean> values) {
            addCriterion("box_confirmed in", values, "boxConfirmed");
            return (Criteria) this;
        }

        public Criteria andBoxConfirmedNotIn(List<Boolean> values) {
            addCriterion("box_confirmed not in", values, "boxConfirmed");
            return (Criteria) this;
        }

        public Criteria andBoxConfirmedBetween(Boolean value1, Boolean value2) {
            addCriterion("box_confirmed between", value1, value2, "boxConfirmed");
            return (Criteria) this;
        }

        public Criteria andBoxConfirmedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("box_confirmed not between", value1, value2, "boxConfirmed");
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