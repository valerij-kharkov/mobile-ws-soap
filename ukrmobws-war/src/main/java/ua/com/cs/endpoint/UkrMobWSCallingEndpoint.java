package ua.com.cs.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ua.com.cs.model.wm.request.CallingRequest;
import ua.com.cs.model.wm.request.CardListRequest;
import ua.com.cs.model.wm.request.CardPictureListRequest;
import ua.com.cs.model.wm.request.GetDealOperationPaymentDetailsRequest;
import ua.com.cs.model.wm.response.CallingResponse;
import ua.com.cs.model.wm.response.Response;
import ua.com.cs.services.UkrMobWSCallingService;

/**
 * Created by valeriy_solyanik
 * on 15.12.2015.
 */
@Endpoint
public class UkrMobWSCallingEndpoint {
	public final static String NAMESPACE = "http://cs.com.ua/callingService/";

	@Autowired
	UkrMobWSCallingService service;

	@PayloadRoot(localPart = "CallingRequest", namespace = NAMESPACE)
	@ResponsePayload
	public CallingResponse callWithString(@RequestPayload CallingRequest request) {
		return service.callWithString(request);
	}

	@PayloadRoot(localPart = "CardListRequest", namespace = NAMESPACE)
	@ResponsePayload
	public Response callCardList(@RequestPayload CardListRequest request) {
		return service.callCardList(request);
	}

	@PayloadRoot(localPart = "CardPictureListRequest", namespace = NAMESPACE)
	@ResponsePayload
	public Response callCardPictureList(@RequestPayload CardPictureListRequest request) {
		return service.callCardPictureList(request);
	}

	@PayloadRoot(localPart = "GetDealOperationPaymentDetailsRequest", namespace = NAMESPACE)
	@ResponsePayload
	public Response callDealOperationPaymentDetails(@RequestPayload GetDealOperationPaymentDetailsRequest request) {
		return service.callGetDealOperationPaymentDetails(request);
	}
}
