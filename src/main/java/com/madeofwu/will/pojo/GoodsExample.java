package com.madeofwu.will.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_Id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_Id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_Id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_Id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_Id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_Id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_Id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_Id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_Id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_Id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_Id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_Id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_Id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_Id not between", value1, value2, "goodsId");
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

        public Criteria andGoodsStoreIsNull() {
            addCriterion("goods_store is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreIsNotNull() {
            addCriterion("goods_store is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreEqualTo(Integer value) {
            addCriterion("goods_store =", value, "goodsStore");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreNotEqualTo(Integer value) {
            addCriterion("goods_store <>", value, "goodsStore");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreGreaterThan(Integer value) {
            addCriterion("goods_store >", value, "goodsStore");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_store >=", value, "goodsStore");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreLessThan(Integer value) {
            addCriterion("goods_store <", value, "goodsStore");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreLessThanOrEqualTo(Integer value) {
            addCriterion("goods_store <=", value, "goodsStore");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreIn(List<Integer> values) {
            addCriterion("goods_store in", values, "goodsStore");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreNotIn(List<Integer> values) {
            addCriterion("goods_store not in", values, "goodsStore");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreBetween(Integer value1, Integer value2) {
            addCriterion("goods_store between", value1, value2, "goodsStore");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_store not between", value1, value2, "goodsStore");
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

        public Criteria andGoodsRemarkIsNull() {
            addCriterion("goods_remark is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarkIsNotNull() {
            addCriterion("goods_remark is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarkEqualTo(String value) {
            addCriterion("goods_remark =", value, "goodsRemark");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarkNotEqualTo(String value) {
            addCriterion("goods_remark <>", value, "goodsRemark");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarkGreaterThan(String value) {
            addCriterion("goods_remark >", value, "goodsRemark");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("goods_remark >=", value, "goodsRemark");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarkLessThan(String value) {
            addCriterion("goods_remark <", value, "goodsRemark");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarkLessThanOrEqualTo(String value) {
            addCriterion("goods_remark <=", value, "goodsRemark");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarkLike(String value) {
            addCriterion("goods_remark like", value, "goodsRemark");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarkNotLike(String value) {
            addCriterion("goods_remark not like", value, "goodsRemark");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarkIn(List<String> values) {
            addCriterion("goods_remark in", values, "goodsRemark");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarkNotIn(List<String> values) {
            addCriterion("goods_remark not in", values, "goodsRemark");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarkBetween(String value1, String value2) {
            addCriterion("goods_remark between", value1, value2, "goodsRemark");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarkNotBetween(String value1, String value2) {
            addCriterion("goods_remark not between", value1, value2, "goodsRemark");
            return (Criteria) this;
        }

        public Criteria andGoodsSelPriceIsNull() {
            addCriterion("goods_sel_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSelPriceIsNotNull() {
            addCriterion("goods_sel_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSelPriceEqualTo(Integer value) {
            addCriterion("goods_sel_price =", value, "goodsSelPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSelPriceNotEqualTo(Integer value) {
            addCriterion("goods_sel_price <>", value, "goodsSelPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSelPriceGreaterThan(Integer value) {
            addCriterion("goods_sel_price >", value, "goodsSelPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSelPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sel_price >=", value, "goodsSelPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSelPriceLessThan(Integer value) {
            addCriterion("goods_sel_price <", value, "goodsSelPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSelPriceLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sel_price <=", value, "goodsSelPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSelPriceIn(List<Integer> values) {
            addCriterion("goods_sel_price in", values, "goodsSelPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSelPriceNotIn(List<Integer> values) {
            addCriterion("goods_sel_price not in", values, "goodsSelPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSelPriceBetween(Integer value1, Integer value2) {
            addCriterion("goods_sel_price between", value1, value2, "goodsSelPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSelPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sel_price not between", value1, value2, "goodsSelPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsBuyPriceIsNull() {
            addCriterion("goods_buy_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBuyPriceIsNotNull() {
            addCriterion("goods_buy_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBuyPriceEqualTo(Integer value) {
            addCriterion("goods_buy_price =", value, "goodsBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsBuyPriceNotEqualTo(Integer value) {
            addCriterion("goods_buy_price <>", value, "goodsBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsBuyPriceGreaterThan(Integer value) {
            addCriterion("goods_buy_price >", value, "goodsBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsBuyPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_buy_price >=", value, "goodsBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsBuyPriceLessThan(Integer value) {
            addCriterion("goods_buy_price <", value, "goodsBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsBuyPriceLessThanOrEqualTo(Integer value) {
            addCriterion("goods_buy_price <=", value, "goodsBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsBuyPriceIn(List<Integer> values) {
            addCriterion("goods_buy_price in", values, "goodsBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsBuyPriceNotIn(List<Integer> values) {
            addCriterion("goods_buy_price not in", values, "goodsBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsBuyPriceBetween(Integer value1, Integer value2) {
            addCriterion("goods_buy_price between", value1, value2, "goodsBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsBuyPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_buy_price not between", value1, value2, "goodsBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreIdIsNull() {
            addCriterion("goods_store_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreIdIsNotNull() {
            addCriterion("goods_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreIdEqualTo(Integer value) {
            addCriterion("goods_store_id =", value, "goodsStoreId");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreIdNotEqualTo(Integer value) {
            addCriterion("goods_store_id <>", value, "goodsStoreId");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreIdGreaterThan(Integer value) {
            addCriterion("goods_store_id >", value, "goodsStoreId");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_store_id >=", value, "goodsStoreId");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreIdLessThan(Integer value) {
            addCriterion("goods_store_id <", value, "goodsStoreId");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_store_id <=", value, "goodsStoreId");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreIdIn(List<Integer> values) {
            addCriterion("goods_store_id in", values, "goodsStoreId");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreIdNotIn(List<Integer> values) {
            addCriterion("goods_store_id not in", values, "goodsStoreId");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_store_id between", value1, value2, "goodsStoreId");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_store_id not between", value1, value2, "goodsStoreId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdIsNull() {
            addCriterion("goods_supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdIsNotNull() {
            addCriterion("goods_supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdEqualTo(Integer value) {
            addCriterion("goods_supplier_id =", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdNotEqualTo(Integer value) {
            addCriterion("goods_supplier_id <>", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdGreaterThan(Integer value) {
            addCriterion("goods_supplier_id >", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_supplier_id >=", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdLessThan(Integer value) {
            addCriterion("goods_supplier_id <", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_supplier_id <=", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdIn(List<Integer> values) {
            addCriterion("goods_supplier_id in", values, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdNotIn(List<Integer> values) {
            addCriterion("goods_supplier_id not in", values, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_supplier_id between", value1, value2, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_supplier_id not between", value1, value2, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatedIsNull() {
            addCriterion("goods_created is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatedIsNotNull() {
            addCriterion("goods_created is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatedEqualTo(String value) {
            addCriterion("goods_created =", value, "goodsCreated");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatedNotEqualTo(String value) {
            addCriterion("goods_created <>", value, "goodsCreated");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatedGreaterThan(String value) {
            addCriterion("goods_created >", value, "goodsCreated");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatedGreaterThanOrEqualTo(String value) {
            addCriterion("goods_created >=", value, "goodsCreated");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatedLessThan(String value) {
            addCriterion("goods_created <", value, "goodsCreated");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatedLessThanOrEqualTo(String value) {
            addCriterion("goods_created <=", value, "goodsCreated");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatedIn(List<String> values) {
            addCriterion("goods_created in", values, "goodsCreated");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatedNotIn(List<String> values) {
            addCriterion("goods_created not in", values, "goodsCreated");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatedBetween(String value1, String value2) {
            addCriterion("goods_created between", value1, value2, "goodsCreated");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatedNotBetween(String value1, String value2) {
            addCriterion("goods_created not between", value1, value2, "goodsCreated");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatedIsNull() {
            addCriterion("goods_updated is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatedIsNotNull() {
            addCriterion("goods_updated is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatedEqualTo(String value) {
            addCriterion("goods_updated =", value, "goodsUpdated");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatedNotEqualTo(String value) {
            addCriterion("goods_updated <>", value, "goodsUpdated");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatedGreaterThan(String value) {
            addCriterion("goods_updated >", value, "goodsUpdated");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatedGreaterThanOrEqualTo(String value) {
            addCriterion("goods_updated >=", value, "goodsUpdated");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatedLessThan(String value) {
            addCriterion("goods_updated <", value, "goodsUpdated");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatedLessThanOrEqualTo(String value) {
            addCriterion("goods_updated <=", value, "goodsUpdated");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatedIn(List<String> values) {
            addCriterion("goods_updated in", values, "goodsUpdated");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatedNotIn(List<String> values) {
            addCriterion("goods_updated not in", values, "goodsUpdated");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatedBetween(String value1, String value2) {
            addCriterion("goods_updated between", value1, value2, "goodsUpdated");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatedNotBetween(String value1, String value2) {
            addCriterion("goods_updated not between", value1, value2, "goodsUpdated");
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