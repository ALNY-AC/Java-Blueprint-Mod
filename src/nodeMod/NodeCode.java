package nodeMod;

/**
 * �˽ӿ�����ȡ�ýڵ��Դ��
 */
public interface NodeCode {

	/**
	 * ����if����Դ��
	 * 
	 * @param if_code
	 *            Ҫ���õ�Դ��
	 */
	void setIfCode(String if_code);

	/**
	 * ȡ��if���ͽڵ��Դ��
	 * 
	 * @return ���ش˽ڵ�Դ��
	 */
	String getIfCode();

	/**
	 * ����for����Դ��
	 * 
	 * @param for_code
	 *            Ҫ���õ�Դ��
	 */
	void setForCode(String for_code);

	/**
	 * ȡ��for���ͽڵ��Դ��
	 * 
	 * @return ���ش˽ڵ�Դ��
	 */
	String getForCode();

	/**
	 * ����while����Դ��
	 * 
	 * @param while_code
	 *            Ҫ���õ�Դ��
	 */
	void setWhileCode(String while_code);

	/**
	 * ȡ��while���ͽڵ��Դ��
	 * 
	 * @return ���ش˽ڵ�Դ��
	 */
	String getWhileCode();

	/**
	 * ����switch����Դ��
	 * 
	 * @param switch_code
	 *            Ҫ���õ�Դ��
	 */
	void setSwitchCode(String switch_code);

	/**
	 * ȡ��switch���ͽڵ��Դ��
	 * 
	 * @return ���ش˽ڵ�Դ��
	 */
	String getSwitchCode();

	/**
	 * ����cal����Դ��
	 * 
	 * @param call_code
	 *            Ҫ���õ�Դ��
	 */
	void setCallVar(String call_code);

	/**
	 * ȡ�õ������ͽڵ��Դ��
	 * 
	 * @return ���ش˽ڵ�Դ��
	 */
	String getCallVar();

	/**
	 * ����Method����Դ��
	 * 
	 * @param method_code
	 *            Ҫ���õ�Դ��
	 */
	void setMethodCode(String method_code);

	/**
	 * ȡ�÷�����Դ��
	 * 
	 * @return ���ش˽ڵ�Դ��
	 */
	String getMethodCode();

}
