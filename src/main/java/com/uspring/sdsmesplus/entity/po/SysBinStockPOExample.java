package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysBinStockPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysBinStockPOExample() {
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

        public Criteria andBstkIdIsNull() {
            addCriterion("bstk_id is null");
            return (Criteria) this;
        }

        public Criteria andBstkIdIsNotNull() {
            addCriterion("bstk_id is not null");
            return (Criteria) this;
        }

        public Criteria andBstkIdEqualTo(Integer value) {
            addCriterion("bstk_id =", value, "bstkId");
            return (Criteria) this;
        }

        public Criteria andBstkIdNotEqualTo(Integer value) {
            addCriterion("bstk_id <>", value, "bstkId");
            return (Criteria) this;
        }

        public Criteria andBstkIdGreaterThan(Integer value) {
            addCriterion("bstk_id >", value, "bstkId");
            return (Criteria) this;
        }

        public Criteria andBstkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bstk_id >=", value, "bstkId");
            return (Criteria) this;
        }

        public Criteria andBstkIdLessThan(Integer value) {
            addCriterion("bstk_id <", value, "bstkId");
            return (Criteria) this;
        }

        public Criteria andBstkIdLessThanOrEqualTo(Integer value) {
            addCriterion("bstk_id <=", value, "bstkId");
            return (Criteria) this;
        }

        public Criteria andBstkIdIn(List<Integer> values) {
            addCriterion("bstk_id in", values, "bstkId");
            return (Criteria) this;
        }

        public Criteria andBstkIdNotIn(List<Integer> values) {
            addCriterion("bstk_id not in", values, "bstkId");
            return (Criteria) this;
        }

        public Criteria andBstkIdBetween(Integer value1, Integer value2) {
            addCriterion("bstk_id between", value1, value2, "bstkId");
            return (Criteria) this;
        }

        public Criteria andBstkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bstk_id not between", value1, value2, "bstkId");
            return (Criteria) this;
        }

        public Criteria andBstockTypeIsNull() {
            addCriterion("bstock_type is null");
            return (Criteria) this;
        }

        public Criteria andBstockTypeIsNotNull() {
            addCriterion("bstock_type is not null");
            return (Criteria) this;
        }

        public Criteria andBstockTypeEqualTo(String value) {
            addCriterion("bstock_type =", value, "bstockType");
            return (Criteria) this;
        }

        public Criteria andBstockTypeNotEqualTo(String value) {
            addCriterion("bstock_type <>", value, "bstockType");
            return (Criteria) this;
        }

        public Criteria andBstockTypeGreaterThan(String value) {
            addCriterion("bstock_type >", value, "bstockType");
            return (Criteria) this;
        }

        public Criteria andBstockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bstock_type >=", value, "bstockType");
            return (Criteria) this;
        }

        public Criteria andBstockTypeLessThan(String value) {
            addCriterion("bstock_type <", value, "bstockType");
            return (Criteria) this;
        }

        public Criteria andBstockTypeLessThanOrEqualTo(String value) {
            addCriterion("bstock_type <=", value, "bstockType");
            return (Criteria) this;
        }

        public Criteria andBstockTypeLike(String value) {
            addCriterion("bstock_type like", value, "bstockType");
            return (Criteria) this;
        }

        public Criteria andBstockTypeNotLike(String value) {
            addCriterion("bstock_type not like", value, "bstockType");
            return (Criteria) this;
        }

        public Criteria andBstockTypeIn(List<String> values) {
            addCriterion("bstock_type in", values, "bstockType");
            return (Criteria) this;
        }

        public Criteria andBstockTypeNotIn(List<String> values) {
            addCriterion("bstock_type not in", values, "bstockType");
            return (Criteria) this;
        }

        public Criteria andBstockTypeBetween(String value1, String value2) {
            addCriterion("bstock_type between", value1, value2, "bstockType");
            return (Criteria) this;
        }

        public Criteria andBstockTypeNotBetween(String value1, String value2) {
            addCriterion("bstock_type not between", value1, value2, "bstockType");
            return (Criteria) this;
        }

        public Criteria andWarehouseNumIsNull() {
            addCriterion("warehouse_num is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseNumIsNotNull() {
            addCriterion("warehouse_num is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseNumEqualTo(String value) {
            addCriterion("warehouse_num =", value, "warehouseNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseNumNotEqualTo(String value) {
            addCriterion("warehouse_num <>", value, "warehouseNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseNumGreaterThan(String value) {
            addCriterion("warehouse_num >", value, "warehouseNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseNumGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_num >=", value, "warehouseNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseNumLessThan(String value) {
            addCriterion("warehouse_num <", value, "warehouseNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseNumLessThanOrEqualTo(String value) {
            addCriterion("warehouse_num <=", value, "warehouseNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseNumLike(String value) {
            addCriterion("warehouse_num like", value, "warehouseNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseNumNotLike(String value) {
            addCriterion("warehouse_num not like", value, "warehouseNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseNumIn(List<String> values) {
            addCriterion("warehouse_num in", values, "warehouseNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseNumNotIn(List<String> values) {
            addCriterion("warehouse_num not in", values, "warehouseNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseNumBetween(String value1, String value2) {
            addCriterion("warehouse_num between", value1, value2, "warehouseNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseNumNotBetween(String value1, String value2) {
            addCriterion("warehouse_num not between", value1, value2, "warehouseNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskIsNull() {
            addCriterion("warehouse_task is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskIsNotNull() {
            addCriterion("warehouse_task is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskEqualTo(String value) {
            addCriterion("warehouse_task =", value, "warehouseTask");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskNotEqualTo(String value) {
            addCriterion("warehouse_task <>", value, "warehouseTask");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskGreaterThan(String value) {
            addCriterion("warehouse_task >", value, "warehouseTask");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_task >=", value, "warehouseTask");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskLessThan(String value) {
            addCriterion("warehouse_task <", value, "warehouseTask");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskLessThanOrEqualTo(String value) {
            addCriterion("warehouse_task <=", value, "warehouseTask");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskLike(String value) {
            addCriterion("warehouse_task like", value, "warehouseTask");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskNotLike(String value) {
            addCriterion("warehouse_task not like", value, "warehouseTask");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskIn(List<String> values) {
            addCriterion("warehouse_task in", values, "warehouseTask");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskNotIn(List<String> values) {
            addCriterion("warehouse_task not in", values, "warehouseTask");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskBetween(String value1, String value2) {
            addCriterion("warehouse_task between", value1, value2, "warehouseTask");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskNotBetween(String value1, String value2) {
            addCriterion("warehouse_task not between", value1, value2, "warehouseTask");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskItemIsNull() {
            addCriterion("warehouse_task_item is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskItemIsNotNull() {
            addCriterion("warehouse_task_item is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskItemEqualTo(String value) {
            addCriterion("warehouse_task_item =", value, "warehouseTaskItem");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskItemNotEqualTo(String value) {
            addCriterion("warehouse_task_item <>", value, "warehouseTaskItem");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskItemGreaterThan(String value) {
            addCriterion("warehouse_task_item >", value, "warehouseTaskItem");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskItemGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_task_item >=", value, "warehouseTaskItem");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskItemLessThan(String value) {
            addCriterion("warehouse_task_item <", value, "warehouseTaskItem");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskItemLessThanOrEqualTo(String value) {
            addCriterion("warehouse_task_item <=", value, "warehouseTaskItem");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskItemLike(String value) {
            addCriterion("warehouse_task_item like", value, "warehouseTaskItem");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskItemNotLike(String value) {
            addCriterion("warehouse_task_item not like", value, "warehouseTaskItem");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskItemIn(List<String> values) {
            addCriterion("warehouse_task_item in", values, "warehouseTaskItem");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskItemNotIn(List<String> values) {
            addCriterion("warehouse_task_item not in", values, "warehouseTaskItem");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskItemBetween(String value1, String value2) {
            addCriterion("warehouse_task_item between", value1, value2, "warehouseTaskItem");
            return (Criteria) this;
        }

        public Criteria andWarehouseTaskItemNotBetween(String value1, String value2) {
            addCriterion("warehouse_task_item not between", value1, value2, "warehouseTaskItem");
            return (Criteria) this;
        }

        public Criteria andParentHuIsNull() {
            addCriterion("parent_hu is null");
            return (Criteria) this;
        }

        public Criteria andParentHuIsNotNull() {
            addCriterion("parent_hu is not null");
            return (Criteria) this;
        }

        public Criteria andParentHuEqualTo(String value) {
            addCriterion("parent_hu =", value, "parentHu");
            return (Criteria) this;
        }

        public Criteria andParentHuNotEqualTo(String value) {
            addCriterion("parent_hu <>", value, "parentHu");
            return (Criteria) this;
        }

        public Criteria andParentHuGreaterThan(String value) {
            addCriterion("parent_hu >", value, "parentHu");
            return (Criteria) this;
        }

        public Criteria andParentHuGreaterThanOrEqualTo(String value) {
            addCriterion("parent_hu >=", value, "parentHu");
            return (Criteria) this;
        }

        public Criteria andParentHuLessThan(String value) {
            addCriterion("parent_hu <", value, "parentHu");
            return (Criteria) this;
        }

        public Criteria andParentHuLessThanOrEqualTo(String value) {
            addCriterion("parent_hu <=", value, "parentHu");
            return (Criteria) this;
        }

        public Criteria andParentHuLike(String value) {
            addCriterion("parent_hu like", value, "parentHu");
            return (Criteria) this;
        }

        public Criteria andParentHuNotLike(String value) {
            addCriterion("parent_hu not like", value, "parentHu");
            return (Criteria) this;
        }

        public Criteria andParentHuIn(List<String> values) {
            addCriterion("parent_hu in", values, "parentHu");
            return (Criteria) this;
        }

        public Criteria andParentHuNotIn(List<String> values) {
            addCriterion("parent_hu not in", values, "parentHu");
            return (Criteria) this;
        }

        public Criteria andParentHuBetween(String value1, String value2) {
            addCriterion("parent_hu between", value1, value2, "parentHu");
            return (Criteria) this;
        }

        public Criteria andParentHuNotBetween(String value1, String value2) {
            addCriterion("parent_hu not between", value1, value2, "parentHu");
            return (Criteria) this;
        }

        public Criteria andHuCodeIsNull() {
            addCriterion("hu_code is null");
            return (Criteria) this;
        }

        public Criteria andHuCodeIsNotNull() {
            addCriterion("hu_code is not null");
            return (Criteria) this;
        }

        public Criteria andHuCodeEqualTo(String value) {
            addCriterion("hu_code =", value, "huCode");
            return (Criteria) this;
        }

        public Criteria andHuCodeNotEqualTo(String value) {
            addCriterion("hu_code <>", value, "huCode");
            return (Criteria) this;
        }

        public Criteria andHuCodeGreaterThan(String value) {
            addCriterion("hu_code >", value, "huCode");
            return (Criteria) this;
        }

        public Criteria andHuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hu_code >=", value, "huCode");
            return (Criteria) this;
        }

        public Criteria andHuCodeLessThan(String value) {
            addCriterion("hu_code <", value, "huCode");
            return (Criteria) this;
        }

        public Criteria andHuCodeLessThanOrEqualTo(String value) {
            addCriterion("hu_code <=", value, "huCode");
            return (Criteria) this;
        }

        public Criteria andHuCodeLike(String value) {
            addCriterion("hu_code like", value, "huCode");
            return (Criteria) this;
        }

        public Criteria andHuCodeNotLike(String value) {
            addCriterion("hu_code not like", value, "huCode");
            return (Criteria) this;
        }

        public Criteria andHuCodeIn(List<String> values) {
            addCriterion("hu_code in", values, "huCode");
            return (Criteria) this;
        }

        public Criteria andHuCodeNotIn(List<String> values) {
            addCriterion("hu_code not in", values, "huCode");
            return (Criteria) this;
        }

        public Criteria andHuCodeBetween(String value1, String value2) {
            addCriterion("hu_code between", value1, value2, "huCode");
            return (Criteria) this;
        }

        public Criteria andHuCodeNotBetween(String value1, String value2) {
            addCriterion("hu_code not between", value1, value2, "huCode");
            return (Criteria) this;
        }

        public Criteria andPackageMaterialIsNull() {
            addCriterion("package_material is null");
            return (Criteria) this;
        }

        public Criteria andPackageMaterialIsNotNull() {
            addCriterion("package_material is not null");
            return (Criteria) this;
        }

        public Criteria andPackageMaterialEqualTo(String value) {
            addCriterion("package_material =", value, "packageMaterial");
            return (Criteria) this;
        }

        public Criteria andPackageMaterialNotEqualTo(String value) {
            addCriterion("package_material <>", value, "packageMaterial");
            return (Criteria) this;
        }

        public Criteria andPackageMaterialGreaterThan(String value) {
            addCriterion("package_material >", value, "packageMaterial");
            return (Criteria) this;
        }

        public Criteria andPackageMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("package_material >=", value, "packageMaterial");
            return (Criteria) this;
        }

        public Criteria andPackageMaterialLessThan(String value) {
            addCriterion("package_material <", value, "packageMaterial");
            return (Criteria) this;
        }

        public Criteria andPackageMaterialLessThanOrEqualTo(String value) {
            addCriterion("package_material <=", value, "packageMaterial");
            return (Criteria) this;
        }

        public Criteria andPackageMaterialLike(String value) {
            addCriterion("package_material like", value, "packageMaterial");
            return (Criteria) this;
        }

        public Criteria andPackageMaterialNotLike(String value) {
            addCriterion("package_material not like", value, "packageMaterial");
            return (Criteria) this;
        }

        public Criteria andPackageMaterialIn(List<String> values) {
            addCriterion("package_material in", values, "packageMaterial");
            return (Criteria) this;
        }

        public Criteria andPackageMaterialNotIn(List<String> values) {
            addCriterion("package_material not in", values, "packageMaterial");
            return (Criteria) this;
        }

        public Criteria andPackageMaterialBetween(String value1, String value2) {
            addCriterion("package_material between", value1, value2, "packageMaterial");
            return (Criteria) this;
        }

        public Criteria andPackageMaterialNotBetween(String value1, String value2) {
            addCriterion("package_material not between", value1, value2, "packageMaterial");
            return (Criteria) this;
        }

        public Criteria andOriginalBinTypeIsNull() {
            addCriterion("original_bin_type is null");
            return (Criteria) this;
        }

        public Criteria andOriginalBinTypeIsNotNull() {
            addCriterion("original_bin_type is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalBinTypeEqualTo(String value) {
            addCriterion("original_bin_type =", value, "originalBinType");
            return (Criteria) this;
        }

        public Criteria andOriginalBinTypeNotEqualTo(String value) {
            addCriterion("original_bin_type <>", value, "originalBinType");
            return (Criteria) this;
        }

        public Criteria andOriginalBinTypeGreaterThan(String value) {
            addCriterion("original_bin_type >", value, "originalBinType");
            return (Criteria) this;
        }

        public Criteria andOriginalBinTypeGreaterThanOrEqualTo(String value) {
            addCriterion("original_bin_type >=", value, "originalBinType");
            return (Criteria) this;
        }

        public Criteria andOriginalBinTypeLessThan(String value) {
            addCriterion("original_bin_type <", value, "originalBinType");
            return (Criteria) this;
        }

        public Criteria andOriginalBinTypeLessThanOrEqualTo(String value) {
            addCriterion("original_bin_type <=", value, "originalBinType");
            return (Criteria) this;
        }

        public Criteria andOriginalBinTypeLike(String value) {
            addCriterion("original_bin_type like", value, "originalBinType");
            return (Criteria) this;
        }

        public Criteria andOriginalBinTypeNotLike(String value) {
            addCriterion("original_bin_type not like", value, "originalBinType");
            return (Criteria) this;
        }

        public Criteria andOriginalBinTypeIn(List<String> values) {
            addCriterion("original_bin_type in", values, "originalBinType");
            return (Criteria) this;
        }

        public Criteria andOriginalBinTypeNotIn(List<String> values) {
            addCriterion("original_bin_type not in", values, "originalBinType");
            return (Criteria) this;
        }

        public Criteria andOriginalBinTypeBetween(String value1, String value2) {
            addCriterion("original_bin_type between", value1, value2, "originalBinType");
            return (Criteria) this;
        }

        public Criteria andOriginalBinTypeNotBetween(String value1, String value2) {
            addCriterion("original_bin_type not between", value1, value2, "originalBinType");
            return (Criteria) this;
        }

        public Criteria andOrginalBinIsNull() {
            addCriterion("orginal_bin is null");
            return (Criteria) this;
        }

        public Criteria andOrginalBinIsNotNull() {
            addCriterion("orginal_bin is not null");
            return (Criteria) this;
        }

        public Criteria andOrginalBinEqualTo(String value) {
            addCriterion("orginal_bin =", value, "orginalBin");
            return (Criteria) this;
        }

        public Criteria andOrginalBinNotEqualTo(String value) {
            addCriterion("orginal_bin <>", value, "orginalBin");
            return (Criteria) this;
        }

        public Criteria andOrginalBinGreaterThan(String value) {
            addCriterion("orginal_bin >", value, "orginalBin");
            return (Criteria) this;
        }

        public Criteria andOrginalBinGreaterThanOrEqualTo(String value) {
            addCriterion("orginal_bin >=", value, "orginalBin");
            return (Criteria) this;
        }

        public Criteria andOrginalBinLessThan(String value) {
            addCriterion("orginal_bin <", value, "orginalBin");
            return (Criteria) this;
        }

        public Criteria andOrginalBinLessThanOrEqualTo(String value) {
            addCriterion("orginal_bin <=", value, "orginalBin");
            return (Criteria) this;
        }

        public Criteria andOrginalBinLike(String value) {
            addCriterion("orginal_bin like", value, "orginalBin");
            return (Criteria) this;
        }

        public Criteria andOrginalBinNotLike(String value) {
            addCriterion("orginal_bin not like", value, "orginalBin");
            return (Criteria) this;
        }

        public Criteria andOrginalBinIn(List<String> values) {
            addCriterion("orginal_bin in", values, "orginalBin");
            return (Criteria) this;
        }

        public Criteria andOrginalBinNotIn(List<String> values) {
            addCriterion("orginal_bin not in", values, "orginalBin");
            return (Criteria) this;
        }

        public Criteria andOrginalBinBetween(String value1, String value2) {
            addCriterion("orginal_bin between", value1, value2, "orginalBin");
            return (Criteria) this;
        }

        public Criteria andOrginalBinNotBetween(String value1, String value2) {
            addCriterion("orginal_bin not between", value1, value2, "orginalBin");
            return (Criteria) this;
        }

        public Criteria andTargetBinTypeIsNull() {
            addCriterion("target_bin_type is null");
            return (Criteria) this;
        }

        public Criteria andTargetBinTypeIsNotNull() {
            addCriterion("target_bin_type is not null");
            return (Criteria) this;
        }

        public Criteria andTargetBinTypeEqualTo(String value) {
            addCriterion("target_bin_type =", value, "targetBinType");
            return (Criteria) this;
        }

        public Criteria andTargetBinTypeNotEqualTo(String value) {
            addCriterion("target_bin_type <>", value, "targetBinType");
            return (Criteria) this;
        }

        public Criteria andTargetBinTypeGreaterThan(String value) {
            addCriterion("target_bin_type >", value, "targetBinType");
            return (Criteria) this;
        }

        public Criteria andTargetBinTypeGreaterThanOrEqualTo(String value) {
            addCriterion("target_bin_type >=", value, "targetBinType");
            return (Criteria) this;
        }

        public Criteria andTargetBinTypeLessThan(String value) {
            addCriterion("target_bin_type <", value, "targetBinType");
            return (Criteria) this;
        }

        public Criteria andTargetBinTypeLessThanOrEqualTo(String value) {
            addCriterion("target_bin_type <=", value, "targetBinType");
            return (Criteria) this;
        }

        public Criteria andTargetBinTypeLike(String value) {
            addCriterion("target_bin_type like", value, "targetBinType");
            return (Criteria) this;
        }

        public Criteria andTargetBinTypeNotLike(String value) {
            addCriterion("target_bin_type not like", value, "targetBinType");
            return (Criteria) this;
        }

        public Criteria andTargetBinTypeIn(List<String> values) {
            addCriterion("target_bin_type in", values, "targetBinType");
            return (Criteria) this;
        }

        public Criteria andTargetBinTypeNotIn(List<String> values) {
            addCriterion("target_bin_type not in", values, "targetBinType");
            return (Criteria) this;
        }

        public Criteria andTargetBinTypeBetween(String value1, String value2) {
            addCriterion("target_bin_type between", value1, value2, "targetBinType");
            return (Criteria) this;
        }

        public Criteria andTargetBinTypeNotBetween(String value1, String value2) {
            addCriterion("target_bin_type not between", value1, value2, "targetBinType");
            return (Criteria) this;
        }

        public Criteria andTargetBinIsNull() {
            addCriterion("target_bin is null");
            return (Criteria) this;
        }

        public Criteria andTargetBinIsNotNull() {
            addCriterion("target_bin is not null");
            return (Criteria) this;
        }

        public Criteria andTargetBinEqualTo(String value) {
            addCriterion("target_bin =", value, "targetBin");
            return (Criteria) this;
        }

        public Criteria andTargetBinNotEqualTo(String value) {
            addCriterion("target_bin <>", value, "targetBin");
            return (Criteria) this;
        }

        public Criteria andTargetBinGreaterThan(String value) {
            addCriterion("target_bin >", value, "targetBin");
            return (Criteria) this;
        }

        public Criteria andTargetBinGreaterThanOrEqualTo(String value) {
            addCriterion("target_bin >=", value, "targetBin");
            return (Criteria) this;
        }

        public Criteria andTargetBinLessThan(String value) {
            addCriterion("target_bin <", value, "targetBin");
            return (Criteria) this;
        }

        public Criteria andTargetBinLessThanOrEqualTo(String value) {
            addCriterion("target_bin <=", value, "targetBin");
            return (Criteria) this;
        }

        public Criteria andTargetBinLike(String value) {
            addCriterion("target_bin like", value, "targetBin");
            return (Criteria) this;
        }

        public Criteria andTargetBinNotLike(String value) {
            addCriterion("target_bin not like", value, "targetBin");
            return (Criteria) this;
        }

        public Criteria andTargetBinIn(List<String> values) {
            addCriterion("target_bin in", values, "targetBin");
            return (Criteria) this;
        }

        public Criteria andTargetBinNotIn(List<String> values) {
            addCriterion("target_bin not in", values, "targetBin");
            return (Criteria) this;
        }

        public Criteria andTargetBinBetween(String value1, String value2) {
            addCriterion("target_bin between", value1, value2, "targetBin");
            return (Criteria) this;
        }

        public Criteria andTargetBinNotBetween(String value1, String value2) {
            addCriterion("target_bin not between", value1, value2, "targetBin");
            return (Criteria) this;
        }

        public Criteria andSapMatCodeIsNull() {
            addCriterion("sap_mat_code is null");
            return (Criteria) this;
        }

        public Criteria andSapMatCodeIsNotNull() {
            addCriterion("sap_mat_code is not null");
            return (Criteria) this;
        }

        public Criteria andSapMatCodeEqualTo(String value) {
            addCriterion("sap_mat_code =", value, "sapMatCode");
            return (Criteria) this;
        }

        public Criteria andSapMatCodeNotEqualTo(String value) {
            addCriterion("sap_mat_code <>", value, "sapMatCode");
            return (Criteria) this;
        }

        public Criteria andSapMatCodeGreaterThan(String value) {
            addCriterion("sap_mat_code >", value, "sapMatCode");
            return (Criteria) this;
        }

        public Criteria andSapMatCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sap_mat_code >=", value, "sapMatCode");
            return (Criteria) this;
        }

        public Criteria andSapMatCodeLessThan(String value) {
            addCriterion("sap_mat_code <", value, "sapMatCode");
            return (Criteria) this;
        }

        public Criteria andSapMatCodeLessThanOrEqualTo(String value) {
            addCriterion("sap_mat_code <=", value, "sapMatCode");
            return (Criteria) this;
        }

        public Criteria andSapMatCodeLike(String value) {
            addCriterion("sap_mat_code like", value, "sapMatCode");
            return (Criteria) this;
        }

        public Criteria andSapMatCodeNotLike(String value) {
            addCriterion("sap_mat_code not like", value, "sapMatCode");
            return (Criteria) this;
        }

        public Criteria andSapMatCodeIn(List<String> values) {
            addCriterion("sap_mat_code in", values, "sapMatCode");
            return (Criteria) this;
        }

        public Criteria andSapMatCodeNotIn(List<String> values) {
            addCriterion("sap_mat_code not in", values, "sapMatCode");
            return (Criteria) this;
        }

        public Criteria andSapMatCodeBetween(String value1, String value2) {
            addCriterion("sap_mat_code between", value1, value2, "sapMatCode");
            return (Criteria) this;
        }

        public Criteria andSapMatCodeNotBetween(String value1, String value2) {
            addCriterion("sap_mat_code not between", value1, value2, "sapMatCode");
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

        public Criteria andBoxRcvTimeIsNull() {
            addCriterion("box_rcv_time is null");
            return (Criteria) this;
        }

        public Criteria andBoxRcvTimeIsNotNull() {
            addCriterion("box_rcv_time is not null");
            return (Criteria) this;
        }

        public Criteria andBoxRcvTimeEqualTo(String value) {
            addCriterion("box_rcv_time =", value, "boxRcvTime");
            return (Criteria) this;
        }

        public Criteria andBoxRcvTimeNotEqualTo(String value) {
            addCriterion("box_rcv_time <>", value, "boxRcvTime");
            return (Criteria) this;
        }

        public Criteria andBoxRcvTimeGreaterThan(String value) {
            addCriterion("box_rcv_time >", value, "boxRcvTime");
            return (Criteria) this;
        }

        public Criteria andBoxRcvTimeGreaterThanOrEqualTo(String value) {
            addCriterion("box_rcv_time >=", value, "boxRcvTime");
            return (Criteria) this;
        }

        public Criteria andBoxRcvTimeLessThan(String value) {
            addCriterion("box_rcv_time <", value, "boxRcvTime");
            return (Criteria) this;
        }

        public Criteria andBoxRcvTimeLessThanOrEqualTo(String value) {
            addCriterion("box_rcv_time <=", value, "boxRcvTime");
            return (Criteria) this;
        }

        public Criteria andBoxRcvTimeLike(String value) {
            addCriterion("box_rcv_time like", value, "boxRcvTime");
            return (Criteria) this;
        }

        public Criteria andBoxRcvTimeNotLike(String value) {
            addCriterion("box_rcv_time not like", value, "boxRcvTime");
            return (Criteria) this;
        }

        public Criteria andBoxRcvTimeIn(List<String> values) {
            addCriterion("box_rcv_time in", values, "boxRcvTime");
            return (Criteria) this;
        }

        public Criteria andBoxRcvTimeNotIn(List<String> values) {
            addCriterion("box_rcv_time not in", values, "boxRcvTime");
            return (Criteria) this;
        }

        public Criteria andBoxRcvTimeBetween(String value1, String value2) {
            addCriterion("box_rcv_time between", value1, value2, "boxRcvTime");
            return (Criteria) this;
        }

        public Criteria andBoxRcvTimeNotBetween(String value1, String value2) {
            addCriterion("box_rcv_time not between", value1, value2, "boxRcvTime");
            return (Criteria) this;
        }

        public Criteria andBoxQuanUnitIsNull() {
            addCriterion("box_quan_unit is null");
            return (Criteria) this;
        }

        public Criteria andBoxQuanUnitIsNotNull() {
            addCriterion("box_quan_unit is not null");
            return (Criteria) this;
        }

        public Criteria andBoxQuanUnitEqualTo(String value) {
            addCriterion("box_quan_unit =", value, "boxQuanUnit");
            return (Criteria) this;
        }

        public Criteria andBoxQuanUnitNotEqualTo(String value) {
            addCriterion("box_quan_unit <>", value, "boxQuanUnit");
            return (Criteria) this;
        }

        public Criteria andBoxQuanUnitGreaterThan(String value) {
            addCriterion("box_quan_unit >", value, "boxQuanUnit");
            return (Criteria) this;
        }

        public Criteria andBoxQuanUnitGreaterThanOrEqualTo(String value) {
            addCriterion("box_quan_unit >=", value, "boxQuanUnit");
            return (Criteria) this;
        }

        public Criteria andBoxQuanUnitLessThan(String value) {
            addCriterion("box_quan_unit <", value, "boxQuanUnit");
            return (Criteria) this;
        }

        public Criteria andBoxQuanUnitLessThanOrEqualTo(String value) {
            addCriterion("box_quan_unit <=", value, "boxQuanUnit");
            return (Criteria) this;
        }

        public Criteria andBoxQuanUnitLike(String value) {
            addCriterion("box_quan_unit like", value, "boxQuanUnit");
            return (Criteria) this;
        }

        public Criteria andBoxQuanUnitNotLike(String value) {
            addCriterion("box_quan_unit not like", value, "boxQuanUnit");
            return (Criteria) this;
        }

        public Criteria andBoxQuanUnitIn(List<String> values) {
            addCriterion("box_quan_unit in", values, "boxQuanUnit");
            return (Criteria) this;
        }

        public Criteria andBoxQuanUnitNotIn(List<String> values) {
            addCriterion("box_quan_unit not in", values, "boxQuanUnit");
            return (Criteria) this;
        }

        public Criteria andBoxQuanUnitBetween(String value1, String value2) {
            addCriterion("box_quan_unit between", value1, value2, "boxQuanUnit");
            return (Criteria) this;
        }

        public Criteria andBoxQuanUnitNotBetween(String value1, String value2) {
            addCriterion("box_quan_unit not between", value1, value2, "boxQuanUnit");
            return (Criteria) this;
        }

        public Criteria andMatRcvTimeIsNull() {
            addCriterion("mat_rcv_time is null");
            return (Criteria) this;
        }

        public Criteria andMatRcvTimeIsNotNull() {
            addCriterion("mat_rcv_time is not null");
            return (Criteria) this;
        }

        public Criteria andMatRcvTimeEqualTo(String value) {
            addCriterion("mat_rcv_time =", value, "matRcvTime");
            return (Criteria) this;
        }

        public Criteria andMatRcvTimeNotEqualTo(String value) {
            addCriterion("mat_rcv_time <>", value, "matRcvTime");
            return (Criteria) this;
        }

        public Criteria andMatRcvTimeGreaterThan(String value) {
            addCriterion("mat_rcv_time >", value, "matRcvTime");
            return (Criteria) this;
        }

        public Criteria andMatRcvTimeGreaterThanOrEqualTo(String value) {
            addCriterion("mat_rcv_time >=", value, "matRcvTime");
            return (Criteria) this;
        }

        public Criteria andMatRcvTimeLessThan(String value) {
            addCriterion("mat_rcv_time <", value, "matRcvTime");
            return (Criteria) this;
        }

        public Criteria andMatRcvTimeLessThanOrEqualTo(String value) {
            addCriterion("mat_rcv_time <=", value, "matRcvTime");
            return (Criteria) this;
        }

        public Criteria andMatRcvTimeLike(String value) {
            addCriterion("mat_rcv_time like", value, "matRcvTime");
            return (Criteria) this;
        }

        public Criteria andMatRcvTimeNotLike(String value) {
            addCriterion("mat_rcv_time not like", value, "matRcvTime");
            return (Criteria) this;
        }

        public Criteria andMatRcvTimeIn(List<String> values) {
            addCriterion("mat_rcv_time in", values, "matRcvTime");
            return (Criteria) this;
        }

        public Criteria andMatRcvTimeNotIn(List<String> values) {
            addCriterion("mat_rcv_time not in", values, "matRcvTime");
            return (Criteria) this;
        }

        public Criteria andMatRcvTimeBetween(String value1, String value2) {
            addCriterion("mat_rcv_time between", value1, value2, "matRcvTime");
            return (Criteria) this;
        }

        public Criteria andMatRcvTimeNotBetween(String value1, String value2) {
            addCriterion("mat_rcv_time not between", value1, value2, "matRcvTime");
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

        public Criteria andMatHeatFeatureIsNull() {
            addCriterion("mat_heat_feature is null");
            return (Criteria) this;
        }

        public Criteria andMatHeatFeatureIsNotNull() {
            addCriterion("mat_heat_feature is not null");
            return (Criteria) this;
        }

        public Criteria andMatHeatFeatureEqualTo(String value) {
            addCriterion("mat_heat_feature =", value, "matHeatFeature");
            return (Criteria) this;
        }

        public Criteria andMatHeatFeatureNotEqualTo(String value) {
            addCriterion("mat_heat_feature <>", value, "matHeatFeature");
            return (Criteria) this;
        }

        public Criteria andMatHeatFeatureGreaterThan(String value) {
            addCriterion("mat_heat_feature >", value, "matHeatFeature");
            return (Criteria) this;
        }

        public Criteria andMatHeatFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("mat_heat_feature >=", value, "matHeatFeature");
            return (Criteria) this;
        }

        public Criteria andMatHeatFeatureLessThan(String value) {
            addCriterion("mat_heat_feature <", value, "matHeatFeature");
            return (Criteria) this;
        }

        public Criteria andMatHeatFeatureLessThanOrEqualTo(String value) {
            addCriterion("mat_heat_feature <=", value, "matHeatFeature");
            return (Criteria) this;
        }

        public Criteria andMatHeatFeatureLike(String value) {
            addCriterion("mat_heat_feature like", value, "matHeatFeature");
            return (Criteria) this;
        }

        public Criteria andMatHeatFeatureNotLike(String value) {
            addCriterion("mat_heat_feature not like", value, "matHeatFeature");
            return (Criteria) this;
        }

        public Criteria andMatHeatFeatureIn(List<String> values) {
            addCriterion("mat_heat_feature in", values, "matHeatFeature");
            return (Criteria) this;
        }

        public Criteria andMatHeatFeatureNotIn(List<String> values) {
            addCriterion("mat_heat_feature not in", values, "matHeatFeature");
            return (Criteria) this;
        }

        public Criteria andMatHeatFeatureBetween(String value1, String value2) {
            addCriterion("mat_heat_feature between", value1, value2, "matHeatFeature");
            return (Criteria) this;
        }

        public Criteria andMatHeatFeatureNotBetween(String value1, String value2) {
            addCriterion("mat_heat_feature not between", value1, value2, "matHeatFeature");
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

        public Criteria andBoxCheckPersonIsNull() {
            addCriterion("box_check_person is null");
            return (Criteria) this;
        }

        public Criteria andBoxCheckPersonIsNotNull() {
            addCriterion("box_check_person is not null");
            return (Criteria) this;
        }

        public Criteria andBoxCheckPersonEqualTo(String value) {
            addCriterion("box_check_person =", value, "boxCheckPerson");
            return (Criteria) this;
        }

        public Criteria andBoxCheckPersonNotEqualTo(String value) {
            addCriterion("box_check_person <>", value, "boxCheckPerson");
            return (Criteria) this;
        }

        public Criteria andBoxCheckPersonGreaterThan(String value) {
            addCriterion("box_check_person >", value, "boxCheckPerson");
            return (Criteria) this;
        }

        public Criteria andBoxCheckPersonGreaterThanOrEqualTo(String value) {
            addCriterion("box_check_person >=", value, "boxCheckPerson");
            return (Criteria) this;
        }

        public Criteria andBoxCheckPersonLessThan(String value) {
            addCriterion("box_check_person <", value, "boxCheckPerson");
            return (Criteria) this;
        }

        public Criteria andBoxCheckPersonLessThanOrEqualTo(String value) {
            addCriterion("box_check_person <=", value, "boxCheckPerson");
            return (Criteria) this;
        }

        public Criteria andBoxCheckPersonLike(String value) {
            addCriterion("box_check_person like", value, "boxCheckPerson");
            return (Criteria) this;
        }

        public Criteria andBoxCheckPersonNotLike(String value) {
            addCriterion("box_check_person not like", value, "boxCheckPerson");
            return (Criteria) this;
        }

        public Criteria andBoxCheckPersonIn(List<String> values) {
            addCriterion("box_check_person in", values, "boxCheckPerson");
            return (Criteria) this;
        }

        public Criteria andBoxCheckPersonNotIn(List<String> values) {
            addCriterion("box_check_person not in", values, "boxCheckPerson");
            return (Criteria) this;
        }

        public Criteria andBoxCheckPersonBetween(String value1, String value2) {
            addCriterion("box_check_person between", value1, value2, "boxCheckPerson");
            return (Criteria) this;
        }

        public Criteria andBoxCheckPersonNotBetween(String value1, String value2) {
            addCriterion("box_check_person not between", value1, value2, "boxCheckPerson");
            return (Criteria) this;
        }

        public Criteria andBoxNoteIsNull() {
            addCriterion("box_note is null");
            return (Criteria) this;
        }

        public Criteria andBoxNoteIsNotNull() {
            addCriterion("box_note is not null");
            return (Criteria) this;
        }

        public Criteria andBoxNoteEqualTo(String value) {
            addCriterion("box_note =", value, "boxNote");
            return (Criteria) this;
        }

        public Criteria andBoxNoteNotEqualTo(String value) {
            addCriterion("box_note <>", value, "boxNote");
            return (Criteria) this;
        }

        public Criteria andBoxNoteGreaterThan(String value) {
            addCriterion("box_note >", value, "boxNote");
            return (Criteria) this;
        }

        public Criteria andBoxNoteGreaterThanOrEqualTo(String value) {
            addCriterion("box_note >=", value, "boxNote");
            return (Criteria) this;
        }

        public Criteria andBoxNoteLessThan(String value) {
            addCriterion("box_note <", value, "boxNote");
            return (Criteria) this;
        }

        public Criteria andBoxNoteLessThanOrEqualTo(String value) {
            addCriterion("box_note <=", value, "boxNote");
            return (Criteria) this;
        }

        public Criteria andBoxNoteLike(String value) {
            addCriterion("box_note like", value, "boxNote");
            return (Criteria) this;
        }

        public Criteria andBoxNoteNotLike(String value) {
            addCriterion("box_note not like", value, "boxNote");
            return (Criteria) this;
        }

        public Criteria andBoxNoteIn(List<String> values) {
            addCriterion("box_note in", values, "boxNote");
            return (Criteria) this;
        }

        public Criteria andBoxNoteNotIn(List<String> values) {
            addCriterion("box_note not in", values, "boxNote");
            return (Criteria) this;
        }

        public Criteria andBoxNoteBetween(String value1, String value2) {
            addCriterion("box_note between", value1, value2, "boxNote");
            return (Criteria) this;
        }

        public Criteria andBoxNoteNotBetween(String value1, String value2) {
            addCriterion("box_note not between", value1, value2, "boxNote");
            return (Criteria) this;
        }

        public Criteria andCostomerCodeIsNull() {
            addCriterion("costomer_code is null");
            return (Criteria) this;
        }

        public Criteria andCostomerCodeIsNotNull() {
            addCriterion("costomer_code is not null");
            return (Criteria) this;
        }

        public Criteria andCostomerCodeEqualTo(String value) {
            addCriterion("costomer_code =", value, "costomerCode");
            return (Criteria) this;
        }

        public Criteria andCostomerCodeNotEqualTo(String value) {
            addCriterion("costomer_code <>", value, "costomerCode");
            return (Criteria) this;
        }

        public Criteria andCostomerCodeGreaterThan(String value) {
            addCriterion("costomer_code >", value, "costomerCode");
            return (Criteria) this;
        }

        public Criteria andCostomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("costomer_code >=", value, "costomerCode");
            return (Criteria) this;
        }

        public Criteria andCostomerCodeLessThan(String value) {
            addCriterion("costomer_code <", value, "costomerCode");
            return (Criteria) this;
        }

        public Criteria andCostomerCodeLessThanOrEqualTo(String value) {
            addCriterion("costomer_code <=", value, "costomerCode");
            return (Criteria) this;
        }

        public Criteria andCostomerCodeLike(String value) {
            addCriterion("costomer_code like", value, "costomerCode");
            return (Criteria) this;
        }

        public Criteria andCostomerCodeNotLike(String value) {
            addCriterion("costomer_code not like", value, "costomerCode");
            return (Criteria) this;
        }

        public Criteria andCostomerCodeIn(List<String> values) {
            addCriterion("costomer_code in", values, "costomerCode");
            return (Criteria) this;
        }

        public Criteria andCostomerCodeNotIn(List<String> values) {
            addCriterion("costomer_code not in", values, "costomerCode");
            return (Criteria) this;
        }

        public Criteria andCostomerCodeBetween(String value1, String value2) {
            addCriterion("costomer_code between", value1, value2, "costomerCode");
            return (Criteria) this;
        }

        public Criteria andCostomerCodeNotBetween(String value1, String value2) {
            addCriterion("costomer_code not between", value1, value2, "costomerCode");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountIsNull() {
            addCriterion("supplier_account is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountIsNotNull() {
            addCriterion("supplier_account is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountEqualTo(String value) {
            addCriterion("supplier_account =", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountNotEqualTo(String value) {
            addCriterion("supplier_account <>", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountGreaterThan(String value) {
            addCriterion("supplier_account >", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_account >=", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountLessThan(String value) {
            addCriterion("supplier_account <", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountLessThanOrEqualTo(String value) {
            addCriterion("supplier_account <=", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountLike(String value) {
            addCriterion("supplier_account like", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountNotLike(String value) {
            addCriterion("supplier_account not like", value, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountIn(List<String> values) {
            addCriterion("supplier_account in", values, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountNotIn(List<String> values) {
            addCriterion("supplier_account not in", values, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountBetween(String value1, String value2) {
            addCriterion("supplier_account between", value1, value2, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountNotBetween(String value1, String value2) {
            addCriterion("supplier_account not between", value1, value2, "supplierAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeIsNull() {
            addCriterion("supplier_batch_code is null");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeIsNotNull() {
            addCriterion("supplier_batch_code is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeEqualTo(String value) {
            addCriterion("supplier_batch_code =", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeNotEqualTo(String value) {
            addCriterion("supplier_batch_code <>", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeGreaterThan(String value) {
            addCriterion("supplier_batch_code >", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_batch_code >=", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeLessThan(String value) {
            addCriterion("supplier_batch_code <", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeLessThanOrEqualTo(String value) {
            addCriterion("supplier_batch_code <=", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeLike(String value) {
            addCriterion("supplier_batch_code like", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeNotLike(String value) {
            addCriterion("supplier_batch_code not like", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeIn(List<String> values) {
            addCriterion("supplier_batch_code in", values, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeNotIn(List<String> values) {
            addCriterion("supplier_batch_code not in", values, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeBetween(String value1, String value2) {
            addCriterion("supplier_batch_code between", value1, value2, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeNotBetween(String value1, String value2) {
            addCriterion("supplier_batch_code not between", value1, value2, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andBatchDateIsNull() {
            addCriterion("batch_date is null");
            return (Criteria) this;
        }

        public Criteria andBatchDateIsNotNull() {
            addCriterion("batch_date is not null");
            return (Criteria) this;
        }

        public Criteria andBatchDateEqualTo(String value) {
            addCriterion("batch_date =", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotEqualTo(String value) {
            addCriterion("batch_date <>", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateGreaterThan(String value) {
            addCriterion("batch_date >", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateGreaterThanOrEqualTo(String value) {
            addCriterion("batch_date >=", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateLessThan(String value) {
            addCriterion("batch_date <", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateLessThanOrEqualTo(String value) {
            addCriterion("batch_date <=", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateLike(String value) {
            addCriterion("batch_date like", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotLike(String value) {
            addCriterion("batch_date not like", value, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateIn(List<String> values) {
            addCriterion("batch_date in", values, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotIn(List<String> values) {
            addCriterion("batch_date not in", values, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateBetween(String value1, String value2) {
            addCriterion("batch_date between", value1, value2, "batchDate");
            return (Criteria) this;
        }

        public Criteria andBatchDateNotBetween(String value1, String value2) {
            addCriterion("batch_date not between", value1, value2, "batchDate");
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

        public Criteria andConfirmDateIsNull() {
            addCriterion("confirm_date is null");
            return (Criteria) this;
        }

        public Criteria andConfirmDateIsNotNull() {
            addCriterion("confirm_date is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmDateEqualTo(String value) {
            addCriterion("confirm_date =", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotEqualTo(String value) {
            addCriterion("confirm_date <>", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateGreaterThan(String value) {
            addCriterion("confirm_date >", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateGreaterThanOrEqualTo(String value) {
            addCriterion("confirm_date >=", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateLessThan(String value) {
            addCriterion("confirm_date <", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateLessThanOrEqualTo(String value) {
            addCriterion("confirm_date <=", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateLike(String value) {
            addCriterion("confirm_date like", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotLike(String value) {
            addCriterion("confirm_date not like", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateIn(List<String> values) {
            addCriterion("confirm_date in", values, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotIn(List<String> values) {
            addCriterion("confirm_date not in", values, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateBetween(String value1, String value2) {
            addCriterion("confirm_date between", value1, value2, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotBetween(String value1, String value2) {
            addCriterion("confirm_date not between", value1, value2, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(String value) {
            addCriterion("confirm_time =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(String value) {
            addCriterion("confirm_time <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(String value) {
            addCriterion("confirm_time >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(String value) {
            addCriterion("confirm_time >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(String value) {
            addCriterion("confirm_time <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(String value) {
            addCriterion("confirm_time <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLike(String value) {
            addCriterion("confirm_time like", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotLike(String value) {
            addCriterion("confirm_time not like", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<String> values) {
            addCriterion("confirm_time in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<String> values) {
            addCriterion("confirm_time not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(String value1, String value2) {
            addCriterion("confirm_time between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(String value1, String value2) {
            addCriterion("confirm_time not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonIsNull() {
            addCriterion("confirm_person is null");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonIsNotNull() {
            addCriterion("confirm_person is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonEqualTo(String value) {
            addCriterion("confirm_person =", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNotEqualTo(String value) {
            addCriterion("confirm_person <>", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonGreaterThan(String value) {
            addCriterion("confirm_person >", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonGreaterThanOrEqualTo(String value) {
            addCriterion("confirm_person >=", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonLessThan(String value) {
            addCriterion("confirm_person <", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonLessThanOrEqualTo(String value) {
            addCriterion("confirm_person <=", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonLike(String value) {
            addCriterion("confirm_person like", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNotLike(String value) {
            addCriterion("confirm_person not like", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonIn(List<String> values) {
            addCriterion("confirm_person in", values, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNotIn(List<String> values) {
            addCriterion("confirm_person not in", values, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonBetween(String value1, String value2) {
            addCriterion("confirm_person between", value1, value2, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNotBetween(String value1, String value2) {
            addCriterion("confirm_person not between", value1, value2, "confirmPerson");
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