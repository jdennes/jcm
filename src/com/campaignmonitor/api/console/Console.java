package com.campaignmonitor.api.console;

import java.util.Scanner;
import com.campaignmonitor.api.Api;
import com.campaignmonitor.api.CampaignMonitorApi;
import com.campaignmonitor.api.types.ArrayOfList;
import com.campaignmonitor.api.types.ClientGetLists;
import com.campaignmonitor.api.types.List;
import com.campaignmonitor.api.types.Result;

/**
 * Console for interactively testing the Campaign Monitor API wrapper
 * @author jdennes
 */
public class Console {

	private String apiKey, clientId;
	private Scanner in;
	private CampaignMonitorApi api;
	
	public Console() {
		in = new Scanner(System.in);
		api = new Api().getApiSoap();
		this.collectApiKey();
	}
	
	private void collectApiKey() {
		System.out.println("Campaign Monitor API key:");
		this.apiKey = in.nextLine();
	}
	
	private void collectClientId() {
		System.out.println("Client ID:");
		this.clientId = in.nextLine();
	}

	/**
	 * Test getting lists for a client
	 */
	public void getClientListsTest() {
		this.collectClientId();
		ClientGetLists params = new ClientGetLists(); {{
			params.setApiKey(this.apiKey);
			params.setClientID(this.clientId);
		}};
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
	
	public static void main(String[] args) {
		Console con = new Console();
		con.getClientListsTest();
	}
}
