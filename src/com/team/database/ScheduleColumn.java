package com.team.database;

import android.provider.BaseColumns;

public class ScheduleColumn implements BaseColumns {

	public ScheduleColumn() {
	}

	// 列名

	public static final String DATE = "date";// 日期
	public static final String SUBJECTNAME = "subjectName";// 课程名称
	public static final String WHICHWEEK = "whichWeek";// 第几周
	public static final String WEEK = "week";// 星期
	public static final String ADDRESS = "address";// 上课地点
	public static final String WHICHLESSON = "whichLesson";// 节次
	public static final String ISSILENCE = "isSilence";// 是否静音
	public static final String ISREMINDBYVIBRATO = "isRemindByVibrato";// 是否震动提醒
	public static final String ISREMINDBYRING = "isRemindByRing";// 是否铃声提醒
	public static final String REMINDTIME = "remindTime";// 提醒时间
	// 列 索引值
	public static final int _ID_COLUMN = 0;
	public static final int DATE_COLUMN = 1;
	public static final int SUBJECTNAME_COLUMN = 2;
	public static final int WHICHWEEK_COLUMN = 3;
	public static final int WEEK_COLUMN = 4;
	public static final int ADDRESS_COLUMN = 5;
	public static final int WHICHLESSON_COLUMN = 6;
	public static final int ISSILENCE_COLUMN = 7;
	public static final int ISREMINDBYVIBRATO_COLUMN = 8;
	public static final int ISREMINDBYRING_COLUMN = 9;
	public static final int REMINDTIME_COLUMN = 10;
	// 查询结果
	public static final String[] PROJECTION = { _ID,// 0
			DATE,// 1
			SUBJECTNAME,// 2
			WHICHWEEK,// 3
			WEEK,// 4
			ADDRESS,// 5
			WHICHLESSON,// 6
			ISSILENCE,// 7
			ISREMINDBYVIBRATO,// 8
			ISREMINDBYRING,// 9
			REMINDTIME // 10
	};
}
