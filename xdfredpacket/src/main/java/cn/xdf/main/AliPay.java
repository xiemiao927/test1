package cn.xdf.main;

import java.util.Random;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayFundCouponOperationQueryRequest;
import com.alipay.api.request.AlipayFundCouponOrderAppPayRequest;
import com.alipay.api.request.AlipayFundCouponOrderDisburseRequest;
import com.alipay.api.request.AlipayFundCouponOrderRefundRequest;
import com.alipay.api.request.AlipayUserUserinfoShareRequest;
import com.alipay.api.response.AlipayFundCouponOperationQueryResponse;
import com.alipay.api.response.AlipayFundCouponOrderAppPayResponse;
import com.alipay.api.response.AlipayFundCouponOrderDisburseResponse;
import com.alipay.api.response.AlipayFundCouponOrderRefundResponse;
import com.alipay.api.response.AlipayUserUserinfoShareResponse;

public class AliPay {

	private static AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",
			AlipayConfig.app_id, AlipayConfig.private_key, "json", "utf-8", AlipayConfig.ali_public_key, "RSA2");

	/**
	 * 用户授权
	 * 
	 * @throws AlipayApiException
	 */
	public static void userInfoShare() throws AlipayApiException {
		// 实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.user.userinfo.share
		AlipayUserUserinfoShareRequest request = new AlipayUserUserinfoShareRequest();
		// 授权类接口执行API调用时需要带上accessToken
		AlipayUserUserinfoShareResponse response = alipayClient.execute(request, "accessToken");
		System.out.println(response.toString());
		// 业务处理
		// ...
	}

	public static void main(String[] args) throws AlipayApiException {
//				userInfoShare();
		LeftMoneyPackage leftMoneyPackage = new LeftMoneyPackage();
		leftMoneyPackage.setMoney(0.10);
		leftMoneyPackage.setRemainMoney(100.00);
		leftMoneyPackage.setRemainSize(10);
		leftMoneyPackage.setSize(10);
		Double count = 0.00;
		for(int i = 1 ;leftMoneyPackage.getRemainSize() > 0  ;i++) {
			Double temp = getRandomMoney(leftMoneyPackage);
			System.out.println("第"+i+"个人抢到" + temp);
			count = BigDecimalUtils.add(count, temp);
		}
		System.out.println("总共"+count);
//		 Random r = new Random();
//		System.out.println(r.nextDouble());
	}

	/**
	 * 红包下单
	 * 
	 * @throws AlipayApiException
	 */
	public static void fundCouponOrderAppPay() throws AlipayApiException {
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", "app_id",
				"your private_key", "json", "GBK", "alipay_public_key", "RSA2");
		AlipayFundCouponOrderAppPayRequest request = new AlipayFundCouponOrderAppPayRequest();
		request.setBizContent("{" + "\"out_order_no\":\"8077735255938023\","
				+ "\"out_request_no\":\"8077735255634078\"," + "\"order_title\":\"发送红包\"," + "\"amount\":100.00,"
				+ "\"pay_timeout\":\"1h\"," + "\"extra_param\":\"{\\\"merchantExt\\\":\\\"key=value\\\"}\"" + "  }");
		AlipayFundCouponOrderAppPayResponse response = alipayClient.execute(request);
		if (response.isSuccess()) {
			System.out.println("调用成功");
		} else {
			System.out.println("调用失败");
		}
	}

	/**
	 * 红包打款
	 * 
	 * @throws AlipayApiException
	 */
	public static void alipayFundCouponOrderDisburse() throws AlipayApiException {
		AlipayFundCouponOrderDisburseRequest request = new AlipayFundCouponOrderDisburseRequest();
		request.setBizContent(
				"{" + "\"out_order_no\":\"8077735255938023\"," + "\"deduct_auth_no\":\"2014031600002001260000001024\","
						+ "\"deduct_out_order_no\":\"8077735255937028\"," + "\"out_request_no\":\"8077735255634078\","
						+ "\"order_title\":\"红包打款\"," + "\"amount\":100.00," + "\"payee_user_id\":\"2088102138117431\","
						+ "\"payee_logon_id\":\"alitest@alipay.com\"," + "\"pay_timeout\":\"1h\","
						+ "\"extra_param\":\"{\\\"merchantExt\\\":\\\"key=value\\\"}\"" + "  }");
		AlipayFundCouponOrderDisburseResponse response = alipayClient.execute(request);
		if (response.isSuccess()) {
			System.out.println("调用成功");
		} else {
			System.out.println("调用失败");
		}
	}
	
	/**
	 * 红包明细查询
	 * 
	 * @throws AlipayApiException
	 */
	public static void alipayFundCouponOperationQuery() throws AlipayApiException {
		AlipayFundCouponOperationQueryRequest request = new AlipayFundCouponOperationQueryRequest();
		request.setBizContent("{" +
		"\"auth_no\":\"2014021601002000640012345678\"," +
		"\"out_order_no\":\"8077735255938023\"," +
		"\"operation_id\":\"20140216010020006400\"," +
		"\"out_request_no\":\"2014021600100146\"" +
		"  }");
		AlipayFundCouponOperationQueryResponse response = alipayClient.execute(request);
		if(response.isSuccess()){
		System.out.println("调用成功");
		} else {
		System.out.println("调用失败");
		}
	}
	
	/**
	 * 红包退款
	 * 
	 * @throws AlipayApiException
	 */
	public static void alipayFundCouponOrderRefund() throws AlipayApiException {
		AlipayFundCouponOrderRefundRequest request = new AlipayFundCouponOrderRefundRequest();
		request.setBizContent("{" +
		"\"auth_no\":\"2014070800002001550000014417\"," +
		"\"out_request_no\":\"8077735255634078\"," +
		"\"amount\":10.00," +
		"\"remark\":\"红包退款\"" +
		"  }");
		AlipayFundCouponOrderRefundResponse response = alipayClient.execute(request);
		if(response.isSuccess()){
		System.out.println("调用成功");
		} else {
		System.out.println("调用失败");
		}
	}
	
	public static double getRandomMoney(LeftMoneyPackage leftMoneyPackage) {
	    if (leftMoneyPackage.getRemainSize() == 1) {
	    	leftMoneyPackage.setRemainSize((leftMoneyPackage.getRemainSize())-1);
	        return (double) leftMoneyPackage.getRemainMoney();
	    }
	    Random r = new Random();
	    double min = 0.01; 
	    double max = BigDecimalUtils.divide(leftMoneyPackage.getRemainMoney(),leftMoneyPackage.getRemainSize()) > 0.01 ? BigDecimalUtils.divide(leftMoneyPackage.getRemainMoney(),leftMoneyPackage.getRemainSize()) * 2 : 0.01;
	    double money = BigDecimalUtils.format(BigDecimalUtils.multiply(r.nextDouble(), max) ,2);
	    money = money <= min ? 0.01: money;
	    leftMoneyPackage.setRemainSize((leftMoneyPackage.getRemainSize())-1);
	    leftMoneyPackage.setRemainMoney(BigDecimalUtils.subtract(leftMoneyPackage.getRemainMoney(), money));
	    return money;
	}
	
	
}
