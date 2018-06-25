package com.sust.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PicPictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicPictureExample() {
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

        public Criteria andPiIdIsNull() {
            addCriterion("pi_id is null");
            return (Criteria) this;
        }

        public Criteria andPiIdIsNotNull() {
            addCriterion("pi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPiIdEqualTo(Integer value) {
            addCriterion("pi_id =", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotEqualTo(Integer value) {
            addCriterion("pi_id <>", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdGreaterThan(Integer value) {
            addCriterion("pi_id >", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pi_id >=", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLessThan(Integer value) {
            addCriterion("pi_id <", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLessThanOrEqualTo(Integer value) {
            addCriterion("pi_id <=", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdIn(List<Integer> values) {
            addCriterion("pi_id in", values, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotIn(List<Integer> values) {
            addCriterion("pi_id not in", values, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdBetween(Integer value1, Integer value2) {
            addCriterion("pi_id between", value1, value2, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pi_id not between", value1, value2, "piId");
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

        public Criteria andPiTitleIsNull() {
            addCriterion("pi_title is null");
            return (Criteria) this;
        }

        public Criteria andPiTitleIsNotNull() {
            addCriterion("pi_title is not null");
            return (Criteria) this;
        }

        public Criteria andPiTitleEqualTo(String value) {
            addCriterion("pi_title =", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleNotEqualTo(String value) {
            addCriterion("pi_title <>", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleGreaterThan(String value) {
            addCriterion("pi_title >", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleGreaterThanOrEqualTo(String value) {
            addCriterion("pi_title >=", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleLessThan(String value) {
            addCriterion("pi_title <", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleLessThanOrEqualTo(String value) {
            addCriterion("pi_title <=", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleLike(String value) {
            addCriterion("pi_title like", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleNotLike(String value) {
            addCriterion("pi_title not like", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleIn(List<String> values) {
            addCriterion("pi_title in", values, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleNotIn(List<String> values) {
            addCriterion("pi_title not in", values, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleBetween(String value1, String value2) {
            addCriterion("pi_title between", value1, value2, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleNotBetween(String value1, String value2) {
            addCriterion("pi_title not between", value1, value2, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiSusheIsNull() {
            addCriterion("pi_sushe is null");
            return (Criteria) this;
        }

        public Criteria andPiSusheIsNotNull() {
            addCriterion("pi_sushe is not null");
            return (Criteria) this;
        }

        public Criteria andPiSusheEqualTo(String value) {
            addCriterion("pi_sushe =", value, "piSushe");
            return (Criteria) this;
        }

        public Criteria andPiSusheNotEqualTo(String value) {
            addCriterion("pi_sushe <>", value, "piSushe");
            return (Criteria) this;
        }

        public Criteria andPiSusheGreaterThan(String value) {
            addCriterion("pi_sushe >", value, "piSushe");
            return (Criteria) this;
        }

        public Criteria andPiSusheGreaterThanOrEqualTo(String value) {
            addCriterion("pi_sushe >=", value, "piSushe");
            return (Criteria) this;
        }

        public Criteria andPiSusheLessThan(String value) {
            addCriterion("pi_sushe <", value, "piSushe");
            return (Criteria) this;
        }

        public Criteria andPiSusheLessThanOrEqualTo(String value) {
            addCriterion("pi_sushe <=", value, "piSushe");
            return (Criteria) this;
        }

        public Criteria andPiSusheLike(String value) {
            addCriterion("pi_sushe like", value, "piSushe");
            return (Criteria) this;
        }

        public Criteria andPiSusheNotLike(String value) {
            addCriterion("pi_sushe not like", value, "piSushe");
            return (Criteria) this;
        }

        public Criteria andPiSusheIn(List<String> values) {
            addCriterion("pi_sushe in", values, "piSushe");
            return (Criteria) this;
        }

        public Criteria andPiSusheNotIn(List<String> values) {
            addCriterion("pi_sushe not in", values, "piSushe");
            return (Criteria) this;
        }

        public Criteria andPiSusheBetween(String value1, String value2) {
            addCriterion("pi_sushe between", value1, value2, "piSushe");
            return (Criteria) this;
        }

        public Criteria andPiSusheNotBetween(String value1, String value2) {
            addCriterion("pi_sushe not between", value1, value2, "piSushe");
            return (Criteria) this;
        }

        public Criteria andPiUptimeIsNull() {
            addCriterion("pi_uptime is null");
            return (Criteria) this;
        }

        public Criteria andPiUptimeIsNotNull() {
            addCriterion("pi_uptime is not null");
            return (Criteria) this;
        }

        public Criteria andPiUptimeEqualTo(Date value) {
            addCriterion("pi_uptime =", value, "piUptime");
            return (Criteria) this;
        }

        public Criteria andPiUptimeNotEqualTo(Date value) {
            addCriterion("pi_uptime <>", value, "piUptime");
            return (Criteria) this;
        }

        public Criteria andPiUptimeGreaterThan(Date value) {
            addCriterion("pi_uptime >", value, "piUptime");
            return (Criteria) this;
        }

        public Criteria andPiUptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pi_uptime >=", value, "piUptime");
            return (Criteria) this;
        }

        public Criteria andPiUptimeLessThan(Date value) {
            addCriterion("pi_uptime <", value, "piUptime");
            return (Criteria) this;
        }

        public Criteria andPiUptimeLessThanOrEqualTo(Date value) {
            addCriterion("pi_uptime <=", value, "piUptime");
            return (Criteria) this;
        }

        public Criteria andPiUptimeIn(List<Date> values) {
            addCriterion("pi_uptime in", values, "piUptime");
            return (Criteria) this;
        }

        public Criteria andPiUptimeNotIn(List<Date> values) {
            addCriterion("pi_uptime not in", values, "piUptime");
            return (Criteria) this;
        }

        public Criteria andPiUptimeBetween(Date value1, Date value2) {
            addCriterion("pi_uptime between", value1, value2, "piUptime");
            return (Criteria) this;
        }

        public Criteria andPiUptimeNotBetween(Date value1, Date value2) {
            addCriterion("pi_uptime not between", value1, value2, "piUptime");
            return (Criteria) this;
        }

        public Criteria andPiStr1IsNull() {
            addCriterion("pi_str1 is null");
            return (Criteria) this;
        }

        public Criteria andPiStr1IsNotNull() {
            addCriterion("pi_str1 is not null");
            return (Criteria) this;
        }

        public Criteria andPiStr1EqualTo(String value) {
            addCriterion("pi_str1 =", value, "piStr1");
            return (Criteria) this;
        }

        public Criteria andPiStr1NotEqualTo(String value) {
            addCriterion("pi_str1 <>", value, "piStr1");
            return (Criteria) this;
        }

        public Criteria andPiStr1GreaterThan(String value) {
            addCriterion("pi_str1 >", value, "piStr1");
            return (Criteria) this;
        }

        public Criteria andPiStr1GreaterThanOrEqualTo(String value) {
            addCriterion("pi_str1 >=", value, "piStr1");
            return (Criteria) this;
        }

        public Criteria andPiStr1LessThan(String value) {
            addCriterion("pi_str1 <", value, "piStr1");
            return (Criteria) this;
        }

        public Criteria andPiStr1LessThanOrEqualTo(String value) {
            addCriterion("pi_str1 <=", value, "piStr1");
            return (Criteria) this;
        }

        public Criteria andPiStr1Like(String value) {
            addCriterion("pi_str1 like", value, "piStr1");
            return (Criteria) this;
        }

        public Criteria andPiStr1NotLike(String value) {
            addCriterion("pi_str1 not like", value, "piStr1");
            return (Criteria) this;
        }

        public Criteria andPiStr1In(List<String> values) {
            addCriterion("pi_str1 in", values, "piStr1");
            return (Criteria) this;
        }

        public Criteria andPiStr1NotIn(List<String> values) {
            addCriterion("pi_str1 not in", values, "piStr1");
            return (Criteria) this;
        }

        public Criteria andPiStr1Between(String value1, String value2) {
            addCriterion("pi_str1 between", value1, value2, "piStr1");
            return (Criteria) this;
        }

        public Criteria andPiStr1NotBetween(String value1, String value2) {
            addCriterion("pi_str1 not between", value1, value2, "piStr1");
            return (Criteria) this;
        }

        public Criteria andPiStr2IsNull() {
            addCriterion("pi_str2 is null");
            return (Criteria) this;
        }

        public Criteria andPiStr2IsNotNull() {
            addCriterion("pi_str2 is not null");
            return (Criteria) this;
        }

        public Criteria andPiStr2EqualTo(String value) {
            addCriterion("pi_str2 =", value, "piStr2");
            return (Criteria) this;
        }

        public Criteria andPiStr2NotEqualTo(String value) {
            addCriterion("pi_str2 <>", value, "piStr2");
            return (Criteria) this;
        }

        public Criteria andPiStr2GreaterThan(String value) {
            addCriterion("pi_str2 >", value, "piStr2");
            return (Criteria) this;
        }

        public Criteria andPiStr2GreaterThanOrEqualTo(String value) {
            addCriterion("pi_str2 >=", value, "piStr2");
            return (Criteria) this;
        }

        public Criteria andPiStr2LessThan(String value) {
            addCriterion("pi_str2 <", value, "piStr2");
            return (Criteria) this;
        }

        public Criteria andPiStr2LessThanOrEqualTo(String value) {
            addCriterion("pi_str2 <=", value, "piStr2");
            return (Criteria) this;
        }

        public Criteria andPiStr2Like(String value) {
            addCriterion("pi_str2 like", value, "piStr2");
            return (Criteria) this;
        }

        public Criteria andPiStr2NotLike(String value) {
            addCriterion("pi_str2 not like", value, "piStr2");
            return (Criteria) this;
        }

        public Criteria andPiStr2In(List<String> values) {
            addCriterion("pi_str2 in", values, "piStr2");
            return (Criteria) this;
        }

        public Criteria andPiStr2NotIn(List<String> values) {
            addCriterion("pi_str2 not in", values, "piStr2");
            return (Criteria) this;
        }

        public Criteria andPiStr2Between(String value1, String value2) {
            addCriterion("pi_str2 between", value1, value2, "piStr2");
            return (Criteria) this;
        }

        public Criteria andPiStr2NotBetween(String value1, String value2) {
            addCriterion("pi_str2 not between", value1, value2, "piStr2");
            return (Criteria) this;
        }

        public Criteria andPiStr3IsNull() {
            addCriterion("pi_str3 is null");
            return (Criteria) this;
        }

        public Criteria andPiStr3IsNotNull() {
            addCriterion("pi_str3 is not null");
            return (Criteria) this;
        }

        public Criteria andPiStr3EqualTo(String value) {
            addCriterion("pi_str3 =", value, "piStr3");
            return (Criteria) this;
        }

        public Criteria andPiStr3NotEqualTo(String value) {
            addCriterion("pi_str3 <>", value, "piStr3");
            return (Criteria) this;
        }

        public Criteria andPiStr3GreaterThan(String value) {
            addCriterion("pi_str3 >", value, "piStr3");
            return (Criteria) this;
        }

        public Criteria andPiStr3GreaterThanOrEqualTo(String value) {
            addCriterion("pi_str3 >=", value, "piStr3");
            return (Criteria) this;
        }

        public Criteria andPiStr3LessThan(String value) {
            addCriterion("pi_str3 <", value, "piStr3");
            return (Criteria) this;
        }

        public Criteria andPiStr3LessThanOrEqualTo(String value) {
            addCriterion("pi_str3 <=", value, "piStr3");
            return (Criteria) this;
        }

        public Criteria andPiStr3Like(String value) {
            addCriterion("pi_str3 like", value, "piStr3");
            return (Criteria) this;
        }

        public Criteria andPiStr3NotLike(String value) {
            addCriterion("pi_str3 not like", value, "piStr3");
            return (Criteria) this;
        }

        public Criteria andPiStr3In(List<String> values) {
            addCriterion("pi_str3 in", values, "piStr3");
            return (Criteria) this;
        }

        public Criteria andPiStr3NotIn(List<String> values) {
            addCriterion("pi_str3 not in", values, "piStr3");
            return (Criteria) this;
        }

        public Criteria andPiStr3Between(String value1, String value2) {
            addCriterion("pi_str3 between", value1, value2, "piStr3");
            return (Criteria) this;
        }

        public Criteria andPiStr3NotBetween(String value1, String value2) {
            addCriterion("pi_str3 not between", value1, value2, "piStr3");
            return (Criteria) this;
        }

        public Criteria andPiStr4IsNull() {
            addCriterion("pi_str4 is null");
            return (Criteria) this;
        }

        public Criteria andPiStr4IsNotNull() {
            addCriterion("pi_str4 is not null");
            return (Criteria) this;
        }

        public Criteria andPiStr4EqualTo(String value) {
            addCriterion("pi_str4 =", value, "piStr4");
            return (Criteria) this;
        }

        public Criteria andPiStr4NotEqualTo(String value) {
            addCriterion("pi_str4 <>", value, "piStr4");
            return (Criteria) this;
        }

        public Criteria andPiStr4GreaterThan(String value) {
            addCriterion("pi_str4 >", value, "piStr4");
            return (Criteria) this;
        }

        public Criteria andPiStr4GreaterThanOrEqualTo(String value) {
            addCriterion("pi_str4 >=", value, "piStr4");
            return (Criteria) this;
        }

        public Criteria andPiStr4LessThan(String value) {
            addCriterion("pi_str4 <", value, "piStr4");
            return (Criteria) this;
        }

        public Criteria andPiStr4LessThanOrEqualTo(String value) {
            addCriterion("pi_str4 <=", value, "piStr4");
            return (Criteria) this;
        }

        public Criteria andPiStr4Like(String value) {
            addCriterion("pi_str4 like", value, "piStr4");
            return (Criteria) this;
        }

        public Criteria andPiStr4NotLike(String value) {
            addCriterion("pi_str4 not like", value, "piStr4");
            return (Criteria) this;
        }

        public Criteria andPiStr4In(List<String> values) {
            addCriterion("pi_str4 in", values, "piStr4");
            return (Criteria) this;
        }

        public Criteria andPiStr4NotIn(List<String> values) {
            addCriterion("pi_str4 not in", values, "piStr4");
            return (Criteria) this;
        }

        public Criteria andPiStr4Between(String value1, String value2) {
            addCriterion("pi_str4 between", value1, value2, "piStr4");
            return (Criteria) this;
        }

        public Criteria andPiStr4NotBetween(String value1, String value2) {
            addCriterion("pi_str4 not between", value1, value2, "piStr4");
            return (Criteria) this;
        }

        public Criteria andPiStr5IsNull() {
            addCriterion("pi_str5 is null");
            return (Criteria) this;
        }

        public Criteria andPiStr5IsNotNull() {
            addCriterion("pi_str5 is not null");
            return (Criteria) this;
        }

        public Criteria andPiStr5EqualTo(String value) {
            addCriterion("pi_str5 =", value, "piStr5");
            return (Criteria) this;
        }

        public Criteria andPiStr5NotEqualTo(String value) {
            addCriterion("pi_str5 <>", value, "piStr5");
            return (Criteria) this;
        }

        public Criteria andPiStr5GreaterThan(String value) {
            addCriterion("pi_str5 >", value, "piStr5");
            return (Criteria) this;
        }

        public Criteria andPiStr5GreaterThanOrEqualTo(String value) {
            addCriterion("pi_str5 >=", value, "piStr5");
            return (Criteria) this;
        }

        public Criteria andPiStr5LessThan(String value) {
            addCriterion("pi_str5 <", value, "piStr5");
            return (Criteria) this;
        }

        public Criteria andPiStr5LessThanOrEqualTo(String value) {
            addCriterion("pi_str5 <=", value, "piStr5");
            return (Criteria) this;
        }

        public Criteria andPiStr5Like(String value) {
            addCriterion("pi_str5 like", value, "piStr5");
            return (Criteria) this;
        }

        public Criteria andPiStr5NotLike(String value) {
            addCriterion("pi_str5 not like", value, "piStr5");
            return (Criteria) this;
        }

        public Criteria andPiStr5In(List<String> values) {
            addCriterion("pi_str5 in", values, "piStr5");
            return (Criteria) this;
        }

        public Criteria andPiStr5NotIn(List<String> values) {
            addCriterion("pi_str5 not in", values, "piStr5");
            return (Criteria) this;
        }

        public Criteria andPiStr5Between(String value1, String value2) {
            addCriterion("pi_str5 between", value1, value2, "piStr5");
            return (Criteria) this;
        }

        public Criteria andPiStr5NotBetween(String value1, String value2) {
            addCriterion("pi_str5 not between", value1, value2, "piStr5");
            return (Criteria) this;
        }

        public Criteria andPiTitleLikeInsensitive(String value) {
            addCriterion("upper(pi_title) like", value.toUpperCase(), "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiSusheLikeInsensitive(String value) {
            addCriterion("upper(pi_sushe) like", value.toUpperCase(), "piSushe");
            return (Criteria) this;
        }

        public Criteria andPiStr1LikeInsensitive(String value) {
            addCriterion("upper(pi_str1) like", value.toUpperCase(), "piStr1");
            return (Criteria) this;
        }

        public Criteria andPiStr2LikeInsensitive(String value) {
            addCriterion("upper(pi_str2) like", value.toUpperCase(), "piStr2");
            return (Criteria) this;
        }

        public Criteria andPiStr3LikeInsensitive(String value) {
            addCriterion("upper(pi_str3) like", value.toUpperCase(), "piStr3");
            return (Criteria) this;
        }

        public Criteria andPiStr4LikeInsensitive(String value) {
            addCriterion("upper(pi_str4) like", value.toUpperCase(), "piStr4");
            return (Criteria) this;
        }

        public Criteria andPiStr5LikeInsensitive(String value) {
            addCriterion("upper(pi_str5) like", value.toUpperCase(), "piStr5");
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