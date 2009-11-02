package com.campaignmonitor.api.console;

import java.util.Arrays;
import java.util.Scanner;
import com.campaignmonitor.api.Api;
import com.campaignmonitor.api.CampaignMonitorApi;
import com.campaignmonitor.api.types.ArrayOfList;
import com.campaignmonitor.api.types.ArrayOfString;
import com.campaignmonitor.api.types.CampaignCreate;
import com.campaignmonitor.api.types.ClientGetLists;
import com.campaignmonitor.api.types.List;
import com.campaignmonitor.api.types.ListGetStats;
import com.campaignmonitor.api.types.ListStatistics;
import com.campaignmonitor.api.types.Result;

/**
 * Console for interactively testing the Campaign Monitor API wrapper
 * @author jdennes
 * @see http://www.campaignmonitor.com/api/
 */
public class Console {

	private String apiKey, clientId, campaignName, campaignSubject, fromName, 
	fromEmail, replyToEmail, htmlUrl, textUrl, listId;
	private ArrayOfList listSegments;
	private ArrayOfString listIds;
	
	private Scanner in;
	private CampaignMonitorApi api;

	public Console() {
		in = new Scanner(System.in);
		api = new Api().getApiSoap();
		apiKey = collectString("Campaign Monitor API key:");
	}
	
	private String collectString(String prompt) {
		System.out.println(prompt);
		return in.nextLine();
	}
	
	/**
	 * Test getting lists for a client
	 * @see http://www.campaignmonitor.com/api/method/client-getlists
	 */
	public void getClientListsTest() {
		System.out.println("Testing the Client.GetLists API method...");
		clientId = collectString("Client ID:");
		ClientGetLists params = new ClientGetLists();
		params.setApiKey(this.apiKey);
		params.setClientID(this.clientId);
		Object o = api.getClientLists(params).getClientGetListsResult();

		if (o instanceof ArrayOfList) {
			java.util.List<List> arr = ((ArrayOfList)o).getList();
			System.out.println(String.format("Congratulations, %d list%s found:", arr.size(), arr.size() == 1 ? "" : "s"));
			for (List l : ((ArrayOfList)o).getList())
				System.out.println(String.format("List -> ID: %s; Name: %s", l.getListID(), l.getName()));
		} else if (o instanceof Result) {
			Result res = (Result)o;
			System.out.println("Sorry, the following error occurred:");
			System.out.println(String.format("%d: %s", res.getCode(), res.getMessage()));
		}
	}
	
	private ArrayOfString collectListIds(String prompt) {
		System.out.println(prompt);
		String tmp = in.nextLine();
		ArrayOfString aos = new ArrayOfString();
		for (String s : Arrays.asList(tmp.split(",")))
			aos.getString().add(s.trim());
		return aos;
	}

	/**
	 * Test creating a campaign - a more comprehensive test
	 * @see http://www.campaignmonitor.com/api/method/campaign-create/
	 */
	public void createCampaignTest() {
		System.out.println("Testing the Campaign.Create API method...");
		clientId = collectString("Client ID:");
		campaignName = collectString("Campaign name:");
		campaignSubject = collectString("Campaign subject:");
		fromName = collectString("From name:");
		fromEmail = collectString("From email:");
		replyToEmail = collectString("Reply-to email:");
		htmlUrl = collectString("HTML version Url:");
		textUrl = collectString("Text version Url:");
		listIds = collectListIds("Comma-separated list of Subscriber list IDs:");
		listSegments = new ArrayOfList(); // Just left blank for this test

		CampaignCreate params = new CampaignCreate();
		params.setApiKey(apiKey);
		params.setClientID(clientId);
		params.setCampaignName(campaignName);
		params.setCampaignSubject(campaignSubject);
		params.setFromName(fromName);
		params.setFromEmail(fromEmail);
		params.setReplyTo(replyToEmail);
		params.setHtmlUrl(htmlUrl);
		params.setTextUrl(textUrl);
		params.setSubscriberListIDs(listIds);
		params.setListSegments(listSegments);

		Object o = api.createCampaign(params).getCampaignCreateResult();

		if (o instanceof String) {
			System.out.println(String.format("Congratulations, you created a new campaign with ID: %s", (String)o));
		} else if (o instanceof Result) {
			Result res = (Result)o;
			System.out.println("Sorry, the following error occurred:");
			System.out.println(String.format("%d: %s", res.getCode(), res.getMessage()));
		}
	}

	public void getListStatsTest() {
		System.out.println("Testing the List.GetStats API method...");
		listId = collectString("List ID:");
		ListGetStats params = new ListGetStats();
		params.setApiKey(apiKey);
		params.setListID(listId);
		Object o = api.getListStats(params).getListGetStatsResult();

		if (o instanceof ListStatistics) {
			System.out.println("Congratulations, you retrieved the following stats:");
			ListStatistics stats = (ListStatistics)o;
			System.out.println(String.format("Total Active: %d\nNew subscribers today: %d\nNew subscribers yesterday: %d\nNew subscribers this week: %d\nNew subscribers this month: %d\nNew subscribers this year: %d",
					stats.getTotalActiveSubscribers(), stats.getNewActiveSubscribersToday(), stats.getNewActiveSubscribersYesterday(), stats.getNewActiveSubscribersThisWeek(), stats.getNewActiveSubscribersThisMonth(), stats.getNewActiveSubscribersThisYear()));
		} else if (o instanceof Result) {
			Result res = (Result)o;
			System.out.println("Sorry, the following error occurred:");
			System.out.println(String.format("%d: %s", res.getCode(), res.getMessage()));
		}
	}
	
	public static void main(String[] args) {
		Console con = new Console();
		// Run the tests you want from here:
		//con.getClientListsTest();
		//con.createCampaignTest();
		con.getListStatsTest();
	}
}
