package com.sust.entity;

import java.util.ArrayList;
import java.util.List;

public class PicWordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicWordsExample() {
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

        public Criteria andWoIdIsNull() {
            addCriterion("wo_id is null");
            return (Criteria) this;
        }

        public Criteria andWoIdIsNotNull() {
            addCriterion("wo_id is not null");
            return (Criteria) this;
        }

        public Criteria andWoIdEqualTo(Integer value) {
            addCriterion("wo_id =", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdNotEqualTo(Integer value) {
            addCriterion("wo_id <>", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdGreaterThan(Integer value) {
            addCriterion("wo_id >", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wo_id >=", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdLessThan(Integer value) {
            addCriterion("wo_id <", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdLessThanOrEqualTo(Integer value) {
            addCriterion("wo_id <=", value, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdIn(List<Integer> values) {
            addCriterion("wo_id in", values, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdNotIn(List<Integer> values) {
            addCriterion("wo_id not in", values, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdBetween(Integer value1, Integer value2) {
            addCriterion("wo_id between", value1, value2, "woId");
            return (Criteria) this;
        }

        public Criteria andWoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wo_id not between", value1, value2, "woId");
            return (Criteria) this;
        }

        public Criteria andUsIdIsNull() {
            addCriterion("us_id is null");
            return (Criteria) this;
        }

        public Criteria andUsIdIsNotNull() {
            addCriterion("us_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsIdEqualTo(Integer value) {
            addCriterion("us_id =", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotEqualTo(Integer value) {
            addCriterion("us_id <>", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdGreaterThan(Integer value) {
            addCriterion("us_id >", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("us_id >=", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdLessThan(Integer value) {
            addCriterion("us_id <", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdLessThanOrEqualTo(Integer value) {
            addCriterion("us_id <=", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdIn(List<Integer> values) {
            addCriterion("us_id in", values, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotIn(List<Integer> values) {
            addCriterion("us_id not in", values, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdBetween(Integer value1, Integer value2) {
            addCriterion("us_id between", value1, value2, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("us_id not between", value1, value2, "usId");
            return (Criteria) this;
        }

        public Criteria andWoUsIdIsNull() {
            addCriterion("wo_us_id is null");
            return (Criteria) this;
        }

        public Criteria andWoUsIdIsNotNull() {
            addCriterion("wo_us_id is not null");
            return (Criteria) this;
        }

        public Criteria andWoUsIdEqualTo(Integer value) {
            addCriterion("wo_us_id =", value, "woUsId");
            return (Criteria) this;
        }

        public Criteria andWoUsIdNotEqualTo(Integer value) {
            addCriterion("wo_us_id <>", value, "woUsId");
            return (Criteria) this;
        }

        public Criteria andWoUsIdGreaterThan(Integer value) {
            addCriterion("wo_us_id >", value, "woUsId");
            return (Criteria) this;
        }

        public Criteria andWoUsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wo_us_id >=", value, "woUsId");
            return (Criteria) this;
        }

        public Criteria andWoUsIdLessThan(Integer value) {
            addCriterion("wo_us_id <", value, "woUsId");
            return (Criteria) this;
        }

        public Criteria andWoUsIdLessThanOrEqualTo(Integer value) {
            addCriterion("wo_us_id <=", value, "woUsId");
            return (Criteria) this;
        }

        public Criteria andWoUsIdIn(List<Integer> values) {
            addCriterion("wo_us_id in", values, "woUsId");
            return (Criteria) this;
        }

        public Criteria andWoUsIdNotIn(List<Integer> values) {
            addCriterion("wo_us_id not in", values, "woUsId");
            return (Criteria) this;
        }

        public Criteria andWoUsIdBetween(Integer value1, Integer value2) {
            addCriterion("wo_us_id between", value1, value2, "woUsId");
            return (Criteria) this;
        }

        public Criteria andWoUsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wo_us_id not between", value1, value2, "woUsId");
            return (Criteria) this;
        }

        public Criteria andWoAboutIsNull() {
            addCriterion("wo_about is null");
            return (Criteria) this;
        }

        public Criteria andWoAboutIsNotNull() {
            addCriterion("wo_about is not null");
            return (Criteria) this;
        }

        public Criteria andWoAboutEqualTo(String value) {
            addCriterion("wo_about =", value, "woAbout");
            return (Criteria) this;
        }

        public Criteria andWoAboutNotEqualTo(String value) {
            addCriterion("wo_about <>", value, "woAbout");
            return (Criteria) this;
        }

        public Criteria andWoAboutGreaterThan(String value) {
            addCriterion("wo_about >", value, "woAbout");
            return (Criteria) this;
        }

        public Criteria andWoAboutGreaterThanOrEqualTo(String value) {
            addCriterion("wo_about >=", value, "woAbout");
            return (Criteria) this;
        }

        public Criteria andWoAboutLessThan(String value) {
            addCriterion("wo_about <", value, "woAbout");
            return (Criteria) this;
        }

        public Criteria andWoAboutLessThanOrEqualTo(String value) {
            addCriterion("wo_about <=", value, "woAbout");
            return (Criteria) this;
        }

        public Criteria andWoAboutLike(String value) {
            addCriterion("wo_about like", value, "woAbout");
            return (Criteria) this;
        }

        public Criteria andWoAboutNotLike(String value) {
            addCriterion("wo_about not like", value, "woAbout");
            return (Criteria) this;
        }

        public Criteria andWoAboutIn(List<String> values) {
            addCriterion("wo_about in", values, "woAbout");
            return (Criteria) this;
        }

        public Criteria andWoAboutNotIn(List<String> values) {
            addCriterion("wo_about not in", values, "woAbout");
            return (Criteria) this;
        }

        public Criteria andWoAboutBetween(String value1, String value2) {
            addCriterion("wo_about between", value1, value2, "woAbout");
            return (Criteria) this;
        }

        public Criteria andWoAboutNotBetween(String value1, String value2) {
            addCriterion("wo_about not between", value1, value2, "woAbout");
            return (Criteria) this;
        }

        public Criteria andWordscolIsNull() {
            addCriterion("wordscol is null");
            return (Criteria) this;
        }

        public Criteria andWordscolIsNotNull() {
            addCriterion("wordscol is not null");
            return (Criteria) this;
        }

        public Criteria andWordscolEqualTo(String value) {
            addCriterion("wordscol =", value, "wordscol");
            return (Criteria) this;
        }

        public Criteria andWordscolNotEqualTo(String value) {
            addCriterion("wordscol <>", value, "wordscol");
            return (Criteria) this;
        }

        public Criteria andWordscolGreaterThan(String value) {
            addCriterion("wordscol >", value, "wordscol");
            return (Criteria) this;
        }

        public Criteria andWordscolGreaterThanOrEqualTo(String value) {
            addCriterion("wordscol >=", value, "wordscol");
            return (Criteria) this;
        }

        public Criteria andWordscolLessThan(String value) {
            addCriterion("wordscol <", value, "wordscol");
            return (Criteria) this;
        }

        public Criteria andWordscolLessThanOrEqualTo(String value) {
            addCriterion("wordscol <=", value, "wordscol");
            return (Criteria) this;
        }

        public Criteria andWordscolLike(String value) {
            addCriterion("wordscol like", value, "wordscol");
            return (Criteria) this;
        }

        public Criteria andWordscolNotLike(String value) {
            addCriterion("wordscol not like", value, "wordscol");
            return (Criteria) this;
        }

        public Criteria andWordscolIn(List<String> values) {
            addCriterion("wordscol in", values, "wordscol");
            return (Criteria) this;
        }

        public Criteria andWordscolNotIn(List<String> values) {
            addCriterion("wordscol not in", values, "wordscol");
            return (Criteria) this;
        }

        public Criteria andWordscolBetween(String value1, String value2) {
            addCriterion("wordscol between", value1, value2, "wordscol");
            return (Criteria) this;
        }

        public Criteria andWordscolNotBetween(String value1, String value2) {
            addCriterion("wordscol not between", value1, value2, "wordscol");
            return (Criteria) this;
        }

        public Criteria andWoStr1IsNull() {
            addCriterion("wo_str1 is null");
            return (Criteria) this;
        }

        public Criteria andWoStr1IsNotNull() {
            addCriterion("wo_str1 is not null");
            return (Criteria) this;
        }

        public Criteria andWoStr1EqualTo(String value) {
            addCriterion("wo_str1 =", value, "woStr1");
            return (Criteria) this;
        }

        public Criteria andWoStr1NotEqualTo(String value) {
            addCriterion("wo_str1 <>", value, "woStr1");
            return (Criteria) this;
        }

        public Criteria andWoStr1GreaterThan(String value) {
            addCriterion("wo_str1 >", value, "woStr1");
            return (Criteria) this;
        }

        public Criteria andWoStr1GreaterThanOrEqualTo(String value) {
            addCriterion("wo_str1 >=", value, "woStr1");
            return (Criteria) this;
        }

        public Criteria andWoStr1LessThan(String value) {
            addCriterion("wo_str1 <", value, "woStr1");
            return (Criteria) this;
        }

        public Criteria andWoStr1LessThanOrEqualTo(String value) {
            addCriterion("wo_str1 <=", value, "woStr1");
            return (Criteria) this;
        }

        public Criteria andWoStr1Like(String value) {
            addCriterion("wo_str1 like", value, "woStr1");
            return (Criteria) this;
        }

        public Criteria andWoStr1NotLike(String value) {
            addCriterion("wo_str1 not like", value, "woStr1");
            return (Criteria) this;
        }

        public Criteria andWoStr1In(List<String> values) {
            addCriterion("wo_str1 in", values, "woStr1");
            return (Criteria) this;
        }

        public Criteria andWoStr1NotIn(List<String> values) {
            addCriterion("wo_str1 not in", values, "woStr1");
            return (Criteria) this;
        }

        public Criteria andWoStr1Between(String value1, String value2) {
            addCriterion("wo_str1 between", value1, value2, "woStr1");
            return (Criteria) this;
        }

        public Criteria andWoStr1NotBetween(String value1, String value2) {
            addCriterion("wo_str1 not between", value1, value2, "woStr1");
            return (Criteria) this;
        }

        public Criteria andWoStr2IsNull() {
            addCriterion("wo_str2 is null");
            return (Criteria) this;
        }

        public Criteria andWoStr2IsNotNull() {
            addCriterion("wo_str2 is not null");
            return (Criteria) this;
        }

        public Criteria andWoStr2EqualTo(String value) {
            addCriterion("wo_str2 =", value, "woStr2");
            return (Criteria) this;
        }

        public Criteria andWoStr2NotEqualTo(String value) {
            addCriterion("wo_str2 <>", value, "woStr2");
            return (Criteria) this;
        }

        public Criteria andWoStr2GreaterThan(String value) {
            addCriterion("wo_str2 >", value, "woStr2");
            return (Criteria) this;
        }

        public Criteria andWoStr2GreaterThanOrEqualTo(String value) {
            addCriterion("wo_str2 >=", value, "woStr2");
            return (Criteria) this;
        }

        public Criteria andWoStr2LessThan(String value) {
            addCriterion("wo_str2 <", value, "woStr2");
            return (Criteria) this;
        }

        public Criteria andWoStr2LessThanOrEqualTo(String value) {
            addCriterion("wo_str2 <=", value, "woStr2");
            return (Criteria) this;
        }

        public Criteria andWoStr2Like(String value) {
            addCriterion("wo_str2 like", value, "woStr2");
            return (Criteria) this;
        }

        public Criteria andWoStr2NotLike(String value) {
            addCriterion("wo_str2 not like", value, "woStr2");
            return (Criteria) this;
        }

        public Criteria andWoStr2In(List<String> values) {
            addCriterion("wo_str2 in", values, "woStr2");
            return (Criteria) this;
        }

        public Criteria andWoStr2NotIn(List<String> values) {
            addCriterion("wo_str2 not in", values, "woStr2");
            return (Criteria) this;
        }

        public Criteria andWoStr2Between(String value1, String value2) {
            addCriterion("wo_str2 between", value1, value2, "woStr2");
            return (Criteria) this;
        }

        public Criteria andWoStr2NotBetween(String value1, String value2) {
            addCriterion("wo_str2 not between", value1, value2, "woStr2");
            return (Criteria) this;
        }

        public Criteria andWoStr3IsNull() {
            addCriterion("wo_str3 is null");
            return (Criteria) this;
        }

        public Criteria andWoStr3IsNotNull() {
            addCriterion("wo_str3 is not null");
            return (Criteria) this;
        }

        public Criteria andWoStr3EqualTo(String value) {
            addCriterion("wo_str3 =", value, "woStr3");
            return (Criteria) this;
        }

        public Criteria andWoStr3NotEqualTo(String value) {
            addCriterion("wo_str3 <>", value, "woStr3");
            return (Criteria) this;
        }

        public Criteria andWoStr3GreaterThan(String value) {
            addCriterion("wo_str3 >", value, "woStr3");
            return (Criteria) this;
        }

        public Criteria andWoStr3GreaterThanOrEqualTo(String value) {
            addCriterion("wo_str3 >=", value, "woStr3");
            return (Criteria) this;
        }

        public Criteria andWoStr3LessThan(String value) {
            addCriterion("wo_str3 <", value, "woStr3");
            return (Criteria) this;
        }

        public Criteria andWoStr3LessThanOrEqualTo(String value) {
            addCriterion("wo_str3 <=", value, "woStr3");
            return (Criteria) this;
        }

        public Criteria andWoStr3Like(String value) {
            addCriterion("wo_str3 like", value, "woStr3");
            return (Criteria) this;
        }

        public Criteria andWoStr3NotLike(String value) {
            addCriterion("wo_str3 not like", value, "woStr3");
            return (Criteria) this;
        }

        public Criteria andWoStr3In(List<String> values) {
            addCriterion("wo_str3 in", values, "woStr3");
            return (Criteria) this;
        }

        public Criteria andWoStr3NotIn(List<String> values) {
            addCriterion("wo_str3 not in", values, "woStr3");
            return (Criteria) this;
        }

        public Criteria andWoStr3Between(String value1, String value2) {
            addCriterion("wo_str3 between", value1, value2, "woStr3");
            return (Criteria) this;
        }

        public Criteria andWoStr3NotBetween(String value1, String value2) {
            addCriterion("wo_str3 not between", value1, value2, "woStr3");
            return (Criteria) this;
        }

        public Criteria andWoStr4IsNull() {
            addCriterion("wo_str4 is null");
            return (Criteria) this;
        }

        public Criteria andWoStr4IsNotNull() {
            addCriterion("wo_str4 is not null");
            return (Criteria) this;
        }

        public Criteria andWoStr4EqualTo(String value) {
            addCriterion("wo_str4 =", value, "woStr4");
            return (Criteria) this;
        }

        public Criteria andWoStr4NotEqualTo(String value) {
            addCriterion("wo_str4 <>", value, "woStr4");
            return (Criteria) this;
        }

        public Criteria andWoStr4GreaterThan(String value) {
            addCriterion("wo_str4 >", value, "woStr4");
            return (Criteria) this;
        }

        public Criteria andWoStr4GreaterThanOrEqualTo(String value) {
            addCriterion("wo_str4 >=", value, "woStr4");
            return (Criteria) this;
        }

        public Criteria andWoStr4LessThan(String value) {
            addCriterion("wo_str4 <", value, "woStr4");
            return (Criteria) this;
        }

        public Criteria andWoStr4LessThanOrEqualTo(String value) {
            addCriterion("wo_str4 <=", value, "woStr4");
            return (Criteria) this;
        }

        public Criteria andWoStr4Like(String value) {
            addCriterion("wo_str4 like", value, "woStr4");
            return (Criteria) this;
        }

        public Criteria andWoStr4NotLike(String value) {
            addCriterion("wo_str4 not like", value, "woStr4");
            return (Criteria) this;
        }

        public Criteria andWoStr4In(List<String> values) {
            addCriterion("wo_str4 in", values, "woStr4");
            return (Criteria) this;
        }

        public Criteria andWoStr4NotIn(List<String> values) {
            addCriterion("wo_str4 not in", values, "woStr4");
            return (Criteria) this;
        }

        public Criteria andWoStr4Between(String value1, String value2) {
            addCriterion("wo_str4 between", value1, value2, "woStr4");
            return (Criteria) this;
        }

        public Criteria andWoStr4NotBetween(String value1, String value2) {
            addCriterion("wo_str4 not between", value1, value2, "woStr4");
            return (Criteria) this;
        }

        public Criteria andWoStr5IsNull() {
            addCriterion("wo_str5 is null");
            return (Criteria) this;
        }

        public Criteria andWoStr5IsNotNull() {
            addCriterion("wo_str5 is not null");
            return (Criteria) this;
        }

        public Criteria andWoStr5EqualTo(String value) {
            addCriterion("wo_str5 =", value, "woStr5");
            return (Criteria) this;
        }

        public Criteria andWoStr5NotEqualTo(String value) {
            addCriterion("wo_str5 <>", value, "woStr5");
            return (Criteria) this;
        }

        public Criteria andWoStr5GreaterThan(String value) {
            addCriterion("wo_str5 >", value, "woStr5");
            return (Criteria) this;
        }

        public Criteria andWoStr5GreaterThanOrEqualTo(String value) {
            addCriterion("wo_str5 >=", value, "woStr5");
            return (Criteria) this;
        }

        public Criteria andWoStr5LessThan(String value) {
            addCriterion("wo_str5 <", value, "woStr5");
            return (Criteria) this;
        }

        public Criteria andWoStr5LessThanOrEqualTo(String value) {
            addCriterion("wo_str5 <=", value, "woStr5");
            return (Criteria) this;
        }

        public Criteria andWoStr5Like(String value) {
            addCriterion("wo_str5 like", value, "woStr5");
            return (Criteria) this;
        }

        public Criteria andWoStr5NotLike(String value) {
            addCriterion("wo_str5 not like", value, "woStr5");
            return (Criteria) this;
        }

        public Criteria andWoStr5In(List<String> values) {
            addCriterion("wo_str5 in", values, "woStr5");
            return (Criteria) this;
        }

        public Criteria andWoStr5NotIn(List<String> values) {
            addCriterion("wo_str5 not in", values, "woStr5");
            return (Criteria) this;
        }

        public Criteria andWoStr5Between(String value1, String value2) {
            addCriterion("wo_str5 between", value1, value2, "woStr5");
            return (Criteria) this;
        }

        public Criteria andWoStr5NotBetween(String value1, String value2) {
            addCriterion("wo_str5 not between", value1, value2, "woStr5");
            return (Criteria) this;
        }

        public Criteria andWoStr6IsNull() {
            addCriterion("wo_str6 is null");
            return (Criteria) this;
        }

        public Criteria andWoStr6IsNotNull() {
            addCriterion("wo_str6 is not null");
            return (Criteria) this;
        }

        public Criteria andWoStr6EqualTo(String value) {
            addCriterion("wo_str6 =", value, "woStr6");
            return (Criteria) this;
        }

        public Criteria andWoStr6NotEqualTo(String value) {
            addCriterion("wo_str6 <>", value, "woStr6");
            return (Criteria) this;
        }

        public Criteria andWoStr6GreaterThan(String value) {
            addCriterion("wo_str6 >", value, "woStr6");
            return (Criteria) this;
        }

        public Criteria andWoStr6GreaterThanOrEqualTo(String value) {
            addCriterion("wo_str6 >=", value, "woStr6");
            return (Criteria) this;
        }

        public Criteria andWoStr6LessThan(String value) {
            addCriterion("wo_str6 <", value, "woStr6");
            return (Criteria) this;
        }

        public Criteria andWoStr6LessThanOrEqualTo(String value) {
            addCriterion("wo_str6 <=", value, "woStr6");
            return (Criteria) this;
        }

        public Criteria andWoStr6Like(String value) {
            addCriterion("wo_str6 like", value, "woStr6");
            return (Criteria) this;
        }

        public Criteria andWoStr6NotLike(String value) {
            addCriterion("wo_str6 not like", value, "woStr6");
            return (Criteria) this;
        }

        public Criteria andWoStr6In(List<String> values) {
            addCriterion("wo_str6 in", values, "woStr6");
            return (Criteria) this;
        }

        public Criteria andWoStr6NotIn(List<String> values) {
            addCriterion("wo_str6 not in", values, "woStr6");
            return (Criteria) this;
        }

        public Criteria andWoStr6Between(String value1, String value2) {
            addCriterion("wo_str6 between", value1, value2, "woStr6");
            return (Criteria) this;
        }

        public Criteria andWoStr6NotBetween(String value1, String value2) {
            addCriterion("wo_str6 not between", value1, value2, "woStr6");
            return (Criteria) this;
        }

        public Criteria andWoAboutLikeInsensitive(String value) {
            addCriterion("upper(wo_about) like", value.toUpperCase(), "woAbout");
            return (Criteria) this;
        }

        public Criteria andWordscolLikeInsensitive(String value) {
            addCriterion("upper(wordscol) like", value.toUpperCase(), "wordscol");
            return (Criteria) this;
        }

        public Criteria andWoStr1LikeInsensitive(String value) {
            addCriterion("upper(wo_str1) like", value.toUpperCase(), "woStr1");
            return (Criteria) this;
        }

        public Criteria andWoStr2LikeInsensitive(String value) {
            addCriterion("upper(wo_str2) like", value.toUpperCase(), "woStr2");
            return (Criteria) this;
        }

        public Criteria andWoStr3LikeInsensitive(String value) {
            addCriterion("upper(wo_str3) like", value.toUpperCase(), "woStr3");
            return (Criteria) this;
        }

        public Criteria andWoStr4LikeInsensitive(String value) {
            addCriterion("upper(wo_str4) like", value.toUpperCase(), "woStr4");
            return (Criteria) this;
        }

        public Criteria andWoStr5LikeInsensitive(String value) {
            addCriterion("upper(wo_str5) like", value.toUpperCase(), "woStr5");
            return (Criteria) this;
        }

        public Criteria andWoStr6LikeInsensitive(String value) {
            addCriterion("upper(wo_str6) like", value.toUpperCase(), "woStr6");
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