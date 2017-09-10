package com.madeofwu.will.pojo;

import java.util.ArrayList;
import java.util.List;

public class BuyOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuyOrderExample() {
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

        public Criteria andBoIdIsNull() {
            addCriterion("bo_id is null");
            return (Criteria) this;
        }

        public Criteria andBoIdIsNotNull() {
            addCriterion("bo_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoIdEqualTo(String value) {
            addCriterion("bo_id =", value, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdNotEqualTo(String value) {
            addCriterion("bo_id <>", value, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdGreaterThan(String value) {
            addCriterion("bo_id >", value, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdGreaterThanOrEqualTo(String value) {
            addCriterion("bo_id >=", value, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdLessThan(String value) {
            addCriterion("bo_id <", value, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdLessThanOrEqualTo(String value) {
            addCriterion("bo_id <=", value, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdLike(String value) {
            addCriterion("bo_id like", value, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdNotLike(String value) {
            addCriterion("bo_id not like", value, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdIn(List<String> values) {
            addCriterion("bo_id in", values, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdNotIn(List<String> values) {
            addCriterion("bo_id not in", values, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdBetween(String value1, String value2) {
            addCriterion("bo_id between", value1, value2, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdNotBetween(String value1, String value2) {
            addCriterion("bo_id not between", value1, value2, "boId");
            return (Criteria) this;
        }

        public Criteria andSupIdIsNull() {
            addCriterion("sup_id is null");
            return (Criteria) this;
        }

        public Criteria andSupIdIsNotNull() {
            addCriterion("sup_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupIdEqualTo(Integer value) {
            addCriterion("sup_id =", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotEqualTo(Integer value) {
            addCriterion("sup_id <>", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdGreaterThan(Integer value) {
            addCriterion("sup_id >", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sup_id >=", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdLessThan(Integer value) {
            addCriterion("sup_id <", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdLessThanOrEqualTo(Integer value) {
            addCriterion("sup_id <=", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdIn(List<Integer> values) {
            addCriterion("sup_id in", values, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotIn(List<Integer> values) {
            addCriterion("sup_id not in", values, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdBetween(Integer value1, Integer value2) {
            addCriterion("sup_id between", value1, value2, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sup_id not between", value1, value2, "supId");
            return (Criteria) this;
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

        public Criteria andBoDateIsNull() {
            addCriterion("bo_date is null");
            return (Criteria) this;
        }

        public Criteria andBoDateIsNotNull() {
            addCriterion("bo_date is not null");
            return (Criteria) this;
        }

        public Criteria andBoDateEqualTo(String value) {
            addCriterion("bo_date =", value, "boDate");
            return (Criteria) this;
        }

        public Criteria andBoDateNotEqualTo(String value) {
            addCriterion("bo_date <>", value, "boDate");
            return (Criteria) this;
        }

        public Criteria andBoDateGreaterThan(String value) {
            addCriterion("bo_date >", value, "boDate");
            return (Criteria) this;
        }

        public Criteria andBoDateGreaterThanOrEqualTo(String value) {
            addCriterion("bo_date >=", value, "boDate");
            return (Criteria) this;
        }

        public Criteria andBoDateLessThan(String value) {
            addCriterion("bo_date <", value, "boDate");
            return (Criteria) this;
        }

        public Criteria andBoDateLessThanOrEqualTo(String value) {
            addCriterion("bo_date <=", value, "boDate");
            return (Criteria) this;
        }

        public Criteria andBoDateLike(String value) {
            addCriterion("bo_date like", value, "boDate");
            return (Criteria) this;
        }

        public Criteria andBoDateNotLike(String value) {
            addCriterion("bo_date not like", value, "boDate");
            return (Criteria) this;
        }

        public Criteria andBoDateIn(List<String> values) {
            addCriterion("bo_date in", values, "boDate");
            return (Criteria) this;
        }

        public Criteria andBoDateNotIn(List<String> values) {
            addCriterion("bo_date not in", values, "boDate");
            return (Criteria) this;
        }

        public Criteria andBoDateBetween(String value1, String value2) {
            addCriterion("bo_date between", value1, value2, "boDate");
            return (Criteria) this;
        }

        public Criteria andBoDateNotBetween(String value1, String value2) {
            addCriterion("bo_date not between", value1, value2, "boDate");
            return (Criteria) this;
        }

        public Criteria andBoPayableIsNull() {
            addCriterion("bo_payable is null");
            return (Criteria) this;
        }

        public Criteria andBoPayableIsNotNull() {
            addCriterion("bo_payable is not null");
            return (Criteria) this;
        }

        public Criteria andBoPayableEqualTo(Integer value) {
            addCriterion("bo_payable =", value, "boPayable");
            return (Criteria) this;
        }

        public Criteria andBoPayableNotEqualTo(Integer value) {
            addCriterion("bo_payable <>", value, "boPayable");
            return (Criteria) this;
        }

        public Criteria andBoPayableGreaterThan(Integer value) {
            addCriterion("bo_payable >", value, "boPayable");
            return (Criteria) this;
        }

        public Criteria andBoPayableGreaterThanOrEqualTo(Integer value) {
            addCriterion("bo_payable >=", value, "boPayable");
            return (Criteria) this;
        }

        public Criteria andBoPayableLessThan(Integer value) {
            addCriterion("bo_payable <", value, "boPayable");
            return (Criteria) this;
        }

        public Criteria andBoPayableLessThanOrEqualTo(Integer value) {
            addCriterion("bo_payable <=", value, "boPayable");
            return (Criteria) this;
        }

        public Criteria andBoPayableIn(List<Integer> values) {
            addCriterion("bo_payable in", values, "boPayable");
            return (Criteria) this;
        }

        public Criteria andBoPayableNotIn(List<Integer> values) {
            addCriterion("bo_payable not in", values, "boPayable");
            return (Criteria) this;
        }

        public Criteria andBoPayableBetween(Integer value1, Integer value2) {
            addCriterion("bo_payable between", value1, value2, "boPayable");
            return (Criteria) this;
        }

        public Criteria andBoPayableNotBetween(Integer value1, Integer value2) {
            addCriterion("bo_payable not between", value1, value2, "boPayable");
            return (Criteria) this;
        }

        public Criteria andBoPaidIsNull() {
            addCriterion("bo_paid is null");
            return (Criteria) this;
        }

        public Criteria andBoPaidIsNotNull() {
            addCriterion("bo_paid is not null");
            return (Criteria) this;
        }

        public Criteria andBoPaidEqualTo(Integer value) {
            addCriterion("bo_paid =", value, "boPaid");
            return (Criteria) this;
        }

        public Criteria andBoPaidNotEqualTo(Integer value) {
            addCriterion("bo_paid <>", value, "boPaid");
            return (Criteria) this;
        }

        public Criteria andBoPaidGreaterThan(Integer value) {
            addCriterion("bo_paid >", value, "boPaid");
            return (Criteria) this;
        }

        public Criteria andBoPaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bo_paid >=", value, "boPaid");
            return (Criteria) this;
        }

        public Criteria andBoPaidLessThan(Integer value) {
            addCriterion("bo_paid <", value, "boPaid");
            return (Criteria) this;
        }

        public Criteria andBoPaidLessThanOrEqualTo(Integer value) {
            addCriterion("bo_paid <=", value, "boPaid");
            return (Criteria) this;
        }

        public Criteria andBoPaidIn(List<Integer> values) {
            addCriterion("bo_paid in", values, "boPaid");
            return (Criteria) this;
        }

        public Criteria andBoPaidNotIn(List<Integer> values) {
            addCriterion("bo_paid not in", values, "boPaid");
            return (Criteria) this;
        }

        public Criteria andBoPaidBetween(Integer value1, Integer value2) {
            addCriterion("bo_paid between", value1, value2, "boPaid");
            return (Criteria) this;
        }

        public Criteria andBoPaidNotBetween(Integer value1, Integer value2) {
            addCriterion("bo_paid not between", value1, value2, "boPaid");
            return (Criteria) this;
        }

        public Criteria andBoArrearsIsNull() {
            addCriterion("bo_arrears is null");
            return (Criteria) this;
        }

        public Criteria andBoArrearsIsNotNull() {
            addCriterion("bo_arrears is not null");
            return (Criteria) this;
        }

        public Criteria andBoArrearsEqualTo(Integer value) {
            addCriterion("bo_arrears =", value, "boArrears");
            return (Criteria) this;
        }

        public Criteria andBoArrearsNotEqualTo(Integer value) {
            addCriterion("bo_arrears <>", value, "boArrears");
            return (Criteria) this;
        }

        public Criteria andBoArrearsGreaterThan(Integer value) {
            addCriterion("bo_arrears >", value, "boArrears");
            return (Criteria) this;
        }

        public Criteria andBoArrearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("bo_arrears >=", value, "boArrears");
            return (Criteria) this;
        }

        public Criteria andBoArrearsLessThan(Integer value) {
            addCriterion("bo_arrears <", value, "boArrears");
            return (Criteria) this;
        }

        public Criteria andBoArrearsLessThanOrEqualTo(Integer value) {
            addCriterion("bo_arrears <=", value, "boArrears");
            return (Criteria) this;
        }

        public Criteria andBoArrearsIn(List<Integer> values) {
            addCriterion("bo_arrears in", values, "boArrears");
            return (Criteria) this;
        }

        public Criteria andBoArrearsNotIn(List<Integer> values) {
            addCriterion("bo_arrears not in", values, "boArrears");
            return (Criteria) this;
        }

        public Criteria andBoArrearsBetween(Integer value1, Integer value2) {
            addCriterion("bo_arrears between", value1, value2, "boArrears");
            return (Criteria) this;
        }

        public Criteria andBoArrearsNotBetween(Integer value1, Integer value2) {
            addCriterion("bo_arrears not between", value1, value2, "boArrears");
            return (Criteria) this;
        }

        public Criteria andBoOriginalIsNull() {
            addCriterion("bo_original is null");
            return (Criteria) this;
        }

        public Criteria andBoOriginalIsNotNull() {
            addCriterion("bo_original is not null");
            return (Criteria) this;
        }

        public Criteria andBoOriginalEqualTo(String value) {
            addCriterion("bo_original =", value, "boOriginal");
            return (Criteria) this;
        }

        public Criteria andBoOriginalNotEqualTo(String value) {
            addCriterion("bo_original <>", value, "boOriginal");
            return (Criteria) this;
        }

        public Criteria andBoOriginalGreaterThan(String value) {
            addCriterion("bo_original >", value, "boOriginal");
            return (Criteria) this;
        }

        public Criteria andBoOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("bo_original >=", value, "boOriginal");
            return (Criteria) this;
        }

        public Criteria andBoOriginalLessThan(String value) {
            addCriterion("bo_original <", value, "boOriginal");
            return (Criteria) this;
        }

        public Criteria andBoOriginalLessThanOrEqualTo(String value) {
            addCriterion("bo_original <=", value, "boOriginal");
            return (Criteria) this;
        }

        public Criteria andBoOriginalLike(String value) {
            addCriterion("bo_original like", value, "boOriginal");
            return (Criteria) this;
        }

        public Criteria andBoOriginalNotLike(String value) {
            addCriterion("bo_original not like", value, "boOriginal");
            return (Criteria) this;
        }

        public Criteria andBoOriginalIn(List<String> values) {
            addCriterion("bo_original in", values, "boOriginal");
            return (Criteria) this;
        }

        public Criteria andBoOriginalNotIn(List<String> values) {
            addCriterion("bo_original not in", values, "boOriginal");
            return (Criteria) this;
        }

        public Criteria andBoOriginalBetween(String value1, String value2) {
            addCriterion("bo_original between", value1, value2, "boOriginal");
            return (Criteria) this;
        }

        public Criteria andBoOriginalNotBetween(String value1, String value2) {
            addCriterion("bo_original not between", value1, value2, "boOriginal");
            return (Criteria) this;
        }

        public Criteria andBoRemarkIsNull() {
            addCriterion("bo_remark is null");
            return (Criteria) this;
        }

        public Criteria andBoRemarkIsNotNull() {
            addCriterion("bo_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBoRemarkEqualTo(String value) {
            addCriterion("bo_remark =", value, "boRemark");
            return (Criteria) this;
        }

        public Criteria andBoRemarkNotEqualTo(String value) {
            addCriterion("bo_remark <>", value, "boRemark");
            return (Criteria) this;
        }

        public Criteria andBoRemarkGreaterThan(String value) {
            addCriterion("bo_remark >", value, "boRemark");
            return (Criteria) this;
        }

        public Criteria andBoRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("bo_remark >=", value, "boRemark");
            return (Criteria) this;
        }

        public Criteria andBoRemarkLessThan(String value) {
            addCriterion("bo_remark <", value, "boRemark");
            return (Criteria) this;
        }

        public Criteria andBoRemarkLessThanOrEqualTo(String value) {
            addCriterion("bo_remark <=", value, "boRemark");
            return (Criteria) this;
        }

        public Criteria andBoRemarkLike(String value) {
            addCriterion("bo_remark like", value, "boRemark");
            return (Criteria) this;
        }

        public Criteria andBoRemarkNotLike(String value) {
            addCriterion("bo_remark not like", value, "boRemark");
            return (Criteria) this;
        }

        public Criteria andBoRemarkIn(List<String> values) {
            addCriterion("bo_remark in", values, "boRemark");
            return (Criteria) this;
        }

        public Criteria andBoRemarkNotIn(List<String> values) {
            addCriterion("bo_remark not in", values, "boRemark");
            return (Criteria) this;
        }

        public Criteria andBoRemarkBetween(String value1, String value2) {
            addCriterion("bo_remark between", value1, value2, "boRemark");
            return (Criteria) this;
        }

        public Criteria andBoRemarkNotBetween(String value1, String value2) {
            addCriterion("bo_remark not between", value1, value2, "boRemark");
            return (Criteria) this;
        }

        public Criteria andBoAttnIsNull() {
            addCriterion("bo_attn is null");
            return (Criteria) this;
        }

        public Criteria andBoAttnIsNotNull() {
            addCriterion("bo_attn is not null");
            return (Criteria) this;
        }

        public Criteria andBoAttnEqualTo(String value) {
            addCriterion("bo_attn =", value, "boAttn");
            return (Criteria) this;
        }

        public Criteria andBoAttnNotEqualTo(String value) {
            addCriterion("bo_attn <>", value, "boAttn");
            return (Criteria) this;
        }

        public Criteria andBoAttnGreaterThan(String value) {
            addCriterion("bo_attn >", value, "boAttn");
            return (Criteria) this;
        }

        public Criteria andBoAttnGreaterThanOrEqualTo(String value) {
            addCriterion("bo_attn >=", value, "boAttn");
            return (Criteria) this;
        }

        public Criteria andBoAttnLessThan(String value) {
            addCriterion("bo_attn <", value, "boAttn");
            return (Criteria) this;
        }

        public Criteria andBoAttnLessThanOrEqualTo(String value) {
            addCriterion("bo_attn <=", value, "boAttn");
            return (Criteria) this;
        }

        public Criteria andBoAttnLike(String value) {
            addCriterion("bo_attn like", value, "boAttn");
            return (Criteria) this;
        }

        public Criteria andBoAttnNotLike(String value) {
            addCriterion("bo_attn not like", value, "boAttn");
            return (Criteria) this;
        }

        public Criteria andBoAttnIn(List<String> values) {
            addCriterion("bo_attn in", values, "boAttn");
            return (Criteria) this;
        }

        public Criteria andBoAttnNotIn(List<String> values) {
            addCriterion("bo_attn not in", values, "boAttn");
            return (Criteria) this;
        }

        public Criteria andBoAttnBetween(String value1, String value2) {
            addCriterion("bo_attn between", value1, value2, "boAttn");
            return (Criteria) this;
        }

        public Criteria andBoAttnNotBetween(String value1, String value2) {
            addCriterion("bo_attn not between", value1, value2, "boAttn");
            return (Criteria) this;
        }

        public Criteria andBoOperatorIsNull() {
            addCriterion("bo_operator is null");
            return (Criteria) this;
        }

        public Criteria andBoOperatorIsNotNull() {
            addCriterion("bo_operator is not null");
            return (Criteria) this;
        }

        public Criteria andBoOperatorEqualTo(Integer value) {
            addCriterion("bo_operator =", value, "boOperator");
            return (Criteria) this;
        }

        public Criteria andBoOperatorNotEqualTo(Integer value) {
            addCriterion("bo_operator <>", value, "boOperator");
            return (Criteria) this;
        }

        public Criteria andBoOperatorGreaterThan(Integer value) {
            addCriterion("bo_operator >", value, "boOperator");
            return (Criteria) this;
        }

        public Criteria andBoOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("bo_operator >=", value, "boOperator");
            return (Criteria) this;
        }

        public Criteria andBoOperatorLessThan(Integer value) {
            addCriterion("bo_operator <", value, "boOperator");
            return (Criteria) this;
        }

        public Criteria andBoOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("bo_operator <=", value, "boOperator");
            return (Criteria) this;
        }

        public Criteria andBoOperatorIn(List<Integer> values) {
            addCriterion("bo_operator in", values, "boOperator");
            return (Criteria) this;
        }

        public Criteria andBoOperatorNotIn(List<Integer> values) {
            addCriterion("bo_operator not in", values, "boOperator");
            return (Criteria) this;
        }

        public Criteria andBoOperatorBetween(Integer value1, Integer value2) {
            addCriterion("bo_operator between", value1, value2, "boOperator");
            return (Criteria) this;
        }

        public Criteria andBoOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("bo_operator not between", value1, value2, "boOperator");
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