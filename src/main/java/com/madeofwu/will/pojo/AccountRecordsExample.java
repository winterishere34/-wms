package com.madeofwu.will.pojo;

import java.util.ArrayList;
import java.util.List;

public class AccountRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountRecordsExample() {
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

        public Criteria andArIdIsNull() {
            addCriterion("ar_id is null");
            return (Criteria) this;
        }

        public Criteria andArIdIsNotNull() {
            addCriterion("ar_id is not null");
            return (Criteria) this;
        }

        public Criteria andArIdEqualTo(String value) {
            addCriterion("ar_id =", value, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdNotEqualTo(String value) {
            addCriterion("ar_id <>", value, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdGreaterThan(String value) {
            addCriterion("ar_id >", value, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdGreaterThanOrEqualTo(String value) {
            addCriterion("ar_id >=", value, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdLessThan(String value) {
            addCriterion("ar_id <", value, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdLessThanOrEqualTo(String value) {
            addCriterion("ar_id <=", value, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdLike(String value) {
            addCriterion("ar_id like", value, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdNotLike(String value) {
            addCriterion("ar_id not like", value, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdIn(List<String> values) {
            addCriterion("ar_id in", values, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdNotIn(List<String> values) {
            addCriterion("ar_id not in", values, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdBetween(String value1, String value2) {
            addCriterion("ar_id between", value1, value2, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdNotBetween(String value1, String value2) {
            addCriterion("ar_id not between", value1, value2, "arId");
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

        public Criteria andArDateIsNull() {
            addCriterion("ar_date is null");
            return (Criteria) this;
        }

        public Criteria andArDateIsNotNull() {
            addCriterion("ar_date is not null");
            return (Criteria) this;
        }

        public Criteria andArDateEqualTo(String value) {
            addCriterion("ar_date =", value, "arDate");
            return (Criteria) this;
        }

        public Criteria andArDateNotEqualTo(String value) {
            addCriterion("ar_date <>", value, "arDate");
            return (Criteria) this;
        }

        public Criteria andArDateGreaterThan(String value) {
            addCriterion("ar_date >", value, "arDate");
            return (Criteria) this;
        }

        public Criteria andArDateGreaterThanOrEqualTo(String value) {
            addCriterion("ar_date >=", value, "arDate");
            return (Criteria) this;
        }

        public Criteria andArDateLessThan(String value) {
            addCriterion("ar_date <", value, "arDate");
            return (Criteria) this;
        }

        public Criteria andArDateLessThanOrEqualTo(String value) {
            addCriterion("ar_date <=", value, "arDate");
            return (Criteria) this;
        }

        public Criteria andArDateLike(String value) {
            addCriterion("ar_date like", value, "arDate");
            return (Criteria) this;
        }

        public Criteria andArDateNotLike(String value) {
            addCriterion("ar_date not like", value, "arDate");
            return (Criteria) this;
        }

        public Criteria andArDateIn(List<String> values) {
            addCriterion("ar_date in", values, "arDate");
            return (Criteria) this;
        }

        public Criteria andArDateNotIn(List<String> values) {
            addCriterion("ar_date not in", values, "arDate");
            return (Criteria) this;
        }

        public Criteria andArDateBetween(String value1, String value2) {
            addCriterion("ar_date between", value1, value2, "arDate");
            return (Criteria) this;
        }

        public Criteria andArDateNotBetween(String value1, String value2) {
            addCriterion("ar_date not between", value1, value2, "arDate");
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

        public Criteria andArAmountIsNull() {
            addCriterion("ar_amount is null");
            return (Criteria) this;
        }

        public Criteria andArAmountIsNotNull() {
            addCriterion("ar_amount is not null");
            return (Criteria) this;
        }

        public Criteria andArAmountEqualTo(Integer value) {
            addCriterion("ar_amount =", value, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountNotEqualTo(Integer value) {
            addCriterion("ar_amount <>", value, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountGreaterThan(Integer value) {
            addCriterion("ar_amount >", value, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ar_amount >=", value, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountLessThan(Integer value) {
            addCriterion("ar_amount <", value, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountLessThanOrEqualTo(Integer value) {
            addCriterion("ar_amount <=", value, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountIn(List<Integer> values) {
            addCriterion("ar_amount in", values, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountNotIn(List<Integer> values) {
            addCriterion("ar_amount not in", values, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountBetween(Integer value1, Integer value2) {
            addCriterion("ar_amount between", value1, value2, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("ar_amount not between", value1, value2, "arAmount");
            return (Criteria) this;
        }

        public Criteria andArPriceIsNull() {
            addCriterion("ar_price is null");
            return (Criteria) this;
        }

        public Criteria andArPriceIsNotNull() {
            addCriterion("ar_price is not null");
            return (Criteria) this;
        }

        public Criteria andArPriceEqualTo(Integer value) {
            addCriterion("ar_price =", value, "arPrice");
            return (Criteria) this;
        }

        public Criteria andArPriceNotEqualTo(Integer value) {
            addCriterion("ar_price <>", value, "arPrice");
            return (Criteria) this;
        }

        public Criteria andArPriceGreaterThan(Integer value) {
            addCriterion("ar_price >", value, "arPrice");
            return (Criteria) this;
        }

        public Criteria andArPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ar_price >=", value, "arPrice");
            return (Criteria) this;
        }

        public Criteria andArPriceLessThan(Integer value) {
            addCriterion("ar_price <", value, "arPrice");
            return (Criteria) this;
        }

        public Criteria andArPriceLessThanOrEqualTo(Integer value) {
            addCriterion("ar_price <=", value, "arPrice");
            return (Criteria) this;
        }

        public Criteria andArPriceIn(List<Integer> values) {
            addCriterion("ar_price in", values, "arPrice");
            return (Criteria) this;
        }

        public Criteria andArPriceNotIn(List<Integer> values) {
            addCriterion("ar_price not in", values, "arPrice");
            return (Criteria) this;
        }

        public Criteria andArPriceBetween(Integer value1, Integer value2) {
            addCriterion("ar_price between", value1, value2, "arPrice");
            return (Criteria) this;
        }

        public Criteria andArPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("ar_price not between", value1, value2, "arPrice");
            return (Criteria) this;
        }

        public Criteria andArPayableIsNull() {
            addCriterion("ar_payable is null");
            return (Criteria) this;
        }

        public Criteria andArPayableIsNotNull() {
            addCriterion("ar_payable is not null");
            return (Criteria) this;
        }

        public Criteria andArPayableEqualTo(Integer value) {
            addCriterion("ar_payable =", value, "arPayable");
            return (Criteria) this;
        }

        public Criteria andArPayableNotEqualTo(Integer value) {
            addCriterion("ar_payable <>", value, "arPayable");
            return (Criteria) this;
        }

        public Criteria andArPayableGreaterThan(Integer value) {
            addCriterion("ar_payable >", value, "arPayable");
            return (Criteria) this;
        }

        public Criteria andArPayableGreaterThanOrEqualTo(Integer value) {
            addCriterion("ar_payable >=", value, "arPayable");
            return (Criteria) this;
        }

        public Criteria andArPayableLessThan(Integer value) {
            addCriterion("ar_payable <", value, "arPayable");
            return (Criteria) this;
        }

        public Criteria andArPayableLessThanOrEqualTo(Integer value) {
            addCriterion("ar_payable <=", value, "arPayable");
            return (Criteria) this;
        }

        public Criteria andArPayableIn(List<Integer> values) {
            addCriterion("ar_payable in", values, "arPayable");
            return (Criteria) this;
        }

        public Criteria andArPayableNotIn(List<Integer> values) {
            addCriterion("ar_payable not in", values, "arPayable");
            return (Criteria) this;
        }

        public Criteria andArPayableBetween(Integer value1, Integer value2) {
            addCriterion("ar_payable between", value1, value2, "arPayable");
            return (Criteria) this;
        }

        public Criteria andArPayableNotBetween(Integer value1, Integer value2) {
            addCriterion("ar_payable not between", value1, value2, "arPayable");
            return (Criteria) this;
        }

        public Criteria andArPaidIsNull() {
            addCriterion("ar_paid is null");
            return (Criteria) this;
        }

        public Criteria andArPaidIsNotNull() {
            addCriterion("ar_paid is not null");
            return (Criteria) this;
        }

        public Criteria andArPaidEqualTo(Integer value) {
            addCriterion("ar_paid =", value, "arPaid");
            return (Criteria) this;
        }

        public Criteria andArPaidNotEqualTo(Integer value) {
            addCriterion("ar_paid <>", value, "arPaid");
            return (Criteria) this;
        }

        public Criteria andArPaidGreaterThan(Integer value) {
            addCriterion("ar_paid >", value, "arPaid");
            return (Criteria) this;
        }

        public Criteria andArPaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ar_paid >=", value, "arPaid");
            return (Criteria) this;
        }

        public Criteria andArPaidLessThan(Integer value) {
            addCriterion("ar_paid <", value, "arPaid");
            return (Criteria) this;
        }

        public Criteria andArPaidLessThanOrEqualTo(Integer value) {
            addCriterion("ar_paid <=", value, "arPaid");
            return (Criteria) this;
        }

        public Criteria andArPaidIn(List<Integer> values) {
            addCriterion("ar_paid in", values, "arPaid");
            return (Criteria) this;
        }

        public Criteria andArPaidNotIn(List<Integer> values) {
            addCriterion("ar_paid not in", values, "arPaid");
            return (Criteria) this;
        }

        public Criteria andArPaidBetween(Integer value1, Integer value2) {
            addCriterion("ar_paid between", value1, value2, "arPaid");
            return (Criteria) this;
        }

        public Criteria andArPaidNotBetween(Integer value1, Integer value2) {
            addCriterion("ar_paid not between", value1, value2, "arPaid");
            return (Criteria) this;
        }

        public Criteria andArArrearsIsNull() {
            addCriterion("ar_arrears is null");
            return (Criteria) this;
        }

        public Criteria andArArrearsIsNotNull() {
            addCriterion("ar_arrears is not null");
            return (Criteria) this;
        }

        public Criteria andArArrearsEqualTo(Integer value) {
            addCriterion("ar_arrears =", value, "arArrears");
            return (Criteria) this;
        }

        public Criteria andArArrearsNotEqualTo(Integer value) {
            addCriterion("ar_arrears <>", value, "arArrears");
            return (Criteria) this;
        }

        public Criteria andArArrearsGreaterThan(Integer value) {
            addCriterion("ar_arrears >", value, "arArrears");
            return (Criteria) this;
        }

        public Criteria andArArrearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ar_arrears >=", value, "arArrears");
            return (Criteria) this;
        }

        public Criteria andArArrearsLessThan(Integer value) {
            addCriterion("ar_arrears <", value, "arArrears");
            return (Criteria) this;
        }

        public Criteria andArArrearsLessThanOrEqualTo(Integer value) {
            addCriterion("ar_arrears <=", value, "arArrears");
            return (Criteria) this;
        }

        public Criteria andArArrearsIn(List<Integer> values) {
            addCriterion("ar_arrears in", values, "arArrears");
            return (Criteria) this;
        }

        public Criteria andArArrearsNotIn(List<Integer> values) {
            addCriterion("ar_arrears not in", values, "arArrears");
            return (Criteria) this;
        }

        public Criteria andArArrearsBetween(Integer value1, Integer value2) {
            addCriterion("ar_arrears between", value1, value2, "arArrears");
            return (Criteria) this;
        }

        public Criteria andArArrearsNotBetween(Integer value1, Integer value2) {
            addCriterion("ar_arrears not between", value1, value2, "arArrears");
            return (Criteria) this;
        }

        public Criteria andArDiscountIsNull() {
            addCriterion("ar_discount is null");
            return (Criteria) this;
        }

        public Criteria andArDiscountIsNotNull() {
            addCriterion("ar_discount is not null");
            return (Criteria) this;
        }

        public Criteria andArDiscountEqualTo(Integer value) {
            addCriterion("ar_discount =", value, "arDiscount");
            return (Criteria) this;
        }

        public Criteria andArDiscountNotEqualTo(Integer value) {
            addCriterion("ar_discount <>", value, "arDiscount");
            return (Criteria) this;
        }

        public Criteria andArDiscountGreaterThan(Integer value) {
            addCriterion("ar_discount >", value, "arDiscount");
            return (Criteria) this;
        }

        public Criteria andArDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ar_discount >=", value, "arDiscount");
            return (Criteria) this;
        }

        public Criteria andArDiscountLessThan(Integer value) {
            addCriterion("ar_discount <", value, "arDiscount");
            return (Criteria) this;
        }

        public Criteria andArDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("ar_discount <=", value, "arDiscount");
            return (Criteria) this;
        }

        public Criteria andArDiscountIn(List<Integer> values) {
            addCriterion("ar_discount in", values, "arDiscount");
            return (Criteria) this;
        }

        public Criteria andArDiscountNotIn(List<Integer> values) {
            addCriterion("ar_discount not in", values, "arDiscount");
            return (Criteria) this;
        }

        public Criteria andArDiscountBetween(Integer value1, Integer value2) {
            addCriterion("ar_discount between", value1, value2, "arDiscount");
            return (Criteria) this;
        }

        public Criteria andArDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("ar_discount not between", value1, value2, "arDiscount");
            return (Criteria) this;
        }

        public Criteria andArAttnIsNull() {
            addCriterion("ar_attn is null");
            return (Criteria) this;
        }

        public Criteria andArAttnIsNotNull() {
            addCriterion("ar_attn is not null");
            return (Criteria) this;
        }

        public Criteria andArAttnEqualTo(String value) {
            addCriterion("ar_attn =", value, "arAttn");
            return (Criteria) this;
        }

        public Criteria andArAttnNotEqualTo(String value) {
            addCriterion("ar_attn <>", value, "arAttn");
            return (Criteria) this;
        }

        public Criteria andArAttnGreaterThan(String value) {
            addCriterion("ar_attn >", value, "arAttn");
            return (Criteria) this;
        }

        public Criteria andArAttnGreaterThanOrEqualTo(String value) {
            addCriterion("ar_attn >=", value, "arAttn");
            return (Criteria) this;
        }

        public Criteria andArAttnLessThan(String value) {
            addCriterion("ar_attn <", value, "arAttn");
            return (Criteria) this;
        }

        public Criteria andArAttnLessThanOrEqualTo(String value) {
            addCriterion("ar_attn <=", value, "arAttn");
            return (Criteria) this;
        }

        public Criteria andArAttnLike(String value) {
            addCriterion("ar_attn like", value, "arAttn");
            return (Criteria) this;
        }

        public Criteria andArAttnNotLike(String value) {
            addCriterion("ar_attn not like", value, "arAttn");
            return (Criteria) this;
        }

        public Criteria andArAttnIn(List<String> values) {
            addCriterion("ar_attn in", values, "arAttn");
            return (Criteria) this;
        }

        public Criteria andArAttnNotIn(List<String> values) {
            addCriterion("ar_attn not in", values, "arAttn");
            return (Criteria) this;
        }

        public Criteria andArAttnBetween(String value1, String value2) {
            addCriterion("ar_attn between", value1, value2, "arAttn");
            return (Criteria) this;
        }

        public Criteria andArAttnNotBetween(String value1, String value2) {
            addCriterion("ar_attn not between", value1, value2, "arAttn");
            return (Criteria) this;
        }

        public Criteria andArOperatorIsNull() {
            addCriterion("ar_operator is null");
            return (Criteria) this;
        }

        public Criteria andArOperatorIsNotNull() {
            addCriterion("ar_operator is not null");
            return (Criteria) this;
        }

        public Criteria andArOperatorEqualTo(Integer value) {
            addCriterion("ar_operator =", value, "arOperator");
            return (Criteria) this;
        }

        public Criteria andArOperatorNotEqualTo(Integer value) {
            addCriterion("ar_operator <>", value, "arOperator");
            return (Criteria) this;
        }

        public Criteria andArOperatorGreaterThan(Integer value) {
            addCriterion("ar_operator >", value, "arOperator");
            return (Criteria) this;
        }

        public Criteria andArOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("ar_operator >=", value, "arOperator");
            return (Criteria) this;
        }

        public Criteria andArOperatorLessThan(Integer value) {
            addCriterion("ar_operator <", value, "arOperator");
            return (Criteria) this;
        }

        public Criteria andArOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("ar_operator <=", value, "arOperator");
            return (Criteria) this;
        }

        public Criteria andArOperatorIn(List<Integer> values) {
            addCriterion("ar_operator in", values, "arOperator");
            return (Criteria) this;
        }

        public Criteria andArOperatorNotIn(List<Integer> values) {
            addCriterion("ar_operator not in", values, "arOperator");
            return (Criteria) this;
        }

        public Criteria andArOperatorBetween(Integer value1, Integer value2) {
            addCriterion("ar_operator between", value1, value2, "arOperator");
            return (Criteria) this;
        }

        public Criteria andArOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("ar_operator not between", value1, value2, "arOperator");
            return (Criteria) this;
        }

        public Criteria andArRemarkIsNull() {
            addCriterion("ar_remark is null");
            return (Criteria) this;
        }

        public Criteria andArRemarkIsNotNull() {
            addCriterion("ar_remark is not null");
            return (Criteria) this;
        }

        public Criteria andArRemarkEqualTo(String value) {
            addCriterion("ar_remark =", value, "arRemark");
            return (Criteria) this;
        }

        public Criteria andArRemarkNotEqualTo(String value) {
            addCriterion("ar_remark <>", value, "arRemark");
            return (Criteria) this;
        }

        public Criteria andArRemarkGreaterThan(String value) {
            addCriterion("ar_remark >", value, "arRemark");
            return (Criteria) this;
        }

        public Criteria andArRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ar_remark >=", value, "arRemark");
            return (Criteria) this;
        }

        public Criteria andArRemarkLessThan(String value) {
            addCriterion("ar_remark <", value, "arRemark");
            return (Criteria) this;
        }

        public Criteria andArRemarkLessThanOrEqualTo(String value) {
            addCriterion("ar_remark <=", value, "arRemark");
            return (Criteria) this;
        }

        public Criteria andArRemarkLike(String value) {
            addCriterion("ar_remark like", value, "arRemark");
            return (Criteria) this;
        }

        public Criteria andArRemarkNotLike(String value) {
            addCriterion("ar_remark not like", value, "arRemark");
            return (Criteria) this;
        }

        public Criteria andArRemarkIn(List<String> values) {
            addCriterion("ar_remark in", values, "arRemark");
            return (Criteria) this;
        }

        public Criteria andArRemarkNotIn(List<String> values) {
            addCriterion("ar_remark not in", values, "arRemark");
            return (Criteria) this;
        }

        public Criteria andArRemarkBetween(String value1, String value2) {
            addCriterion("ar_remark between", value1, value2, "arRemark");
            return (Criteria) this;
        }

        public Criteria andArRemarkNotBetween(String value1, String value2) {
            addCriterion("ar_remark not between", value1, value2, "arRemark");
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