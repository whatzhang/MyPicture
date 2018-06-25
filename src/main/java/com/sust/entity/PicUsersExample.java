package com.sust.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PicUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicUsersExample() {
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

        public Criteria andUsNameIsNull() {
            addCriterion("us_name is null");
            return (Criteria) this;
        }

        public Criteria andUsNameIsNotNull() {
            addCriterion("us_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsNameEqualTo(String value) {
            addCriterion("us_name =", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameNotEqualTo(String value) {
            addCriterion("us_name <>", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameGreaterThan(String value) {
            addCriterion("us_name >", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameGreaterThanOrEqualTo(String value) {
            addCriterion("us_name >=", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameLessThan(String value) {
            addCriterion("us_name <", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameLessThanOrEqualTo(String value) {
            addCriterion("us_name <=", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameLike(String value) {
            addCriterion("us_name like", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameNotLike(String value) {
            addCriterion("us_name not like", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameIn(List<String> values) {
            addCriterion("us_name in", values, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameNotIn(List<String> values) {
            addCriterion("us_name not in", values, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameBetween(String value1, String value2) {
            addCriterion("us_name between", value1, value2, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameNotBetween(String value1, String value2) {
            addCriterion("us_name not between", value1, value2, "usName");
            return (Criteria) this;
        }

        public Criteria andUsLastdateIsNull() {
            addCriterion("us_lastdate is null");
            return (Criteria) this;
        }

        public Criteria andUsLastdateIsNotNull() {
            addCriterion("us_lastdate is not null");
            return (Criteria) this;
        }

        public Criteria andUsLastdateEqualTo(Date value) {
            addCriterion("us_lastdate =", value, "usLastdate");
            return (Criteria) this;
        }

        public Criteria andUsLastdateNotEqualTo(Date value) {
            addCriterion("us_lastdate <>", value, "usLastdate");
            return (Criteria) this;
        }

        public Criteria andUsLastdateGreaterThan(Date value) {
            addCriterion("us_lastdate >", value, "usLastdate");
            return (Criteria) this;
        }

        public Criteria andUsLastdateGreaterThanOrEqualTo(Date value) {
            addCriterion("us_lastdate >=", value, "usLastdate");
            return (Criteria) this;
        }

        public Criteria andUsLastdateLessThan(Date value) {
            addCriterion("us_lastdate <", value, "usLastdate");
            return (Criteria) this;
        }

        public Criteria andUsLastdateLessThanOrEqualTo(Date value) {
            addCriterion("us_lastdate <=", value, "usLastdate");
            return (Criteria) this;
        }

        public Criteria andUsLastdateIn(List<Date> values) {
            addCriterion("us_lastdate in", values, "usLastdate");
            return (Criteria) this;
        }

        public Criteria andUsLastdateNotIn(List<Date> values) {
            addCriterion("us_lastdate not in", values, "usLastdate");
            return (Criteria) this;
        }

        public Criteria andUsLastdateBetween(Date value1, Date value2) {
            addCriterion("us_lastdate between", value1, value2, "usLastdate");
            return (Criteria) this;
        }

        public Criteria andUsLastdateNotBetween(Date value1, Date value2) {
            addCriterion("us_lastdate not between", value1, value2, "usLastdate");
            return (Criteria) this;
        }

        public Criteria andUsStr1IsNull() {
            addCriterion("us_str1 is null");
            return (Criteria) this;
        }

        public Criteria andUsStr1IsNotNull() {
            addCriterion("us_str1 is not null");
            return (Criteria) this;
        }

        public Criteria andUsStr1EqualTo(String value) {
            addCriterion("us_str1 =", value, "usStr1");
            return (Criteria) this;
        }

        public Criteria andUsStr1NotEqualTo(String value) {
            addCriterion("us_str1 <>", value, "usStr1");
            return (Criteria) this;
        }

        public Criteria andUsStr1GreaterThan(String value) {
            addCriterion("us_str1 >", value, "usStr1");
            return (Criteria) this;
        }

        public Criteria andUsStr1GreaterThanOrEqualTo(String value) {
            addCriterion("us_str1 >=", value, "usStr1");
            return (Criteria) this;
        }

        public Criteria andUsStr1LessThan(String value) {
            addCriterion("us_str1 <", value, "usStr1");
            return (Criteria) this;
        }

        public Criteria andUsStr1LessThanOrEqualTo(String value) {
            addCriterion("us_str1 <=", value, "usStr1");
            return (Criteria) this;
        }

        public Criteria andUsStr1Like(String value) {
            addCriterion("us_str1 like", value, "usStr1");
            return (Criteria) this;
        }

        public Criteria andUsStr1NotLike(String value) {
            addCriterion("us_str1 not like", value, "usStr1");
            return (Criteria) this;
        }

        public Criteria andUsStr1In(List<String> values) {
            addCriterion("us_str1 in", values, "usStr1");
            return (Criteria) this;
        }

        public Criteria andUsStr1NotIn(List<String> values) {
            addCriterion("us_str1 not in", values, "usStr1");
            return (Criteria) this;
        }

        public Criteria andUsStr1Between(String value1, String value2) {
            addCriterion("us_str1 between", value1, value2, "usStr1");
            return (Criteria) this;
        }

        public Criteria andUsStr1NotBetween(String value1, String value2) {
            addCriterion("us_str1 not between", value1, value2, "usStr1");
            return (Criteria) this;
        }

        public Criteria andUsStr2IsNull() {
            addCriterion("us_str2 is null");
            return (Criteria) this;
        }

        public Criteria andUsStr2IsNotNull() {
            addCriterion("us_str2 is not null");
            return (Criteria) this;
        }

        public Criteria andUsStr2EqualTo(String value) {
            addCriterion("us_str2 =", value, "usStr2");
            return (Criteria) this;
        }

        public Criteria andUsStr2NotEqualTo(String value) {
            addCriterion("us_str2 <>", value, "usStr2");
            return (Criteria) this;
        }

        public Criteria andUsStr2GreaterThan(String value) {
            addCriterion("us_str2 >", value, "usStr2");
            return (Criteria) this;
        }

        public Criteria andUsStr2GreaterThanOrEqualTo(String value) {
            addCriterion("us_str2 >=", value, "usStr2");
            return (Criteria) this;
        }

        public Criteria andUsStr2LessThan(String value) {
            addCriterion("us_str2 <", value, "usStr2");
            return (Criteria) this;
        }

        public Criteria andUsStr2LessThanOrEqualTo(String value) {
            addCriterion("us_str2 <=", value, "usStr2");
            return (Criteria) this;
        }

        public Criteria andUsStr2Like(String value) {
            addCriterion("us_str2 like", value, "usStr2");
            return (Criteria) this;
        }

        public Criteria andUsStr2NotLike(String value) {
            addCriterion("us_str2 not like", value, "usStr2");
            return (Criteria) this;
        }

        public Criteria andUsStr2In(List<String> values) {
            addCriterion("us_str2 in", values, "usStr2");
            return (Criteria) this;
        }

        public Criteria andUsStr2NotIn(List<String> values) {
            addCriterion("us_str2 not in", values, "usStr2");
            return (Criteria) this;
        }

        public Criteria andUsStr2Between(String value1, String value2) {
            addCriterion("us_str2 between", value1, value2, "usStr2");
            return (Criteria) this;
        }

        public Criteria andUsStr2NotBetween(String value1, String value2) {
            addCriterion("us_str2 not between", value1, value2, "usStr2");
            return (Criteria) this;
        }

        public Criteria andUsStr3IsNull() {
            addCriterion("us_str3 is null");
            return (Criteria) this;
        }

        public Criteria andUsStr3IsNotNull() {
            addCriterion("us_str3 is not null");
            return (Criteria) this;
        }

        public Criteria andUsStr3EqualTo(String value) {
            addCriterion("us_str3 =", value, "usStr3");
            return (Criteria) this;
        }

        public Criteria andUsStr3NotEqualTo(String value) {
            addCriterion("us_str3 <>", value, "usStr3");
            return (Criteria) this;
        }

        public Criteria andUsStr3GreaterThan(String value) {
            addCriterion("us_str3 >", value, "usStr3");
            return (Criteria) this;
        }

        public Criteria andUsStr3GreaterThanOrEqualTo(String value) {
            addCriterion("us_str3 >=", value, "usStr3");
            return (Criteria) this;
        }

        public Criteria andUsStr3LessThan(String value) {
            addCriterion("us_str3 <", value, "usStr3");
            return (Criteria) this;
        }

        public Criteria andUsStr3LessThanOrEqualTo(String value) {
            addCriterion("us_str3 <=", value, "usStr3");
            return (Criteria) this;
        }

        public Criteria andUsStr3Like(String value) {
            addCriterion("us_str3 like", value, "usStr3");
            return (Criteria) this;
        }

        public Criteria andUsStr3NotLike(String value) {
            addCriterion("us_str3 not like", value, "usStr3");
            return (Criteria) this;
        }

        public Criteria andUsStr3In(List<String> values) {
            addCriterion("us_str3 in", values, "usStr3");
            return (Criteria) this;
        }

        public Criteria andUsStr3NotIn(List<String> values) {
            addCriterion("us_str3 not in", values, "usStr3");
            return (Criteria) this;
        }

        public Criteria andUsStr3Between(String value1, String value2) {
            addCriterion("us_str3 between", value1, value2, "usStr3");
            return (Criteria) this;
        }

        public Criteria andUsStr3NotBetween(String value1, String value2) {
            addCriterion("us_str3 not between", value1, value2, "usStr3");
            return (Criteria) this;
        }

        public Criteria andUsStr4IsNull() {
            addCriterion("us_str4 is null");
            return (Criteria) this;
        }

        public Criteria andUsStr4IsNotNull() {
            addCriterion("us_str4 is not null");
            return (Criteria) this;
        }

        public Criteria andUsStr4EqualTo(String value) {
            addCriterion("us_str4 =", value, "usStr4");
            return (Criteria) this;
        }

        public Criteria andUsStr4NotEqualTo(String value) {
            addCriterion("us_str4 <>", value, "usStr4");
            return (Criteria) this;
        }

        public Criteria andUsStr4GreaterThan(String value) {
            addCriterion("us_str4 >", value, "usStr4");
            return (Criteria) this;
        }

        public Criteria andUsStr4GreaterThanOrEqualTo(String value) {
            addCriterion("us_str4 >=", value, "usStr4");
            return (Criteria) this;
        }

        public Criteria andUsStr4LessThan(String value) {
            addCriterion("us_str4 <", value, "usStr4");
            return (Criteria) this;
        }

        public Criteria andUsStr4LessThanOrEqualTo(String value) {
            addCriterion("us_str4 <=", value, "usStr4");
            return (Criteria) this;
        }

        public Criteria andUsStr4Like(String value) {
            addCriterion("us_str4 like", value, "usStr4");
            return (Criteria) this;
        }

        public Criteria andUsStr4NotLike(String value) {
            addCriterion("us_str4 not like", value, "usStr4");
            return (Criteria) this;
        }

        public Criteria andUsStr4In(List<String> values) {
            addCriterion("us_str4 in", values, "usStr4");
            return (Criteria) this;
        }

        public Criteria andUsStr4NotIn(List<String> values) {
            addCriterion("us_str4 not in", values, "usStr4");
            return (Criteria) this;
        }

        public Criteria andUsStr4Between(String value1, String value2) {
            addCriterion("us_str4 between", value1, value2, "usStr4");
            return (Criteria) this;
        }

        public Criteria andUsStr4NotBetween(String value1, String value2) {
            addCriterion("us_str4 not between", value1, value2, "usStr4");
            return (Criteria) this;
        }

        public Criteria andUsStr5IsNull() {
            addCriterion("us_str5 is null");
            return (Criteria) this;
        }

        public Criteria andUsStr5IsNotNull() {
            addCriterion("us_str5 is not null");
            return (Criteria) this;
        }

        public Criteria andUsStr5EqualTo(String value) {
            addCriterion("us_str5 =", value, "usStr5");
            return (Criteria) this;
        }

        public Criteria andUsStr5NotEqualTo(String value) {
            addCriterion("us_str5 <>", value, "usStr5");
            return (Criteria) this;
        }

        public Criteria andUsStr5GreaterThan(String value) {
            addCriterion("us_str5 >", value, "usStr5");
            return (Criteria) this;
        }

        public Criteria andUsStr5GreaterThanOrEqualTo(String value) {
            addCriterion("us_str5 >=", value, "usStr5");
            return (Criteria) this;
        }

        public Criteria andUsStr5LessThan(String value) {
            addCriterion("us_str5 <", value, "usStr5");
            return (Criteria) this;
        }

        public Criteria andUsStr5LessThanOrEqualTo(String value) {
            addCriterion("us_str5 <=", value, "usStr5");
            return (Criteria) this;
        }

        public Criteria andUsStr5Like(String value) {
            addCriterion("us_str5 like", value, "usStr5");
            return (Criteria) this;
        }

        public Criteria andUsStr5NotLike(String value) {
            addCriterion("us_str5 not like", value, "usStr5");
            return (Criteria) this;
        }

        public Criteria andUsStr5In(List<String> values) {
            addCriterion("us_str5 in", values, "usStr5");
            return (Criteria) this;
        }

        public Criteria andUsStr5NotIn(List<String> values) {
            addCriterion("us_str5 not in", values, "usStr5");
            return (Criteria) this;
        }

        public Criteria andUsStr5Between(String value1, String value2) {
            addCriterion("us_str5 between", value1, value2, "usStr5");
            return (Criteria) this;
        }

        public Criteria andUsStr5NotBetween(String value1, String value2) {
            addCriterion("us_str5 not between", value1, value2, "usStr5");
            return (Criteria) this;
        }

        public Criteria andUsNameLikeInsensitive(String value) {
            addCriterion("upper(us_name) like", value.toUpperCase(), "usName");
            return (Criteria) this;
        }

        public Criteria andUsStr1LikeInsensitive(String value) {
            addCriterion("upper(us_str1) like", value.toUpperCase(), "usStr1");
            return (Criteria) this;
        }

        public Criteria andUsStr2LikeInsensitive(String value) {
            addCriterion("upper(us_str2) like", value.toUpperCase(), "usStr2");
            return (Criteria) this;
        }

        public Criteria andUsStr3LikeInsensitive(String value) {
            addCriterion("upper(us_str3) like", value.toUpperCase(), "usStr3");
            return (Criteria) this;
        }

        public Criteria andUsStr4LikeInsensitive(String value) {
            addCriterion("upper(us_str4) like", value.toUpperCase(), "usStr4");
            return (Criteria) this;
        }

        public Criteria andUsStr5LikeInsensitive(String value) {
            addCriterion("upper(us_str5) like", value.toUpperCase(), "usStr5");
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