package com.madeofwu.will.pojo;

import java.util.ArrayList;
import java.util.List;

public class StoreHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreHouseExample() {
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

        public Criteria andShIdIsNull() {
            addCriterion("sh_id is null");
            return (Criteria) this;
        }

        public Criteria andShIdIsNotNull() {
            addCriterion("sh_id is not null");
            return (Criteria) this;
        }

        public Criteria andShIdEqualTo(Integer value) {
            addCriterion("sh_id =", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdNotEqualTo(Integer value) {
            addCriterion("sh_id <>", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdGreaterThan(Integer value) {
            addCriterion("sh_id >", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sh_id >=", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdLessThan(Integer value) {
            addCriterion("sh_id <", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdLessThanOrEqualTo(Integer value) {
            addCriterion("sh_id <=", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdIn(List<Integer> values) {
            addCriterion("sh_id in", values, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdNotIn(List<Integer> values) {
            addCriterion("sh_id not in", values, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdBetween(Integer value1, Integer value2) {
            addCriterion("sh_id between", value1, value2, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sh_id not between", value1, value2, "shId");
            return (Criteria) this;
        }

        public Criteria andShNameIsNull() {
            addCriterion("sh_name is null");
            return (Criteria) this;
        }

        public Criteria andShNameIsNotNull() {
            addCriterion("sh_name is not null");
            return (Criteria) this;
        }

        public Criteria andShNameEqualTo(String value) {
            addCriterion("sh_name =", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameNotEqualTo(String value) {
            addCriterion("sh_name <>", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameGreaterThan(String value) {
            addCriterion("sh_name >", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameGreaterThanOrEqualTo(String value) {
            addCriterion("sh_name >=", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameLessThan(String value) {
            addCriterion("sh_name <", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameLessThanOrEqualTo(String value) {
            addCriterion("sh_name <=", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameLike(String value) {
            addCriterion("sh_name like", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameNotLike(String value) {
            addCriterion("sh_name not like", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameIn(List<String> values) {
            addCriterion("sh_name in", values, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameNotIn(List<String> values) {
            addCriterion("sh_name not in", values, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameBetween(String value1, String value2) {
            addCriterion("sh_name between", value1, value2, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameNotBetween(String value1, String value2) {
            addCriterion("sh_name not between", value1, value2, "shName");
            return (Criteria) this;
        }

        public Criteria andShResponsibleIsNull() {
            addCriterion("sh_responsible is null");
            return (Criteria) this;
        }

        public Criteria andShResponsibleIsNotNull() {
            addCriterion("sh_responsible is not null");
            return (Criteria) this;
        }

        public Criteria andShResponsibleEqualTo(String value) {
            addCriterion("sh_responsible =", value, "shResponsible");
            return (Criteria) this;
        }

        public Criteria andShResponsibleNotEqualTo(String value) {
            addCriterion("sh_responsible <>", value, "shResponsible");
            return (Criteria) this;
        }

        public Criteria andShResponsibleGreaterThan(String value) {
            addCriterion("sh_responsible >", value, "shResponsible");
            return (Criteria) this;
        }

        public Criteria andShResponsibleGreaterThanOrEqualTo(String value) {
            addCriterion("sh_responsible >=", value, "shResponsible");
            return (Criteria) this;
        }

        public Criteria andShResponsibleLessThan(String value) {
            addCriterion("sh_responsible <", value, "shResponsible");
            return (Criteria) this;
        }

        public Criteria andShResponsibleLessThanOrEqualTo(String value) {
            addCriterion("sh_responsible <=", value, "shResponsible");
            return (Criteria) this;
        }

        public Criteria andShResponsibleLike(String value) {
            addCriterion("sh_responsible like", value, "shResponsible");
            return (Criteria) this;
        }

        public Criteria andShResponsibleNotLike(String value) {
            addCriterion("sh_responsible not like", value, "shResponsible");
            return (Criteria) this;
        }

        public Criteria andShResponsibleIn(List<String> values) {
            addCriterion("sh_responsible in", values, "shResponsible");
            return (Criteria) this;
        }

        public Criteria andShResponsibleNotIn(List<String> values) {
            addCriterion("sh_responsible not in", values, "shResponsible");
            return (Criteria) this;
        }

        public Criteria andShResponsibleBetween(String value1, String value2) {
            addCriterion("sh_responsible between", value1, value2, "shResponsible");
            return (Criteria) this;
        }

        public Criteria andShResponsibleNotBetween(String value1, String value2) {
            addCriterion("sh_responsible not between", value1, value2, "shResponsible");
            return (Criteria) this;
        }

        public Criteria andShPhoneIsNull() {
            addCriterion("sh_phone is null");
            return (Criteria) this;
        }

        public Criteria andShPhoneIsNotNull() {
            addCriterion("sh_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShPhoneEqualTo(String value) {
            addCriterion("sh_phone =", value, "shPhone");
            return (Criteria) this;
        }

        public Criteria andShPhoneNotEqualTo(String value) {
            addCriterion("sh_phone <>", value, "shPhone");
            return (Criteria) this;
        }

        public Criteria andShPhoneGreaterThan(String value) {
            addCriterion("sh_phone >", value, "shPhone");
            return (Criteria) this;
        }

        public Criteria andShPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("sh_phone >=", value, "shPhone");
            return (Criteria) this;
        }

        public Criteria andShPhoneLessThan(String value) {
            addCriterion("sh_phone <", value, "shPhone");
            return (Criteria) this;
        }

        public Criteria andShPhoneLessThanOrEqualTo(String value) {
            addCriterion("sh_phone <=", value, "shPhone");
            return (Criteria) this;
        }

        public Criteria andShPhoneLike(String value) {
            addCriterion("sh_phone like", value, "shPhone");
            return (Criteria) this;
        }

        public Criteria andShPhoneNotLike(String value) {
            addCriterion("sh_phone not like", value, "shPhone");
            return (Criteria) this;
        }

        public Criteria andShPhoneIn(List<String> values) {
            addCriterion("sh_phone in", values, "shPhone");
            return (Criteria) this;
        }

        public Criteria andShPhoneNotIn(List<String> values) {
            addCriterion("sh_phone not in", values, "shPhone");
            return (Criteria) this;
        }

        public Criteria andShPhoneBetween(String value1, String value2) {
            addCriterion("sh_phone between", value1, value2, "shPhone");
            return (Criteria) this;
        }

        public Criteria andShPhoneNotBetween(String value1, String value2) {
            addCriterion("sh_phone not between", value1, value2, "shPhone");
            return (Criteria) this;
        }

        public Criteria andShAddressIsNull() {
            addCriterion("sh_address is null");
            return (Criteria) this;
        }

        public Criteria andShAddressIsNotNull() {
            addCriterion("sh_address is not null");
            return (Criteria) this;
        }

        public Criteria andShAddressEqualTo(String value) {
            addCriterion("sh_address =", value, "shAddress");
            return (Criteria) this;
        }

        public Criteria andShAddressNotEqualTo(String value) {
            addCriterion("sh_address <>", value, "shAddress");
            return (Criteria) this;
        }

        public Criteria andShAddressGreaterThan(String value) {
            addCriterion("sh_address >", value, "shAddress");
            return (Criteria) this;
        }

        public Criteria andShAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sh_address >=", value, "shAddress");
            return (Criteria) this;
        }

        public Criteria andShAddressLessThan(String value) {
            addCriterion("sh_address <", value, "shAddress");
            return (Criteria) this;
        }

        public Criteria andShAddressLessThanOrEqualTo(String value) {
            addCriterion("sh_address <=", value, "shAddress");
            return (Criteria) this;
        }

        public Criteria andShAddressLike(String value) {
            addCriterion("sh_address like", value, "shAddress");
            return (Criteria) this;
        }

        public Criteria andShAddressNotLike(String value) {
            addCriterion("sh_address not like", value, "shAddress");
            return (Criteria) this;
        }

        public Criteria andShAddressIn(List<String> values) {
            addCriterion("sh_address in", values, "shAddress");
            return (Criteria) this;
        }

        public Criteria andShAddressNotIn(List<String> values) {
            addCriterion("sh_address not in", values, "shAddress");
            return (Criteria) this;
        }

        public Criteria andShAddressBetween(String value1, String value2) {
            addCriterion("sh_address between", value1, value2, "shAddress");
            return (Criteria) this;
        }

        public Criteria andShAddressNotBetween(String value1, String value2) {
            addCriterion("sh_address not between", value1, value2, "shAddress");
            return (Criteria) this;
        }

        public Criteria andShTypeIsNull() {
            addCriterion("sh_type is null");
            return (Criteria) this;
        }

        public Criteria andShTypeIsNotNull() {
            addCriterion("sh_type is not null");
            return (Criteria) this;
        }

        public Criteria andShTypeEqualTo(Integer value) {
            addCriterion("sh_type =", value, "shType");
            return (Criteria) this;
        }

        public Criteria andShTypeNotEqualTo(Integer value) {
            addCriterion("sh_type <>", value, "shType");
            return (Criteria) this;
        }

        public Criteria andShTypeGreaterThan(Integer value) {
            addCriterion("sh_type >", value, "shType");
            return (Criteria) this;
        }

        public Criteria andShTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sh_type >=", value, "shType");
            return (Criteria) this;
        }

        public Criteria andShTypeLessThan(Integer value) {
            addCriterion("sh_type <", value, "shType");
            return (Criteria) this;
        }

        public Criteria andShTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sh_type <=", value, "shType");
            return (Criteria) this;
        }

        public Criteria andShTypeIn(List<Integer> values) {
            addCriterion("sh_type in", values, "shType");
            return (Criteria) this;
        }

        public Criteria andShTypeNotIn(List<Integer> values) {
            addCriterion("sh_type not in", values, "shType");
            return (Criteria) this;
        }

        public Criteria andShTypeBetween(Integer value1, Integer value2) {
            addCriterion("sh_type between", value1, value2, "shType");
            return (Criteria) this;
        }

        public Criteria andShTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sh_type not between", value1, value2, "shType");
            return (Criteria) this;
        }

        public Criteria andShRemarkIsNull() {
            addCriterion("sh_remark is null");
            return (Criteria) this;
        }

        public Criteria andShRemarkIsNotNull() {
            addCriterion("sh_remark is not null");
            return (Criteria) this;
        }

        public Criteria andShRemarkEqualTo(String value) {
            addCriterion("sh_remark =", value, "shRemark");
            return (Criteria) this;
        }

        public Criteria andShRemarkNotEqualTo(String value) {
            addCriterion("sh_remark <>", value, "shRemark");
            return (Criteria) this;
        }

        public Criteria andShRemarkGreaterThan(String value) {
            addCriterion("sh_remark >", value, "shRemark");
            return (Criteria) this;
        }

        public Criteria andShRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sh_remark >=", value, "shRemark");
            return (Criteria) this;
        }

        public Criteria andShRemarkLessThan(String value) {
            addCriterion("sh_remark <", value, "shRemark");
            return (Criteria) this;
        }

        public Criteria andShRemarkLessThanOrEqualTo(String value) {
            addCriterion("sh_remark <=", value, "shRemark");
            return (Criteria) this;
        }

        public Criteria andShRemarkLike(String value) {
            addCriterion("sh_remark like", value, "shRemark");
            return (Criteria) this;
        }

        public Criteria andShRemarkNotLike(String value) {
            addCriterion("sh_remark not like", value, "shRemark");
            return (Criteria) this;
        }

        public Criteria andShRemarkIn(List<String> values) {
            addCriterion("sh_remark in", values, "shRemark");
            return (Criteria) this;
        }

        public Criteria andShRemarkNotIn(List<String> values) {
            addCriterion("sh_remark not in", values, "shRemark");
            return (Criteria) this;
        }

        public Criteria andShRemarkBetween(String value1, String value2) {
            addCriterion("sh_remark between", value1, value2, "shRemark");
            return (Criteria) this;
        }

        public Criteria andShRemarkNotBetween(String value1, String value2) {
            addCriterion("sh_remark not between", value1, value2, "shRemark");
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