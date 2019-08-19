package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysStoragebinPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysStoragebinPOExample() {
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

        public Criteria andBinIdIsNull() {
            addCriterion("bin_id is null");
            return (Criteria) this;
        }

        public Criteria andBinIdIsNotNull() {
            addCriterion("bin_id is not null");
            return (Criteria) this;
        }

        public Criteria andBinIdEqualTo(Integer value) {
            addCriterion("bin_id =", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdNotEqualTo(Integer value) {
            addCriterion("bin_id <>", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdGreaterThan(Integer value) {
            addCriterion("bin_id >", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bin_id >=", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdLessThan(Integer value) {
            addCriterion("bin_id <", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdLessThanOrEqualTo(Integer value) {
            addCriterion("bin_id <=", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdIn(List<Integer> values) {
            addCriterion("bin_id in", values, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdNotIn(List<Integer> values) {
            addCriterion("bin_id not in", values, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdBetween(Integer value1, Integer value2) {
            addCriterion("bin_id between", value1, value2, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bin_id not between", value1, value2, "binId");
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

        public Criteria andWarehouseLocIsNull() {
            addCriterion("warehouse_loc is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocIsNotNull() {
            addCriterion("warehouse_loc is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocEqualTo(String value) {
            addCriterion("warehouse_loc =", value, "warehouseLoc");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocNotEqualTo(String value) {
            addCriterion("warehouse_loc <>", value, "warehouseLoc");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocGreaterThan(String value) {
            addCriterion("warehouse_loc >", value, "warehouseLoc");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_loc >=", value, "warehouseLoc");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocLessThan(String value) {
            addCriterion("warehouse_loc <", value, "warehouseLoc");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocLessThanOrEqualTo(String value) {
            addCriterion("warehouse_loc <=", value, "warehouseLoc");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocLike(String value) {
            addCriterion("warehouse_loc like", value, "warehouseLoc");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocNotLike(String value) {
            addCriterion("warehouse_loc not like", value, "warehouseLoc");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocIn(List<String> values) {
            addCriterion("warehouse_loc in", values, "warehouseLoc");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocNotIn(List<String> values) {
            addCriterion("warehouse_loc not in", values, "warehouseLoc");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocBetween(String value1, String value2) {
            addCriterion("warehouse_loc between", value1, value2, "warehouseLoc");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocNotBetween(String value1, String value2) {
            addCriterion("warehouse_loc not between", value1, value2, "warehouseLoc");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIsNull() {
            addCriterion("storage_type is null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIsNotNull() {
            addCriterion("storage_type is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeEqualTo(String value) {
            addCriterion("storage_type =", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotEqualTo(String value) {
            addCriterion("storage_type <>", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeGreaterThan(String value) {
            addCriterion("storage_type >", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("storage_type >=", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLessThan(String value) {
            addCriterion("storage_type <", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLessThanOrEqualTo(String value) {
            addCriterion("storage_type <=", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLike(String value) {
            addCriterion("storage_type like", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotLike(String value) {
            addCriterion("storage_type not like", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIn(List<String> values) {
            addCriterion("storage_type in", values, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotIn(List<String> values) {
            addCriterion("storage_type not in", values, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeBetween(String value1, String value2) {
            addCriterion("storage_type between", value1, value2, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotBetween(String value1, String value2) {
            addCriterion("storage_type not between", value1, value2, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeDescIsNull() {
            addCriterion("storage_type_desc is null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeDescIsNotNull() {
            addCriterion("storage_type_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeDescEqualTo(String value) {
            addCriterion("storage_type_desc =", value, "storageTypeDesc");
            return (Criteria) this;
        }

        public Criteria andStorageTypeDescNotEqualTo(String value) {
            addCriterion("storage_type_desc <>", value, "storageTypeDesc");
            return (Criteria) this;
        }

        public Criteria andStorageTypeDescGreaterThan(String value) {
            addCriterion("storage_type_desc >", value, "storageTypeDesc");
            return (Criteria) this;
        }

        public Criteria andStorageTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("storage_type_desc >=", value, "storageTypeDesc");
            return (Criteria) this;
        }

        public Criteria andStorageTypeDescLessThan(String value) {
            addCriterion("storage_type_desc <", value, "storageTypeDesc");
            return (Criteria) this;
        }

        public Criteria andStorageTypeDescLessThanOrEqualTo(String value) {
            addCriterion("storage_type_desc <=", value, "storageTypeDesc");
            return (Criteria) this;
        }

        public Criteria andStorageTypeDescLike(String value) {
            addCriterion("storage_type_desc like", value, "storageTypeDesc");
            return (Criteria) this;
        }

        public Criteria andStorageTypeDescNotLike(String value) {
            addCriterion("storage_type_desc not like", value, "storageTypeDesc");
            return (Criteria) this;
        }

        public Criteria andStorageTypeDescIn(List<String> values) {
            addCriterion("storage_type_desc in", values, "storageTypeDesc");
            return (Criteria) this;
        }

        public Criteria andStorageTypeDescNotIn(List<String> values) {
            addCriterion("storage_type_desc not in", values, "storageTypeDesc");
            return (Criteria) this;
        }

        public Criteria andStorageTypeDescBetween(String value1, String value2) {
            addCriterion("storage_type_desc between", value1, value2, "storageTypeDesc");
            return (Criteria) this;
        }

        public Criteria andStorageTypeDescNotBetween(String value1, String value2) {
            addCriterion("storage_type_desc not between", value1, value2, "storageTypeDesc");
            return (Criteria) this;
        }

        public Criteria andWorkStationIsNull() {
            addCriterion("work_station is null");
            return (Criteria) this;
        }

        public Criteria andWorkStationIsNotNull() {
            addCriterion("work_station is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStationEqualTo(String value) {
            addCriterion("work_station =", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationNotEqualTo(String value) {
            addCriterion("work_station <>", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationGreaterThan(String value) {
            addCriterion("work_station >", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationGreaterThanOrEqualTo(String value) {
            addCriterion("work_station >=", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationLessThan(String value) {
            addCriterion("work_station <", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationLessThanOrEqualTo(String value) {
            addCriterion("work_station <=", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationLike(String value) {
            addCriterion("work_station like", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationNotLike(String value) {
            addCriterion("work_station not like", value, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationIn(List<String> values) {
            addCriterion("work_station in", values, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationNotIn(List<String> values) {
            addCriterion("work_station not in", values, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationBetween(String value1, String value2) {
            addCriterion("work_station between", value1, value2, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationNotBetween(String value1, String value2) {
            addCriterion("work_station not between", value1, value2, "workStation");
            return (Criteria) this;
        }

        public Criteria andWorkStationDescIsNull() {
            addCriterion("work_station_desc is null");
            return (Criteria) this;
        }

        public Criteria andWorkStationDescIsNotNull() {
            addCriterion("work_station_desc is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStationDescEqualTo(String value) {
            addCriterion("work_station_desc =", value, "workStationDesc");
            return (Criteria) this;
        }

        public Criteria andWorkStationDescNotEqualTo(String value) {
            addCriterion("work_station_desc <>", value, "workStationDesc");
            return (Criteria) this;
        }

        public Criteria andWorkStationDescGreaterThan(String value) {
            addCriterion("work_station_desc >", value, "workStationDesc");
            return (Criteria) this;
        }

        public Criteria andWorkStationDescGreaterThanOrEqualTo(String value) {
            addCriterion("work_station_desc >=", value, "workStationDesc");
            return (Criteria) this;
        }

        public Criteria andWorkStationDescLessThan(String value) {
            addCriterion("work_station_desc <", value, "workStationDesc");
            return (Criteria) this;
        }

        public Criteria andWorkStationDescLessThanOrEqualTo(String value) {
            addCriterion("work_station_desc <=", value, "workStationDesc");
            return (Criteria) this;
        }

        public Criteria andWorkStationDescLike(String value) {
            addCriterion("work_station_desc like", value, "workStationDesc");
            return (Criteria) this;
        }

        public Criteria andWorkStationDescNotLike(String value) {
            addCriterion("work_station_desc not like", value, "workStationDesc");
            return (Criteria) this;
        }

        public Criteria andWorkStationDescIn(List<String> values) {
            addCriterion("work_station_desc in", values, "workStationDesc");
            return (Criteria) this;
        }

        public Criteria andWorkStationDescNotIn(List<String> values) {
            addCriterion("work_station_desc not in", values, "workStationDesc");
            return (Criteria) this;
        }

        public Criteria andWorkStationDescBetween(String value1, String value2) {
            addCriterion("work_station_desc between", value1, value2, "workStationDesc");
            return (Criteria) this;
        }

        public Criteria andWorkStationDescNotBetween(String value1, String value2) {
            addCriterion("work_station_desc not between", value1, value2, "workStationDesc");
            return (Criteria) this;
        }

        public Criteria andEntitledPartIsNull() {
            addCriterion("entitled_part is null");
            return (Criteria) this;
        }

        public Criteria andEntitledPartIsNotNull() {
            addCriterion("entitled_part is not null");
            return (Criteria) this;
        }

        public Criteria andEntitledPartEqualTo(String value) {
            addCriterion("entitled_part =", value, "entitledPart");
            return (Criteria) this;
        }

        public Criteria andEntitledPartNotEqualTo(String value) {
            addCriterion("entitled_part <>", value, "entitledPart");
            return (Criteria) this;
        }

        public Criteria andEntitledPartGreaterThan(String value) {
            addCriterion("entitled_part >", value, "entitledPart");
            return (Criteria) this;
        }

        public Criteria andEntitledPartGreaterThanOrEqualTo(String value) {
            addCriterion("entitled_part >=", value, "entitledPart");
            return (Criteria) this;
        }

        public Criteria andEntitledPartLessThan(String value) {
            addCriterion("entitled_part <", value, "entitledPart");
            return (Criteria) this;
        }

        public Criteria andEntitledPartLessThanOrEqualTo(String value) {
            addCriterion("entitled_part <=", value, "entitledPart");
            return (Criteria) this;
        }

        public Criteria andEntitledPartLike(String value) {
            addCriterion("entitled_part like", value, "entitledPart");
            return (Criteria) this;
        }

        public Criteria andEntitledPartNotLike(String value) {
            addCriterion("entitled_part not like", value, "entitledPart");
            return (Criteria) this;
        }

        public Criteria andEntitledPartIn(List<String> values) {
            addCriterion("entitled_part in", values, "entitledPart");
            return (Criteria) this;
        }

        public Criteria andEntitledPartNotIn(List<String> values) {
            addCriterion("entitled_part not in", values, "entitledPart");
            return (Criteria) this;
        }

        public Criteria andEntitledPartBetween(String value1, String value2) {
            addCriterion("entitled_part between", value1, value2, "entitledPart");
            return (Criteria) this;
        }

        public Criteria andEntitledPartNotBetween(String value1, String value2) {
            addCriterion("entitled_part not between", value1, value2, "entitledPart");
            return (Criteria) this;
        }

        public Criteria andBinAreaIsNull() {
            addCriterion("bin_area is null");
            return (Criteria) this;
        }

        public Criteria andBinAreaIsNotNull() {
            addCriterion("bin_area is not null");
            return (Criteria) this;
        }

        public Criteria andBinAreaEqualTo(String value) {
            addCriterion("bin_area =", value, "binArea");
            return (Criteria) this;
        }

        public Criteria andBinAreaNotEqualTo(String value) {
            addCriterion("bin_area <>", value, "binArea");
            return (Criteria) this;
        }

        public Criteria andBinAreaGreaterThan(String value) {
            addCriterion("bin_area >", value, "binArea");
            return (Criteria) this;
        }

        public Criteria andBinAreaGreaterThanOrEqualTo(String value) {
            addCriterion("bin_area >=", value, "binArea");
            return (Criteria) this;
        }

        public Criteria andBinAreaLessThan(String value) {
            addCriterion("bin_area <", value, "binArea");
            return (Criteria) this;
        }

        public Criteria andBinAreaLessThanOrEqualTo(String value) {
            addCriterion("bin_area <=", value, "binArea");
            return (Criteria) this;
        }

        public Criteria andBinAreaLike(String value) {
            addCriterion("bin_area like", value, "binArea");
            return (Criteria) this;
        }

        public Criteria andBinAreaNotLike(String value) {
            addCriterion("bin_area not like", value, "binArea");
            return (Criteria) this;
        }

        public Criteria andBinAreaIn(List<String> values) {
            addCriterion("bin_area in", values, "binArea");
            return (Criteria) this;
        }

        public Criteria andBinAreaNotIn(List<String> values) {
            addCriterion("bin_area not in", values, "binArea");
            return (Criteria) this;
        }

        public Criteria andBinAreaBetween(String value1, String value2) {
            addCriterion("bin_area between", value1, value2, "binArea");
            return (Criteria) this;
        }

        public Criteria andBinAreaNotBetween(String value1, String value2) {
            addCriterion("bin_area not between", value1, value2, "binArea");
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