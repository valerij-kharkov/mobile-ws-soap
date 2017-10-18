package ua.com.cs;

import ua.com.cs.helpers.Base64;
import ua.com.cs.helpers.ZipHelper;

import java.math.BigDecimal;

/**
 * Created by valeriy_solyanik
 * on 14.12.2015.
 */
public class Main {
	/*public static void main(String[] args) throws Exception {
		//WMServiceBeanService service = new WMServiceBeanService();
		//WMServiceBean wmServiceBean = service.getWMServiceBeanPort();
		String message = "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";
		//XMLAndMarshallerHelper helper = new XMLAndMarshallerHelper();
		//message = helper.geResponseWithParamType(message, "CardListResponseParametersType");
		ZipHelper zip = new ZipHelper("cp1251");
		message = zip.DecompressGZIP(Base64.decode(message.getBytes("cp1251")));
		//String response = wmServiceBean.call(message);
		System.out.println(message);
	}*/
}
