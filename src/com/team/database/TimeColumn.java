package com.team.database;

import android.provider.BaseColumns;

public class TimeColumn implements BaseColumns {

	public TimeColumn() {
	}

	// ����

	public static final String WHICHLESSON = "whichLesson";// �δ�
	public static final String STARTTIME = "startTime";// �Ͽο�ʼʱ��
	public static final String ENDTIME = "endTime";// �Ͽν���ʱ��
	// �� ����ֵ
	public static final int _ID_COLUMN = 0;
	public static final int WHICHLESSON_COLUMN = 1;
	public static final int STARTTIME_COLUMN = 2;
	public static final int ENDTIME_COLUMN = 3;
	// ��ѯ���
	public static final String[] PROJECTION = { _ID,// 0
			WHICHLESSON,// 1
			STARTTIME,// 2
			ENDTIME // 3
	};
}
