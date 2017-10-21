package com.team2052.frckrawler.models;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "TEAM".
 */
public class TeamDao extends AbstractDao<Team, Long> {

    public static final String TABLENAME = "TEAM";
    private DaoSession daoSession;

    public TeamDao(DaoConfig config) {
        super(config);
    }


    public TeamDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TEAM\" (" + //
                "\"NUMBER\" INTEGER PRIMARY KEY UNIQUE ," + // 0: number
                "\"TEAMKEY\" TEXT UNIQUE ," + // 1: teamkey
                "\"NAME\" TEXT," + // 2: name
                "\"DATA\" TEXT);"); // 3: data
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TEAM\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Team entity) {
        stmt.clearBindings();

        Long number = entity.getNumber();
        if (number != null) {
            stmt.bindLong(1, number);
        }

        String teamkey = entity.getTeamkey();
        if (teamkey != null) {
            stmt.bindString(2, teamkey);
        }

        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }

        String data = entity.getData();
        if (data != null) {
            stmt.bindString(4, data);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Team entity) {
        stmt.clearBindings();

        Long number = entity.getNumber();
        if (number != null) {
            stmt.bindLong(1, number);
        }

        String teamkey = entity.getTeamkey();
        if (teamkey != null) {
            stmt.bindString(2, teamkey);
        }

        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }

        String data = entity.getData();
        if (data != null) {
            stmt.bindString(4, data);
        }
    }

    @Override
    protected final void attachEntity(Team entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    @Override
    public Team readEntity(Cursor cursor, int offset) {
        Team entity = new Team( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // number
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // teamkey
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // data
        );
        return entity;
    }

    @Override
    public void readEntity(Cursor cursor, Team entity, int offset) {
        entity.setNumber(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTeamkey(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setData(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
     
    @Override
    protected final Long updateKeyAfterInsert(Team entity, long rowId) {
        entity.setNumber(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Team entity) {
        if (entity != null) {
            return entity.getNumber();
        } else {
            return null;
        }
    }
    
    @Override
    public boolean hasKey(Team entity) {
        return entity.getNumber() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }

    /**
     * Properties of entity Team.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Number = new Property(0, Long.class, "number", true, "NUMBER");
        public final static Property Teamkey = new Property(1, String.class, "teamkey", false, "TEAMKEY");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Data = new Property(3, String.class, "data", false, "DATA");
    }
    
}
