package ua.com.cs.services;

import org.springframework.stereotype.Service;
import ua.com.cs.model.wm.request.CallingRequest;
import ua.com.cs.model.wm.request.CardListRequest;
import ua.com.cs.model.wm.request.CardPictureListRequest;
import ua.com.cs.model.wm.request.GetDealOperationPaymentDetailsRequest;
import ua.com.cs.model.wm.response.CallingResponse;
import ua.com.cs.model.wm.response.Response;

/**
 * Created by valeriy_solyanik
 * on 15.12.2015.
 */
@Service
public class UkrMobWSCallingService extends CallingService{

	//Для вызова мобильных сервисов по-старинке  - через строку
	public CallingResponse callWithString(CallingRequest request) {
		return call(request);
	}

	//Для вызова сервиса CardList
	public Response callCardList(CardListRequest request) {
		String responseParameterValue = "CardListResponseParametersType";
		return call(request, responseParameterValue);
	}

	//Для вызова сервиса CardPictureList
	public Response callCardPictureList(CardPictureListRequest request) {
		String responseParameterValue = "CardPictureListResponseParametersType";
		return call(request, responseParameterValue);
	}

	//Для вызова сервиса GetDealOperationPaymentDetails
	public Response callGetDealOperationPaymentDetails(GetDealOperationPaymentDetailsRequest request) {
		String responseParameterValue = "GetDealOperationPaymentDetailsResponseParametersType";
		return call(request, responseParameterValue);
	}
}
