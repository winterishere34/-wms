package com.madeofwu.will.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReturnOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReturnOrderExample() {
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

        public Criteria andRoIdIsNull() {
            addCriterion("ro_id is null");
            return (Criteria) this;
        }

        public Criteria andRoIdIsNotNull() {
            addCriterion("ro_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoIdEqualTo(String value) {
            addCriterion("ro_id =", value, "roId");
            return (Criteria) this;
        }

        public Criteria andRoIdNotEqualTo(String value) {
            addCriterion("ro_id <>", value, "roId");
            return (Criteria) this;
        }

        public Criteria andRoIdGreaterThan(String value) {
            addCriterion("ro_id >", value, "roId");
            return (Criteria) this;
        }

        public Criteria andRoIdGreaterThanOrEqualTo(String value) {
            addCriterion("ro_id >=", value, "roId");
            return (Criteria) this;
        }

        public Criteria andRoIdLessThan(String value) {
            addCriterion("ro_id <", value, "roId");
            return (Criteria) this;
        }

        public Criteria andRoIdLessThanOrEqualTo(String value) {
            addCriterion("ro_id <=", value, "roId");
            return (Criteria) this;
        }

        public Criteria andRoIdLike(String value) {
            addCriterion("ro_id like", value, "roId");
            return (Criteria) this;
        }

        public Criteria andRoIdNotLike(String value) {
            addCriterion("ro_id not like", value, "roId");
            return (Criteria) this;
        }

        public Criteria andRoIdIn(List<String> values) {
            addCriterion("ro_id in", values, "roId");
            return (Criteria) this;
        }

        public Criteria andRoIdNotIn(List<String> values) {
            addCriterion("ro_id not in", values, "roId");
            return (Criteria) this;
        }

        public Criteria andRoIdBetween(String value1, String value2) {
            addCriterion("ro_id between", value1, value2, "roId");
            return (Criteria) this;
        }

        public Criteria andRoIdNotBetween(String value1, String value2) {
            addCriterion("ro_id not between", value1, value2, "roId");
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

        public Criteria andRoDateIsNull() {
            addCriterion("ro_date is null");
            return (Criteria) this;
        }

        public Criteria andRoDateIsNotNull() {
            addCriterion("ro_date is not null");
            return (Criteria) this;
        }

        public Criteria andRoDateEqualTo(String value) {
            addCriterion("ro_date =", value, "roDate");
            return (Criteria) this;
        }

        public Criteria andRoDateNotEqualTo(String value) {
            addCriterion("ro_date <>", value, "roDate");
            return (Criteria) this;
        }

        public Criteria andRoDateGreaterThan(String value) {
            addCriterion("ro_date >", value, "roDate");
            return (Criteria) this;
        }

        public Criteria andRoDateGreaterThanOrEqualTo(String value) {
            addCriterion("ro_date >=", value, "roDate");
            return (Criteria) this;
        }

        public Criteria andRoDateLessThan(String value) {
            addCriterion("ro_date <", value, "roDate");
            return (Criteria) this;
        }

        public Criteria andRoDateLessThanOrEqualTo(String value) {
            addCriterion("ro_date <=", value, "roDate");
            return (Criteria) this;
        }

        public Criteria andRoDateLike(String value) {
            addCriterion("ro_date like", value, "roDate");
            return (Criteria) this;
        }

        public Criteria andRoDateNotLike(String value) {
            addCriterion("ro_date not like", value, "roDate");
            return (Criteria) this;
        }

        public Criteria andRoDateIn(List<String> values) {
            addCriterion("ro_date in", values, "roDate");
            return (Criteria) this;
        }

        public Criteria andRoDateNotIn(List<String> values) {
            addCriterion("ro_date not in", values, "roDate");
            return (Criteria) this;
        }

        public Criteria andRoDateBetween(String value1, String value2) {
            addCriterion("ro_date between", value1, value2, "roDate");
            return (Criteria) this;
        }

        public Criteria andRoDateNotBetween(String value1, String value2) {
            addCriterion("ro_date not between", value1, value2, "roDate");
            return (Criteria) this;
        }

        public Criteria andRoPayableIsNull() {
            addCriterion("ro_payable is null");
            return (Criteria) this;
        }

        public Criteria andRoPayableIsNotNull() {
            addCriterion("ro_payable is not null");
            return (Criteria) this;
        }

        public Criteria andRoPayableEqualTo(Integer value) {
            addCriterion("ro_payable =", value, "roPayable");
            return (Criteria) this;
        }

        public Criteria andRoPayableNotEqualTo(Integer value) {
            addCriterion("ro_payable <>", value, "roPayable");
            return (Criteria) this;
        }

        public Criteria andRoPayableGreaterThan(Integer value) {
            addCriterion("ro_payable >", value, "roPayable");
            return (Criteria) this;
        }

        public Criteria andRoPayableGreaterThanOrEqualTo(Integer value) {
            addCriterion("ro_payable >=", value, "roPayable");
            return (Criteria) this;
        }

        public Criteria andRoPayableLessThan(Integer value) {
            addCriterion("ro_payable <", value, "roPayable");
            return (Criteria) this;
        }

        public Criteria andRoPayableLessThanOrEqualTo(Integer value) {
            addCriterion("ro_payable <=", value, "roPayable");
            return (Criteria) this;
        }

        public Criteria andRoPayableIn(List<Integer> values) {
            addCriterion("ro_payable in", values, "roPayable");
            return (Criteria) this;
        }

        public Criteria andRoPayableNotIn(List<Integer> values) {
            addCriterion("ro_payable not in", values, "roPayable");
            return (Criteria) this;
        }

        public Criteria andRoPayableBetween(Integer value1, Integer value2) {
            addCriterion("ro_payable between", value1, value2, "roPayable");
            return (Criteria) this;
        }

        public Criteria andRoPayableNotBetween(Integer value1, Integer value2) {
            addCriterion("ro_payable not between", value1, value2, "roPayable");
            return (Criteria) this;
        }

        public Criteria andRoPaidIsNull() {
            addCriterion("ro_paid is null");
            return (Criteria) this;
        }

        public Criteria andRoPaidIsNotNull() {
            addCriterion("ro_paid is not null");
            return (Criteria) this;
        }

        public Criteria andRoPaidEqualTo(Integer value) {
            addCriterion("ro_paid =", value, "roPaid");
            return (Criteria) this;
        }

        public Criteria andRoPaidNotEqualTo(Integer value) {
            addCriterion("ro_paid <>", value, "roPaid");
            return (Criteria) this;
        }

        public Criteria andRoPaidGreaterThan(Integer value) {
            addCriterion("ro_paid >", value, "roPaid");
            return (Criteria) this;
        }

        public Criteria andRoPaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ro_paid >=", value, "roPaid");
            return (Criteria) this;
        }

        public Criteria andRoPaidLessThan(Integer value) {
            addCriterion("ro_paid <", value, "roPaid");
            return (Criteria) this;
        }

        public Criteria andRoPaidLessThanOrEqualTo(Integer value) {
            addCriterion("ro_paid <=", value, "roPaid");
            return (Criteria) this;
        }

        public Criteria andRoPaidIn(List<Integer> values) {
            addCriterion("ro_paid in", values, "roPaid");
            return (Criteria) this;
        }

        public Criteria andRoPaidNotIn(List<Integer> values) {
            addCriterion("ro_paid not in", values, "roPaid");
            return (Criteria) this;
        }

        public Criteria andRoPaidBetween(Integer value1, Integer value2) {
            addCriterion("ro_paid between", value1, value2, "roPaid");
            return (Criteria) this;
        }

        public Criteria andRoPaidNotBetween(Integer value1, Integer value2) {
            addCriterion("ro_paid not between", value1, value2, "roPaid");
            return (Criteria) this;
        }

        public Criteria andRoOriginalIsNull() {
            addCriterion("ro_original is null");
            return (Criteria) this;
        }

        public Criteria andRoOriginalIsNotNull() {
            addCriterion("ro_original is not null");
            return (Criteria) this;
        }

        public Criteria andRoOriginalEqualTo(String value) {
            addCriterion("ro_original =", value, "roOriginal");
            return (Criteria) this;
        }

        public Criteria andRoOriginalNotEqualTo(String value) {
            addCriterion("ro_original <>", value, "roOriginal");
            return (Criteria) this;
        }

        public Criteria andRoOriginalGreaterThan(String value) {
            addCriterion("ro_original >", value, "roOriginal");
            return (Criteria) this;
        }

        public Criteria andRoOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("ro_original >=", value, "roOriginal");
            return (Criteria) this;
        }

        public Criteria andRoOriginalLessThan(String value) {
            addCriterion("ro_original <", value, "roOriginal");
            return (Criteria) this;
        }

        public Criteria andRoOriginalLessThanOrEqualTo(String value) {
            addCriterion("ro_original <=", value, "roOriginal");
            return (Criteria) this;
        }

        public Criteria andRoOriginalLike(String value) {
            addCriterion("ro_original like", value, "roOriginal");
            return (Criteria) this;
        }

        public Criteria andRoOriginalNotLike(String value) {
            addCriterion("ro_original not like", value, "roOriginal");
            return (Criteria) this;
        }

        public Criteria andRoOriginalIn(List<String> values) {
            addCriterion("ro_original in", values, "roOriginal");
            return (Criteria) this;
        }

        public Criteria andRoOriginalNotIn(List<String> values) {
            addCriterion("ro_original not in", values, "roOriginal");
            return (Criteria) this;
        }

        public Criteria andRoOriginalBetween(String value1, String value2) {
            addCriterion("ro_original between", value1, value2, "roOriginal");
            return (Criteria) this;
        }

        public Criteria andRoOriginalNotBetween(String value1, String value2) {
            addCriterion("ro_original not between", value1, value2, "roOriginal");
            return (Criteria) this;
        }

        public Criteria andRoRemarkIsNull() {
            addCriterion("ro_remark is null");
            return (Criteria) this;
        }

        public Criteria andRoRemarkIsNotNull() {
            addCriterion("ro_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRoRemarkEqualTo(String value) {
            addCriterion("ro_remark =", value, "roRemark");
            return (Criteria) this;
        }

        public Criteria andRoRemarkNotEqualTo(String value) {
            addCriterion("ro_remark <>", value, "roRemark");
            return (Criteria) this;
        }

        public Criteria andRoRemarkGreaterThan(String value) {
            addCriterion("ro_remark >", value, "roRemark");
            return (Criteria) this;
        }

        public Criteria andRoRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ro_remark >=", value, "roRemark");
            return (Criteria) this;
        }

        public Criteria andRoRemarkLessThan(String value) {
            addCriterion("ro_remark <", value, "roRemark");
            return (Criteria) this;
        }

        public Criteria andRoRemarkLessThanOrEqualTo(String value) {
            addCriterion("ro_remark <=", value, "roRemark");
            return (Criteria) this;
        }

        public Criteria andRoRemarkLike(String value) {
            addCriterion("ro_remark like", value, "roRemark");
            return (Criteria) this;
        }

        public Criteria andRoRemarkNotLike(String value) {
            addCriterion("ro_remark not like", value, "roRemark");
            return (Criteria) this;
        }

        public Criteria andRoRemarkIn(List<String> values) {
            addCriterion("ro_remark in", values, "roRemark");
            return (Criteria) this;
        }

        public Criteria andRoRemarkNotIn(List<String> values) {
            addCriterion("ro_remark not in", values, "roRemark");
            return (Criteria) this;
        }

        public Criteria andRoRemarkBetween(String value1, String value2) {
            addCriterion("ro_remark between", value1, value2, "roRemark");
            return (Criteria) this;
        }

        public Criteria andRoRemarkNotBetween(String value1, String value2) {
            addCriterion("ro_remark not between", value1, value2, "roRemark");
            return (Criteria) this;
        }

        public Criteria andRoAttnIsNull() {
            addCriterion("ro_attn is null");
            return (Criteria) this;
        }

        public Criteria andRoAttnIsNotNull() {
            addCriterion("ro_attn is not null");
            return (Criteria) this;
        }

        public Criteria andRoAttnEqualTo(String value) {
            addCriterion("ro_attn =", value, "roAttn");
            return (Criteria) this;
        }

        public Criteria andRoAttnNotEqualTo(String value) {
            addCriterion("ro_attn <>", value, "roAttn");
            return (Criteria) this;
        }

        public Criteria andRoAttnGreaterThan(String value) {
            addCriterion("ro_attn >", value, "roAttn");
            return (Criteria) this;
        }

        public Criteria andRoAttnGreaterThanOrEqualTo(String value) {
            addCriterion("ro_attn >=", value, "roAttn");
            return (Criteria) this;
        }

        public Criteria andRoAttnLessThan(String value) {
            addCriterion("ro_attn <", value, "roAttn");
            return (Criteria) this;
        }

        public Criteria andRoAttnLessThanOrEqualTo(String value) {
            addCriterion("ro_attn <=", value, "roAttn");
            return (Criteria) this;
        }

        public Criteria andRoAttnLike(String value) {
            addCriterion("ro_attn like", value, "roAttn");
            return (Criteria) this;
        }

        public Criteria andRoAttnNotLike(String value) {
            addCriterion("ro_attn not like", value, "roAttn");
            return (Criteria) this;
        }

        public Criteria andRoAttnIn(List<String> values) {
            addCriterion("ro_attn in", values, "roAttn");
            return (Criteria) this;
        }

        public Criteria andRoAttnNotIn(List<String> values) {
            addCriterion("ro_attn not in", values, "roAttn");
            return (Criteria) this;
        }

        public Criteria andRoAttnBetween(String value1, String value2) {
            addCriterion("ro_attn between", value1, value2, "roAttn");
            return (Criteria) this;
        }

        public Criteria andRoAttnNotBetween(String value1, String value2) {
            addCriterion("ro_attn not between", value1, value2, "roAttn");
            return (Criteria) this;
        }

        public Criteria andRoOperatorIsNull() {
            addCriterion("ro_operator is null");
            return (Criteria) this;
        }

        public Criteria andRoOperatorIsNotNull() {
            addCriterion("ro_operator is not null");
            return (Criteria) this;
        }

        public Criteria andRoOperatorEqualTo(Integer value) {
            addCriterion("ro_operator =", value, "roOperator");
            return (Criteria) this;
        }

        public Criteria andRoOperatorNotEqualTo(Integer value) {
            addCriterion("ro_operator <>", value, "roOperator");
            return (Criteria) this;
        }

        public Criteria andRoOperatorGreaterThan(Integer value) {
            addCriterion("ro_operator >", value, "roOperator");
            return (Criteria) this;
        }

        public Criteria andRoOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("ro_operator >=", value, "roOperator");
            return (Criteria) this;
        }

        public Criteria andRoOperatorLessThan(Integer value) {
            addCriterion("ro_operator <", value, "roOperator");
            return (Criteria) this;
        }

        public Criteria andRoOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("ro_operator <=", value, "roOperator");
            return (Criteria) this;
        }

        public Criteria andRoOperatorIn(List<Integer> values) {
            addCriterion("ro_operator in", values, "roOperator");
            return (Criteria) this;
        }

        public Criteria andRoOperatorNotIn(List<Integer> values) {
            addCriterion("ro_operator not in", values, "roOperator");
            return (Criteria) this;
        }

        public Criteria andRoOperatorBetween(Integer value1, Integer value2) {
            addCriterion("ro_operator between", value1, value2, "roOperator");
            return (Criteria) this;
        }

        public Criteria andRoOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("ro_operator not between", value1, value2, "roOperator");
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