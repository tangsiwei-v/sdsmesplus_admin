package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProdOrderStockPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProdOrderStockPOExample() {
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

        public Criteria andPobIdIsNull() {
            addCriterion("pob_id is null");
            return (Criteria) this;
        }

        public Criteria andPobIdIsNotNull() {
            addCriterion("pob_id is not null");
            return (Criteria) this;
        }

        public Criteria andPobIdEqualTo(Integer value) {
            addCriterion("pob_id =", value, "pobId");
            return (Criteria) this;
        }

        public Criteria andPobIdNotEqualTo(Integer value) {
            addCriterion("pob_id <>", value, "pobId");
            return (Criteria) this;
        }

        public Criteria andPobIdGreaterThan(Integer value) {
            addCriterion("pob_id >", value, "pobId");
            return (Criteria) this;
        }

        public Criteria andPobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pob_id >=", value, "pobId");
            return (Criteria) this;
        }

        public Criteria andPobIdLessThan(Integer value) {
            addCriterion("pob_id <", value, "pobId");
            return (Criteria) this;
        }

        public Criteria andPobIdLessThanOrEqualTo(Integer value) {
            addCriterion("pob_id <=", value, "pobId");
            return (Criteria) this;
        }

        public Criteria andPobIdIn(List<Integer> values) {
            addCriterion("pob_id in", values, "pobId");
            return (Criteria) this;
        }

        public Criteria andPobIdNotIn(List<Integer> values) {
            addCriterion("pob_id not in", values, "pobId");
            return (Criteria) this;
        }

        public Criteria andPobIdBetween(Integer value1, Integer value2) {
            addCriterion("pob_id between", value1, value2, "pobId");
            return (Criteria) this;
        }

        public Criteria andPobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pob_id not between", value1, value2, "pobId");
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

        public Criteria andMatMandatIsNull() {
            addCriterion("mat_mandat is null");
            return (Criteria) this;
        }

        public Criteria andMatMandatIsNotNull() {
            addCriterion("mat_mandat is not null");
            return (Criteria) this;
        }

        public Criteria andMatMandatEqualTo(String value) {
            addCriterion("mat_mandat =", value, "matMandat");
            return (Criteria) this;
        }

        public Criteria andMatMandatNotEqualTo(String value) {
            addCriterion("mat_mandat <>", value, "matMandat");
            return (Criteria) this;
        }

        public Criteria andMatMandatGreaterThan(String value) {
            addCriterion("mat_mandat >", value, "matMandat");
            return (Criteria) this;
        }

        public Criteria andMatMandatGreaterThanOrEqualTo(String value) {
            addCriterion("mat_mandat >=", value, "matMandat");
            return (Criteria) this;
        }

        public Criteria andMatMandatLessThan(String value) {
            addCriterion("mat_mandat <", value, "matMandat");
            return (Criteria) this;
        }

        public Criteria andMatMandatLessThanOrEqualTo(String value) {
            addCriterion("mat_mandat <=", value, "matMandat");
            return (Criteria) this;
        }

        public Criteria andMatMandatLike(String value) {
            addCriterion("mat_mandat like", value, "matMandat");
            return (Criteria) this;
        }

        public Criteria andMatMandatNotLike(String value) {
            addCriterion("mat_mandat not like", value, "matMandat");
            return (Criteria) this;
        }

        public Criteria andMatMandatIn(List<String> values) {
            addCriterion("mat_mandat in", values, "matMandat");
            return (Criteria) this;
        }

        public Criteria andMatMandatNotIn(List<String> values) {
            addCriterion("mat_mandat not in", values, "matMandat");
            return (Criteria) this;
        }

        public Criteria andMatMandatBetween(String value1, String value2) {
            addCriterion("mat_mandat between", value1, value2, "matMandat");
            return (Criteria) this;
        }

        public Criteria andMatMandatNotBetween(String value1, String value2) {
            addCriterion("mat_mandat not between", value1, value2, "matMandat");
            return (Criteria) this;
        }

        public Criteria andMatWarehouseNumIsNull() {
            addCriterion("mat_warehouse_num is null");
            return (Criteria) this;
        }

        public Criteria andMatWarehouseNumIsNotNull() {
            addCriterion("mat_warehouse_num is not null");
            return (Criteria) this;
        }

        public Criteria andMatWarehouseNumEqualTo(String value) {
            addCriterion("mat_warehouse_num =", value, "matWarehouseNum");
            return (Criteria) this;
        }

        public Criteria andMatWarehouseNumNotEqualTo(String value) {
            addCriterion("mat_warehouse_num <>", value, "matWarehouseNum");
            return (Criteria) this;
        }

        public Criteria andMatWarehouseNumGreaterThan(String value) {
            addCriterion("mat_warehouse_num >", value, "matWarehouseNum");
            return (Criteria) this;
        }

        public Criteria andMatWarehouseNumGreaterThanOrEqualTo(String value) {
            addCriterion("mat_warehouse_num >=", value, "matWarehouseNum");
            return (Criteria) this;
        }

        public Criteria andMatWarehouseNumLessThan(String value) {
            addCriterion("mat_warehouse_num <", value, "matWarehouseNum");
            return (Criteria) this;
        }

        public Criteria andMatWarehouseNumLessThanOrEqualTo(String value) {
            addCriterion("mat_warehouse_num <=", value, "matWarehouseNum");
            return (Criteria) this;
        }

        public Criteria andMatWarehouseNumLike(String value) {
            addCriterion("mat_warehouse_num like", value, "matWarehouseNum");
            return (Criteria) this;
        }

        public Criteria andMatWarehouseNumNotLike(String value) {
            addCriterion("mat_warehouse_num not like", value, "matWarehouseNum");
            return (Criteria) this;
        }

        public Criteria andMatWarehouseNumIn(List<String> values) {
            addCriterion("mat_warehouse_num in", values, "matWarehouseNum");
            return (Criteria) this;
        }

        public Criteria andMatWarehouseNumNotIn(List<String> values) {
            addCriterion("mat_warehouse_num not in", values, "matWarehouseNum");
            return (Criteria) this;
        }

        public Criteria andMatWarehouseNumBetween(String value1, String value2) {
            addCriterion("mat_warehouse_num between", value1, value2, "matWarehouseNum");
            return (Criteria) this;
        }

        public Criteria andMatWarehouseNumNotBetween(String value1, String value2) {
            addCriterion("mat_warehouse_num not between", value1, value2, "matWarehouseNum");
            return (Criteria) this;
        }

        public Criteria andMatEntitledPartIsNull() {
            addCriterion("mat_entitled_part is null");
            return (Criteria) this;
        }

        public Criteria andMatEntitledPartIsNotNull() {
            addCriterion("mat_entitled_part is not null");
            return (Criteria) this;
        }

        public Criteria andMatEntitledPartEqualTo(String value) {
            addCriterion("mat_entitled_part =", value, "matEntitledPart");
            return (Criteria) this;
        }

        public Criteria andMatEntitledPartNotEqualTo(String value) {
            addCriterion("mat_entitled_part <>", value, "matEntitledPart");
            return (Criteria) this;
        }

        public Criteria andMatEntitledPartGreaterThan(String value) {
            addCriterion("mat_entitled_part >", value, "matEntitledPart");
            return (Criteria) this;
        }

        public Criteria andMatEntitledPartGreaterThanOrEqualTo(String value) {
            addCriterion("mat_entitled_part >=", value, "matEntitledPart");
            return (Criteria) this;
        }

        public Criteria andMatEntitledPartLessThan(String value) {
            addCriterion("mat_entitled_part <", value, "matEntitledPart");
            return (Criteria) this;
        }

        public Criteria andMatEntitledPartLessThanOrEqualTo(String value) {
            addCriterion("mat_entitled_part <=", value, "matEntitledPart");
            return (Criteria) this;
        }

        public Criteria andMatEntitledPartLike(String value) {
            addCriterion("mat_entitled_part like", value, "matEntitledPart");
            return (Criteria) this;
        }

        public Criteria andMatEntitledPartNotLike(String value) {
            addCriterion("mat_entitled_part not like", value, "matEntitledPart");
            return (Criteria) this;
        }

        public Criteria andMatEntitledPartIn(List<String> values) {
            addCriterion("mat_entitled_part in", values, "matEntitledPart");
            return (Criteria) this;
        }

        public Criteria andMatEntitledPartNotIn(List<String> values) {
            addCriterion("mat_entitled_part not in", values, "matEntitledPart");
            return (Criteria) this;
        }

        public Criteria andMatEntitledPartBetween(String value1, String value2) {
            addCriterion("mat_entitled_part between", value1, value2, "matEntitledPart");
            return (Criteria) this;
        }

        public Criteria andMatEntitledPartNotBetween(String value1, String value2) {
            addCriterion("mat_entitled_part not between", value1, value2, "matEntitledPart");
            return (Criteria) this;
        }

        public Criteria andMatHuidentIsNull() {
            addCriterion("mat_huident is null");
            return (Criteria) this;
        }

        public Criteria andMatHuidentIsNotNull() {
            addCriterion("mat_huident is not null");
            return (Criteria) this;
        }

        public Criteria andMatHuidentEqualTo(String value) {
            addCriterion("mat_huident =", value, "matHuident");
            return (Criteria) this;
        }

        public Criteria andMatHuidentNotEqualTo(String value) {
            addCriterion("mat_huident <>", value, "matHuident");
            return (Criteria) this;
        }

        public Criteria andMatHuidentGreaterThan(String value) {
            addCriterion("mat_huident >", value, "matHuident");
            return (Criteria) this;
        }

        public Criteria andMatHuidentGreaterThanOrEqualTo(String value) {
            addCriterion("mat_huident >=", value, "matHuident");
            return (Criteria) this;
        }

        public Criteria andMatHuidentLessThan(String value) {
            addCriterion("mat_huident <", value, "matHuident");
            return (Criteria) this;
        }

        public Criteria andMatHuidentLessThanOrEqualTo(String value) {
            addCriterion("mat_huident <=", value, "matHuident");
            return (Criteria) this;
        }

        public Criteria andMatHuidentLike(String value) {
            addCriterion("mat_huident like", value, "matHuident");
            return (Criteria) this;
        }

        public Criteria andMatHuidentNotLike(String value) {
            addCriterion("mat_huident not like", value, "matHuident");
            return (Criteria) this;
        }

        public Criteria andMatHuidentIn(List<String> values) {
            addCriterion("mat_huident in", values, "matHuident");
            return (Criteria) this;
        }

        public Criteria andMatHuidentNotIn(List<String> values) {
            addCriterion("mat_huident not in", values, "matHuident");
            return (Criteria) this;
        }

        public Criteria andMatHuidentBetween(String value1, String value2) {
            addCriterion("mat_huident between", value1, value2, "matHuident");
            return (Criteria) this;
        }

        public Criteria andMatHuidentNotBetween(String value1, String value2) {
            addCriterion("mat_huident not between", value1, value2, "matHuident");
            return (Criteria) this;
        }

        public Criteria andMatNumberIsNull() {
            addCriterion("mat_number is null");
            return (Criteria) this;
        }

        public Criteria andMatNumberIsNotNull() {
            addCriterion("mat_number is not null");
            return (Criteria) this;
        }

        public Criteria andMatNumberEqualTo(String value) {
            addCriterion("mat_number =", value, "matNumber");
            return (Criteria) this;
        }

        public Criteria andMatNumberNotEqualTo(String value) {
            addCriterion("mat_number <>", value, "matNumber");
            return (Criteria) this;
        }

        public Criteria andMatNumberGreaterThan(String value) {
            addCriterion("mat_number >", value, "matNumber");
            return (Criteria) this;
        }

        public Criteria andMatNumberGreaterThanOrEqualTo(String value) {
            addCriterion("mat_number >=", value, "matNumber");
            return (Criteria) this;
        }

        public Criteria andMatNumberLessThan(String value) {
            addCriterion("mat_number <", value, "matNumber");
            return (Criteria) this;
        }

        public Criteria andMatNumberLessThanOrEqualTo(String value) {
            addCriterion("mat_number <=", value, "matNumber");
            return (Criteria) this;
        }

        public Criteria andMatNumberLike(String value) {
            addCriterion("mat_number like", value, "matNumber");
            return (Criteria) this;
        }

        public Criteria andMatNumberNotLike(String value) {
            addCriterion("mat_number not like", value, "matNumber");
            return (Criteria) this;
        }

        public Criteria andMatNumberIn(List<String> values) {
            addCriterion("mat_number in", values, "matNumber");
            return (Criteria) this;
        }

        public Criteria andMatNumberNotIn(List<String> values) {
            addCriterion("mat_number not in", values, "matNumber");
            return (Criteria) this;
        }

        public Criteria andMatNumberBetween(String value1, String value2) {
            addCriterion("mat_number between", value1, value2, "matNumber");
            return (Criteria) this;
        }

        public Criteria andMatNumberNotBetween(String value1, String value2) {
            addCriterion("mat_number not between", value1, value2, "matNumber");
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

        public Criteria andMatTuhaoIsNull() {
            addCriterion("mat_tuhao is null");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoIsNotNull() {
            addCriterion("mat_tuhao is not null");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoEqualTo(String value) {
            addCriterion("mat_tuhao =", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoNotEqualTo(String value) {
            addCriterion("mat_tuhao <>", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoGreaterThan(String value) {
            addCriterion("mat_tuhao >", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoGreaterThanOrEqualTo(String value) {
            addCriterion("mat_tuhao >=", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoLessThan(String value) {
            addCriterion("mat_tuhao <", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoLessThanOrEqualTo(String value) {
            addCriterion("mat_tuhao <=", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoLike(String value) {
            addCriterion("mat_tuhao like", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoNotLike(String value) {
            addCriterion("mat_tuhao not like", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoIn(List<String> values) {
            addCriterion("mat_tuhao in", values, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoNotIn(List<String> values) {
            addCriterion("mat_tuhao not in", values, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoBetween(String value1, String value2) {
            addCriterion("mat_tuhao between", value1, value2, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoNotBetween(String value1, String value2) {
            addCriterion("mat_tuhao not between", value1, value2, "matTuhao");
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

        public Criteria andMatFurnaceNoIsNull() {
            addCriterion("mat_furnace_no is null");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoIsNotNull() {
            addCriterion("mat_furnace_no is not null");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoEqualTo(String value) {
            addCriterion("mat_furnace_no =", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoNotEqualTo(String value) {
            addCriterion("mat_furnace_no <>", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoGreaterThan(String value) {
            addCriterion("mat_furnace_no >", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoGreaterThanOrEqualTo(String value) {
            addCriterion("mat_furnace_no >=", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoLessThan(String value) {
            addCriterion("mat_furnace_no <", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoLessThanOrEqualTo(String value) {
            addCriterion("mat_furnace_no <=", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoLike(String value) {
            addCriterion("mat_furnace_no like", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoNotLike(String value) {
            addCriterion("mat_furnace_no not like", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoIn(List<String> values) {
            addCriterion("mat_furnace_no in", values, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoNotIn(List<String> values) {
            addCriterion("mat_furnace_no not in", values, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoBetween(String value1, String value2) {
            addCriterion("mat_furnace_no between", value1, value2, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoNotBetween(String value1, String value2) {
            addCriterion("mat_furnace_no not between", value1, value2, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatGlevelIsNull() {
            addCriterion("mat_glevel is null");
            return (Criteria) this;
        }

        public Criteria andMatGlevelIsNotNull() {
            addCriterion("mat_glevel is not null");
            return (Criteria) this;
        }

        public Criteria andMatGlevelEqualTo(String value) {
            addCriterion("mat_glevel =", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelNotEqualTo(String value) {
            addCriterion("mat_glevel <>", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelGreaterThan(String value) {
            addCriterion("mat_glevel >", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelGreaterThanOrEqualTo(String value) {
            addCriterion("mat_glevel >=", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelLessThan(String value) {
            addCriterion("mat_glevel <", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelLessThanOrEqualTo(String value) {
            addCriterion("mat_glevel <=", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelLike(String value) {
            addCriterion("mat_glevel like", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelNotLike(String value) {
            addCriterion("mat_glevel not like", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelIn(List<String> values) {
            addCriterion("mat_glevel in", values, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelNotIn(List<String> values) {
            addCriterion("mat_glevel not in", values, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelBetween(String value1, String value2) {
            addCriterion("mat_glevel between", value1, value2, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelNotBetween(String value1, String value2) {
            addCriterion("mat_glevel not between", value1, value2, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatVersionIsNull() {
            addCriterion("mat_version is null");
            return (Criteria) this;
        }

        public Criteria andMatVersionIsNotNull() {
            addCriterion("mat_version is not null");
            return (Criteria) this;
        }

        public Criteria andMatVersionEqualTo(String value) {
            addCriterion("mat_version =", value, "matVersion");
            return (Criteria) this;
        }

        public Criteria andMatVersionNotEqualTo(String value) {
            addCriterion("mat_version <>", value, "matVersion");
            return (Criteria) this;
        }

        public Criteria andMatVersionGreaterThan(String value) {
            addCriterion("mat_version >", value, "matVersion");
            return (Criteria) this;
        }

        public Criteria andMatVersionGreaterThanOrEqualTo(String value) {
            addCriterion("mat_version >=", value, "matVersion");
            return (Criteria) this;
        }

        public Criteria andMatVersionLessThan(String value) {
            addCriterion("mat_version <", value, "matVersion");
            return (Criteria) this;
        }

        public Criteria andMatVersionLessThanOrEqualTo(String value) {
            addCriterion("mat_version <=", value, "matVersion");
            return (Criteria) this;
        }

        public Criteria andMatVersionLike(String value) {
            addCriterion("mat_version like", value, "matVersion");
            return (Criteria) this;
        }

        public Criteria andMatVersionNotLike(String value) {
            addCriterion("mat_version not like", value, "matVersion");
            return (Criteria) this;
        }

        public Criteria andMatVersionIn(List<String> values) {
            addCriterion("mat_version in", values, "matVersion");
            return (Criteria) this;
        }

        public Criteria andMatVersionNotIn(List<String> values) {
            addCriterion("mat_version not in", values, "matVersion");
            return (Criteria) this;
        }

        public Criteria andMatVersionBetween(String value1, String value2) {
            addCriterion("mat_version between", value1, value2, "matVersion");
            return (Criteria) this;
        }

        public Criteria andMatVersionNotBetween(String value1, String value2) {
            addCriterion("mat_version not between", value1, value2, "matVersion");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoIsNull() {
            addCriterion("mat_batch_no is null");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoIsNotNull() {
            addCriterion("mat_batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoEqualTo(String value) {
            addCriterion("mat_batch_no =", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoNotEqualTo(String value) {
            addCriterion("mat_batch_no <>", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoGreaterThan(String value) {
            addCriterion("mat_batch_no >", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("mat_batch_no >=", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoLessThan(String value) {
            addCriterion("mat_batch_no <", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoLessThanOrEqualTo(String value) {
            addCriterion("mat_batch_no <=", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoLike(String value) {
            addCriterion("mat_batch_no like", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoNotLike(String value) {
            addCriterion("mat_batch_no not like", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoIn(List<String> values) {
            addCriterion("mat_batch_no in", values, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoNotIn(List<String> values) {
            addCriterion("mat_batch_no not in", values, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoBetween(String value1, String value2) {
            addCriterion("mat_batch_no between", value1, value2, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoNotBetween(String value1, String value2) {
            addCriterion("mat_batch_no not between", value1, value2, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andBoxQuanIsNull() {
            addCriterion("box_quan is null");
            return (Criteria) this;
        }

        public Criteria andBoxQuanIsNotNull() {
            addCriterion("box_quan is not null");
            return (Criteria) this;
        }

        public Criteria andBoxQuanEqualTo(BigDecimal value) {
            addCriterion("box_quan =", value, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanNotEqualTo(BigDecimal value) {
            addCriterion("box_quan <>", value, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanGreaterThan(BigDecimal value) {
            addCriterion("box_quan >", value, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("box_quan >=", value, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLessThan(BigDecimal value) {
            addCriterion("box_quan <", value, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("box_quan <=", value, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanIn(List<BigDecimal> values) {
            addCriterion("box_quan in", values, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanNotIn(List<BigDecimal> values) {
            addCriterion("box_quan not in", values, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("box_quan between", value1, value2, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("box_quan not between", value1, value2, "boxQuan");
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

        public Criteria andBoxInspectorIsNull() {
            addCriterion("box_inspector is null");
            return (Criteria) this;
        }

        public Criteria andBoxInspectorIsNotNull() {
            addCriterion("box_inspector is not null");
            return (Criteria) this;
        }

        public Criteria andBoxInspectorEqualTo(String value) {
            addCriterion("box_inspector =", value, "boxInspector");
            return (Criteria) this;
        }

        public Criteria andBoxInspectorNotEqualTo(String value) {
            addCriterion("box_inspector <>", value, "boxInspector");
            return (Criteria) this;
        }

        public Criteria andBoxInspectorGreaterThan(String value) {
            addCriterion("box_inspector >", value, "boxInspector");
            return (Criteria) this;
        }

        public Criteria andBoxInspectorGreaterThanOrEqualTo(String value) {
            addCriterion("box_inspector >=", value, "boxInspector");
            return (Criteria) this;
        }

        public Criteria andBoxInspectorLessThan(String value) {
            addCriterion("box_inspector <", value, "boxInspector");
            return (Criteria) this;
        }

        public Criteria andBoxInspectorLessThanOrEqualTo(String value) {
            addCriterion("box_inspector <=", value, "boxInspector");
            return (Criteria) this;
        }

        public Criteria andBoxInspectorLike(String value) {
            addCriterion("box_inspector like", value, "boxInspector");
            return (Criteria) this;
        }

        public Criteria andBoxInspectorNotLike(String value) {
            addCriterion("box_inspector not like", value, "boxInspector");
            return (Criteria) this;
        }

        public Criteria andBoxInspectorIn(List<String> values) {
            addCriterion("box_inspector in", values, "boxInspector");
            return (Criteria) this;
        }

        public Criteria andBoxInspectorNotIn(List<String> values) {
            addCriterion("box_inspector not in", values, "boxInspector");
            return (Criteria) this;
        }

        public Criteria andBoxInspectorBetween(String value1, String value2) {
            addCriterion("box_inspector between", value1, value2, "boxInspector");
            return (Criteria) this;
        }

        public Criteria andBoxInspectorNotBetween(String value1, String value2) {
            addCriterion("box_inspector not between", value1, value2, "boxInspector");
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

        public Criteria andIsOpenIsNull() {
            addCriterion("is_open is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNotNull() {
            addCriterion("is_open is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenEqualTo(Boolean value) {
            addCriterion("is_open =", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotEqualTo(Boolean value) {
            addCriterion("is_open <>", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThan(Boolean value) {
            addCriterion("is_open >", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_open >=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThan(Boolean value) {
            addCriterion("is_open <", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThanOrEqualTo(Boolean value) {
            addCriterion("is_open <=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenIn(List<Boolean> values) {
            addCriterion("is_open in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotIn(List<Boolean> values) {
            addCriterion("is_open not in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenBetween(Boolean value1, Boolean value2) {
            addCriterion("is_open between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_open not between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLeftIsNull() {
            addCriterion("box_quan_left is null");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLeftIsNotNull() {
            addCriterion("box_quan_left is not null");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLeftEqualTo(BigDecimal value) {
            addCriterion("box_quan_left =", value, "boxQuanLeft");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLeftNotEqualTo(BigDecimal value) {
            addCriterion("box_quan_left <>", value, "boxQuanLeft");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLeftGreaterThan(BigDecimal value) {
            addCriterion("box_quan_left >", value, "boxQuanLeft");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLeftGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("box_quan_left >=", value, "boxQuanLeft");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLeftLessThan(BigDecimal value) {
            addCriterion("box_quan_left <", value, "boxQuanLeft");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLeftLessThanOrEqualTo(BigDecimal value) {
            addCriterion("box_quan_left <=", value, "boxQuanLeft");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLeftIn(List<BigDecimal> values) {
            addCriterion("box_quan_left in", values, "boxQuanLeft");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLeftNotIn(List<BigDecimal> values) {
            addCriterion("box_quan_left not in", values, "boxQuanLeft");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLeftBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("box_quan_left between", value1, value2, "boxQuanLeft");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLeftNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("box_quan_left not between", value1, value2, "boxQuanLeft");
            return (Criteria) this;
        }

        public Criteria andIsCleanedIsNull() {
            addCriterion("is_cleaned is null");
            return (Criteria) this;
        }

        public Criteria andIsCleanedIsNotNull() {
            addCriterion("is_cleaned is not null");
            return (Criteria) this;
        }

        public Criteria andIsCleanedEqualTo(Boolean value) {
            addCriterion("is_cleaned =", value, "isCleaned");
            return (Criteria) this;
        }

        public Criteria andIsCleanedNotEqualTo(Boolean value) {
            addCriterion("is_cleaned <>", value, "isCleaned");
            return (Criteria) this;
        }

        public Criteria andIsCleanedGreaterThan(Boolean value) {
            addCriterion("is_cleaned >", value, "isCleaned");
            return (Criteria) this;
        }

        public Criteria andIsCleanedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_cleaned >=", value, "isCleaned");
            return (Criteria) this;
        }

        public Criteria andIsCleanedLessThan(Boolean value) {
            addCriterion("is_cleaned <", value, "isCleaned");
            return (Criteria) this;
        }

        public Criteria andIsCleanedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_cleaned <=", value, "isCleaned");
            return (Criteria) this;
        }

        public Criteria andIsCleanedIn(List<Boolean> values) {
            addCriterion("is_cleaned in", values, "isCleaned");
            return (Criteria) this;
        }

        public Criteria andIsCleanedNotIn(List<Boolean> values) {
            addCriterion("is_cleaned not in", values, "isCleaned");
            return (Criteria) this;
        }

        public Criteria andIsCleanedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cleaned between", value1, value2, "isCleaned");
            return (Criteria) this;
        }

        public Criteria andIsCleanedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cleaned not between", value1, value2, "isCleaned");
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