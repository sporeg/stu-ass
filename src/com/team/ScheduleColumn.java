package com.team;

import android.provider.BaseColumns;

public class ScheduleColumn implements BaseColumns {

	public ScheduleColumn() {
	}

	// ����

	public static final String NAME = "name";//	����
	public static final String LOCATION = "location";//	λ��
	public static final String PRICE = "price";//	�۸�
	public static final String ASSESSMENT = "assessment";//	����
	public static final String RECOMMENDATION = "recommendation";//	�Ƽ�����
	public static final String BUSINESSHOURS = "businesshours";//	Ӫҵʱ��
	public static final String REMARKS = "remarks";//	��ע
	// �� ����ֵ
	public static final int _ID_COLUMN = 0;
	public static final int NAME_COLUMN = 1;
	public static final int LOCATION_COLUMN = 2;
	public static final int PRICE_COLUMN = 3;
	public static final int ASSESSMENT_COLUMN = 4;
	public static final int RECOMMENDATION_COLUMN = 5;
	public static final int BUSINESSHOURS_COLUMN = 6;
	public static final int REMARKS_COLUMN = 7;
	// ��ѯ���
	public static final String[] PROJECTION = {
			_ID,// 0
			NAME,// 1
			LOCATION,// 2
			PRICE,//3
			ASSESSMENT,//4
			RECOMMENDATION,//5
			BUSINESSHOURS,
			REMARKS
	};
}
