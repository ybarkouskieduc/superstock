/*
 * This file is generated by jOOQ.
 */
package com.wldrmnd.superstock.domain.tables;


import com.wldrmnd.superstock.domain.Keys;
import com.wldrmnd.superstock.domain.Superstock;
import com.wldrmnd.superstock.domain.tables.records.StockAccountStatisticRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StockAccountStatistic extends TableImpl<StockAccountStatisticRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>superstock.stock_account_statistic</code>
     */
    public static final StockAccountStatistic STOCK_ACCOUNT_STATISTIC = new StockAccountStatistic();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StockAccountStatisticRecord> getRecordType() {
        return StockAccountStatisticRecord.class;
    }

    /**
     * The column <code>superstock.stock_account_statistic.id</code>.
     */
    public final TableField<StockAccountStatisticRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>superstock.stock_account_statistic.user_id</code>.
     */
    public final TableField<StockAccountStatisticRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>superstock.stock_account_statistic.stock_id</code>.
     */
    public final TableField<StockAccountStatisticRecord, Long> STOCK_ID = createField(DSL.name("stock_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>superstock.stock_account_statistic.created_at</code>.
     */
    public final TableField<StockAccountStatisticRecord, Timestamp> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.TIMESTAMP(0).nullable(false), this, "");

    /**
     * The column <code>superstock.stock_account_statistic.profit</code>.
     */
    public final TableField<StockAccountStatisticRecord, BigDecimal> PROFIT = createField(DSL.name("profit"), SQLDataType.DECIMAL(10, 2).nullable(false), this, "");

    private StockAccountStatistic(Name alias, Table<StockAccountStatisticRecord> aliased) {
        this(alias, aliased, null);
    }

    private StockAccountStatistic(Name alias, Table<StockAccountStatisticRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>superstock.stock_account_statistic</code> table
     * reference
     */
    public StockAccountStatistic(String alias) {
        this(DSL.name(alias), STOCK_ACCOUNT_STATISTIC);
    }

    /**
     * Create an aliased <code>superstock.stock_account_statistic</code> table
     * reference
     */
    public StockAccountStatistic(Name alias) {
        this(alias, STOCK_ACCOUNT_STATISTIC);
    }

    /**
     * Create a <code>superstock.stock_account_statistic</code> table reference
     */
    public StockAccountStatistic() {
        this(DSL.name("stock_account_statistic"), null);
    }

    public <O extends Record> StockAccountStatistic(Table<O> child, ForeignKey<O, StockAccountStatisticRecord> key) {
        super(child, key, STOCK_ACCOUNT_STATISTIC);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Superstock.SUPERSTOCK;
    }

    @Override
    public Identity<StockAccountStatisticRecord, Long> getIdentity() {
        return (Identity<StockAccountStatisticRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<StockAccountStatisticRecord> getPrimaryKey() {
        return Keys.KEY_STOCK_ACCOUNT_STATISTIC_PRIMARY;
    }

    @Override
    public StockAccountStatistic as(String alias) {
        return new StockAccountStatistic(DSL.name(alias), this);
    }

    @Override
    public StockAccountStatistic as(Name alias) {
        return new StockAccountStatistic(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StockAccountStatistic rename(String name) {
        return new StockAccountStatistic(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StockAccountStatistic rename(Name name) {
        return new StockAccountStatistic(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, Long, Timestamp, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
