package ua.com.cs.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.client.support.interceptor.PayloadValidatingInterceptor;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.server.endpoint.adapter.method.MarshallingPayloadMethodProcessor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.commons.CommonsXsdSchemaCollection;
import ua.com.cs.interceptors.ChangeMassageClientInterceptor;
import ua.com.cs.interceptors.PayloadLoggingInterceptor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by valeriy_solyanik on 23.03.2017.
 */
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ukrmobws/*");
    }

    @Bean(name = "UkrMobWS")
    public DefaultWsdl11Definition defaultWsdl11Definition() {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("UkrMobWS");
        wsdl11Definition.setLocationUri("/ukrmobws/");
        wsdl11Definition.setTargetNamespace("http://cs.com.ua/callingService/");
        wsdl11Definition.setSchemaCollection(commonsXsdSchemaCollection());
        return wsdl11Definition;
    }

    @Bean
    public PayloadValidatingInterceptor payloadValidatingInterceptor() {
        PayloadValidatingInterceptor payloadValidatingInterceptor = new PayloadValidatingInterceptor();
        payloadValidatingInterceptor.setSchemas(new ClassPathResource("ukrmobws-request.xsd"),
                new ClassPathResource("ukrmobws-response.xsd"));
        payloadValidatingInterceptor.setValidateRequest(true);
        payloadValidatingInterceptor.setValidateResponse(true);
        return payloadValidatingInterceptor;
    }

    @Bean
    public PayloadLoggingInterceptor payloadLoggingInterceptor() {
        PayloadLoggingInterceptor payloadLoggingInterceptor = new PayloadLoggingInterceptor();
        payloadLoggingInterceptor.setLogRequest(true);
        payloadLoggingInterceptor.setLogResponse(true);
        return payloadLoggingInterceptor;
    }

    @Bean
    public MarshallingPayloadMethodProcessor marshallingPayloadMethodProcessor() {
        MarshallingPayloadMethodProcessor marshallingPayloadMethodProcessor = new MarshallingPayloadMethodProcessor();
        marshallingPayloadMethodProcessor.setMarshaller(jaxb2Marshaller());
        marshallingPayloadMethodProcessor.setUnmarshaller(jaxb2Marshaller());
        return marshallingPayloadMethodProcessor;
    }

    @Bean(name = "jaxb2Marshaller")
    public Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        Map<String, Boolean> properties = new HashMap<String, Boolean>();
        properties.put(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxb2Marshaller.setPackagesToScan("ua.com.cs.model.wm");
        jaxb2Marshaller.setMarshallerProperties(properties);
        return jaxb2Marshaller;
    }

    @Bean(name = "ifobsJaxb2Marshaller")
    public Jaxb2Marshaller ifobsJaxb2Marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        Map<String, Boolean> properties = new HashMap<String, Boolean>();
        properties.put(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxb2Marshaller.setPackagesToScan("ua.com.cs.model.ifobswm");
        jaxb2Marshaller.setMarshallerProperties(properties);
        return jaxb2Marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(@Value("${ws.wsdlUrl}") String url) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setDefaultUri(url);
        webServiceTemplate.setInterceptors(new ClientInterceptor[]{new ChangeMassageClientInterceptor()});
        webServiceTemplate.setMarshaller(ifobsJaxb2Marshaller());
        webServiceTemplate.setUnmarshaller(ifobsJaxb2Marshaller());
        return webServiceTemplate;
    }

    @Bean
    public CommonsXsdSchemaCollection commonsXsdSchemaCollection() {
        return new CommonsXsdSchemaCollection(new ClassPathResource("ukrmobws-response.xsd"), new ClassPathResource("ukrmobws-request.xsd"));
    }

    @Override
    public void addInterceptors(List<EndpointInterceptor> interceptors) {
        List<EndpointInterceptor> endpointInterceptors = new ArrayList<EndpointInterceptor>();
        endpointInterceptors.add(new PayloadLoggingInterceptor());

        super.addInterceptors(endpointInterceptors);
    }
}
