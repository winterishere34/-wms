package com.madeofwu.will.pojo;

import java.util.ArrayList;
import java.util.List;

public class BuyOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuyOrderDetailExample() {
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

        public Criteria andBodIdIsNull() {
            addCriterion("bod_id is null");
            return (Criteria) this;
        }

        public Criteria andBodIdIsNotNull() {
            addCriterion("bod_id is not null");
            return (Criteria) this;
        }

        public Criteria andBodIdEqualTo(String value) {
            addCriterion("bod_id =", value, "bodId");
            return (Criteria) this;
        }

        public Criteria andBodIdNotEqualTo(String value) {
            addCriterion("bod_id <>", value, "bodId");
            return (Criteria) this;
        }

        public Criteria andBodIdGreaterThan(String value) {
            addCriterion("bod_id >", value, "bodId");
            return (Criteria) this;
        }

        public Criteria andBodIdGreaterThanOrEqualTo(String value) {
            addCriterion("bod_id >=", value, "bodId");
            return (Criteria) this;
        }

        public Criteria andBodIdLessThan(String value) {
            addCriterion("bod_id <", value, "bodId");
            return (Criteria) this;
        }

        public Criteria andBodIdLessThanOrEqualTo(String value) {
            addCriterion("bod_id <=", value, "bodId");
            return (Criteria) this;
        }

        public Criteria andBodIdLike(String value) {
            addCriterion("bod_id like", value, "bodId");
            return (Criteria) this;
        }

        public Criteria andBodIdNotLike(String value) {
            addCriterion("bod_id not like", value, "bodId");
            return (Criteria) this;
        }

        public Criteria andBodIdIn(List<String> values) {
            addCriterion("bod_id in", values, "bodId");
            return (Criteria) this;
        }

        public Criteria andBodIdNotIn(List<String> values) {
            addCriterion("bod_id not in", values, "bodId");
            return (Criteria) this;
        }

        public Criteria andBodIdBetween(String value1, String value2) {
            addCriterion("bod_id between", value1, value2, "bodId");
            return (Criteria) this;
        }

        public Criteria andBodIdNotBetween(String value1, String value2) {
            addCriterion("bod_id not between", value1, value2, "bodId");
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

        public Criteria andGoodsProducerIsNull() {
            addCriterion("goods_producer is null");
            return (Criteria) this;
        }

        public Criteria andGoodsProducerIsNotNull() {
            addCriterion("goods_producer is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsProducerEqualTo(String value) {
            addCriterion("goods_producer =", value, "goodsProducer");
            return (Criteria) this;
        }

        public Criteria andGoodsProducerNotEqualTo(String value) {
            addCriterion("goods_producer <>", value, "goodsProducer");
            return (Criteria) this;
        }

        public Criteria andGoodsProducerGreaterThan(String value) {
            addCriterion("goods_producer >", value, "goodsProducer");
            return (Criteria) this;
        }

        public Criteria andGoodsProducerGreaterThanOrEqualTo(String value) {
            addCriterion("goods_producer >=", value, "goodsProducer");
            return (Criteria) this;
        }

        public Criteria andGoodsProducerLessThan(String value) {
            addCriterion("goods_producer <", value, "goodsProducer");
            return (Criteria) this;
        }

        public Criteria andGoodsProducerLessThanOrEqualTo(String value) {
            addCriterion("goods_producer <=", value, "goodsProducer");
            return (Criteria) this;
        }

        public Criteria andGoodsProducerLike(String value) {
            addCriterion("goods_producer like", value, "goodsProducer");
            return (Criteria) this;
        }

        public Criteria andGoodsProducerNotLike(String value) {
            addCriterion("goods_producer not like", value, "goodsProducer");
            return (Criteria) this;
        }

        public Criteria andGoodsProducerIn(List<String> values) {
            addCriterion("goods_producer in", values, "goodsProducer");
            return (Criteria) this;
        }

        public Criteria andGoodsProducerNotIn(List<String> values) {
            addCriterion("goods_producer not in", values, "goodsProducer");
            return (Criteria) this;
        }

        public Criteria andGoodsProducerBetween(String value1, String value2) {
            addCriterion("goods_producer between", value1, value2, "goodsProducer");
            return (Criteria) this;
        }

        public Criteria andGoodsProducerNotBetween(String value1, String value2) {
            addCriterion("goods_producer not between", value1, value2, "goodsProducer");
            return (Criteria) this;
        }

        public Criteria andBodAmountIsNull() {
            addCriterion("bod_amount is null");
            return (Criteria) this;
        }

        public Criteria andBodAmountIsNotNull() {
            addCriterion("bod_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBodAmountEqualTo(Integer value) {
            addCriterion("bod_amount =", value, "bodAmount");
            return (Criteria) this;
        }

        public Criteria andBodAmountNotEqualTo(Integer value) {
            addCriterion("bod_amount <>", value, "bodAmount");
            return (Criteria) this;
        }

        public Criteria andBodAmountGreaterThan(Integer value) {
            addCriterion("bod_amount >", value, "bodAmount");
            return (Criteria) this;
        }

        public Criteria andBodAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bod_amount >=", value, "bodAmount");
            return (Criteria) this;
        }

        public Criteria andBodAmountLessThan(Integer value) {
            addCriterion("bod_amount <", value, "bodAmount");
            return (Criteria) this;
        }

        public Criteria andBodAmountLessThanOrEqualTo(Integer value) {
            addCriterion("bod_amount <=", value, "bodAmount");
            return (Criteria) this;
        }

        public Criteria andBodAmountIn(List<Integer> values) {
            addCriterion("bod_amount in", values, "bodAmount");
            return (Criteria) this;
        }

        public Criteria andBodAmountNotIn(List<Integer> values) {
            addCriterion("bod_amount not in", values, "bodAmount");
            return (Criteria) this;
        }

        public Criteria andBodAmountBetween(Integer value1, Integer value2) {
            addCriterion("bod_amount between", value1, value2, "bodAmount");
            return (Criteria) this;
        }

        public Criteria andBodAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("bod_amount not between", value1, value2, "bodAmount");
            return (Criteria) this;
        }

        public Criteria andBodBuyPriceIsNull() {
            addCriterion("bod_buy_price is null");
            return (Criteria) this;
        }

        public Criteria andBodBuyPriceIsNotNull() {
            addCriterion("bod_buy_price is not null");
            return (Criteria) this;
        }

        public Criteria andBodBuyPriceEqualTo(Integer value) {
            addCriterion("bod_buy_price =", value, "bodBuyPrice");
            return (Criteria) this;
        }

        public Criteria andBodBuyPriceNotEqualTo(Integer value) {
            addCriterion("bod_buy_price <>", value, "bodBuyPrice");
            return (Criteria) this;
        }

        public Criteria andBodBuyPriceGreaterThan(Integer value) {
            addCriterion("bod_buy_price >", value, "bodBuyPrice");
            return (Criteria) this;
        }

        public Criteria andBodBuyPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("bod_buy_price >=", value, "bodBuyPrice");
            return (Criteria) this;
        }

        public Criteria andBodBuyPriceLessThan(Integer value) {
            addCriterion("bod_buy_price <", value, "bodBuyPrice");
            return (Criteria) this;
        }

        public Criteria andBodBuyPriceLessThanOrEqualTo(Integer value) {
            addCriterion("bod_buy_price <=", value, "bodBuyPrice");
            return (Criteria) this;
        }

        public Criteria andBodBuyPriceIn(List<Integer> values) {
            addCriterion("bod_buy_price in", values, "bodBuyPrice");
            return (Criteria) this;
        }

        public Criteria andBodBuyPriceNotIn(List<Integer> values) {
            addCriterion("bod_buy_price not in", values, "bodBuyPrice");
            return (Criteria) this;
        }

        public Criteria andBodBuyPriceBetween(Integer value1, Integer value2) {
            addCriterion("bod_buy_price between", value1, value2, "bodBuyPrice");
            return (Criteria) this;
        }

        public Criteria andBodBuyPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("bod_buy_price not between", value1, value2, "bodBuyPrice");
            return (Criteria) this;
        }

        public Criteria andBodTotalPriceIsNull() {
            addCriterion("bod_total_price is null");
            return (Criteria) this;
        }

        public Criteria andBodTotalPriceIsNotNull() {
            addCriterion("bod_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andBodTotalPriceEqualTo(Integer value) {
            addCriterion("bod_total_price =", value, "bodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBodTotalPriceNotEqualTo(Integer value) {
            addCriterion("bod_total_price <>", value, "bodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBodTotalPriceGreaterThan(Integer value) {
            addCriterion("bod_total_price >", value, "bodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBodTotalPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("bod_total_price >=", value, "bodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBodTotalPriceLessThan(Integer value) {
            addCriterion("bod_total_price <", value, "bodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBodTotalPriceLessThanOrEqualTo(Integer value) {
            addCriterion("bod_total_price <=", value, "bodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBodTotalPriceIn(List<Integer> values) {
            addCriterion("bod_total_price in", values, "bodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBodTotalPriceNotIn(List<Integer> values) {
            addCriterion("bod_total_price not in", values, "bodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBodTotalPriceBetween(Integer value1, Integer value2) {
            addCriterion("bod_total_price between", value1, value2, "bodTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBodTotalPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("bod_total_price not between", value1, value2, "bodTotalPrice");
            return (Criteria) this;
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