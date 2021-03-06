package sh.evc.sdk.wechat.pay.response.pay;

import com.fasterxml.jackson.annotation.JsonProperty;
import sh.evc.sdk.wechat.pay.domain.ReceiverAdd;
import sh.evc.sdk.wechat.pay.response.XmlResponse;
import sh.evc.sdk.wechat.pay.util.SerializeUtil;

/**
 * 添加分账接收方
 *
 * @author winixi
 * @date 2021/1/28 4:10 PM
 */
public class ProfitSharingAddReceiverResponse extends XmlResponse {

  /**
   * 商户号
   */
  private String mchId;

  /**
   * 子商户号
   */
  private String subMchId;

  /**
   * 公众帐号id
   */
  @JsonProperty("appid")
  private String appId;

  /**
   * 子商户公众号id
   */
  @JsonProperty("sub_appid")
  private String subAppId;

  /**
   * 分账接收方对象
   * json格式
   */
  private String receiver;

  /**
   * 签名
   */
  private String nonceStr;

  /**
   * 签名
   */
  private String sign;

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

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getSubAppId() {
    return subAppId;
  }

  public void setSubAppId(String subAppId) {
    this.subAppId = subAppId;
  }

  public ReceiverAdd getReceiver() {
    return SerializeUtil.jsonToBean(receiver, ReceiverAdd.class);
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

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

  @Override
  public String toString() {
    return "ProfitSharingAddReceiverResponse{" +
            "mchId='" + mchId + '\'' +
            ", subMchId='" + subMchId + '\'' +
            ", appId='" + appId + '\'' +
            ", subAppId='" + subAppId + '\'' +
            ", receiver=" + receiver +
            ", nonceStr='" + nonceStr + '\'' +
            ", sign='" + sign + '\'' +
            "} " + super.toString();
  }
}
