package com.madeofwu.will.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReturnOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReturnOrderDetailExample() {
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

        public Criteria andRodIdIsNull() {
            addCriterion("rod_id is null");
            return (Criteria) this;
        }

        public Criteria andRodIdIsNotNull() {
            addCriterion("rod_id is not null");
            return (Criteria) this;
        }

        public Criteria andRodIdEqualTo(String value) {
            addCriterion("rod_id =", value, "rodId");
            return (Criteria) this;
        }

        public Criteria andRodIdNotEqualTo(String value) {
            addCriterion("rod_id <>", value, "rodId");
            return (Criteria) this;
        }

        public Criteria andRodIdGreaterThan(String value) {
            addCriterion("rod_id >", value, "rodId");
            return (Criteria) this;
        }

        public Criteria andRodIdGreaterThanOrEqualTo(String value) {
            addCriterion("rod_id >=", value, "rodId");
            return (Criteria) this;
        }

        public Criteria andRodIdLessThan(String value) {
            addCriterion("rod_id <", value, "rodId");
            return (Criteria) this;
        }

        public Criteria andRodIdLessThanOrEqualTo(String value) {
            addCriterion("rod_id <=", value, "rodId");
            return (Criteria) this;
        }

        public Criteria andRodIdLike(String value) {
            addCriterion("rod_id like", value, "rodId");
            return (Criteria) this;
        }

        public Criteria andRodIdNotLike(String value) {
            addCriterion("rod_id not like", value, "rodId");
            return (Criteria) this;
        }

        public Criteria andRodIdIn(List<String> values) {
            addCriterion("rod_id in", values, "rodId");
            return (Criteria) this;
        }

        public Criteria andRodIdNotIn(List<String> values) {
            addCriterion("rod_id not in", values, "rodId");
            return (Criteria) this;
        }

        public Criteria andRodIdBetween(String value1, String value2) {
            addCriterion("rod_id between", value1, value2, "rodId");
            return (Criteria) this;
        }

        public Criteria andRodIdNotBetween(String value1, String value2) {
            addCriterion("rod_id not between", value1, value2, "rodId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNull() {
            addCriterion("goods_unit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNotNull() {
            addCriterion("goods_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitEqualTo(String value) {
            addCriterion("goods_unit =", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotEqualTo(String value) {
            addCriterion("goods_unit <>", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThan(String value) {
            addCriterion("goods_unit >", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("goods_unit >=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThan(String value) {
            addCriterion("goods_unit <", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThanOrEqualTo(String value) {
            addCriterion("goods_unit <=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLike(String value) {
            addCriterion("goods_unit like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotLike(String value) {
            addCriterion("goods_unit not like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIn(List<String> values) {
            addCriterion("goods_unit in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotIn(List<String> values) {
            addCriterion("goods_unit not in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitBetween(String value1, String value2) {
            addCriterion("goods_unit between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotBetween(String value1, String value2) {
            addCriterion("goods_unit not between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("goods_type like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("goods_type not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIsNull() {
            addCriterion("goods_color is null");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIsNotNull() {
            addCriterion("goods_color is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsColorEqualTo(String value) {
            addCriterion("goods_color =", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorNotEqualTo(String value) {
            addCriterion("goods_color <>", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorGreaterThan(String value) {
            addCriterion("goods_color >", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorGreaterThanOrEqualTo(String value) {
            addCriterion("goods_color >=", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorLessThan(String value) {
            addCriterion("goods_color <", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorLessThanOrEqualTo(String value) {
            addCriterion("goods_color <=", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorLike(String value) {
            addCriterion("goods_color like", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorNotLike(String value) {
            addCriterion("goods_color not like", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIn(List<String> values) {
            addCriterion("goods_color in", values, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorNotIn(List<String> values) {
            addCriterion("goods_color not in", values, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorBetween(String value1, String value2) {
            addCriterion("goods_color between", value1, value2, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorNotBetween(String value1, String value2) {
            addCriterion("goods_color not between", value1, value2, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andRodAmountIsNull() {
            addCriterion("rod_amount is null");
            return (Criteria) this;
        }

        public Criteria andRodAmountIsNotNull() {
            addCriterion("rod_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRodAmountEqualTo(Integer value) {
            addCriterion("rod_amount =", value, "rodAmount");
            return (Criteria) this;
        }

        public Criteria andRodAmountNotEqualTo(Integer value) {
            addCriterion("rod_amount <>", value, "rodAmount");
            return (Criteria) this;
        }

        public Criteria andRodAmountGreaterThan(Integer value) {
            addCriterion("rod_amount >", value, "rodAmount");
            return (Criteria) this;
        }

        public Criteria andRodAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("rod_amount >=", value, "rodAmount");
            return (Criteria) this;
        }

        public Criteria andRodAmountLessThan(Integer value) {
            addCriterion("rod_amount <", value, "rodAmount");
            return (Criteria) this;
        }

        public Criteria andRodAmountLessThanOrEqualTo(Integer value) {
            addCriterion("rod_amount <=", value, "rodAmount");
            return (Criteria) this;
        }

        public Criteria andRodAmountIn(List<Integer> values) {
            addCriterion("rod_amount in", values, "rodAmount");
            return (Criteria) this;
        }

        public Criteria andRodAmountNotIn(List<Integer> values) {
            addCriterion("rod_amount not in", values, "rodAmount");
            return (Criteria) this;
        }

        public Criteria andRodAmountBetween(Integer value1, Integer value2) {
            addCriterion("rod_amount between", value1, value2, "rodAmount");
            return (Criteria) this;
        }

        public Criteria andRodAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("rod_amount not between", value1, value2, "rodAmount");
            return (Criteria) this;
        }

        public Criteria andRodReturnPriceIsNull() {
            addCriterion("rod_return_price is null");
            return (Criteria) this;
        }

        public Criteria andRodReturnPriceIsNotNull() {
            addCriterion("rod_return_price is not null");
            return (Criteria) this;
        }

        public Criteria andRodReturnPriceEqualTo(Integer value) {
            addCriterion("rod_return_price =", value, "rodReturnPrice");
            return (Criteria) this;
        }

        public Criteria andRodReturnPriceNotEqualTo(Integer value) {
            addCriterion("rod_return_price <>", value, "rodReturnPrice");
            return (Criteria) this;
        }

        public Criteria andRodReturnPriceGreaterThan(Integer value) {
            addCriterion("rod_return_price >", value, "rodReturnPrice");
            return (Criteria) this;
        }

        public Criteria andRodReturnPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("rod_return_price >=", value, "rodReturnPrice");
            return (Criteria) this;
        }

        public Criteria andRodReturnPriceLessThan(Integer value) {
            addCriterion("rod_return_price <", value, "rodReturnPrice");
            return (Criteria) this;
        }

        public Criteria andRodReturnPriceLessThanOrEqualTo(Integer value) {
            addCriterion("rod_return_price <=", value, "rodReturnPrice");
            return (Criteria) this;
        }

        public Criteria andRodReturnPriceIn(List<Integer> values) {
            addCriterion("rod_return_price in", values, "rodReturnPrice");
            return (Criteria) this;
        }

        public Criteria andRodReturnPriceNotIn(List<Integer> values) {
            addCriterion("rod_return_price not in", values, "rodReturnPrice");
            return (Criteria) this;
        }

        public Criteria andRodReturnPriceBetween(Integer value1, Integer value2) {
            addCriterion("rod_return_price between", value1, value2, "rodReturnPrice");
            return (Criteria) this;
        }

        public Criteria andRodReturnPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("rod_return_price not between", value1, value2, "rodReturnPrice");
            return (Criteria) this;
        }

        public Criteria andRodTotalPriceIsNull() {
            addCriterion("rod_total_price is null");
            return (Criteria) this;
        }

        public Criteria andRodTotalPriceIsNotNull() {
            addCriterion("rod_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andRodTotalPriceEqualTo(Integer value) {
            addCriterion("rod_total_price =", value, "rodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andRodTotalPriceNotEqualTo(Integer value) {
            addCriterion("rod_total_price <>", value, "rodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andRodTotalPriceGreaterThan(Integer value) {
            addCriterion("rod_total_price >", value, "rodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andRodTotalPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("rod_total_price >=", value, "rodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andRodTotalPriceLessThan(Integer value) {
            addCriterion("rod_total_price <", value, "rodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andRodTotalPriceLessThanOrEqualTo(Integer value) {
            addCriterion("rod_total_price <=", value, "rodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andRodTotalPriceIn(List<Integer> values) {
            addCriterion("rod_total_price in", values, "rodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andRodTotalPriceNotIn(List<Integer> values) {
            addCriterion("rod_total_price not in", values, "rodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andRodTotalPriceBetween(Integer value1, Integer value2) {
            addCriterion("rod_total_price between", value1, value2, "rodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andRodTotalPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("rod_total_price not between", value1, value2, "rodTotalPrice");
            return (Criteria) this;
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