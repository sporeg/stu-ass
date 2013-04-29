package com.team;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

	public static final String DATABASE_NAME = "stuass.db";
	public static final int DATABASE_VERSION = 1;
	public static final String SCHEDULE_TABLE = "tab_schedule";
	public static final String TIME_TABLE = "tab_time";
	// 创建数据库
	private static final String SCHEDULE_TABLE_CREATE = "CREATE TABLE "
			+ SCHEDULE_TABLE + " (" + ScheduleColumn._ID
			+ " integer primary key autoincrement," + ScheduleColumn.DATE + " text,"
			+ ScheduleColumn.SUBJECTNAME + " text," + ScheduleColumn.WHICHWEEK + " text,"
			+ ScheduleColumn.WEEK + " text," + ScheduleColumn.ADDRESS + " text,"
			+ ScheduleColumn.WHICHLESSON + " text," + ScheduleColumn.ISSILENCE + " integer,"
			+ ScheduleColumn.ISREMINDBYVIBRATO + " integer," + ScheduleColumn.ISREMINDBYRING
			+ " integer" + ScheduleColumn.REMINDTIME + " text);";
	
	private static final String TIME_TABLE_CREATE = "CREATE TABLE "
			+ SCHEDULE_TABLE + " (" + TimeColumn._ID
			+ " integer primary key autoincrement," + TimeColumn.WHICHLESSON + " text,"
			+ TimeColumn.STARTTIME + " text," TimeColumn.ENDTIME + " text);";

	public DBHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);

	}

	@Override
	public void onCreate(SQLiteDatabase db) {

		db.execSQL(SCHEDULE_TABLE_CREATE);
		db.execSQL(TIME_TABLE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

		db.execSQL("DROP TABLE IF EXISTS " + SCHEDULE_TABLE);
		db.execSQL("DROP TABLE IF EXISTS " + TIME_TABLE);
		onCreate(db);
	}

}
