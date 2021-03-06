/*
 * This file is generated by jOOQ.
 */
package com.wldrmnd.superstock.domain.tables.records;


import com.wldrmnd.superstock.domain.tables.Account;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountRecord extends UpdatableRecordImpl<AccountRecord> implements Record5<Long, Long, String, BigDecimal, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>superstock.account.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>superstock.account.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>superstock.account.user_id</code>.
     */
    public void setUserId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>superstock.account.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>superstock.account.currency</code>.
     */
    public void setCurrency(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>superstock.account.currency</code>.
     */
    public String getCurrency() {
        return (String) get(2);
    }

    /**
     * Setter for <code>superstock.account.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>superstock.account.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>superstock.account.default</code>.
     */
    public void setDefault(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>superstock.account.default</code>.
     */
    public Boolean getDefault() {
        return (Boolean) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, String, BigDecimal, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, Long, String, BigDecimal, Boolean> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Account.ACCOUNT.ID;
    }

    @Override
    public Field<Long> field2() {
        return Account.ACCOUNT.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return Account.ACCOUNT.CURRENCY;
    }

    @Override
    public Field<BigDecimal> field4() {
        return Account.ACCOUNT.AMOUNT;
    }

    @Override
    public Field<Boolean> field5() {
        return Account.ACCOUNT.DEFAULT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getCurrency();
    }

    @Override
    public BigDecimal component4() {
        return getAmount();
    }

    @Override
    public Boolean component5() {
        return getDefault();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getCurrency();
    }

    @Override
    public BigDecimal value4() {
        return getAmount();
    }

    @Override
    public Boolean value5() {
        return getDefault();
    }

    @Override
    public AccountRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AccountRecord value2(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public AccountRecord value3(String value) {
        setCurrency(value);
        return this;
    }

    @Override
    public AccountRecord value4(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public AccountRecord value5(Boolean value) {
        setDefault(value);
        return this;
    }

    @Override
    public AccountRecord values(Long value1, Long value2, String value3, BigDecimal value4, Boolean value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountRecord
     */
    public AccountRecord() {
        super(Account.ACCOUNT);
    }

    /**
     * Create a detached, initialised AccountRecord
     */
    public AccountRecord(Long id, Long userId, String currency, BigDecimal amount, Boolean default_) {
        super(Account.ACCOUNT);

        setId(id);
        setUserId(userId);
        setCurrency(currency);
        setAmount(amount);
        setDefault(default_);
    }
}
