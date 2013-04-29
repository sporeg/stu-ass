package com.team.database;

import android.provider.BaseColumns;

public class TimeColumn implements BaseColumns {

	public TimeColumn() {
	}

	// 列名

	public static final String WHICHLESSON = "whichLesson";// 课次
	public static final String STARTTIME = "startTime";// 上课开始时间
	public static final String ENDTIME = "endTime";// 上课结束时间
	// 列 索引值
	public static final int _ID_COLUMN = 0;
	public static final int WHICHLESSON_COLUMN = 1;
	public static final int STARTTIME_COLUMN = 2;
	public static final int ENDTIME_COLUMN = 3;
	// 查询结果
	public static final String[] PROJECTION = { _ID,// 0
			WHICHLESSON,// 1
			STARTTIME,// 2
			ENDTIME // 3
	};
}
