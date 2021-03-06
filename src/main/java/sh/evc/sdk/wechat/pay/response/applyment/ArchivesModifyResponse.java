package sh.evc.sdk.wechat.pay.response.applyment;

import sh.evc.sdk.wechat.pay.response.XmlResponse;

/**
 * 修改结算银行卡
 *
 * @author winixi
 * @date 2021/1/29 4:45 PM
 */
public class ArchivesModifyResponse extends XmlResponse {

  /**
   * 随机字符串
   */
  private String nonceStr;

  /**
   * 签名
   */
  private String sign;

  /**
   * 商户号
   */
  private String mchId;

  /**
   * 小微商户号
   */
  private String subMchId;

  public String getNonceStr() {
    return nonceStr;
  }

  public void setNonceStr(String nonceStr) {
    this.nonceStr = nonceStr;
  }

  public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }

  public String getMchId() {
    return mchId;
  }

  public void setMchId(String mchId) {
    this.mchId = mchId;
  }

  public String getSubMchId() {
    return subMchId;
  }

  public void setSubMchId(String subMchId) {
    this.subMchId = subMchId;
  }

  @Override
  public String toString() {
    return "ArchivesModifyResponse{" +
            "nonceStr='" + nonceStr + '\'' +
            ", sign='" + sign + '\'' +
            ", mchId='" + mchId + '\'' +
            ", subMchId='" + subMchId + '\'' +
            "} " + super.toString();
  }
}
