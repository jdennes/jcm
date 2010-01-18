
package com.campaignmonitor.api;

import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "api", targetNamespace = "http://api.createsend.com/api/")
public class Api
    extends Service
{

    private final static URL API_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.campaignmonitor.api.Api.class.getName());

    static {
        URL url = null;
        try {
            url = com.campaignmonitor.api.Api.class.getResource("campaignmonitor.wsdl");
        } catch (Exception e) {
        	if (url != null)
	            logger.warning(String.format("Failed to create URL for the wsdl Location: %s, retrying as a local file", url.toString()));
            logger.warning(e.getMessage());
        }
        API_WSDL_LOCATION = url;
    }

    public Api(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Api() {
        super(API_WSDL_LOCATION, new QName("http://api.createsend.com/api/", "api"));
    }

    /**
     * 
     * @return
     *     returns CampaignMonitorApi
     */
    @WebEndpoint(name = "apiSoap")
    public CampaignMonitorApi getApiSoap() {
        return super.getPort(new QName("http://api.createsend.com/api/", "apiSoap"), CampaignMonitorApi.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CampaignMonitorApi
     */
    @WebEndpoint(name = "apiSoap")
    public CampaignMonitorApi getApiSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.createsend.com/api/", "apiSoap"), CampaignMonitorApi.class, features);
    }

}
