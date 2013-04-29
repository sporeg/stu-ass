package com.team.database;

import android.provider.BaseColumns;

public class ScheduleColumn implements BaseColumns {

	public ScheduleColumn() {
	}

	// ����

	public static final String DATE = "date";// ����
	public static final String SUBJECTNAME = "subjectName";// �γ�����
	public static final String WHICHWEEK = "whichWeek";// �ڼ���
	public static final String WEEK = "week";// ����
	public static final String ADDRESS = "address";// �Ͽεص�
	public static final String WHICHLESSON = "whichLesson";// �ڴ�
	public static final String ISSILENCE = "isSilence";// �Ƿ���
	public static final String ISREMINDBYVIBRATO = "isRemindByVibrato";// �Ƿ�������
	public static final String ISREMINDBYRING = "isRemindByRing";// �Ƿ���������
	public static final String REMINDTIME = "remindTime";// ����ʱ��
	// �� ����ֵ
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
	// ��ѯ���
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
