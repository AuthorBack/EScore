package com.xp.EScore.common.bean;

/**
 * ƽ̨��Ӧ��ֵ��
 *
 * @author zangyunfei
 */
public class ResponseCode {
    /**
     * �ɹ�
     */
    public static final Integer SUCCESS = 0;
    /**
     * δ֪�쳣
     */
    public static final Integer NEED_LOGIN = 401;
    /**
     * δ֪�쳣
     */
    public static final Integer UNHANDLE_EXCEPTION = 500;

    /**
     * ҵ�������쳣(���ύ���ݱ�����ȱʧ)
     */
    public static final Integer INVALID_DATA_EXCEPTION = 501;
    /**
     * ҵ�����쳣
     */
    public static final Integer SERVICE_EXCEPTION = 502;

    /**
     * http����ʧ��
     */
    public static final Integer HTTP_EXCEPTION = 505;

    /**
     * ���ݿ����ʧ��
     */
    public static final Integer DATABASE_OPERATION_FAIL = 506;

}
