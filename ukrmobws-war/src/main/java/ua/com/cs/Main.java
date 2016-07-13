package ua.com.cs;

import ua.com.cs.helpers.Base64;
import ua.com.cs.helpers.ZipHelper;

/**
 * Created by valeriy_solyanik
 * on 14.12.2015.
 */
public class Main {
	public static void main(String[] args) throws Exception {
		//WMServiceBeanService service = new WMServiceBeanService();
		//WMServiceBean wmServiceBean = service.getWMServiceBeanPort();
		String message = "H4sIAAAAAAAAAG2RUWvDIBSF3/srJO+bTSFv1tKFDAJlgyTd68jqXZFFDV67dv9+RhPadHs8x+8cr1e2uaiOfINFafQ6SR+XCQF9MELq4zo5Sy3MGR/SVZYmG75gFWBvNAJfEMJq0AJsqT/NIIOBQ83gECl8W+aDWUIDTec4q13rTvjUmcPXFA8OL6rqtfJ4VPGosNbY3Ajg5cs2b8q34n1fF566HtyADVwc3yNYgqGESCQfw0UgxkQg4lTzMdgQC8ovYOx8bmUHola4k0o6vmL0zonYlGp+euBLRmc6IrfljVRA7/0KWvQLFDxl9K/5Lzx15Oak3dY5UL2L8+3MUepx+fNnMXr9yF9XZk7ZAgIAAA==";
		//XMLAndMarshallerHelper helper = new XMLAndMarshallerHelper();
		//message = helper.geResponseWithParamType(message, "CardListResponseParametersType");
		ZipHelper zip = new ZipHelper("cp1251");
		message = zip.DecompressGZIP(Base64.decode(message.getBytes("cp1251")));
		//String response = wmServiceBean.call(message);
		System.out.println(message);
	}
}
