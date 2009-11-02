
package com.campaignmonitor.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.campaignmonitor.api.types.CampaignCreate;
import com.campaignmonitor.api.types.CampaignCreateResponse;
import com.campaignmonitor.api.types.CampaignDelete;
import com.campaignmonitor.api.types.CampaignDeleteResponse;
import com.campaignmonitor.api.types.CampaignGetBounces;
import com.campaignmonitor.api.types.CampaignGetBouncesResponse;
import com.campaignmonitor.api.types.CampaignGetLists;
import com.campaignmonitor.api.types.CampaignGetListsResponse;
import com.campaignmonitor.api.types.CampaignGetOpens;
import com.campaignmonitor.api.types.CampaignGetOpensResponse;
import com.campaignmonitor.api.types.CampaignGetSubscriberClicks;
import com.campaignmonitor.api.types.CampaignGetSubscriberClicksResponse;
import com.campaignmonitor.api.types.CampaignGetSummary;
import com.campaignmonitor.api.types.CampaignGetSummaryResponse;
import com.campaignmonitor.api.types.CampaignGetUnsubscribes;
import com.campaignmonitor.api.types.CampaignGetUnsubscribesResponse;
import com.campaignmonitor.api.types.CampaignSend;
import com.campaignmonitor.api.types.CampaignSendResponse;
import com.campaignmonitor.api.types.ClientCreate;
import com.campaignmonitor.api.types.ClientCreateResponse;
import com.campaignmonitor.api.types.ClientDelete;
import com.campaignmonitor.api.types.ClientDeleteResponse;
import com.campaignmonitor.api.types.ClientGetCampaigns;
import com.campaignmonitor.api.types.ClientGetCampaignsResponse;
import com.campaignmonitor.api.types.ClientGetDetail;
import com.campaignmonitor.api.types.ClientGetDetailResponse;
import com.campaignmonitor.api.types.ClientGetLists;
import com.campaignmonitor.api.types.ClientGetListsResponse;
import com.campaignmonitor.api.types.ClientGetSegments;
import com.campaignmonitor.api.types.ClientGetSegmentsResponse;
import com.campaignmonitor.api.types.ClientGetSuppressionList;
import com.campaignmonitor.api.types.ClientGetSuppressionListResponse;
import com.campaignmonitor.api.types.ClientGetTemplates;
import com.campaignmonitor.api.types.ClientGetTemplatesResponse;
import com.campaignmonitor.api.types.ClientUpdateAccessAndBilling;
import com.campaignmonitor.api.types.ClientUpdateAccessAndBillingResponse;
import com.campaignmonitor.api.types.ClientUpdateBasics;
import com.campaignmonitor.api.types.ClientUpdateBasicsResponse;
import com.campaignmonitor.api.types.ListCreate;
import com.campaignmonitor.api.types.ListCreateCustomField;
import com.campaignmonitor.api.types.ListCreateCustomFieldResponse;
import com.campaignmonitor.api.types.ListCreateResponse;
import com.campaignmonitor.api.types.ListDelete;
import com.campaignmonitor.api.types.ListDeleteCustomField;
import com.campaignmonitor.api.types.ListDeleteCustomFieldResponse;
import com.campaignmonitor.api.types.ListDeleteResponse;
import com.campaignmonitor.api.types.ListGetCustomFields;
import com.campaignmonitor.api.types.ListGetCustomFieldsResponse;
import com.campaignmonitor.api.types.ListGetDetail;
import com.campaignmonitor.api.types.ListGetDetailResponse;
import com.campaignmonitor.api.types.ListGetStats;
import com.campaignmonitor.api.types.ListGetStatsResponse;
import com.campaignmonitor.api.types.ListUpdate;
import com.campaignmonitor.api.types.ListUpdateResponse;
import com.campaignmonitor.api.types.ObjectFactory;
import com.campaignmonitor.api.types.SubscriberAdd;
import com.campaignmonitor.api.types.SubscriberAddAndResubscribe;
import com.campaignmonitor.api.types.SubscriberAddAndResubscribeResponse;
import com.campaignmonitor.api.types.SubscriberAddAndResubscribeWithCustomFields;
import com.campaignmonitor.api.types.SubscriberAddAndResubscribeWithCustomFieldsResponse;
import com.campaignmonitor.api.types.SubscriberAddResponse;
import com.campaignmonitor.api.types.SubscriberAddWithCustomFields;
import com.campaignmonitor.api.types.SubscriberAddWithCustomFieldsResponse;
import com.campaignmonitor.api.types.SubscriberUnsubscribe;
import com.campaignmonitor.api.types.SubscriberUnsubscribeResponse;
import com.campaignmonitor.api.types.SubscribersGetActive;
import com.campaignmonitor.api.types.SubscribersGetActiveResponse;
import com.campaignmonitor.api.types.SubscribersGetBounced;
import com.campaignmonitor.api.types.SubscribersGetBouncedResponse;
import com.campaignmonitor.api.types.SubscribersGetIsSubscribed;
import com.campaignmonitor.api.types.SubscribersGetIsSubscribedResponse;
import com.campaignmonitor.api.types.SubscribersGetSingleSubscriber;
import com.campaignmonitor.api.types.SubscribersGetSingleSubscriberResponse;
import com.campaignmonitor.api.types.SubscribersGetUnsubscribed;
import com.campaignmonitor.api.types.SubscribersGetUnsubscribedResponse;
import com.campaignmonitor.api.types.TemplateCreate;
import com.campaignmonitor.api.types.TemplateCreateResponse;
import com.campaignmonitor.api.types.TemplateDelete;
import com.campaignmonitor.api.types.TemplateDeleteResponse;
import com.campaignmonitor.api.types.TemplateGetDetail;
import com.campaignmonitor.api.types.TemplateGetDetailResponse;
import com.campaignmonitor.api.types.TemplateUpdate;
import com.campaignmonitor.api.types.TemplateUpdateResponse;
import com.campaignmonitor.api.types.UserGetApiKey;
import com.campaignmonitor.api.types.UserGetApiKeyResponse;
import com.campaignmonitor.api.types.UserGetClients;
import com.campaignmonitor.api.types.UserGetClientsResponse;
import com.campaignmonitor.api.types.UserGetCountries;
import com.campaignmonitor.api.types.UserGetCountriesResponse;
import com.campaignmonitor.api.types.UserGetSystemDate;
import com.campaignmonitor.api.types.UserGetSystemDateResponse;
import com.campaignmonitor.api.types.UserGetTimezones;
import com.campaignmonitor.api.types.UserGetTimezonesResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "apiSoap", targetNamespace = "http://api.createsend.com/api/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CampaignMonitorApi {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.UserGetApiKeyResponse
     */
    @WebMethod(operationName = "GetApiKey", action = "http://api.createsend.com/api/User.GetApiKey")
    @WebResult(name = "User.GetApiKeyResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public UserGetApiKeyResponse getApiKey(
        @WebParam(name = "User.GetApiKey", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        UserGetApiKey parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.SubscriberAddWithCustomFieldsResponse
     */
    @WebMethod(operationName = "AddSubscriberWithCustomFields", action = "http://api.createsend.com/api/Subscriber.AddWithCustomFields")
    @WebResult(name = "Subscriber.AddWithCustomFieldsResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public SubscriberAddWithCustomFieldsResponse addSubscriberWithCustomFields(
        @WebParam(name = "Subscriber.AddWithCustomFields", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        SubscriberAddWithCustomFields parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.SubscriberAddAndResubscribeWithCustomFieldsResponse
     */
    @WebMethod(operationName = "AddAndResubscribeWithCustomFields", action = "http://api.createsend.com/api/Subscriber.AddAndResubscribeWithCustomFields")
    @WebResult(name = "Subscriber.AddAndResubscribeWithCustomFieldsResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public SubscriberAddAndResubscribeWithCustomFieldsResponse addAndResubscribeWithCustomFields(
        @WebParam(name = "Subscriber.AddAndResubscribeWithCustomFields", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        SubscriberAddAndResubscribeWithCustomFields parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.SubscriberAddResponse
     */
    @WebMethod(operationName = "AddSubscriber", action = "http://api.createsend.com/api/Subscriber.Add")
    @WebResult(name = "Subscriber.AddResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public SubscriberAddResponse addSubscriber(
        @WebParam(name = "Subscriber.Add", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        SubscriberAdd parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.SubscriberAddAndResubscribeResponse
     */
    @WebMethod(operationName = "AddAndResubscribe", action = "http://api.createsend.com/api/Subscriber.AddAndResubscribe")
    @WebResult(name = "Subscriber.AddAndResubscribeResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public SubscriberAddAndResubscribeResponse addAndResubscribe(
        @WebParam(name = "Subscriber.AddAndResubscribe", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        SubscriberAddAndResubscribe parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.SubscriberUnsubscribeResponse
     */
    @WebMethod(operationName = "Unsubscribe", action = "http://api.createsend.com/api/Subscriber.Unsubscribe")
    @WebResult(name = "Subscriber.UnsubscribeResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public SubscriberUnsubscribeResponse unsubscribe(
        @WebParam(name = "Subscriber.Unsubscribe", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        SubscriberUnsubscribe parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.SubscribersGetActiveResponse
     */
    @WebMethod(operationName = "GetSubscribers", action = "http://api.createsend.com/api/Subscribers.GetActive")
    @WebResult(name = "Subscribers.GetActiveResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public SubscribersGetActiveResponse getSubscribers(
        @WebParam(name = "Subscribers.GetActive", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        SubscribersGetActive parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.SubscribersGetUnsubscribedResponse
     */
    @WebMethod(operationName = "GetUnsubscribed", action = "http://api.createsend.com/api/Subscribers.GetUnsubscribed")
    @WebResult(name = "Subscribers.GetUnsubscribedResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public SubscribersGetUnsubscribedResponse getUnsubscribed(
        @WebParam(name = "Subscribers.GetUnsubscribed", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        SubscribersGetUnsubscribed parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.SubscribersGetBouncedResponse
     */
    @WebMethod(operationName = "GetBounced", action = "http://api.createsend.com/api/Subscribers.GetBounced")
    @WebResult(name = "Subscribers.GetBouncedResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public SubscribersGetBouncedResponse getBounced(
        @WebParam(name = "Subscribers.GetBounced", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        SubscribersGetBounced parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.SubscribersGetSingleSubscriberResponse
     */
    @WebMethod(operationName = "GetSingleSubscriber", action = "http://api.createsend.com/api/Subscribers.GetSingleSubscriber")
    @WebResult(name = "Subscribers.GetSingleSubscriberResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public SubscribersGetSingleSubscriberResponse getSingleSubscriber(
        @WebParam(name = "Subscribers.GetSingleSubscriber", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        SubscribersGetSingleSubscriber parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.SubscribersGetIsSubscribedResponse
     */
    @WebMethod(operationName = "GetIsSubscribed", action = "http://api.createsend.com/api/Subscribers.GetIsSubscribed")
    @WebResult(name = "Subscribers.GetIsSubscribedResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public SubscribersGetIsSubscribedResponse getIsSubscribed(
        @WebParam(name = "Subscribers.GetIsSubscribed", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        SubscribersGetIsSubscribed parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ListCreateResponse
     */
    @WebMethod(operationName = "CreateList", action = "http://api.createsend.com/api/List.Create")
    @WebResult(name = "List.CreateResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ListCreateResponse createList(
        @WebParam(name = "List.Create", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ListCreate parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ListUpdateResponse
     */
    @WebMethod(operationName = "UpdateList", action = "http://api.createsend.com/api/List.Update")
    @WebResult(name = "List.UpdateResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ListUpdateResponse updateList(
        @WebParam(name = "List.Update", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ListUpdate parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ListGetDetailResponse
     */
    @WebMethod(operationName = "GetListDetail", action = "http://api.createsend.com/api/List.GetDetail")
    @WebResult(name = "List.GetDetailResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ListGetDetailResponse getListDetail(
        @WebParam(name = "List.GetDetail", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ListGetDetail parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ListDeleteResponse
     */
    @WebMethod(operationName = "DeleteList", action = "http://api.createsend.com/api/List.Delete")
    @WebResult(name = "List.DeleteResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ListDeleteResponse deleteList(
        @WebParam(name = "List.Delete", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ListDelete parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ListGetCustomFieldsResponse
     */
    @WebMethod(operationName = "GetListCustomFields", action = "http://api.createsend.com/api/List.GetCustomFields")
    @WebResult(name = "List.GetCustomFieldsResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ListGetCustomFieldsResponse getListCustomFields(
        @WebParam(name = "List.GetCustomFields", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ListGetCustomFields parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ListDeleteCustomFieldResponse
     */
    @WebMethod(operationName = "DeleteListCustomField", action = "http://api.createsend.com/api/List.DeleteCustomField")
    @WebResult(name = "List.DeleteCustomFieldResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ListDeleteCustomFieldResponse deleteListCustomField(
        @WebParam(name = "List.DeleteCustomField", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ListDeleteCustomField parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ListCreateCustomFieldResponse
     */
    @WebMethod(operationName = "CreateListCustomField", action = "http://api.createsend.com/api/List.CreateCustomField")
    @WebResult(name = "List.CreateCustomFieldResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ListCreateCustomFieldResponse createListCustomField(
        @WebParam(name = "List.CreateCustomField", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ListCreateCustomField parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ListGetStatsResponse
     */
    @WebMethod(operationName = "GetListStats", action = "http://api.createsend.com/api/List.GetStats")
    @WebResult(name = "List.GetStatsResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ListGetStatsResponse getListStats(
        @WebParam(name = "List.GetStats", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ListGetStats parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ClientGetCampaignsResponse
     */
    @WebMethod(operationName = "GetClientCampaigns", action = "http://api.createsend.com/api/Client.GetCampaigns")
    @WebResult(name = "Client.GetCampaignsResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ClientGetCampaignsResponse getClientCampaigns(
        @WebParam(name = "Client.GetCampaigns", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ClientGetCampaigns parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ClientGetListsResponse
     */
    @WebMethod(operationName = "GetClientLists", action = "http://api.createsend.com/api/Client.GetLists")
    @WebResult(name = "Client.GetListsResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ClientGetListsResponse getClientLists(
        @WebParam(name = "Client.GetLists", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ClientGetLists parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ClientGetSegmentsResponse
     */
    @WebMethod(operationName = "GetClientSegments", action = "http://api.createsend.com/api/Client.GetSegments")
    @WebResult(name = "Client.GetSegmentsResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ClientGetSegmentsResponse getClientSegments(
        @WebParam(name = "Client.GetSegments", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ClientGetSegments parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ClientGetSuppressionListResponse
     */
    @WebMethod(operationName = "GetClientSuppressionList", action = "http://api.createsend.com/api/Client.GetSuppressionList")
    @WebResult(name = "Client.GetSuppressionListResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ClientGetSuppressionListResponse getClientSuppressionList(
        @WebParam(name = "Client.GetSuppressionList", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ClientGetSuppressionList parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ClientGetTemplatesResponse
     */
    @WebMethod(operationName = "GetClientTemplates", action = "http://api.createsend.com/api/Client.GetTemplates")
    @WebResult(name = "Client.GetTemplatesResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ClientGetTemplatesResponse getClientTemplates(
        @WebParam(name = "Client.GetTemplates", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ClientGetTemplates parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ClientCreateResponse
     */
    @WebMethod(operationName = "CreateClient", action = "http://api.createsend.com/api/Client.Create")
    @WebResult(name = "Client.CreateResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ClientCreateResponse createClient(
        @WebParam(name = "Client.Create", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ClientCreate parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ClientUpdateBasicsResponse
     */
    @WebMethod(operationName = "UpdateClientBasics", action = "http://api.createsend.com/api/Client.UpdateBasics")
    @WebResult(name = "Client.UpdateBasicsResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ClientUpdateBasicsResponse updateClientBasics(
        @WebParam(name = "Client.UpdateBasics", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ClientUpdateBasics parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ClientUpdateAccessAndBillingResponse
     */
    @WebMethod(operationName = "UpdateClientAccessAndBilling", action = "http://api.createsend.com/api/Client.UpdateAccessAndBilling")
    @WebResult(name = "Client.UpdateAccessAndBillingResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ClientUpdateAccessAndBillingResponse updateClientAccessAndBilling(
        @WebParam(name = "Client.UpdateAccessAndBilling", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ClientUpdateAccessAndBilling parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ClientGetDetailResponse
     */
    @WebMethod(operationName = "GetClientDetail", action = "http://api.createsend.com/api/Client.GetDetail")
    @WebResult(name = "Client.GetDetailResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ClientGetDetailResponse getClientDetail(
        @WebParam(name = "Client.GetDetail", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ClientGetDetail parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.ClientDeleteResponse
     */
    @WebMethod(operationName = "DeleteClient", action = "http://api.createsend.com/api/Client.Delete")
    @WebResult(name = "Client.DeleteResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public ClientDeleteResponse deleteClient(
        @WebParam(name = "Client.Delete", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        ClientDelete parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.CampaignGetSubscriberClicksResponse
     */
    @WebMethod(operationName = "GetSubscriberClicks", action = "http://api.createsend.com/api/Campaign.GetSubscriberClicks")
    @WebResult(name = "Campaign.GetSubscriberClicksResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public CampaignGetSubscriberClicksResponse getSubscriberClicks(
        @WebParam(name = "Campaign.GetSubscriberClicks", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        CampaignGetSubscriberClicks parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.CampaignGetOpensResponse
     */
    @WebMethod(operationName = "GetCampaignOpens", action = "http://api.createsend.com/api/Campaign.GetOpens")
    @WebResult(name = "Campaign.GetOpensResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public CampaignGetOpensResponse getCampaignOpens(
        @WebParam(name = "Campaign.GetOpens", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        CampaignGetOpens parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.CampaignGetBouncesResponse
     */
    @WebMethod(operationName = "GetCampaignBounces", action = "http://api.createsend.com/api/Campaign.GetBounces")
    @WebResult(name = "Campaign.GetBouncesResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public CampaignGetBouncesResponse getCampaignBounces(
        @WebParam(name = "Campaign.GetBounces", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        CampaignGetBounces parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.CampaignGetUnsubscribesResponse
     */
    @WebMethod(operationName = "GetCampaignUnsubscribes", action = "http://api.createsend.com/api/Campaign.GetUnsubscribes")
    @WebResult(name = "Campaign.GetUnsubscribesResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public CampaignGetUnsubscribesResponse getCampaignUnsubscribes(
        @WebParam(name = "Campaign.GetUnsubscribes", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        CampaignGetUnsubscribes parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.CampaignGetSummaryResponse
     */
    @WebMethod(operationName = "GetCampaignSummary", action = "http://api.createsend.com/api/Campaign.GetSummary")
    @WebResult(name = "Campaign.GetSummaryResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public CampaignGetSummaryResponse getCampaignSummary(
        @WebParam(name = "Campaign.GetSummary", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        CampaignGetSummary parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.CampaignGetListsResponse
     */
    @WebMethod(operationName = "GetCampaignLists", action = "http://api.createsend.com/api/Campaign.GetLists")
    @WebResult(name = "Campaign.GetListsResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public CampaignGetListsResponse getCampaignLists(
        @WebParam(name = "Campaign.GetLists", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        CampaignGetLists parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.UserGetClientsResponse
     */
    @WebMethod(operationName = "GetClients", action = "http://api.createsend.com/api/User.GetClients")
    @WebResult(name = "User.GetClientsResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public UserGetClientsResponse getClients(
        @WebParam(name = "User.GetClients", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        UserGetClients parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.UserGetSystemDateResponse
     */
    @WebMethod(operationName = "GetSystemDate", action = "http://api.createsend.com/api/User.GetSystemDate")
    @WebResult(name = "User.GetSystemDateResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public UserGetSystemDateResponse getSystemDate(
        @WebParam(name = "User.GetSystemDate", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        UserGetSystemDate parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.UserGetTimezonesResponse
     */
    @WebMethod(operationName = "GetTimezones", action = "http://api.createsend.com/api/User.GetTimezones")
    @WebResult(name = "User.GetTimezonesResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public UserGetTimezonesResponse getTimezones(
        @WebParam(name = "User.GetTimezones", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        UserGetTimezones parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.UserGetCountriesResponse
     */
    @WebMethod(operationName = "GetCountries", action = "http://api.createsend.com/api/User.GetCountries")
    @WebResult(name = "User.GetCountriesResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public UserGetCountriesResponse getCountries(
        @WebParam(name = "User.GetCountries", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        UserGetCountries parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.CampaignCreateResponse
     */
    @WebMethod(operationName = "CreateCampaign", action = "http://api.createsend.com/api/Campaign.Create")
    @WebResult(name = "Campaign.CreateResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public CampaignCreateResponse createCampaign(
        @WebParam(name = "Campaign.Create", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        CampaignCreate parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.CampaignSendResponse
     */
    @WebMethod(operationName = "SendCampaign", action = "http://api.createsend.com/api/Campaign.Send")
    @WebResult(name = "Campaign.SendResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public CampaignSendResponse sendCampaign(
        @WebParam(name = "Campaign.Send", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        CampaignSend parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.CampaignDeleteResponse
     */
    @WebMethod(operationName = "DeleteCampaign", action = "http://api.createsend.com/api/Campaign.Delete")
    @WebResult(name = "Campaign.DeleteResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public CampaignDeleteResponse deleteCampaign(
        @WebParam(name = "Campaign.Delete", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        CampaignDelete parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.TemplateCreateResponse
     */
    @WebMethod(operationName = "CreateTemplate", action = "http://api.createsend.com/api/Template.Create")
    @WebResult(name = "Template.CreateResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public TemplateCreateResponse createTemplate(
        @WebParam(name = "Template.Create", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        TemplateCreate parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.TemplateGetDetailResponse
     */
    @WebMethod(operationName = "GetTemplateDetail", action = "http://api.createsend.com/api/Template.GetDetail")
    @WebResult(name = "Template.GetDetailResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public TemplateGetDetailResponse getTemplateDetail(
        @WebParam(name = "Template.GetDetail", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        TemplateGetDetail parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.TemplateUpdateResponse
     */
    @WebMethod(operationName = "UpdateTemplate", action = "http://api.createsend.com/api/Template.Update")
    @WebResult(name = "Template.UpdateResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public TemplateUpdateResponse updateTemplate(
        @WebParam(name = "Template.Update", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        TemplateUpdate parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.campaignmonitor.api.types.TemplateDeleteResponse
     */
    @WebMethod(operationName = "DeleteTemplate", action = "http://api.createsend.com/api/Template.Delete")
    @WebResult(name = "Template.DeleteResponse", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
    public TemplateDeleteResponse deleteTemplate(
        @WebParam(name = "Template.Delete", targetNamespace = "http://api.createsend.com/api/", partName = "parameters")
        TemplateDelete parameters);

}
