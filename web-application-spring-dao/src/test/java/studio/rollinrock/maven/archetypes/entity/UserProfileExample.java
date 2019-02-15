package studio.rollinrock.maven.archetypes.entity;

import java.util.ArrayList;
import java.util.List;

public class UserProfileExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
    public UserProfileExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBiologicalSexIsNull() {
            addCriterion("biological_sex is null");
            return (Criteria) this;
        }

        public Criteria andBiologicalSexIsNotNull() {
            addCriterion("biological_sex is not null");
            return (Criteria) this;
        }

        public Criteria andBiologicalSexEqualTo(String value) {
            addCriterion("biological_sex =", value, "biologicalSex");
            return (Criteria) this;
        }

        public Criteria andBiologicalSexNotEqualTo(String value) {
            addCriterion("biological_sex <>", value, "biologicalSex");
            return (Criteria) this;
        }

        public Criteria andBiologicalSexGreaterThan(String value) {
            addCriterion("biological_sex >", value, "biologicalSex");
            return (Criteria) this;
        }

        public Criteria andBiologicalSexGreaterThanOrEqualTo(String value) {
            addCriterion("biological_sex >=", value, "biologicalSex");
            return (Criteria) this;
        }

        public Criteria andBiologicalSexLessThan(String value) {
            addCriterion("biological_sex <", value, "biologicalSex");
            return (Criteria) this;
        }

        public Criteria andBiologicalSexLessThanOrEqualTo(String value) {
            addCriterion("biological_sex <=", value, "biologicalSex");
            return (Criteria) this;
        }

        public Criteria andBiologicalSexLike(String value) {
            addCriterion("biological_sex like", value, "biologicalSex");
            return (Criteria) this;
        }

        public Criteria andBiologicalSexNotLike(String value) {
            addCriterion("biological_sex not like", value, "biologicalSex");
            return (Criteria) this;
        }

        public Criteria andBiologicalSexIn(List<String> values) {
            addCriterion("biological_sex in", values, "biologicalSex");
            return (Criteria) this;
        }

        public Criteria andBiologicalSexNotIn(List<String> values) {
            addCriterion("biological_sex not in", values, "biologicalSex");
            return (Criteria) this;
        }

        public Criteria andBiologicalSexBetween(String value1, String value2) {
            addCriterion("biological_sex between", value1, value2, "biologicalSex");
            return (Criteria) this;
        }

        public Criteria andBiologicalSexNotBetween(String value1, String value2) {
            addCriterion("biological_sex not between", value1, value2, "biologicalSex");
            return (Criteria) this;
        }

        public Criteria andLocalLimitIsNull() {
            addCriterion("local_limit is null");
            return (Criteria) this;
        }

        public Criteria andLocalLimitIsNotNull() {
            addCriterion("local_limit is not null");
            return (Criteria) this;
        }

        public Criteria andLocalLimitEqualTo(Integer value) {
            addCriterion("local_limit =", value, "localLimit");
            return (Criteria) this;
        }

        public Criteria andLocalLimitNotEqualTo(Integer value) {
            addCriterion("local_limit <>", value, "localLimit");
            return (Criteria) this;
        }

        public Criteria andLocalLimitGreaterThan(Integer value) {
            addCriterion("local_limit >", value, "localLimit");
            return (Criteria) this;
        }

        public Criteria andLocalLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("local_limit >=", value, "localLimit");
            return (Criteria) this;
        }

        public Criteria andLocalLimitLessThan(Integer value) {
            addCriterion("local_limit <", value, "localLimit");
            return (Criteria) this;
        }

        public Criteria andLocalLimitLessThanOrEqualTo(Integer value) {
            addCriterion("local_limit <=", value, "localLimit");
            return (Criteria) this;
        }

        public Criteria andLocalLimitIn(List<Integer> values) {
            addCriterion("local_limit in", values, "localLimit");
            return (Criteria) this;
        }

        public Criteria andLocalLimitNotIn(List<Integer> values) {
            addCriterion("local_limit not in", values, "localLimit");
            return (Criteria) this;
        }

        public Criteria andLocalLimitBetween(Integer value1, Integer value2) {
            addCriterion("local_limit between", value1, value2, "localLimit");
            return (Criteria) this;
        }

        public Criteria andLocalLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("local_limit not between", value1, value2, "localLimit");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_profile
     *
     * @mbg.generated do_not_delete_during_merge Tue Jan 15 16:09:06 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_profile
     *
     * @mbg.generated Tue Jan 15 16:09:06 CST 2019
     */
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